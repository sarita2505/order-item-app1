package com.spring.dao;

import java.util.List;

public interface IOrderItemDao<T, I> {
    public I save(T t);

    I update(T t, I i);

    I delete(I i);

    List<T> select();

    List<T> select(Integer orderId);

    T selectById(I i);

    List<T> findOrderData(I i);

}
