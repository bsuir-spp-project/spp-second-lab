package by.bsuir.spp.listener;

import by.bsuir.spp.service.exception.ServiceException;
import by.bsuir.spp.service.impl.Service;
import by.bsuir.spp.service.factory.ServiceFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            Service service = serviceFactory.getService();
            service.init();
        } catch (ServiceException exception) {
            exception.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
