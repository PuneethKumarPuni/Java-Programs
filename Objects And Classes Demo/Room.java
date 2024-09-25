
class Room {
    // Variables to store the length and width of the room
    int length;
    int width;

    // Method to set the dimensions (length and width) of the room
    void getData(int l, int w) {
        length = l;
        width = w;
    }
}

class RArea {
    public static void main(String args[]) {

        // Create a Room object for the Hall and set its dimensions
        Room Hall = new Room();
        Hall.getData(100, 45); // Hall's length = 100, width = 45

        // Create a Room object for the Kitchen and set its dimensions
        Room Kitchen = new Room();
        Kitchen.getData(65, 35); // Kitchen's length = 65, width = 35

        // Create a Room object for the Bedroom and set its dimensions
        Room BedRoom = new Room();
        BedRoom.getData(50, 45); // Bedroom's length = 50, width = 45

        // Create a Room object for the Bathroom and set its dimensions
        Room BathRoom = new Room();
        BathRoom.getData(15, 8); // Bathroom's length = 15, width = 8

        // Calculate and print the area of each room
        System.out.println("Area of the Hall: " + Hall.length * Hall.width + " sqrft");
        System.out.println("Area of the Bedroom: " + (BedRoom.length * BedRoom.width) * 2 + " sqrft");
        System.out.println("Area of the Bathroom: " + BathRoom.length * BathRoom.width + " sqrft");
        System.out.println("Area of the Kitchen: " + Kitchen.length * Kitchen.width + " sqrft");

        // Calculate the total area of the house by summing up the areas of all rooms
        int total_area = (Hall.length * Hall.width) +
                         ((BedRoom.length * BedRoom.width) * 2) +
                         (BathRoom.length * BathRoom.width) +
                         (Kitchen.length * Kitchen.width);

        // Print the total area of the house
        System.out.println("Total Area: " + total_area + " sqrft");

        // Calculate the total cost of the house assuming the cost per square foot is Rs. 5000
        int total_cost = total_area * 5000;

        // Print the total cost of the house
        System.out.println("Total Cost: Rs " + total_cost);
    }
}
