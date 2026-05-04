package com.example.sell_api.service;

import com.example.sell_api.model.dto.Me;
import com.example.sell_api.model.dto.Page;
import com.example.sell_api.model.entity.User;
import com.example.sell_api.model.request.ChangePasswordRequest;
import com.example.sell_api.model.request.LoginRequest;
import com.example.sell_api.model.request.PageRequest;
import com.example.sell_api.model.request.UserRequest;
import com.example.sell_api.model.search.UserSearch;

import java.util.Map;

public interface UserService {
    Map<String, Object> loginUser(LoginRequest request);

    User findByAccessToken(String token);

    Me getMe(User user);

    boolean logout(String userId);

    Page<User> getUserList(PageRequest<UserSearch> request);

    User update(UserRequest request);

    User store(UserRequest request);

    void resetPassword(String userId, User user);

    User changePassword(String userId, ChangePasswordRequest request);
}
