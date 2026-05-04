package com.example.sell_api.service;

import com.example.sell_api.model.dto.OrderDto;
import com.example.sell_api.model.dto.Page;
import com.example.sell_api.model.entity.Order;
import com.example.sell_api.model.entity.User;
import com.example.sell_api.model.request.ChangeStatusRequest;
import com.example.sell_api.model.request.OrderRequest;
import com.example.sell_api.model.request.PageRequest;
import com.example.sell_api.model.search.OrderSearch;

public interface OrderService {
    Order storeOrder(OrderRequest request, User user);

    void changeStatus(OrderRequest request, User user);

    void deleteOrder(OrderRequest request);

    Page<OrderDto> getOrderList(PageRequest<OrderSearch> request, User user);

    void changeStatusByOrderDate(ChangeStatusRequest request, User user);

    void changeStatusByItemDate(ChangeStatusRequest request, User user);
}
