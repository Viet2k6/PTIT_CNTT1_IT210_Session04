package com.restaurant.bai2.controller;

import com.restaurant.bai2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("controllerBai2")
@RequestMapping("/bai2")
public class LegacyController {
    private final OrderService orderService;

    @Autowired
    public LegacyController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(@RequestParam(value = "category", required = false, defaultValue = "chay") String category) {
        return "Thuc don danh cho loai mon: " + category;
    }

    @PostMapping("/orders")
    @ResponseBody
    public String createOrder() {
        return orderService.createOrder();
    }
}