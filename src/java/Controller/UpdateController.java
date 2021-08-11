/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import DTO.RoleDTO;
import DTO.UserDTO;
import Ulities.makeEncryptPassword;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
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
@WebServlet(name = "UpdateController", urlPatterns = {"/UpdateController"})
public class UpdateController extends HttpServlet {

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
        String url = "manageUser.jsp";
        String id = request.getParameter("txtUserID");
        String name = request.getParameter("txtUserName");
        String email = request.getParameter("txtEmail");
        String phone = request.getParameter("txtPhone");
        String photo = request.getParameter("txtPhoto");
        String role = request.getParameter("txtRole");  // 
        String rank = request.getParameter("txtRank");  // 
        String password = request.getParameter("txtPassword");
        String newPass = request.getParameter("txtNewPassword");
        String confirmPass = request.getParameter("txtConfirmPassword");
        int roleID = 1;

        // set status: Active or non
        // set role in ListRole
        // set Phone > 12, set confirm pass
        // set ListAccount and ManageUser
        try {
            UserDAO dao = new UserDAO();
            HttpSession session = request.getSession(false);



            if (session != null) {
                List<RoleDTO> listRole = (List<RoleDTO>) session.getAttribute("ListRole");
                for (RoleDTO roleDTO : listRole) {
                    if (role.equals(roleDTO.getRoleName()) && roleDTO.getRoleID() == 2) {
                        roleID = 2;
                    }
                }

                if (Integer.parseInt(rank) <= 10 && Integer.parseInt(rank) >= 0) {
                    if (phone.length() < 12) {
                        if (newPass != "" && confirmPass != "") {
                            if (newPass.equalsIgnoreCase(confirmPass)) {
                                String converPass = makeEncryptPassword.encrypt(newPass);
                                int rs = dao.updateUser(Integer.parseInt(id), name, converPass,
                                        email, phone, photo, Integer.parseInt(rank), roleID);
                                
                                if (rs > 0) {
                                    url = "manageUser.jsp";

                                    List<UserDTO> list = dao.getListAccount();
                                    session.setAttribute("ListAccount", list);
                                    UserDTO user = new UserDTO(Integer.parseInt(id), name, converPass, email, phone, photo, Integer.parseInt(rank), roleID, 0);
                                    session.setAttribute("ManageUser", user);
                                    request.setAttribute("SUCCESS", "Change success!!");
                                }

                            } else {
                                request.setAttribute("Confirm", "Password is not match!!!");
                            }
                        } else {
                            int rs = dao.updateUser(Integer.parseInt(id), name, password,
                                    email, phone, photo, Integer.parseInt(rank), roleID);

                            if (rs > 0) {
                                url = "manageUser.jsp";
                                List<UserDTO> list = dao.getListAccount();
                                session.setAttribute("ListAccount", list);
                                UserDTO user = new UserDTO(Integer.parseInt(id), name, password, email, phone, photo, Integer.parseInt(rank), roleID, 0);
                                session.setAttribute("ManageUser", user);
                                request.setAttribute("SUCCESS", "Change Success!!");
                            }
                        }
                    } else {
                        request.setAttribute("Confirm", "Fail!, Password is not match or phone > 12 number!");
                    }
                } else {
                    request.setAttribute("Confirm", "Fail!, Rank from 0 to 10");
                }
            }

        } catch (SQLException ex) {
            log("UpdateController + SQLException: " + ex.getMessage());
        } catch (NamingException ex) {
            log("UpdateController + NamingException: " + ex.getMessage());
        } catch (NoSuchAlgorithmException ex) {
            log("UpdateController + : NoSuchAlgothmException: " + ex.getMessage());
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
