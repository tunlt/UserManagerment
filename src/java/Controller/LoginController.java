/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.RoleDAO;
import DAO.UserDAO;
import DTO.HistoryDTO;
import DTO.PromotionDTO;
import DTO.RoleDTO;
import DTO.UserDTO;
import Ulities.makeEncryptPassword;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tu
 */
public class LoginController extends HttpServlet {

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
        String url = "login.jsp";
        String userName = request.getParameter("txtUserName");
        String pw = request.getParameter("txtPassword");
        try {
            HttpSession session = request.getSession();

            UserDAO dao = new UserDAO();
            RoleDAO roleDAO = new RoleDAO();

            UserDTO dto = dao.getAccount(userName, makeEncryptPassword.encrypt(pw));
         

            List<PromotionDTO> listPro = dao.getListPromotion();
            List<UserDTO> list = dao.getListAccount();
            List<UserDTO> listUser = dao.getListAccountUser();
            List<RoleDTO> listRole = roleDAO.getListRole();

            if (dto != null) {
                if (dto.getRoleID() == 2) {
                    List<HistoryDTO> listHistory = dao.getListHistory(dto.getUserID());
                    session.setAttribute("ManageUser", dto);
                    session.setAttribute("ListPromotion", "");
                    session.setAttribute("ListRole", listRole);
                    session.setAttribute("ListHistory", listHistory);
                    url = "userhome.jsp";
                } else {
                    session.setAttribute("FULLNAME", dto.getUserName());
                    session.setAttribute("ListAccount", list);
                    session.setAttribute("getListAccountUser", listUser);
                    session.setAttribute("ListRole", listRole);
                    session.setAttribute("ListPromotion", listPro);
                    session.setAttribute("roleID", dto.getRoleID());
                    url = "home.jsp";

                }
            } else {
                request.setAttribute("LoginFailed", "Not Found");
            }

        } catch (SQLException ex) {
            log("LoginController + SQLException: " + ex.getMessage());
        } catch (NamingException ex) {
            log("LoginController + ClassNotFoundException: " + ex.getMessage());
        } catch (NoSuchAlgorithmException ex) {
            log("LoginController + NoSuchAlgothmException: " + ex.getMessage());
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
