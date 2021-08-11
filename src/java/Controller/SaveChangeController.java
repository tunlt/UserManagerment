/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import DTO.ProDetailDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
@WebServlet(name = "SaveChangeController", urlPatterns = {"/SaveChangeController"})
public class SaveChangeController extends HttpServlet {

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

        try {
            UserDAO dao = new UserDAO();
            HttpSession session = request.getSession(false);
            if (proID != "") {

                if (session != null) {
                    List<ProDetailDTO> oldList = dao.getListDetailPromotion(Integer.parseInt(proID));
                    List<ProDetailDTO> newList = (List<ProDetailDTO>) session.getAttribute("listDetail");

                    List<Integer> elementNewList = new ArrayList<>();
                    List<Integer> elementOldList = new ArrayList<>();

                    for (ProDetailDTO p : oldList) {
                        int elementOld = dao.getFields(newList, p.getUser().getUserID());
                        if (elementOld == 0) {
                            elementOldList.add(p.getUser().getUserID());
                        } else {
                            elementOldList.add(elementOld);
                        }
                    }

                    for (ProDetailDTO p : newList) {
                        int elementNew = dao.getFields(oldList, p.getUser().getUserID());
                        if (elementNew == 0) {
                            elementNewList.add(p.getUser().getUserID());
                        } else {
                            elementNewList.add(elementNew);
                        }
                    }


                    for (Integer UserID : elementOldList) {
                        dao.removeDetailPromotion(Integer.parseInt(proID), UserID);
                    }

                    for (Integer UserID : elementNewList) {
                         dao.insertDetailPromotion(Integer.parseInt(proID), UserID);
                    }
                    request.setAttribute("SAVE", "Save successfully!");
                }
            }

        } catch (SQLException ex) {
            log("SaveChangeController + SQLException: " + ex.getMessage());
        } catch (NamingException ex) {
            log("SaveChangeController + NamingEx: " + ex.getMessage());
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
