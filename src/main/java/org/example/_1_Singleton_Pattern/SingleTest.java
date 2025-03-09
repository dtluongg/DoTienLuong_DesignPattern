package org.example._1_Singleton_Pattern;

public class SingleTest {
    public static void main(String[] args) {
        // Lấy thể hiện Singleton lần đầu tiên
        SimpleSingleton singleton1 = SimpleSingleton.getInstance();
        singleton1.doSomething();

        // Lấy thể hiện Singleton lần thứ hai
        SimpleSingleton singleton2 = SimpleSingleton.getInstance();
        singleton2.doSomething();

        // Kiểm tra xem cả hai biến có tham chiếu đến cùng một object không
        System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2)); // In ra: true
    }
}
