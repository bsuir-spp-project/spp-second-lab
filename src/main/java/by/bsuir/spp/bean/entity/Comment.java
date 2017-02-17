package by.bsuir.spp.bean.entity;


public class Comment {
    private String text;
    private String userId;
    private String petitionId;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"Comment\": { \"text\": \"%s\", \"userId\": %s," +
                                                " \"petitionId\": %s, \"createdAt\": \"%s\", \"updatedAt\": \"%s\" }";

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPetitionId() {
        return petitionId;
    }

    public void setPetitionId(String petitionId) {
        this.petitionId = petitionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        String result;
        result = String.format(jsonFormat, this.text, this.userId, this.petitionId, this.createdAt, this.updatedAt);
        return result;
    }
}
