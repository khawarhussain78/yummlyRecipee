package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nutrition_ {

    @SerializedName("mobileSectionName")
    @Expose
    private String mobileSectionName;
    @SerializedName("nutritionEstimates")
    @Expose
    private List<NutritionEstimate> nutritionEstimates = null;

    public String getMobileSectionName() {
        return mobileSectionName;
    }

    public void setMobileSectionName(String mobileSectionName) {
        this.mobileSectionName = mobileSectionName;
    }

    public List<NutritionEstimate> getNutritionEstimates() {
        return nutritionEstimates;
    }

    public void setNutritionEstimates(List<NutritionEstimate> nutritionEstimates) {
        this.nutritionEstimates = nutritionEstimates;
    }

}