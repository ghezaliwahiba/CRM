package com.example.demo.controller;
import com.example.demo.model.Client;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class OrderController {

    @Autowired
    OrderService orderService;
/*
    @GetMapping("orders")
    public List<Order> getOrders() {
        return orderService.getAll();
    }
 */
    @GetMapping("orders")
    public List<OrderDTO> findAll(){
        List<OrderDTO> dtos = new ArrayList<>();
        for(Order entity : orderService.getAll())
            dtos.add(OrderMapper.convertToDTO(entity));
        return dtos;
    }
    @PostMapping("orders")
    public void addOrder(@RequestBody OrderDTO orderdto) {
        orderService.add(orderdto);
    }

    @DeleteMapping("orders/{id}")
    public void delete(@PathVariable("id") Integer id) {
        orderService.delete(id);
    }

    @PutMapping("orders/{id}")
    public void update(@RequestBody Order order, @PathVariable("id") Integer id) {
        orderService.update(id, order);
    }
    @GetMapping("orders/{id}")
    public ResponseEntity<Order> findById(@PathVariable("id") Integer id){
        Optional<Order> opt = orderService.findById(id);
        if(opt.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(opt.get());
    }
}
