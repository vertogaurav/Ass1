package com.company;

import java.util.Date;
import java.util.Objects;

public class Record {
    String uuid;
    Date timestamp;
    String source;
    Date date;
    String eventType;
    String eventCategory;
    String eventAction;
    String eventLabel;
    Integer eventValue;
    Date createdAt;
    Date lastUpdatedAt;
    String location;
    Long id;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getEventAction() {
        return eventAction;
    }

    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    public String getEventLabel() {
        return eventLabel;
    }

    public void setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
    }

    public Integer getEventValue() {
        return eventValue;
    }

    public void setEventValue(Integer eventValue) {
        this.eventValue = eventValue;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Record)) return false;
        Record record = (Record) o;
        return Objects.equals(getUuid(), record.getUuid()) && Objects.equals(getTimestamp(), record.getTimestamp()) && Objects.equals(getSource(), record.getSource()) && Objects.equals(getDate(), record.getDate()) && Objects.equals(getEventType(), record.getEventType()) && Objects.equals(getEventCategory(), record.getEventCategory()) && Objects.equals(getEventAction(), record.getEventAction()) && Objects.equals(getEventLabel(), record.getEventLabel()) && Objects.equals(getEventValue(), record.getEventValue()) && Objects.equals(getCreatedAt(), record.getCreatedAt()) && Objects.equals(getLastUpdatedAt(), record.getLastUpdatedAt()) && Objects.equals(getLocation(), record.getLocation()) && Objects.equals(getId(), record.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getTimestamp(), getSource(), getDate(), getEventType(), getEventCategory(), getEventAction(), getEventLabel(), getEventValue(), getCreatedAt(), getLastUpdatedAt(), getLocation(), getId());
    }

    @Override
    public String toString() {
        return "Record{" +
                "uuid='" + uuid + '\'' +
                ", timestamp=" + timestamp +
                ", source='" + source + '\'' +
                ", date=" + date +
                ", eventType='" + eventType + '\'' +
                ", eventCategory='" + eventCategory + '\'' +
                ", eventAction='" + eventAction + '\'' +
                ", eventLabel='" + eventLabel + '\'' +
                ", eventValue=" + eventValue +
                ", createdAt=" + createdAt +
                ", lastUpdatedAt=" + lastUpdatedAt +
                ", location='" + location + '\'' +
                ", id=" + id +
                '}';
    }
}
