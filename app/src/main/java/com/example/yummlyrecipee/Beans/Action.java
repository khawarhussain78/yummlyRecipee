package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("stepGroups")
    @Expose
    private List<StepGroup> stepGroups = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StepGroup> getStepGroups() {
        return stepGroups;
    }

    public void setStepGroups(List<StepGroup> stepGroups) {
        this.stepGroups = stepGroups;
    }

}