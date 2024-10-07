
# Lulu Hypermarket Voucher System

## Overview

The **Lulu Hypermarket Voucher System** is a Java program designed to simulate the process of customers entering their details for a promotional offer. The program allows customers to fill out vouchers and randomly selects six lucky winners from the list of participants. The application demonstrates key programming concepts such as object-oriented programming (OOP), classes, and loops.

## Features

- **Customer Management**: Collects and manages customer details such as voucher ID, name, phone number, offer price, and selected item.
- **Display Functionality**: Displays the details of all customers who filled out the vouchers and selects six lucky winners at random.
- **Data Storage**: Utilizes an `ArrayList` to store customer entries, showcasing dynamic data storage capabilities in Java.

## Programming Concepts Used

### 1. Objects and Classes
- **Customer Class**: This class represents a customer in the voucher system. It contains attributes such as `voucherID`, `name`, `phoneNumber`, `offerPrice`, and `itemSelected`.
    - **Constructor**: Initializes customer details upon creation.
    - **Method**: `displayDetails()` is used to print the customer's information.

- **VoucherSystem Class**: Manages a list of customers and provides methods to add customers and display their details.
    - **Method**: 
        - `addCustomer(Customer customer)`: Adds a new customer to the list.
        - `displayAllCustomers()`: Iterates through the list and displays all customer details.
        - `displayLuckyWinners()`: Randomly shuffles the customer list and selects six winners.

### 2. Loops
- **For Loop**: Used in the `displayAllCustomers()` and `displayLuckyWinners()` methods to iterate over the list of customers and display their details.

### 3. Collections
- **ArrayList**: Utilized to dynamically store customer entries. The `Collections.shuffle()` method is employed to randomly shuffle the list of customers when selecting winners.

## Code Structure

### Main Class

```java
public class LuluHypermarketDumperOffers {
    public static void main(String[] args) {
        // Create VoucherSystem object
        VoucherSystem voucherSystem = new VoucherSystem();

        // Create and add customers
        Customer customer1 = new Customer("V001", "John Doe", "9876543210", 200.0, "TV");
        // ... (add more customers)
        
        // Display all customer details
        voucherSystem.displayAllCustomers();

        // Display top 6 lucky winners
        voucherSystem.displayLuckyWinners();
    }
}
```

### Example Output
When the program is executed, it will print the details of all customers who filled out vouchers and randomly select six lucky winners from the list.

## How to Run the Program

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Copy the code into a file named `LuluHypermarketDumperOffers.java`.
3. Compile the code using the command:
   ```bash
   javac LuluHypermarketDumperOffers.java
   ```
4. Run the program using the command:
   ```bash
   java LuluHypermarketDumperOffers
   ```

## Conclusion

The **Lulu Hypermarket Voucher System** is a straightforward Java application that effectively demonstrates the use of objects, classes, and loops in programming. It provides a fun and interactive way to simulate a promotional voucher system, showcasing the practical application of fundamental programming concepts.
