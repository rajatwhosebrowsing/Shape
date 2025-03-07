// Main.java
// Menu-driven program for shape calculations

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter Radius: ");
                    double radius = scan.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 2:
                    System.out.print("Enter Length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter Width: ");
                    double width = scan.nextDouble();
                    shape = new Rectangle(length, width);
                    break;

                case 3:
                    System.out.print("Enter Side Length: ");
                    double side = scan.nextDouble();
                    shape = new Square(side);
                    break;

                case 4:
                    System.out.print("Enter Radius: ");
                    radius = scan.nextDouble();
                    shape = new Sphere(radius);
                    volumeShape = (Volume) shape;
                    break;

                case 5:
                    System.out.print("Enter Radius: ");
                    radius = scan.nextDouble();
                    System.out.print("Enter Height: ");
                    double height = scan.nextDouble();
                    shape = new Cylinder(radius, height);
                    volumeShape = (Volume) shape;
                    break;

                case 6:
                    System.out.print("Enter Base Length: ");
                    double base = scan.nextDouble();
                    System.out.print("Enter Height: ");
                    height = scan.nextDouble();
                    shape = new EquilateralPyramid(base, height);
                    volumeShape = (Volume) shape;
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            System.out.println("\n--- Calculations ---");
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
    }
}
