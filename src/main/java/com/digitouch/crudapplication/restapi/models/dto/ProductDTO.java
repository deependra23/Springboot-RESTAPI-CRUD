package com.digitouch.crudapplication.restapi.models.dto;


public class ProductDTO {

    private long product_id;
    private String product_category;
    private String product_desc;
    private String available;

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public String Available() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
