package com.mycompany.ejemplomvc3;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/contacto"})
public class ContactoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/contacto.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DatosContacto contacto = new DatosContacto();
        Map<String, String[]> parametros = req.getParameterMap();
        List<String> errores = contacto.validar(parametros);
        if (errores.size() > 0) {
            req.setAttribute("errores", errores);
            req.getRequestDispatcher("/500.jsp").forward(req, resp);
        } else {
            contacto.rellenar(parametros);
            req.setAttribute("contacto", contacto);
            req.getRequestDispatcher("/WEB-INF/resultado.jsp").forward(req, resp);
        }
    }
}
