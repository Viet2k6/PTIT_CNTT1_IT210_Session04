package com.restaurant.bai5.repository;

import org.springframework.stereotype.Repository;

@Repository("RepositoryBai5")
public class OrderRepository {
    public String getOrder(Long id) {
        return "Chi tiet don hang so: " + id;
    }

    public String getAllOrders() {
        return "Danh sach toan bo don hang (Bai 5)";
    }

    public String getMenu(String category) {
        return "Thuc don danh cho loai mon: " + category;
    }

    public String createOrder() {
        return "Tao moi don hang thanh cong";
    }

    public String cancelOrder(Long id) {
        return "Da huy don hang so: " + id;
    }
}