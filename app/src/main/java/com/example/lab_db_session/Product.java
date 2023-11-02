package com.example.lab_db_session;

public class Product {
    private int _id;
    private String _productname;
    private int _sku;

    public Product() {
    }
    public Product(int id, String productname, int sku) {
        _id = id;
        _productname = productname;
        _sku = sku;
    }
    public Product(String productname, int sku) {
        _productname = productname;
        _sku = sku;
    }

    public int getID() {
        return _id;
    }

    public void setID(int id) {
        _id = id;
    }

    public String getProductName() {
        return _productname;
    }

    public void setProductName(String productname) {
        _productname = productname;
    }

    public int getSku() {
        return _sku;
    }

    public void setSku(int sku) {
        _sku = sku;
    }
}
