Cách A: Dùng URL /bai3/orders/5 kết hợp với @PathVariable. 

Cách B: Dùng URL /bai3/orders?id=5 kết hợp với @RequestParam.

Theo bài học, khi cần lấy ID của một đối tượng cụ thể, việc đặt ID trong đường dẫn (Cách A) sẽ rõ ràng, RESTful và dễ đọc hơn so với việc truyền qua query string.
Vì vậy, em lựa chọn Cách A để triển khai endpoint lấy chi tiết đơn hàng.