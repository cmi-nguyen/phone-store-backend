package com.main.phone_store.controllers;

import com.main.phone_store.entities.Brand;
import com.main.phone_store.services.BrandService.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BrandController {
    @Autowired private BrandService brandService;
    @PostMapping("/brand")
    public Brand saveBrand(@RequestBody Brand brand){
        return brandService.saveBrand(brand);
    }

    // Read list mapping
    @GetMapping("/brand")
    public List<Brand> fetchBrandList(){
        return brandService.fetchBrandList();
    }

    // Read  by id.

    @GetMapping("/brand/{id}")
    public Optional<Brand> getBrandByID(@PathVariable("id") int id){
        return brandService.getBrandByID(id);
    }

    // Update  by id
    @PutMapping("/brand/{id}")
    public Brand updateBrand(@RequestBody  Brand brand, @PathVariable("id") int brand_id){
        return brandService.updateBrand(brand,brand_id);
    }
    // Delete
    @DeleteMapping("/brand/{id}")
    public void deleteBrand(@PathVariable("id") int brand_id){
        brandService.deleteBrand(brand_id);
    }
}
