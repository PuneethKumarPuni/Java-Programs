class Area{
    float lenght;
    float breadth;
    float radius;
    float area;

    void areaRectangle(float l, float b){
     lenght = l;
     breadth = b;
     area = lenght * breadth;
     System.out.println("Area of Rectangle is: " + area);
    }
}

class Geometry{
    public static void main(String[] args){
        Area a = new Area();
        a.areaRectangle(10, 20);
    }
}













// void areaCircle(float r){
//     radius = r;
//     area = (float)(3.14 * radius * radius);
//     System.out.println("Area of Circle is: " + area);
// }
// Area b = new Area();
//         b.areaCircle(5);