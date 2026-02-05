class Vehicle {
    String brand;

    void start() {
        System.out.println("Xe đang khởi động");
    }
}

class Car extends Vehicle {
    int seatCount;
}

class ElectricCar extends Car {
    double batteryCapacity;
}

