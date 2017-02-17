package by.bsuir.spp.bean.entity;

public class Country {
    private String name;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"Country\": { \"name\": \"%s\", \"createdAt\": \"%s\", \"updatedAt\": \"%s\" }";

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
        result = String.format(jsonFormat, this.name, this.createdAt, this.updatedAt);
        return result;
    }
}
