package com.spring.controller;

import com.spring.model.OrderItem;
import com.spring.service.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderItemConroller {
    @Autowired
    private IOrderItemService itemService;

    @PostMapping("/orderItems")
    public ResponseEntity<Integer> saveData(@RequestBody OrderItem item) {
        Integer i = itemService.save(item);
        return ResponseEntity.ok(i);
    }

    @PutMapping("/orderItems/{id}")
    public ResponseEntity<Integer> updateData(@RequestBody OrderItem item, @PathVariable("id") Integer id) {
        Integer i = itemService.update(item,id);
        return ResponseEntity.ok(i);
    }
    @DeleteMapping("/orderItems/{id}")
    public ResponseEntity<Integer> deleteData(@PathVariable("id") Integer id) {
        Integer i = itemService.delete(id);
        return ResponseEntity.ok(i);
    }
    @GetMapping("/orderItems")
    public ResponseEntity<List> getAllData() {
        List<OrderItem> orderData = itemService.selectAll();
        return ResponseEntity.ok(orderData);
    }

    @GetMapping("/orderItems/order/{orderId}")
    public ResponseEntity<List> getAllData(@PathVariable("orderId") Integer orderId) {
        List<OrderItem> orderData = itemService.selectAll(orderId);
        return ResponseEntity.ok(orderData);
    }
    @GetMapping("/orderItems/{id}")
    public ResponseEntity<OrderItem> getById(@PathVariable("id") Integer id) {
        OrderItem data1 = itemService.selectById(id);
        return ResponseEntity.ok(data1);
    }

}
