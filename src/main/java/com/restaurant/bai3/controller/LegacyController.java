package com.restaurant.bai3.controller;

import com.restaurant.bai3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("controllerBai3")
@RequestMapping("/bai3")
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

    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(@RequestParam(value = "category", required = false, defaultValue = "chay") String category) {
        return "Thuc don danh cho loai mon: " + category;
    }

    @GetMapping("/orders/{id}")
    @ResponseBody
    public String getOrderDetail(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/orders")
    @ResponseBody
    public String createOrder() {
        return orderService.createOrder();
    }
}
