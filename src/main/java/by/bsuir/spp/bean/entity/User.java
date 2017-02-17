package by.bsuir.spp.bean.entity;

public class User {
    private String email;
    private String password;
    private String blocked;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"User\": { \"email\":  \"%s\", \"password\":  \"%s\", \"blocked\":  %s," +
                                                " \"createdAt\":  \"%s\"," +
                                                " \"updatedAt\":  \"%s\" }";


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
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
        result = String.format(jsonFormat, this.email, this.password, this.blocked,
                                this.createdAt, this.updatedAt);
        return result;
    }
}
