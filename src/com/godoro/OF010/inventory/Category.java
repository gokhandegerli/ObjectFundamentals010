package com.godoro.OF010.inventory;

import java.util.List;

public class Category {

    private long categoryId;
    private String categorName;
    private List<Product> productList;



    public Category() {
    }

    public Category(long categoryId, String categorName) {
        this.categoryId = categoryId;
        this.categorName = categorName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategorName() {
        return categorName;
    }

    public void setCategorName(String categorName) {
        this.categorName = categorName;
    }
}
