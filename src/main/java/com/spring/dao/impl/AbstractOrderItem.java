package com.spring.dao.impl;

import com.spring.dao.IOrderItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractOrderItem<T,I> implements IOrderItemDao<T,I> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public AbstractOrderItem(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
