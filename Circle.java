// Circle.java
// Inherits from Shape and implements area & perimeter calculations

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0, 1);
    }

    // Calculate and return the area of the circle
    public double calculateArea() {
        return Math.PI * dim_one * dim_one; // π * r²
    }

    // Calculate and return the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one; // 2πr
    }
}
