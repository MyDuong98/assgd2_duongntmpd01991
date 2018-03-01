/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ConnectDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mỹ Dương
 */
@WebServlet(name = "khachhangDAO", urlPatterns = {"/khachhangDAO"})
public class khachhangDAO extends HttpServlet {

   SimpleDateFormat simpleDayFomat = new SimpleDateFormat("yyyy-MM-dd");

    public int addkhachhang(Product khachhang) throws SQLException {
        Connection conn = null;
        PreparedStatement preparedsttm = null;
        try {
            conn = new ConnectDB().getConnect();
            String sSQLInsert = "INSERT INTO `khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SDT`, `Email`) VALUES ( ?, ?, ?, ?, ?);";
            preparedsttm = conn.prepareStatement(sSQLInsert);
            preparedsttm.setInt(1, khachhang.getMaKH());
            preparedsttm.setString(2, khachhang.getTenKH());
            preparedsttm.setString(3, khachhang.getDiaChi());
            preparedsttm.setString(4, khachhang.getSDT());
            preparedsttm.setString(5, khachhang.getEmail());

            preparedsttm.setInt(5, Integer.parseInt(khachhang.getIdDanhMuc().getCategoryID()));
            if (preparedsttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
            return -1;
        }
        return -1;
    }

    public static List<Product> getAllKhachhang() throws SQLException {
        Connection conn = null;
        List<Product> listSP = new ArrayList<>();
        ConnectDB cn = new ConnectDB();
        conn = cn.getConnect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT khachhang.MaKH,khachhang.TenKH,khachhang.DiaChi,khachhang.SDT,khachhang.Email,danhmuc.idDanhMuc,danhmuc.tenDanhMuc  FROM sanpham INNER JOIN danhmuc ON danhmuc.idDanhMuc=sanpham.idDanhmuc");
            while (rs.next()) {
                Product book = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        new Category(rs.getString(5), rs.getString(6)));
                listSP.add(book);

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }

        conn.close();
        return listSP;
    }

    public int deleteProduct(String id) {//DELETE FROM `product` WHERE 
        Connection conn = null;
        PreparedStatement preparedsttm = null;
        try {
            conn = new ConnectDB().getConnect();
            String sSQLInsert = "DELETE FROM `sanpham` WHERE `id`='" + Integer.parseInt(id) + "'";
            preparedsttm = conn.prepareStatement(sSQLInsert);
            if (preparedsttm.executeUpdate() == 1) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
            return -1;
        }
        return -1;
    }

    public static Product getkhachhangbyID(String id) throws SQLException {
        Connection con = null;
        Product pr = null;
        ConnectDB cn = new ConnectDB();
        con = cn.getConnect();
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT `id`,`name`,`quaty`,`price`,danhmuc.idDanhMuc,danhmuc.tenDanhMuc FROM sanpham INNER JOIN danhmuc ON danhmuc.idDanhmuc=sanpham.idDanhMuc where id='" + Integer.parseInt(id) + "'");
        while (rs.next()) {
            pr = new Product(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getInt(3), rs.getInt(4), new Category(rs.getString(5), rs.getString(6)));
        }
        con.close();
        return pr;

    }

    public static int updatekhachhang(khachhang khachhang) throws SQLException {
   Connection conn = null;
        PreparedStatement preparedsttm = null;
        try {
            conn = new ConnectDB().getConnect();
            String sSQLInsert = "UPDATE `khachhang` SET `MaKH`=?,`TenKH`=?,`DiaChi`=?,`SDT`=?,`Email`=?,`idDanhMuc`=? WHERE `id`=?;";
            preparedsttm = conn.prepareStatement(sSQLInsert);
            preparedsttm.setInt(1, khachhang.getMaKH());
            preparedsttm.setString(2, khachhang.getTenKH());
            preparedsttm.setString(3, khachhang.getDiaChi());
            preparedsttm.setString(4, khachhang.getSDT());
            preparedsttm.setString(5, khachhang.getEmail());
            

        
            if (preparedsttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
            return -1;
        }
       return -1;

    }

    public static void main(String[] args) throws SQLException {
        khachhang pr = new khachhang(1, "tuyen", 12, 120000, new Category("1", ""));
        System.out.println(updatekhachhang(pr));

    }
}