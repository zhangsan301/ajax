package com.itheima.servlet;

import com.itheima.utils.CityUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProvinceServlet")
public class ProvinceServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //得到省份信息
        String province = CityUtil.getProvince();

        //回写到浏览器
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(province);
    }
}