package com.mri.Mri.Ecommerce.service;


import com.mri.Mri.Ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(String category);
}
