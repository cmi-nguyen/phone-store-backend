package com.main.phone_store.services;

import com.main.phone_store.entities.Brand;


import java.util.List;
import java.util.Optional;

public interface BrandService {
    Brand saveBrand(Brand brand);

    // Read  list operation
    List<Brand> fetchBrandList();

    // Read  by id
    Optional<Brand> getBrandByID(int brand_id);
    // Update operation
    Brand updateBrand(Brand brand, int brand_id);

    // Delete operation
    void deleteBrand( int brand_id);
}
