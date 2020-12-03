public class Main {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setAccountNumber(1234);
        b.setBalance(65_000);
        b.setCustomerName("riyazuddin");
        b.setEmail("shaikriyaz5159@gmail.com");
        b.setPhoneNumber("7893230137");
        System.out.println("account number: "+b.getAccountNumber());
        System.out.println("balance: "+b.getBalance());
        System.out.println("customer name: "+b.getCustomerName());
        System.out.println("email address: "+b.getEmail());
        System.out.println("phone number: "+b.getPhoneNumber());
        b.depositFunds(25000);
        b.withdrawFunds(100000);


    }
}
