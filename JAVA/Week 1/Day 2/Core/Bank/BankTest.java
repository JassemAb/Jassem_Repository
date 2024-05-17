public class BankTest {
 public static void main(String[] args){
     // Create 3 bank accounts
     BankAccount account1 = new BankAccount();
     BankAccount account2 = new BankAccount();
     BankAccount account3 = new BankAccount();
     // Deposit Test
     // - deposit some money into each bank account's checking or savings account and display the balance each time
     account1.deposit(1000, "checking");
     account2.deposit(1500, "savings");
     account3.deposit(2000, "checking");
     // after deposit
     System.out.println("Account 1 Balance: " + account1.getBalance());
     System.out.println("Account 2 Balance: " + account2.getBalance());
     System.out.println("Account 3 Balance: " + account3.getBalance());
     System.out.println("Total Money: " + (double)(account1.getBalance()+account2.getBalance()+account3.getBalance()));
     System.out.println("Total Money 1 : "+ BankAccount.getTotalMoneyAll());


     // Withdrawal Test
     // - withdraw some money from each bank account's checking or savings account and display the remaining balance

     // - each withdrawal should decrease the amount of totalMoney
     account1.withdraw(200, "checking");
     account2.withdraw(100, "savings");
     account3.withdraw(2530, "checking");


     System.out.println("Account 1 Balance: " + account1.getBalance());
     System.out.println("Account 2 Balance: " + account2.getBalance());
     System.out.println("Account 3 Balance: " + account3.getBalance());
     System.out.println("The Total of Money for the All the Accounts Is :" + BankAccount.getTotalMoneyAll());
     // Static Test (print the number of bank accounts and the totalMoney)
     System.out.println("the Total of your accounts is : " + BankAccount.getAccountsAll());

 }
}