package com.main.phone_store.controllers;

import com.main.phone_store.entities.Product;
import com.main.phone_store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired private ProductService productService;
    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @GetMapping("/product")
    public List<Product> fetchProductList(){
        return productService.fetchProductList();
    }
    @GetMapping("/product/{id}")
    public Optional<Product> getProductByID(@PathVariable("id") int product_id){
        return productService.getProductByID(product_id);
    }
    @PutMapping("/product/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable int product_id){
        return productService.updateProduct(product,product_id);
    }
    @DeleteMapping("/product/{id}")
    public void deleteProductByID(@PathVariable("id") int product_id){
        productService.deleteProduct(product_id);
    }
}
