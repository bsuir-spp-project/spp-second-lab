package by.bsuir.spp.bean.entity;

public class Vote {
    private String userId;
    private String petitionId;
    private String reason;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"Vote\": { \"userId\":  %s, \"petitionId\":  %s, \"reason\":  \"%s\"," +
                                                " \"createdAt\":  \"%s\", \"updatedAt\":  \"%s\" }";

    public String getPetitionId() {
        return petitionId;
    }

    public void setPetitionId(String petitionId) {
        this.petitionId = petitionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        String result;
        result = String.format(jsonFormat, this.userId, this.petitionId, this.reason, this.createdAt, this.updatedAt);
        return result;
    }
}
