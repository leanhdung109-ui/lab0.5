class Animal3 {
    public void makeSound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal3 {
    @Override
    public void makeSound() {
        System.out.println("Chó sủa: Gâu gâu");
    }
}

class Cat extends Animal3 {
    @Override
    public void makeSound() {
        System.out.println("Mèo kêu: Meo meo");
    }
}

