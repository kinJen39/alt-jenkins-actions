/**
* Comment
*/
class Rectangle {
    double length
    double width
    
    // Constructor
    Rectangle(double length, double width) {
        this.length = length
        this.width = width
    }
    
    // Method to calculate the area
    double calculateArea() {
        return length * width
    }
    
    // Method to calculate the perimeter
    double calculatePerimeter() {
        return 2 * (length + width)
    }
}
