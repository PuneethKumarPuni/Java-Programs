package AssignmentLuluHypermart;

import java.util.ArrayList;
import java.util.Collections;

// Customer class to hold customer details
class Customer {
    private String voucherID;
    private String name;
    private String phoneNumber;
    private double offerPrice;
    private String itemSelected;

    // Constructor to initialize customer details
    public Customer(String voucherID, String name, String phoneNumber, double offerPrice, String itemSelected) {
        this.voucherID = voucherID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.offerPrice = offerPrice;
        this.itemSelected = itemSelected;
    }

    // Display customer details
    public void displayDetails() {
        System.out.println("Voucher ID: " + voucherID);
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Voucher Offer Price: " + offerPrice);
        System.out.println("Item Selected: " + itemSelected);
        System.out.println("----------------------------");
    }
}

// VoucherSystem class to handle customer entries and display them
class VoucherSystem {
    private ArrayList<Customer> customers = new ArrayList<>();

    // Method to add a customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to display all customers
    public void displayAllCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).displayDetails();
        }
    }

    // Method to display top 6 lucky winners randomly selected
    public void displayLuckyWinners() {
        // Shuffle the list of customers randomly
        Collections.shuffle(customers);

        // Select the top 6 customers from the shuffled list
        System.out.println("\n\nTop 6 Lucky Winners:");
        for (int i = 0; i < 6; i++) {
            customers.get(i).displayDetails();
        }
    }
}

// Main class to run the program
public class LuluHypermarketDumperOffers {
    public static void main(String[] args) {
        // Create VoucherSystem object
        VoucherSystem voucherSystem = new VoucherSystem();

        // Create and add customers using the 'new' keyword
        Customer customer1 = new Customer("V001", "John Doe", "9876543210", 200.0, "TV");
        Customer customer2 = new Customer("V002", "Jane Smith", "9123456789", 150.0, "Microwave");
        Customer customer3 = new Customer("V003", "Michael Brown", "9345678901", 300.0, "Washing Machine");
        Customer customer4 = new Customer("V004", "Emily Davis", "9543216780", 100.0, "Blender");
        Customer customer5 = new Customer("V005", "Chris Johnson", "9345671234", 250.0, "Laptop");

        // Add customers to the voucher system
        voucherSystem.addCustomer(customer1);
        voucherSystem.addCustomer(customer2);
        voucherSystem.addCustomer(customer3);
        voucherSystem.addCustomer(customer4);
        voucherSystem.addCustomer(customer5);

        // Adding more customers
        Customer customer6 = new Customer("V006", "Sarah White", "9876547890", 500.0, "Fridge");
        Customer customer7 = new Customer("V007", "David Martin", "9654321098", 400.0, "Air Conditioner");
        Customer customer8 = new Customer("V008", "Amy Green", "9123456788", 120.0, "Toaster");
        Customer customer9 = new Customer("V009", "James Wilson", "9001234567", 600.0, "Dishwasher");
        Customer customer10 = new Customer("V010", "Olivia Taylor", "9987654321", 700.0, "Television");

        voucherSystem.addCustomer(customer6);
        voucherSystem.addCustomer(customer7);
        voucherSystem.addCustomer(customer8);
        voucherSystem.addCustomer(customer9);
        voucherSystem.addCustomer(customer10);

        Customer customer11 = new Customer("V011", "Ethan Lee", "9786453210", 80.0, "Vacuum Cleaner");
        Customer customer12 = new Customer("V012", "Emma Clark", "9871236540", 450.0, "Oven");
        Customer customer13 = new Customer("V013", "William Walker", "9543216780", 320.0, "Smartphone");
        Customer customer14 = new Customer("V014", "Sophia Allen", "9213456789", 350.0, "Tablet");
        Customer customer15 = new Customer("V015", "Daniel Lewis", "9641234567", 220.0, "Smart Watch");

        voucherSystem.addCustomer(customer11);
        voucherSystem.addCustomer(customer12);
        voucherSystem.addCustomer(customer13);
        voucherSystem.addCustomer(customer14);
        voucherSystem.addCustomer(customer15);

        Customer customer16 = new Customer("V016", "Mia Harris", "9876543901", 180.0, "Juicer");
        Customer customer17 = new Customer("V017", "Benjamin King", "9345678921", 90.0, "Electric Kettle");
        Customer customer18 = new Customer("V018", "Charlotte Scott", "9871234598", 140.0, "Mixer");
        Customer customer19 = new Customer("V019", "Henry Adams", "9543216879", 260.0, "Headphones");
        Customer customer20 = new Customer("V020", "Amelia Baker", "9654321090", 380.0, "Camera");

        voucherSystem.addCustomer(customer16);
        voucherSystem.addCustomer(customer17);
        voucherSystem.addCustomer(customer18);
        voucherSystem.addCustomer(customer19);
        voucherSystem.addCustomer(customer20);

        // Display all customer details
        System.out.println("All Customers Who Filled Vouchers:");
        voucherSystem.displayAllCustomers();

        // Display top 6 lucky winners
        voucherSystem.displayLuckyWinners();
    }
}
