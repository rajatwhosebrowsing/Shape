Shape
📖 Description
This is a menu-driven Java program to calculate the area, perimeter, and volume of different shapes.
It follows Object-Oriented Programming (OOP) principles with an abstract class (Shape), an interface (Volume), and separate Java files for better modularity.

📂 Project Structure
|-- src | |-- shapes | | |-- Shape.java # Abstract class for all shapes | | |-- Volume.java # Interface for volume calculation | | |-- Circle.java # Circle class | | |-- Rectangle.java # Rectangle class | | |-- Square.java # Square class | | |-- Sphere.java # Sphere class (Implements Volume) | | |-- Cylinder.java # Cylinder class (Implements Volume) | | |-- EquilateralPyramid.java # Equilateral Pyramid (Implements Volume) | |-- Main.java # Menu-driven main program

🚀 Features
✅ Uses Abstract Class and Interface
✅ Supports Circle, Rectangle, Square, Sphere, Cylinder, Equilateral Pyramid
✅ Calculates Area, Perimeter, and Volume
✅ Menu-driven program for user interaction
✅ Follows clean coding principles and modular design
📚 Class and Method Descriptions
📌 Shape.java (Abstract Class)
Shape(String shape) → Constructor to initialize shape name.
calculateArea() → Abstract method for area calculation.
calculatePerimeter() → Abstract method for perimeter calculation.
📌 Volume.java (Interface)
calculateVolume() → Abstract method to calculate volume (Implemented in 3D shapes).
📌 Circle.java
getInput() → Accepts user input for radius.
calculateArea() → Returns π × r².
calculatePerimeter() → Returns 2 × π × r.
📌 Rectangle.java
getInput() → Accepts user input for length & width.
calculateArea() → Returns length × width.
calculatePerimeter() → Returns 2 × (length + width).
📌 Square.java
getInput() → Accepts user input for side length.
calculateArea() → Returns side × side.
calculatePerimeter() → Returns 4 × side.
📌 Sphere.java (Implements Volume)
getInput() → Accepts user input for radius.
calculateArea() → Returns 4 × π × r².
calculateVolume() → Returns (4/3) × π × r³.
calculatePerimeter() → Not applicable (returns 0).
📌 Cylinder.java (Implements Volume)
getInput() → Accepts user input for radius and height.
calculateArea() → Returns 2 × π × r × (r + h).
calculateVolume() → Returns π × r² × h.
calculatePerimeter() → Not applicable (returns 0).
📌 EquilateralPyramid.java (Implements Volume)
getInput() → Accepts user input for base side and height.
calculateArea() → Returns Base Area + Lateral Surface Area.
calculateVolume() → Returns (1/3) × base² × height.
calculatePerimeter() → Returns 4 × base.
