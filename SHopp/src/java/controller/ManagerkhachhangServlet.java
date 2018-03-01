/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.khachhang;
import model.khachhangDAO;

/**
 *
 * @author Mỹ Dương
 */
@WebServlet(name = "ManagerkhachhangServlet", urlPatterns = {"/ManagerkhachhangServlet"})
public class ManagerkhachhangServlet extends HttpServlet {

   khachhangDAO dao = new khachhangDAO();

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String command = request.getParameter("command");
             String id = request.getParameter("idDanhMuc");
              String ten = request.getParameter("tenDanhMuc");
            if (command.equalsIgnoreCase("insert")) {
                
               
              khachhang dao = new khachhang(id, ten);
                if (dao.addkhachhang(dao) == 1) {
                    request.setAttribute("LIST_KHACHHANG", khachhangDAO.getAllkhachhang());
                    request.getRequestDispatcher("/admin/manager_khachhang.jsp").forward(request, response);

                }else{
                request.getRequestDispatcher("/admin/insert_khachhang.jsp").forward(request, response);
}

            }
            if (command.equalsIgnoreCase("delete")) {
               
                if (dao.delmokhachhang(id) == 1) {
                    request.getRequestDispatcher("/admin/manager_khachhang.jsp").forward(request, response);
                }

            }
            if (command.equalsIgnoreCase("edit")) {
               
                
                request.setAttribute("KHACHHANG", khachhangDAO.getkhachhangbyID(id));
                request.setAttribute("KHACHHANG_ID", khachhangDAO.getkhachhangbyID(id).getkhachhangID());
                request.setAttribute("LIST_KHACHHANG",  khachhangDAO.getAllkhachhang());
                request.getRequestDispatcher("/admin/update_khachhang.jsp").forward(request, response);

            }
             if (command.equalsIgnoreCase("update")) {
                khachhang khachhang = new khachhang(id, ten);
               
              dao.Updatekhachhang(khachhang);
                request.setAttribute("LIST_KHACHHANG",  khachhangDAO.getAllkhachhang());
                request.getRequestDispatcher("/admin/manager_khachhang.jsp").forward(request, response);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ManagerCategoryServlet.class.getName()).log(Level.SEVERE, null, ex);
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
