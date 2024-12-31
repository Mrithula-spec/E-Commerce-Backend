package com.mri.Mri.Ecommerce.service;


import com.mri.Mri.Ecommerce.model.Product;
import com.mri.Mri.Ecommerce.repository.ProductRepository;
import com.mri.Mri.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productimpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts(String category) {
        if (category.equals("all")) {
            return productRepository.findAll();
        }
        return productRepository.findByCategory(category);
    }
}
