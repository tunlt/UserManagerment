
package Controller;

import DAO.UserDAO;
import DTO.ProDetailDTO;
import DTO.UserDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tu
 */
@WebServlet(name = "AddPromotionController", urlPatterns = {"/AddPromotionController"})
public class AddPromotionController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = "promotion.jsp";
        String proID = request.getParameter("txtProID");
        String userID = request.getParameter("cboxUser");
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");// định dang ngày tháng nắm
        String dateJoin = dateFormat.format(date);// ngày add khuyến mã
        boolean flag = true;

        try {
           UserDAO dao = new UserDAO();// khợi tạo dao
           HttpSession session = request.getSession(false);// khởi tạo sesion
           
           UserDTO userDTO = dao.getUserByID(Integer.parseInt(userID));// khởi taojc các giá tri của userID
           request.setAttribute("CHANGEUSER", userDTO.getUserName());
           if(session!=null){
               List<ProDetailDTO> list = (List<ProDetailDTO>) session.getAttribute("listDetail");
               if(list == null){                  
                   List<ProDetailDTO> ListDetail = dao.getListDetailPromotion(Integer.parseInt(proID));// khởi tao danh sách khuyến mãi
                   
                   for (ProDetailDTO p : ListDetail) {
                       if(p.getUser().getUserID() == Integer.parseInt(userID)){
                           flag = false;
                       }
                   }
                   session.setAttribute("listDetail", ListDetail);
                   
               }else{
                   for (ProDetailDTO p : list) {
                       if(p.getUser().getUserID() == Integer.parseInt(userID)){
                           flag = false;
                       }
                   }
                                    
               }
               
               if(flag){
                   if(userDTO != null){// 
                       userDTO.setRank(5);
                       list.add(new ProDetailDTO(0, Integer.parseInt(proID), userDTO, dateJoin));
                       session.setAttribute("listDetail", list);
                       request.setAttribute("ADDSUCCESS", "Add successfully!");
                       url = "promotionDetail.jsp";
                       
                   }
               }else{
                   request.setAttribute("Warning", "User is already exist in this promotion");
               }
               
           }            
        } catch (SQLException ex) {
            log("AddpromotionController + SQLException: " + ex.getMessage());
        } catch (NamingException ex) {
            log("AddpromotionController + NamingEx: " + ex.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
