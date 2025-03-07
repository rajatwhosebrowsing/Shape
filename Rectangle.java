// Rectangle.java
// Inherits from Shape and implements area & perimeter calculations

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0, 4);
    }

    // Calculate and return the area of the rectangle
    public double calculateArea() {
        return dim_one * dim_two; // length * width
    }

    // Calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (dim_one + dim_two); // 2 * (length + width)
    }
}
