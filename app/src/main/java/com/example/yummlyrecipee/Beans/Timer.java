package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timer {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("timerName")
    @Expose
    private String timerName;
    @SerializedName("repeatable")
    @Expose
    private Boolean repeatable;
    @SerializedName("maxRepeat")
    @Expose
    private Integer maxRepeat;
    @SerializedName("durationSeconds")
    @Expose
    private Integer durationSeconds;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("mappingNotificationId")
    @Expose
    private String mappingNotificationId;
    @SerializedName("finishMessage")
    @Expose
    private String finishMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimerName() {
        return timerName;
    }

    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    public Boolean getRepeatable() {
        return repeatable;
    }

    public void setRepeatable(Boolean repeatable) {
        this.repeatable = repeatable;
    }

    public Integer getMaxRepeat() {
        return maxRepeat;
    }

    public void setMaxRepeat(Integer maxRepeat) {
        this.maxRepeat = maxRepeat;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getMappingNotificationId() {
        return mappingNotificationId;
    }

    public void setMappingNotificationId(String mappingNotificationId) {
        this.mappingNotificationId = mappingNotificationId;
    }

    public String getFinishMessage() {
        return finishMessage;
    }

    public void setFinishMessage(String finishMessage) {
        this.finishMessage = finishMessage;
    }

}