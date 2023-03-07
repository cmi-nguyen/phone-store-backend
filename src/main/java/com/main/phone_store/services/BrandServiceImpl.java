package com.main.phone_store.services;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.main.phone_store.entities.Brand;
import com.main.phone_store.entities.User;
import com.main.phone_store.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand saveBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public List<Brand> fetchBrandList() {
        return brandRepository.findAll();
    }

    @Override
    public Optional<Brand> getBrandByID(int brand_id) {
        return brandRepository.findById(brand_id);
    }

    @Override
    public Brand updateBrand(Brand brand, int brand_id) {
        Brand brandDB = brandRepository.findById(brand_id).get();
        if (Objects.nonNull(brand.getBrandID())){
            brandDB.setBrandID(brand.getBrandID());
        }
        if  (Objects.nonNull(brand.getBrandName()) && !"".equalsIgnoreCase(brand.getBrandName())){
            brandDB.setBrandName(brand.getBrandName());
        }
        if (Objects.nonNull(brand.getDescription()) && !"".equalsIgnoreCase(brand.getDescription())){
            brandDB.setDescription(brand.getDescription());
        }

        return saveBrand(brandDB);
    }

    @Override
    public void deleteBrand(int brand_id) {
       brandRepository.deleteById(brand_id);
    }
}
