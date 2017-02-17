package by.bsuir.spp.service.factory;

import by.bsuir.spp.service.impl.Service;

public class ServiceFactory {
    private final static ServiceFactory instance = new ServiceFactory();
    private Service service = new Service();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public Service getService() {
        return service;
    }
}
