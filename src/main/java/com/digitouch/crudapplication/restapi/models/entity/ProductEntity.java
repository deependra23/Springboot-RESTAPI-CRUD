package com.digitouch.crudapplication.restapi.models.entity;

import javax.persistence.*;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long product_id;
    @Column
    private String product_category;
    @Column
    private String product_desc;
    @Column
    private String available;

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }


    public ProductEntity(long product_id, String product_category, String product_desc, String available) {
        this.product_id = product_id;
        this.product_category = product_category;
        this.product_desc = product_desc;
        this.available = available;
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


    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
    public ProductEntity(){

    }
}
