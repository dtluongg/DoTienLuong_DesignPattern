package org.example._1_Singleton_Pattern;

public class SimpleSingleton {
    private static SimpleSingleton instance; // Biến static để lưu thể hiện duy nhất

    private SimpleSingleton() { // Constructor private
        System.out.println("Singleton đang được khởi tạo...");
    }

    public static synchronized SimpleSingleton getInstance() { // Phương thức static để lấy thể hiện
        if (instance == null) { // Kiểm tra nếu chưa có thể hiện nào được tạo
            System.out.println("Tạo một thể hiện Singleton mới...");
            instance = new SimpleSingleton(); // Tạo thể hiện mới
        }
        System.out.println("Trả về thể hiện Singleton đã có...");
        return instance; // Trả về thể hiện
    }

    public void doSomething() { // Một phương thức ví dụ để thể hiện hành vi của Singleton
        System.out.println("Singleton đang thực hiện một công việc gì đó...");
    }
}
