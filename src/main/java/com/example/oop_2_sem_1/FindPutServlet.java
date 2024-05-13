package com.example.oop_2_sem_1;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "FindPutServlet", value = "/map")
public class FindPutServlet extends HttpServlet {

    private Map<String, String> data = new HashMap<>();


    public void init() {
        data.put("1", "Привет");
        data.put("2", "Мир");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key_search = request.getParameter("key_search");
        String key_put = request.getParameter("key_put");
        String newValue = request.getParameter("newValue");


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Замена значения
        if (key_put != null && newValue != null) {
            data.put(key_put, newValue);
            out.println("<h2>Значение для ключа " + key_put + " теперь " + newValue + "</h2>");
        }
        else if (key_search != null) {
            // Поиск значения по ключу
            String value = data.get(key_search);
            if (value != null) {
                out.println("<h2>Значение ключа " + key_search + ": " + value + "</h2>");
            } else {
                out.println("<h2>Значение для ключа " + key_search + " не найдено</h2>");
            }
        } else {
            out.println("<h2>Параметры запроса не переданы</h2>");
        }
    }
}