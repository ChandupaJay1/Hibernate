/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import model.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author chand
 */
@WebServlet(name = "SaveUser", urlPatterns = {"/SaveUser"})
public class SaveUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        User user = new User();
        user.setId(1);
        user.setName("Chandupa");
        user.setMobile("0773729462");
        
        //        user.setName("Sahan");
//        user.setMobile("0715221982");

        session.save(user);
//      session.update(user);
//      session.delete(user);
        session.beginTransaction().commit();

    }

}
