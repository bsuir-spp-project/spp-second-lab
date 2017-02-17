package by.bsuir.spp.dao.factory;

import by.bsuir.spp.dao.impl.DataBase;

public class DAOFactory {
    private static DAOFactory instance = new DAOFactory();
    private DataBase dataBase = new DataBase();

    public static DAOFactory getInstance() {
        return instance;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

}
