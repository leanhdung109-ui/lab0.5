class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

