package by.bsuir.spp.bean.entity;

public class Role {
    private String roleName;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"Role\": { \"roleName\":  \"%s\", \"createdAt\":  \"%s\", \"updatedAt\":  \"%s\" }";

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        String result;
        result = String.format(jsonFormat, this.roleName, this.createdAt, this.updatedAt);
        return result;
    }
}
