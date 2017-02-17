package by.bsuir.spp.service;


import by.bsuir.spp.bean.Result;
import by.bsuir.spp.service.exception.ServiceException;

public interface IService {
    Result getAllDatabaseInformation() throws ServiceException;
}
