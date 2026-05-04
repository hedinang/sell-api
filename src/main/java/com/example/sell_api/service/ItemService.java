package com.example.sell_api.service;

import com.example.sell_api.model.dto.ItemDto;
import com.example.sell_api.model.entity.User;
import com.example.sell_api.model.request.ItemRequest;

import java.util.List;

public interface ItemService {
    List<ItemDto> getList(ItemRequest itemRequest, User user);

    ItemDto getDetail(String itemId, User user);
}
