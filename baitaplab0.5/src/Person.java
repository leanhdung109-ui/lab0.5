class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

class Student extends Person {
    String studentId;

    @Override
    void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Mã SV: " + studentId);
    }
}

