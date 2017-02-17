package by.bsuir.spp.bean.entity;

public class City {
    private String name;
    private String countryId;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"City\": { \"name\": \"%s\", \"countryId\": %s," +
                                                " \"createdAt\": \"%s\", \"updatedAt\": \"%s\" }";

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String result;
        result = String.format(jsonFormat, this.name, this.countryId, this.createdAt, this.updatedAt);
        return result;
    }
}
