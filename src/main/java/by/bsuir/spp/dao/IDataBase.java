package by.bsuir.spp.dao;

import by.bsuir.spp.bean.Result;
import by.bsuir.spp.dao.exception.DAOException;

public interface IDataBase {
    Result getAllDatabaseInformation() throws DAOException;
    void init() throws DAOException;
}
