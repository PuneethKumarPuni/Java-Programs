package AssignmentLuluHypermart;

import java.util.ArrayList;
import java.util.Collections;

// Customer class to hold customer details
class Customer {
    // Private fields to store customer details like voucher ID, name, phone number, offer price, and item selected
    private String voucherID;
    private String name;
    private String phoneNumber;
    private double offerPrice;
    private String itemSelected;

    // Constructor to initialize customer details when an object is created
    public Customer(String voucherID, String name, String phoneNumber, double offerPrice, String itemSelected) {
        this.voucherID = voucherID; // Assigning voucher ID
        this.name = name; // Assigning customer name
        this.phoneNumber = phoneNumber; // Assigning phone number
        this.offerPrice = offerPrice; // Assigning offer price of the voucher
        this.itemSelected = itemSelected; // Assigning selected item
    }

    // Method to display customer details to the console
    public void displayDetails() {
        System.out.println("Voucher ID: " + voucherID);
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Voucher Offer Price: " + offerPrice);
        System.out.println("Item Selected: " + itemSelected);
        System.out.println("----------------------------"); // Divider for better display formatting
    }
}

// VoucherSystem class to handle adding and displaying customers and selecting lucky winners
class VoucherSystem {
    // List to store multiple customer objects
    private ArrayList<Customer> customers = new ArrayList<>();

    // Method to add a customer to the customers list
    public void addCustomer(Customer customer) {
        customers.add(customer); // Add the customer to the ArrayList
    }

    // Method to display details of all customers in the system
    public void displayAllCustomers() {
        // Loop through each customer and call the displayDetails method to print their info
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).displayDetails(); // Fetch each customer and display their details
        }
    }

    // Method to randomly shuffle customers and display top 6 lucky winners
    public void displayLuckyWinners() {
        // Shuffle the list of customers to randomly mix them
        Collections.shuffle(customers);

        // Display a message for the lucky winners
        System.out.println("\n\nTop 6 Lucky Winners:");
        
        // Loop to display the top 6 customers from the shuffled list
        for (int i = 0; i < 6; i++) {
            customers.get(i).displayDetails(); // Display the details of the customer
        }
    }
}

// Main class to run the program
public class LuluHypermarketBumperOffers {
    public static void main(String[] args) {
        // Create a new VoucherSystem object to manage the customers
        VoucherSystem voucherSystem = new VoucherSystem();

        // Create several Customer objects with various details
        Customer customer1 = new Customer("V001", "Puneeth", "9353950078", 84763.98, "Asus Rog G15");
        Customer customer2 = new Customer("V002", "Abhi", "9123456789", 164435.70, "MSI SWORD 16 HX");
        Customer customer3 = new Customer("V003", "Krithik", "9345678901", 183740.70, "PH OMEN INTEL CORE 17");
        Customer customer4 = new Customer("V004", "Davis", "9543216780", 55861.00, "Blender");
        Customer customer5 = new Customer("V005", "Johnson", "9345671234", 80000.50, "Laptop");

        // Add these customers to the voucher system
        voucherSystem.addCustomer(customer1);
        voucherSystem.addCustomer(customer2);
        voucherSystem.addCustomer(customer3);
        voucherSystem.addCustomer(customer4);
        voucherSystem.addCustomer(customer5);

        // Create and add more Customer objects
        Customer customer6 = new Customer("V006", "Sarah", "9876547890", 48653.50, "Phone");
        Customer customer7 = new Customer("V007", "David", "9654321098", 38456.92, "Air Conditioner");
        Customer customer8 = new Customer("V008", "Mani", "9123456788", 25000.00, "Toaster");
        Customer customer9 = new Customer("V009", "James", "9001234567", 12000.00, "Dishwasher");
        Customer customer10 = new Customer("V010", "Siri", "9987654321", 78256.90, "Television");

        voucherSystem.addCustomer(customer6);
        voucherSystem.addCustomer(customer7);
        voucherSystem.addCustomer(customer8);
        voucherSystem.addCustomer(customer9);
        voucherSystem.addCustomer(customer10);

        // Create even more customers
        Customer customer11 = new Customer("V011", "Iron Man", "9786453210", 975000.8, "Suit");
        Customer customer12 = new Customer("V012", "Captain", "9871236540", 450000.0, "Vibranium Shield");
        Customer customer13 = new Customer("V013", "Thor", "9543216780", 301568.45, "Hammer");
        Customer customer14 = new Customer("V014", "Super Man", "9213456789", 58000.97, "Pant");
        Customer customer15 = new Customer("V015", "Wonder Woman", "9641234567", 780007.85, "Lasso and Shield");

        voucherSystem.addCustomer(customer11);
        voucherSystem.addCustomer(customer12);
        voucherSystem.addCustomer(customer13);
        voucherSystem.addCustomer(customer14);
        voucherSystem.addCustomer(customer15);

        // Create final batch of customers
        Customer customer16 = new Customer("V016", "Elon Musk", "9876543901", 89000.57, "Earbuds");
        Customer customer17 = new Customer("V017", "Bill Gates", "9345678921", 120000.00, "Electric Kettle");
        Customer customer18 = new Customer("V018", "Sara", "9871234598", 15000.00, "Mixer");
        Customer customer19 = new Customer("V019", "Keerthi", "9543216879", 10000.00, "Headphones");
        Customer customer20 = new Customer("V020", "Joshua", "9654321090", 152000.00, "Camera");

        voucherSystem.addCustomer(customer16);
        voucherSystem.addCustomer(customer17);
        voucherSystem.addCustomer(customer18);
        voucherSystem.addCustomer(customer19);
        voucherSystem.addCustomer(customer20);

        // Display all customer details
        System.out.println("All Customers Who Filled Vouchers:");
        voucherSystem.displayAllCustomers();

        // Display the top 6 lucky winners
        voucherSystem.displayLuckyWinners();
    }
}
