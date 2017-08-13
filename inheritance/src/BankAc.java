  
public class BankAc {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    
    public BankAc(){
        this(10000,9000);
        System.out.println("Empty constructor created");
    }
    
    public BankAc(int number,int balance){
        System.out.println("Account constructor with parameters called");
        this.accountNumber=number;
        this.balance=balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public void setBalance(int balance){
        this.balance = balance;
    }
    
    public int getBalance(){
        return this.balance;
    }
    
    public void setCustomerName(String name){
        this.customerName = name;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
        
    }
    
    public void deposite(int amount){
        this.balance += amount;
        System.out.println("An amount of " + amount + "is being deposited. New Balance is " + this.balance);
    }
    
    public void withdraw(int amount){
        if(this.balance > amount){
            this.balance -= amount;
            System.out.println("An amount of " + amount + " is being withdrawn. New Balance is " + this.balance);
        }else{
            System.out.println("Insuficient Balance to withdraw");
        }
    }
}
