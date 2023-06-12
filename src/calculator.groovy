/**
 * Class that does not do anything, but is here to be a Java class run through
 * groovydoc.
 */
class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b
    }
    
    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b
    }
    
    // Method to multiply two numbers
    int multiply(int a, int b) {
        return a * b
    }
    
    // Method to divide two numbers
    double divide(int a, int b) {
        if (b != 0) {
            return a / b.toDouble()
        } else {
            throw new ArithmeticException("Cannot divide by zero")
        }
    }
}
