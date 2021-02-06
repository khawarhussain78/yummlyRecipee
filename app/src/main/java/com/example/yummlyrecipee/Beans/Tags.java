package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tags {

    @SerializedName("course")
    @Expose
    private List<Course> course = null;
    @SerializedName("difficulty")
    @Expose
    private List<Difficulty> difficulty = null;
    @SerializedName("nutrition")
    @Expose
    private List<Nutrition> nutrition = null;
    @SerializedName("technique")
    @Expose
    private List<Technique> technique = null;

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public List<Difficulty> getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(List<Difficulty> difficulty) {
        this.difficulty = difficulty;
    }

    public List<Nutrition> getNutrition() {
        return nutrition;
    }

    public void setNutrition(List<Nutrition> nutrition) {
        this.nutrition = nutrition;
    }

    public List<Technique> getTechnique() {
        return technique;
    }

    public void setTechnique(List<Technique> technique) {
        this.technique = technique;
    }

}