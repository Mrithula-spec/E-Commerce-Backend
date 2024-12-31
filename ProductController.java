package com.mri.Mri.Ecommerce.controller;


import com.mri.Mri.Ecommerce.model.Product;
import com.mri.Mri.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(@RequestParam(defaultValue = "all") String category) {
        return productService.getProducts(category);
    }
}

