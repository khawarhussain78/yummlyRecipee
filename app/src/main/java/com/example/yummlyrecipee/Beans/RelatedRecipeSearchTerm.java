package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelatedRecipeSearchTerm {

    @SerializedName("allowedIngredient")
    @Expose
    private String allowedIngredient;

    public String getAllowedIngredient() {
        return allowedIngredient;
    }

    public void setAllowedIngredient(String allowedIngredient) {
        this.allowedIngredient = allowedIngredient;
    }

}