/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Bai10 {
    public static void main(String[] args) {
        Employee5[] list = new Employee5[2];
        list[0] = new OfficeEmployee("E01", "Nam", 10000000);
        list[1] = new SalesEmployee("E02", "Hoa", 7000000, 3000000);

        double total = 0;
        for (Employee5 e : list) {
            double salary = e.calculateSalary();
            System.out.println(e.name + " - Lương: " + salary);
            total += salary;
        }

        System.out.println("Tổng lương công ty: " + total);
    }
}
