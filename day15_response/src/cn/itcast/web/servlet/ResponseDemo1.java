package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2021/1/9 15:05
 * @Version 1.0
 */
@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo1");

        /*//访问/responseDemo1,会自动跳转到/responseDemo2资源
        //1.设置状态码为302
        response.setStatus(302);
        //2.设置响应头location
        response.setHeader("location", "/day15/responseDemo2");*/

        //动态获取虚拟目录
        String contextPath = request.getContextPath();
        //简单的重新定向方法
        response.sendRedirect(contextPath + "/responseDemo2");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
