/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Bai5 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.brand = "Tesla";
        e.seatCount = 5;
        e.batteryCapacity = 75;

        e.start();
        System.out.println("Hãng: " + e.brand);
        System.out.println("Số chỗ: " + e.seatCount);
        System.out.println("Pin: " + e.batteryCapacity + " kWh");
    }
}
