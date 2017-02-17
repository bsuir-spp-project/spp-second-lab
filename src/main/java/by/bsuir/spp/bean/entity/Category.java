package by.bsuir.spp.bean.entity;

public class Category {
    private String name;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"Category\": { \"name\": \"%s\", \"createdAt\": \"%s\", \"updatedAt\": \"%s\" }";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    @Override
    public String toString() {
        String result;
        result = String.format(jsonFormat, this.name, this.createdAt, this.updatedAt);
        return result;
    }
}
