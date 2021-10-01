package com.digitouch.crudapplication.restapi.controllers;

import com.digitouch.crudapplication.restapi.models.entity.ProductEntity;
import com.digitouch.crudapplication.restapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    //saving product information
    @PostMapping(value = "/api/v1/saveproduct")
    public String saveProduct(@RequestBody ProductEntity productEntity){
         productRepo.save(productEntity);
         return "product has been saved in the database";
    }

    //updating product
    @PutMapping(value = "/update/{id}")
    public String updateProduct(@PathVariable long id, @RequestBody ProductEntity productEntity){
        //this line find the particular information from database based on given id and save new information
        ProductEntity updatedProduct = productRepo.findById(id).get();

        updatedProduct.setProduct_desc(productEntity.getProduct_desc());
        updatedProduct.setProduct_category(productEntity.getProduct_category());
        updatedProduct.setAvailable(productEntity.getAvailable());

        //saving data into database
        productRepo.save(updatedProduct);

        return "product has been updated";

    }
    @DeleteMapping(value = "/api/v1/deleteproduct/{id}")
    public String deleteProduct(@PathVariable long id){
        ProductEntity delProduct = productRepo.findById(id).get();
        productRepo.delete(delProduct);
        return "Product Has been deleted with id" + id;

    }

    @GetMapping(value = "/findproduct")
    public List<ProductEntity> getProduct(){

        return productRepo.findAll();
    }


}
