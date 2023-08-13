

// Create our class BankAccount
class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    // Create static counters to keep track of the number of accounts and total balance
    public static int numberOfAccounts = 0;
    public static double totalBalance = 0;

    //Create the constructor
    public BankAccount(){
        BankAccount.numberOfAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    //Create Getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    // Create a method that will allow a user to deposit money into either checking or savings and add the total to the total balance
    public void deposit(double amount, String account){
        // Check account type and add the amount to the appropriate account
        if(account == "checking"){
            this.checkingBalance += amount;
            BankAccount.totalBalance += amount;
        }
        else if(account == "savings"){
            this.savingsBalance += amount;
            BankAccount.totalBalance += amount;
        }
        else{
            System.out.println("Invalid account type");
        }
    }
    // Create a method that will allow a user to withdraw money from either checking or savings and subtract the total from the total balance
    public void withdraw(double amount, String account){
        // Check account type and subtract the amount from the appropriate account as long as the amount is less than the current balance
        if(account == "checking"){
            if(amount <= this.checkingBalance){
                this.checkingBalance -= amount;
                BankAccount.totalBalance -= amount;
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
        else if(account == "savings"){
            if(amount <= this.savingsBalance){
                this.savingsBalance -= amount;
                BankAccount.totalBalance -= amount;
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
        else{
            System.out.println("Invalid account type");
        }
    }        
};