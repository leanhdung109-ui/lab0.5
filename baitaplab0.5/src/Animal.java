class Animal {
    protected String name;

    void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println(name + " sủa: Gâu gâu");
    }
}


