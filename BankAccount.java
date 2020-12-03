public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public int getAccountNumber()
    {
        return this.accountNumber;
    }  
    public int getBalance()
    {
        return  this.balance;
    }
    public  String getCustomerName()
    {
        return this.customerName;
    }
    public String getEmail()
    {
        return this.email;
    }
    public  String getPhoneNumber()
    {
        if(phoneNumber.matches("[0-9]+") && phoneNumber.length()==10)
            return this.phoneNumber;
        else
           return  "invalid number";

    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public  void setBalance(int balance)
    {
        this.balance=balance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public void setEmail( String email)
    {
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void depositFunds(int deposit)
    {

        balance=balance+deposit;
        System.out.println("balance is: "+ balance);
    }
    public void withdrawFunds(int withdraw)
    {
        if(withdraw<balance) {
            balance = balance - withdraw;
            System.out.println("balance is: " +balance);
        }

        else
            System.out.println("insufficient balance");
    }
}
