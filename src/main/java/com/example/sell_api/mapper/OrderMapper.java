package com.example.sell_api.mapper;

import com.example.sell_api.model.dto.OrderDto;
import com.example.sell_api.model.entity.Item;
import com.example.sell_api.model.entity.Order;
import com.example.sell_api.model.request.OrderRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order orderRequestToMail(OrderRequest orderRequest);

    OrderDto orderToOrderDto(Order order);

    @Mapping(target = "id", ignore = true)
    Order itemToOrder(Item item);
}
