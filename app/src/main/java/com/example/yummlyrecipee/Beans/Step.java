package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Step {

    @SerializedName("displayText")
    @Expose
    private String displayText;
    @SerializedName("ingredientLines")
    @Expose
    private List<IngredientLine_> ingredientLines = null;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("video")
    @Expose
    private Video video;
    @SerializedName("equipment")
    @Expose
    private List<Equipment> equipment = null;
    @SerializedName("timers")
    @Expose
    private List<Timer> timers = null;

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public List<IngredientLine_> getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(List<IngredientLine_> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public List<Timer> getTimers() {
        return timers;
    }

    public void setTimers(List<Timer> timers) {
        this.timers = timers;
    }

}