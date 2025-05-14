class BankCustomer {
    String name;
    String accountNumber;
    int age;

    BankCustomer(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Age: " + age);
    }

    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Alice", "1234567890", 30);
        customer.displayCustomerInfo();
    }
}