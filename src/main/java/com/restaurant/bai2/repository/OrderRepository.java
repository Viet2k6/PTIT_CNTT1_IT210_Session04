package com.restaurant.bai2.repository;

import org.springframework.stereotype.Repository;

@Repository("RepositoryBai2")
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang voi ID: " + id;
    }

    public String createOrder() {
        return "Da them don hang moi thanh cong";
    }
}