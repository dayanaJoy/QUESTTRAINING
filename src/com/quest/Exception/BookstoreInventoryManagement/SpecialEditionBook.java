package com.quest.Exception.BookstoreInventoryManagement;

public class SpecialEditionBook extends Book {
    private String specialFeature;
    public SpecialEditionBook(String title, String author, double price, int stock, String specialFeautre) {
        super(title, author, price, stock);
        this.specialFeature = specialFeautre;
    }
    public String getSpecialFeautre() {
        return specialFeature;
    }
    public void setSpecialFeautre(String specialFeautre) {
        this.specialFeature = specialFeautre;
    }
    @Override
    public String toString() {
        return super.toString() + ", SpecialEditionBook [specialFeature=" + specialFeature + "]";
    }
}
