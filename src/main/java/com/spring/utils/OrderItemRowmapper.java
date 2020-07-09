package com.spring.utils;

import com.spring.model.OrderItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderItemRowmapper implements RowMapper<OrderItem> {
    @Override
    public OrderItem mapRow(ResultSet resultSet, int i) throws SQLException {
        OrderItem orderItem=new OrderItem();
        orderItem.setId(resultSet.getInt(1));
        orderItem.setProductCode(resultSet.getInt(2));
        orderItem.setProductNmae(resultSet.getString(3));
        orderItem.setQuantity(resultSet.getInt(4));
        orderItem.setOrderId(resultSet.getInt(5));
        return orderItem;
    }
}
