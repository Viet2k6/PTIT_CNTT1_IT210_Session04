package com.restaurant.bai5.controller;

import com.restaurant.bai5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@Controller("orderControllerBai5")
@RequestMapping("/bai5")
public class LegacyController {
    private final OrderService orderService;

    @Autowired
    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getOrder(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }

    @GetMapping
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(@RequestParam(value = "category", required = false, defaultValue = "chay") String category) {
        return orderService.getMenu(category);
    }

    @PostMapping
    @ResponseBody
    public String createOrder() {
        return orderService.createOrder();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String cancelOrder(@PathVariable("id") Long id) {
        return orderService.cancelOrder(id);
    }


    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseBody
    public String handleTypeMismatch() {
        return "ID don hang phai la so hop le";
    }
}