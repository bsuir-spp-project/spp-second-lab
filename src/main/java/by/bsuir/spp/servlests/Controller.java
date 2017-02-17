package by.bsuir.spp.servlests;

import by.bsuir.spp.bean.Result;
import by.bsuir.spp.service.IService;
import by.bsuir.spp.service.exception.ServiceException;
import by.bsuir.spp.service.factory.ServiceFactory;
import by.bsuir.spp.service.impl.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private final static String RESULT = "result";
    private final static String PATH = "WEB-INF/jsp/information.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        requestHandler(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        requestHandler(request, response);
    }

    private void requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        IService service = serviceFactory.getService();

        try {
            Result result = service.getAllDatabaseInformation();
            request.setAttribute(RESULT, result);
            request.getRequestDispatcher(PATH).forward(request, response);
        } catch (ServiceException exception) {
            exception.printStackTrace();
            response.sendError(500);
        }
    }
}
