package com.example.BillingSoftware.service;

import com.example.BillingSoftware.io.UserRequest;
import com.example.BillingSoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
