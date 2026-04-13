package Controleur;
import Model.Vol;
import Service.BilletService;
import Util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;


public class VolController {


    @WebServlet("/api/vol/*")
    public class VolControllerServlet extends HttpServlet {

        private final BilletService service = new BilletService();

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {

            resp.setContentType("application/json");
            String path = req.getPathInfo();

            // GET /api/vol/bonjour
            if ("/bonjour".equals(path)) {
                resp.getWriter().write("{\"message\":\"Bonjour !\"}");
                return;
            }

            // GET /api/vol/liste
            if ("/liste".equals(path)) {
                List<Vol> vols = service.getTousLesVols();
                resp.getWriter().write(JsonUtil.toJson(vols));
                return;
            }

            resp.getWriter().write("{\"erreur\":\"Endpoint GET inconnu\"}");
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {

            resp.setContentType("application/json");
            String path = req.getPathInfo();

            // POST /api/vol/rechercher
            if ("/rechercher".equals(path)) {

                String depart = req.getParameter("depart");
                String destination = req.getParameter("destination");

                List<Vol> vols = service.rechercherVols(depart, destination);

                resp.getWriter().write(JsonUtil.toJson(vols));
                return;
            }

            resp.getWriter().write("{\"erreur\":\"Endpoint POST inconnu\"}");
        }
    }

}
