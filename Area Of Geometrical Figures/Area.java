// Class to calculate the area of different shapes
class Area {
    // Variables to store dimensions of shapes
    // Length of the rectangle
    float length; 
    // Breadth of the rectangle
    float breadth; 
    // Radius of a circle (not used in this code, but can be useful for future methods)
    float radius; 
    // Variable to store the calculated area
    float area; 

    // Method to calculate the area of a rectangle
    void areaRectangle(float l, float b) {
        // Assigning length value
        length = l; 
        // Assigning breadth value
        breadth = b; 
         // Calculating area of the rectangle
        area = length * breadth;
        // Displaying the area of the rectangle
        System.out.println("Area of Rectangle is: " + area); 
    }
}

// Main class to execute the program
class Geometry {
    public static void main(String[] args) {
        // Creating an object of the Area class
        Area a = new Area(); 
        // Calling the areaRectangle method with length 10 and breadth 20
        a.areaRectangle(10, 20); 
    }
}
