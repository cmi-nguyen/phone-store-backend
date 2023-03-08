package com.main.phone_store.services;

import com.main.phone_store.entities.Product;
import com.main.phone_store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductImpl implements ProductService{
    @Autowired private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> fetchProductList() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductByID(int product_id) {
        return productRepository.findById(product_id);
    }

    @Override
    public Product updateProduct(Product product, int product_id) {
        Product productDB = productRepository.findById(product_id).get();
        if (Objects.nonNull(product.getProductID())){
            productDB.setProductID(product.getProductID());
        }
        if  (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())){
            productDB.setProductName(product.getProductName());
        }
        if (Objects.nonNull(product.getImgURL()) ){
            productDB.setImgURL(product.getImgURL());
        }
        if (Objects.nonNull(product.getPrice())){
            productDB.setPrice(product.getPrice());
        }
        if (Objects.nonNull(product.getStock())){
            productDB.setStock(product.getStock());
        }
        if (Objects.nonNull(product.getDescription())){
            productDB.setDescription(product.getDescription());
        }
        if(Objects.nonNull(product.getBrandID())){
            productDB.setBrandID(product.getBrandID());
        }

        return saveProduct(product);
    }

    @Override
    public void deleteProduct(int product_id) {
        productRepository.deleteById(product_id);
    }
}
