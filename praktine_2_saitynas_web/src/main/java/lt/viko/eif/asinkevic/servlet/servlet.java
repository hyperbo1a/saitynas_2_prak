package lt.viko.eif.asinkevic.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lt.viko.eif.asinkevic.transform.TransformToPDF;

import java.io.*;

@WebServlet(name="servlet",urlPatterns = {"/pdf/*"})
public class servlet extends HttpServlet {

    private void servePDFFile(HttpServletResponse response) throws IOException {
        File file = new File("src/main/resources/Reisas.pdf");
        if (!file.exists()) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=Reisas.pdf");
        response.setContentLength((int) file.length());

        try (InputStream is = new FileInputStream(file); OutputStream os = response.getOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        }
    }

    protected void serveHTMLReisas(HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='lt'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Client Order</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #e9ecef; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".container { background: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 15px rgba(0, 0, 0, 0.1); max-width: 500px; width: 100%; }");
        out.println("h1 { font-size: 28px; margin-bottom: 20px; color: #333; }");
        out.println("form { display: flex; flex-direction: column; }");
        out.println("label { margin-bottom: 8px; font-weight: bold; color: #555; }");
        out.println("input[type='text'] { padding: 10px; margin-bottom: 20px; border: 1px solid #ced4da; border-radius: 4px; font-size: 16px; }");
        out.println("input[type='submit'] { padding: 10px 15px; background-color: #007bff; color: #fff; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; }");
        out.println("input[type='submit']:hover { background-color: #0056b3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Enter First Name and Last Name</h1>");
        out.println("<form action='/pdf/GetReisasRequest' method='post'>");
        out.println("<label for='firstName'>First Name:</label>");
        out.println("<input type='text' id='firstName' name='firstName' required>");
        out.println("<label for='lastName'>Last Name:</label>");
        out.println("<input type='text' id='lastName' name='lastName' required>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void serveHTMLTelefonoNumeris(HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='lt'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Client Order</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #e9ecef; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".container { background: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 15px rgba(0, 0, 0, 0.1); max-width: 500px; width: 100%; }");
        out.println("h1 { font-size: 28px; margin-bottom: 20px; color: #333; }");
        out.println("form { display: flex; flex-direction: column; }");
        out.println("label { margin-bottom: 8px; font-weight: bold; color: #555; }");
        out.println("input[type='text'] { padding: 10px; margin-bottom: 20px; border: 1px solid #ced4da; border-radius: 4px; font-size: 16px; }");
        out.println("input[type='submit'] { padding: 10px 15px; background-color: #007bff; color: #fff; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; }");
        out.println("input[type='submit']:hover { background-color: #0056b3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Enter Telefono Numeris</h1>");
        out.println("<form action='/pdf/GetTelefonoNumerisReisasRequest' method='post'>");
        out.println("<label for='telefonoNumeris'>Telefono Numeris:</label>");
        out.println("<input type='text' id='telefonoNumeris' name='telefonoNumeris' required>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void serveHTMLValstybinisNumeris(HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='lt'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Client Order</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #e9ecef; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".container { background: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 15px rgba(0, 0, 0, 0.1); max-width: 500px; width: 100%; }");
        out.println("h1 { font-size: 28px; margin-bottom: 20px; color: #333; }");
        out.println("form { display: flex; flex-direction: column; }");
        out.println("label { margin-bottom: 8px; font-weight: bold; color: #555; }");
        out.println("input[type='text'] { padding: 10px; margin-bottom: 20px; border: 1px solid #ced4da; border-radius: 4px; font-size: 16px; }");
        out.println("input[type='submit'] { padding: 10px 15px; background-color: #007bff; color: #fff; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; }");
        out.println("input[type='submit']:hover { background-color: #0056b3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Enter Valstybinis Numeris</h1>");
        out.println("<form action='/pdf/GetValstybinisNumerisReisasRequest' method='post'>");
        out.println("<label for='valstybinisNumeris'>Valstybinis Numeris:</label>");
        out.println("<input type='text' id='valstybinisNumeris' name='valstybinisNumeris' required>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getRequestURI().endsWith("GetReisasRequest")) {
            try {
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                if (firstName == null || lastName == null) {
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST);
                    return;
                }
                TransformToPDF.convertToGetReisasClient(firstName, lastName);
                servePDFFile(response);
            } catch (Exception e) {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }
        } else if (request.getRequestURI().endsWith("GetTelefonoNumerisReisasRequest")) {
            try {
                String telefonoNumeris = request.getParameter("telefonoNumeris");
                if (telefonoNumeris == null) {
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST);
                    return;
                }
                TransformToPDF.convertToGetTelefonoNumerisReisas(telefonoNumeris);
                servePDFFile(response);
            } catch (Exception e) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        } else if (request.getRequestURI().endsWith("GetValstybinisNumerisReisasRequest")) {
            try {
                String valstybinisNumeris = request.getParameter("valstybinisNumeris");
                if (valstybinisNumeris == null) {
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST);
                    return;
                }
                TransformToPDF.convertToGetValstybinisNumerisReisas(valstybinisNumeris);
                servePDFFile(response);
            } catch (Exception e) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getRequestURI().endsWith("Reisas.pdf")) {
            servePDFFile(response);
        } else if (request.getRequestURI().endsWith("GetReisasRequest")) {
            serveHTMLReisas(response);
        } else if (request.getRequestURI().endsWith("GetTelefonoNumerisReisasRequest")) {
            serveHTMLTelefonoNumeris(response);
        } else if (request.getRequestURI().endsWith("GetValstybinisNumerisReisasRequest")) {
            serveHTMLValstybinisNumeris(response);
        } else {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>PDF</title>");
            out.println("<style>");
            out.println("html, body { height: 100%; margin: 0; padding: 0; display: flex; align-items: center; justify-content: center; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }");
            out.println("body { background-color: #e9ecef; }");
            out.println(".container { text-align: center; }");
            out.println("a { background-color: #007bff; color: white; padding: 20px 30px; text-decoration: none; border-radius: 5px; display: inline-block; margin: 10px 0; }");
            out.println("a:hover { background-color: #0056b3; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>Reisas to PDF</h1>");
            out.println("<p><a href='/pdf/GetReisasRequest'>GetReisasRequest</a></p>");
            out.println("<p><a href='/pdf/GetTelefonoNumerisReisasRequest'>GetTelefonoNumerisReisasRequest</a></p>");
            out.println("<p><a href='/pdf/GetValstybinisNumerisReisasRequest'>GetValstybinisNumerisReisasRequest</a></p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}


