package com.spring.service;

import com.spring.model.OrderItem;

import java.util.List;

public interface IOrderItemService {
    Integer save(OrderItem item);
    Integer update(OrderItem item,Integer id);
    Integer delete(Integer id);
    List<OrderItem> selectAll();
    List<OrderItem> selectAll(Integer id);
    OrderItem selectById(Integer id);
}
