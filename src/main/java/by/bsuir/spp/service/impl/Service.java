package by.bsuir.spp.service.impl;

import by.bsuir.spp.dao.IDataBase;
import by.bsuir.spp.dao.exception.DAOException;
import by.bsuir.spp.dao.factory.DAOFactory;
import by.bsuir.spp.dao.impl.DataBase;
import by.bsuir.spp.service.IService;
import by.bsuir.spp.bean.Result;
import by.bsuir.spp.service.exception.ServiceException;

public class Service implements IService {

    public Result getAllDatabaseInformation() throws ServiceException {
        IDataBase dataBase = getDataBase();
        Result result = null;

        try {
            result = dataBase.getAllDatabaseInformation();
        } catch (DAOException exception) {
            throw new ServiceException(exception);
        }

        return result;
    }

    public void init() throws ServiceException {
        IDataBase dataBase = getDataBase();

        try {
            dataBase.init();
        } catch (DAOException exception) {
            throw new ServiceException(exception);
        }
    }

    private IDataBase getDataBase() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        return daoFactory.getDataBase();
    }
}
