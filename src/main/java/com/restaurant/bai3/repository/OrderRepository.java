package com.restaurant.bai3.repository;

import org.springframework.stereotype.Repository;

@Repository("RepositoryBai3")
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    public String getOrderById(Long id) {
        return "Chi tiet don hang so " + id;
    }

    public String createOrder() {
        return "Da them don hang moi thanh cong";
    }
}
