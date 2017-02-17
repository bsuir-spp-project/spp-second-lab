package by.bsuir.spp.dao.util;

import by.bsuir.spp.bean.Result;
import by.bsuir.spp.bean.entity.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ResultHandler {

    private final static String CREATED_AT = "created_at";
    private final static String UPDATED_AT = "updated_at";

    public static Result getResult(ArrayList<ArrayList> results) {
        Result result = new Result();
        for (ArrayList temp : results) {
            for (Object object : temp) {
                result.addElement(object);
            }
        }
        return result;
    }

    public static ArrayList categoryElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Category category = new Category();
            category.setName(resultSet.getString("category_name"));
            category.setCreatedAt(resultSet.getString(CREATED_AT));
            category.setUpdatedAt(resultSet.getString(UPDATED_AT));
            temp.add(category);
        }

        return temp;
    }

    public static ArrayList cityElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            City city = new City();
            city.setName(resultSet.getString("name"));
            city.setCountryId(resultSet.getString("country_id"));
            city.setUpdatedAt(resultSet.getString(UPDATED_AT));
            city.setCreatedAt(resultSet.getString(CREATED_AT));
            temp.add(city);
        }

        return temp;
    }

    public static ArrayList commentElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Comment comment = new Comment();
            comment.setText(resultSet.getString("text"));
            comment.setPetitionId(resultSet.getString("petition_id"));
            comment.setUserId(resultSet.getString("user_id"));
            comment.setUpdatedAt(resultSet.getString(UPDATED_AT));
            comment.setCreatedAt(resultSet.getString(CREATED_AT));
            temp.add(comment);
        }

        return temp;
    }

    public static ArrayList countryElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Country country = new Country();
            country.setName(resultSet.getString("name"));
            country.setUpdatedAt(resultSet.getString(UPDATED_AT));
            country.setCreatedAt(resultSet.getString(CREATED_AT));
            temp.add(country);
        }

        return temp;
    }

    public static ArrayList petitionElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Petition petition = new Petition();
            petition.setName(resultSet.getString("name"));
            petition.setDescription(resultSet.getString("description"));
            petition.setCreatedBy(resultSet.getString("created_by"));
            petition.setStatusId(resultSet.getString("status_id"));
            petition.setNumberNecessaryVotes(resultSet.getString("number_necessary_votes"));
            petition.setExpiryDate(resultSet.getString("expiry_date"));
            petition.setUpdatedAt(resultSet.getString(UPDATED_AT));
            petition.setCreatedAt(resultSet.getString(CREATED_AT));
            temp.add(petition);
        }

        return temp;
    }

    public static ArrayList roleElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Role role = new Role();
            role.setRoleName(resultSet.getString("role_name"));
            role.setUpdatedAt(resultSet.getString(UPDATED_AT));
            role.setCreatedAt(resultSet.getString(CREATED_AT));
            temp.add(role);
        }

        return temp;
    }

    public static ArrayList userElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            User user = new User();
            user.setEmail(resultSet.getString("email"));
            user.setPassword(resultSet.getString("password"));
            user.setBlocked(resultSet.getString("blocked"));
            user.setUpdatedAt(resultSet.getString(UPDATED_AT));
            user.setCreatedAt(resultSet.getString(CREATED_AT));
            temp.add(user);
        }

        return temp;
    }

    public static ArrayList userInformationElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            UserInformation userInformation = new UserInformation();
            userInformation.setUserId(resultSet.getString("user_id"));
            userInformation.setCityId(resultSet.getString("city"));
            userInformation.setName(resultSet.getString("first_name"));
            userInformation.setSurname(resultSet.getString("surname"));
            temp.add(userInformation);
        }

        return temp;
    }

    public static ArrayList voteElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Vote vote = new Vote();
            vote.setPetitionId(resultSet.getString("petition_id"));
            vote.setUserId(resultSet.getString("user_id"));
            vote.setReason(resultSet.getString("reason"));
            vote.setUpdatedAt(resultSet.getString(UPDATED_AT));
            vote.setCreatedAt(resultSet.getString(CREATED_AT));
            temp.add(vote);
        }

        return temp;
    }
}
