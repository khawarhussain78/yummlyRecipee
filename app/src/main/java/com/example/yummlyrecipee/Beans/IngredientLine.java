package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IngredientLine {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("amount")
    @Expose
    private Amount amount;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("ingredientId")
    @Expose
    private String ingredientId;
    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("relatedRecipeSearchTerm")
    @Expose
    private List<RelatedRecipeSearchTerm> relatedRecipeSearchTerm = null;
    @SerializedName("ingredient")
    @Expose
    private String ingredient;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("remainder")
    @Expose
    private String remainder;
    @SerializedName("quantity")
    @Expose
    private Double quantity;
    @SerializedName("wholeLine")
    @Expose
    private String wholeLine;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public List<RelatedRecipeSearchTerm> getRelatedRecipeSearchTerm() {
        return relatedRecipeSearchTerm;
    }

    public void setRelatedRecipeSearchTerm(List<RelatedRecipeSearchTerm> relatedRecipeSearchTerm) {
        this.relatedRecipeSearchTerm = relatedRecipeSearchTerm;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemainder() {
        return remainder;
    }

    public void setRemainder(String remainder) {
        this.remainder = remainder;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getWholeLine() {
        return wholeLine;
    }

    public void setWholeLine(String wholeLine) {
        this.wholeLine = wholeLine;
    }

}
