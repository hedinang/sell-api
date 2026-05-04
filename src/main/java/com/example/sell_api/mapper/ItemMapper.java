package com.example.sell_api.mapper;

import com.example.sell_api.model.dto.ItemDto;
import com.example.sell_api.model.entity.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDto itemToItemDto(Item item);
}