package by.bsuir.spp.dao.impl;

import by.bsuir.spp.bean.Result;
import by.bsuir.spp.dao.IDataBase;
import by.bsuir.spp.dao.exception.DAOException;
import by.bsuir.spp.dao.util.ResultHandler;

import java.sql.*;
import java.util.ArrayList;

public class DataBase implements IDataBase {

    private final static String URL = "jdbc:mysql://localhost:3306/petition?useSSL=false&characterEncoding=UTF-8";
    private final static String USER = "root";
    private final static String PASSWORD = "123456";

    private final static String SQL_SELECT_CATEGORIES = "SELECT * FROM categories";
    private final static String SQL_SELECT_CITIES = "SELECT * FROM cities";
    private final static String SQL_SELECT_COMMENTS = "SELECT * FROM comments";
    private final static String SQL_SELECT_COUNTRIES = "SELECT * FROM countries";
    private final static String SQL_SELECT_PETITIONS = "SELECT * FROM petitions";
    private final static String SQL_SELECT_ROLES = "SELECT * FROM roles";
    private final static String SQL_SELECT_USERS = "SELECT * FROM users";
    private final static String SQL_SELECT_USERS_INFORMATION = "SELECT * FROM user_info";
    private final static String SQL_SELECT_VOTES = "SELECT * FROM votes";

    public Result getAllDatabaseInformation() throws DAOException {
        Result result = null;
        Connection connection = null;
        Statement statement = null;


        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();

            ArrayList temp = new ArrayList();
            ResultSet resultSet;

            resultSet = statement.executeQuery(SQL_SELECT_CATEGORIES);
            temp.add(ResultHandler.categoryElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_CITIES);
            temp.add(ResultHandler.cityElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_COMMENTS);
            temp.add(ResultHandler.commentElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_COUNTRIES);
            temp.add(ResultHandler.countryElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_PETITIONS);
            temp.add(ResultHandler.petitionElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_ROLES);
            temp.add(ResultHandler.roleElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_USERS);
            temp.add(ResultHandler.userElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_USERS_INFORMATION);
            temp.add(ResultHandler.userInformationElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_VOTES);
            temp.add(ResultHandler.voteElements(resultSet));

            result = ResultHandler.getResult(temp);
        } catch(SQLException exception) {
            throw new DAOException(exception);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
        return result;
    }

    public void init() throws DAOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            throw new DAOException(exception);
        }
    }

}
