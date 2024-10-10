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
// class Area{
//     float width;
//     float lenght;
//     float area;
//     void getdata(float l, float w){
//         lenght = l;
//         width = w;
//     }
// }
// class Exw001Rect{
//     public static void main(String[] args){
//     Area R482 = new Area();
//     R482.getdata(10,20);
//     R482.area = R482.lenght * R482.width;
//     System.out.println("The area of the rectangle is: " + R482.area);
//     }
// }
