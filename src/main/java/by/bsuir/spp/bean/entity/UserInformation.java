package by.bsuir.spp.bean.entity;

public class UserInformation {
    private String name;
    private String surname;
    private String cityId;
    private String userId;

    private final static String jsonFormat = "\"UserInformation\": { \"name\":  \"%s\", \"surname\":  \"%s\"," +
                                                " \"cityId\":  %s, \"userId\":  %s }";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String city) {
        this.cityId = city;
    }

    @Override
    public String toString() {
        String result;
        result = String.format(jsonFormat, this.name, this.surname, this.cityId, this.userId);
        return result;
    }
}
