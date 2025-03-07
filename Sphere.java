// Sphere.java
// Inherits from Shape and implements Volume interface

class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * dim_one; // Circumference of a great circle
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3);
    }
}
