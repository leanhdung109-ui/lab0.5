class Person3 {
    String name;

    Person3(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Xin chào, tôi tên là " + name);
    }
}

class Teacher extends Person3 {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("Tôi dạy môn " + subject);
    }
}


