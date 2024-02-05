package com.example.demo.service;
import com.example.demo.DAO.OrderRepository;
import com.example.demo.controller.OrderDTO;
import com.example.demo.controller.OrderMapper;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void add(OrderDTO orderdto){
        Order order= OrderMapper.convertToOrder(orderdto);
        orderRepository.save(order);
    }
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    public Optional<Order> findById(Integer id){
        return orderRepository.findById(id);
    }
    public void delete(Integer id){
        orderRepository.deleteById(id);
    }
    public void update(Integer id, Order order){
        orderRepository.save(order);
    }
}
