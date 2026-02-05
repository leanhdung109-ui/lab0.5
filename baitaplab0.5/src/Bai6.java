/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Bai6 {
    public static void main(String[] args) {
        Employee[] list = new Employee[2];
        list[0] = new FullTimeEmployee(12000000);
        list[1] = new PartTimeEmployee(80, 50000);

        for (Employee e : list) {
            System.out.println("Lương: " + e.getSalary());
        }
    }
}

