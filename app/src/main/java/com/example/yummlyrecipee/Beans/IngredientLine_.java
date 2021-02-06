package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IngredientLine_ {

    @SerializedName("ingredient")
    @Expose
    private String ingredient;
    @SerializedName("ingredientId")
    @Expose
    private String ingredientId;
    @SerializedName("sortOrder")
    @Expose
    private Integer sortOrder;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("remainder")
    @Expose
    private String remainder;
    @SerializedName("amount")
    @Expose
    private Amount_ amount;

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRemainder() {
        return remainder;
    }

    public void setRemainder(String remainder) {
        this.remainder = remainder;
    }

    public Amount_ getAmount() {
        return amount;
    }

    public void setAmount(Amount_ amount) {
        this.amount = amount;
    }

}