package com.spring.service.impl;

import com.spring.dao.impl.OrderItemImpl;
import com.spring.exception.Error;
import com.spring.exception.OrderItemException;
import com.spring.model.OrderItem;
import com.spring.service.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements IOrderItemService {
    @Autowired
    OrderItemImpl orderItem;

    @Override
    public Integer save(OrderItem item) {
        try {
            return orderItem.save(item);
        } catch (OrderItemException e) {
            throw new OrderItemException(new Error("data is not saved",500));
        }
    }

    @Override
    public Integer update(OrderItem item, Integer id) {
        try {
            return orderItem.update(item,id);
        } catch (OrderItemException e) {
            throw new OrderItemException(new Error("data is not updatd",500));
        }
    }

    @Override
    public Integer delete(Integer id) {
        try {
            return orderItem.delete(id);
        } catch (OrderItemException e) {
            throw new OrderItemException(new Error("data is not deleted",500));
        }
    }

    @Override
    public List<OrderItem> selectAll() {
        return orderItem.select();
    }

    @Override
    public List<OrderItem> selectAll(Integer orderId) {
        return orderItem.select(orderId);
    }

    @Override
    public OrderItem selectById(Integer id) {
        return orderItem.selectById(id);
    }
}
