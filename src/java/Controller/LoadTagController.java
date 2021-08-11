/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import DTO.UserDTO;
import java.io.IOException;
import java.sql.SQLException;
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
@WebServlet(name = "LoadTagController", urlPatterns = {"/LoadTagController"})
public class LoadTagController extends HttpServlet {

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
        String tag = request.getParameter("tag");
        int roleID = 0;
        String url = "error.html";
        
        try {
            
            UserDAO dao = new UserDAO();
            if("all".equals(tag)){
                request.setAttribute("tag", "all");
            }
            else if("admin".equals(tag)){
                roleID = 1;
                request.setAttribute("tag", "admin");
            }else if("user".equals(tag)){
                roleID = 2;
                request.setAttribute("tag", "user");
            }
            HttpSession session = request.getSession(false);
            if(session != null){
                List<UserDTO> list;
                if(roleID > 0){
                    list = dao.getListByTag(roleID);
                    session.setAttribute("ListAccount", list);
                }else{
                    list = dao.getListAccount();
                    session.setAttribute("ListAccount", list);
                }              
                url = "home.jsp";            
            }
            
          
        }catch (SQLException ex) {
            log("LoginController + SQLException: " + ex.getMessage());
        } catch (NamingException ex) {
            log("LoginController + ClassNotFoundException: " + ex.getMessage());
        }finally{
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
