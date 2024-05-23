import java.util.Scanner;

import tk_pay.model.Customer;
import tk_pay.service.CustomerService;
import tk_pay.service.WalletService;

public class Main {
    private static CustomerService customerService = new CustomerService();
    private static WalletService walletService = new WalletService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Get Customer by ID");
            System.out.println("3. Add THY Money to Wallet");
            System.out.println("4. Spend THY Money");
            System.out.println("5. Send THY Points");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    getCustomerById(scanner);
                    break;
                case 3:
                    addTyMoney(scanner);
                    break;
                case 4:
                    spendTyMoney(scanner);
                    break;
                case 5:
                    sendTyPoints(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter TC Kimlik No: ");
        String tcKimlikNo = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Customer customer = new Customer(name, tcKimlikNo, phoneNumber);
        customerService.addCustomer(customer);
        walletService.createWallet(customer);
        System.out.println("Customer added with ID: " + customer.getId());
    }

    private static void getCustomerById(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        Long id = scanner.nextLong();
        Customer customer = customerService.getCustomerById(id);
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());
            System.out.println("TC Kimlik No: " + customer.getTcKimlikNo());
            System.out.println("Phone Number: " + customer.getPhoneNumber());
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void addTyMoney(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        Long customerId = scanner.nextLong();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        Customer customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            walletService.addTyMoney(customer, amount);
            System.out.println("Added " + amount + " TY Money to customer ID " + customerId);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void spendTyMoney(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        Long customerId = scanner.nextLong();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        Customer customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            try {
                walletService.spendTyMoney(customer, amount);
                System.out.println("Spent " + amount + " TY Money from customer ID " + customerId);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void sendTyPoints(Scanner scanner) {
        System.out.print("Enter sender customer ID: ");
        Long senderId = scanner.nextLong();
        System.out.print("Enter receiver customer ID: ");
        Long receiverId = scanner.nextLong();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        Customer sender = customerService.getCustomerById(senderId);
        Customer receiver = customerService.getCustomerById(receiverId);
        if (sender != null && receiver != null) {
            try {
                walletService.sendTyPoints(sender, receiver, amount);
                System.out.println("Sent " + amount + " TY Points from customer ID " + senderId + " to customer ID " + receiverId);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Sender or receiver customer not found.");
        }
    }
}
