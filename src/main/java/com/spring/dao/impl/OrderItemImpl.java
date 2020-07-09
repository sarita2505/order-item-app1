package com.spring.dao.impl;

import com.spring.model.OrderItem;
import com.spring.utils.OrderItemRowmapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class OrderItemImpl extends AbstractOrderItem<OrderItem, Integer> {
    private static final String insert_row = "insert into orderitem(productCode,productNmae,quantity,orderId) values(?,?,?,?)";
    private static final String update_row = "update orderitem set productCode=?,productNmae=?,quantity=?,orderId=? where id=? ";
    private static final String delete_row = "delete from orderitem where id=?";
    private static final String find_row_by_id = "select * from orderitem where id=?";
    private static final String find_all = "select * from orderitem";
    public static final String find_order = "select * from orderitem where orderId=?";

    public OrderItemImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public Integer save(OrderItem orderItem) {
        return getJdbcTemplate().update(insert_row, new Object[]{orderItem.getProductCode(), orderItem.getProductNmae(), orderItem.getQuantity(), orderItem.getOrderId()});
    }

    @Override
    public Integer update(OrderItem orderData, Integer id) {
        return getJdbcTemplate().update(update_row, new Object[]{orderData.getProductCode(), orderData.getProductNmae(), orderData.getQuantity(), orderData.getOrderId(), id});
    }

    @Override
    public Integer delete(Integer id) {
        return getJdbcTemplate().update(delete_row, new Object[]{id});
    }

    @Override
    public List<OrderItem> select() {
        return getJdbcTemplate().query(find_all, new OrderItemRowmapper());
    }

    @Override
    public List<OrderItem> select(Integer orderId) {
        return getJdbcTemplate().query(find_order, new Object[] {orderId}, new OrderItemRowmapper());
    }

    @Override
    public OrderItem selectById(Integer id) {
        return getJdbcTemplate().queryForObject(find_row_by_id, new OrderItemRowmapper(), new Object[]{id});
    }

    @Override
    public List<OrderItem> findOrderData(Integer id) {
        return null;
    }
}
