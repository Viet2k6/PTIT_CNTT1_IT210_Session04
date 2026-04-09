package com.restaurant.bai4.controller;

import com.restaurant.bai4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller("controllerBai4")
@RequestMapping("/bai4")
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

    @GetMapping("/products")
    public String getProducts(
            @RequestParam("category") String category,
            @RequestParam("limit") Integer limit,
            ModelMap model) {
        model.addAttribute("category", category)
                .addAttribute("limit", limit)
                .addAttribute("message", "Tim kiem thanh cong");
        return "productList";
    }
}
