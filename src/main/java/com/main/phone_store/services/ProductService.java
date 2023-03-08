package com.main.phone_store.services;



import com.main.phone_store.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);

    // Read  list operation
    List<Product> fetchProductList();

    // Read  by id
    Optional<Product> getProductByID(int product_id);
    // Update operation
    Product updateProduct(Product product, int product_id);

    // Delete operation
    void deleteProduct( int product_id);
}
