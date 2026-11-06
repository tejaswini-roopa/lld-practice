package src.parkinglot.models;

import java.util.Date;

public class BaseModel {
    private Long id;
    private Date createdId;
    private Date LastUpdatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Date createdId) {
        this.createdId = createdId;
    }

    public Date getLastUpdatedAt() {
        return LastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        LastUpdatedAt = lastUpdatedAt;
    }
}
