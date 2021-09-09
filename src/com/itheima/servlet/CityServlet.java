package com.itheima.servlet;

import com.itheima.utils.CityUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CityServlet")
public class CityServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //解决post请求方式乱码
      request.setCharacterEncoding("utf-8");

       //1.得到省份名称
       String pname = request.getParameter("pname");

       //2.根据名称得到对应的城市
        String citys = CityUtil.getCitys(pname);

        //3.写回到浏览器
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(citys);

    }
}
