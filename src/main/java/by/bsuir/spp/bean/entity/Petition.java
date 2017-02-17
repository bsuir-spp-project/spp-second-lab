package by.bsuir.spp.bean.entity;


public class Petition {
    private String name;
    private String description;
    private String createdBy;
    private String numberNecessaryVotes;
    private String expiryDate;
    private String statusId;
    private String createdAt;
    private String updatedAt;

    private final static String jsonFormat = "\"Petition\": { \"name\":  \"%s\", \"description\":  \"%s\", \"createdBy\":  %s," +
                                                " \"numberNecessaryVotes\":  %s, \"expiryDate\":  \"%s\"," +
                                                " \"statusId\":  %s, \"createdAt\":  \"%s\", \"updatedAt\":  \"%s\" }";

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

    public String getNumberNecessaryVotes() {
        return numberNecessaryVotes;
    }

    public void setNumberNecessaryVotes(String numberNecessaryVotes) {
        this.numberNecessaryVotes = numberNecessaryVotes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        String result;
        result = String.format(jsonFormat, this.name, this.description, this.createdBy, this.numberNecessaryVotes,
                                this.expiryDate, this.statusId, this.createdAt, this.updatedAt);
        return result;
    }
}
