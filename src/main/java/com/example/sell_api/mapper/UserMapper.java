package com.example.sell_api.mapper;

import com.example.sell_api.model.entity.User;
import com.example.sell_api.model.request.UserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userRequestToUser(UserRequest userRequest);
}
