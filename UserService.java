package com.mri.Mri.Ecommerce.service;

import com.mri.Mri.Ecommerce.model.User;

public interface UserService {
    User authenticate(String username, String password);
}
