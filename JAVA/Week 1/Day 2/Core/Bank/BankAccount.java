public class BankAccount {
 // MEMBER VARIABLES
 private double checkingBalance;
 private double savingsBalance;

 private static int accounts;
 private static double totalMoney; // refers to the sum of all bank account checking and savings balances

 // CONSTRUCTOR
 // Be sure to increment the number of accounts
 public BankAccount(){
  this.checkingBalance = 0;
  this.savingsBalance = 1;
  accounts++;
 }
 
 // GETTERS
 // for checking, savings, accounts, and totalMoney
 public double getChekingBalance(){
  return checkingBalance;
 }

 public double getSavingsBalance(){
  return savingsBalance;
 }

 public int getAccounts(){
  return accounts;
 }

 public double getTotalMoney(){
  return savingsBalance + checkingBalance;
 }


 // METHODS
 // deposit

 public void deposit(double amount , String accountType){
  if (accountType.equals("Check")){
   checkingBalance+=amount;
  }else if (accountType.equals("saving")){
   savingsBalance += amount;
  }
  totalMoney += amount;
 }
 // - users should be able to deposit money into their checking or savings account
 // withdraw 
 // - users should be able to withdraw money from their checking or savings account
 // - do not allow them to withdraw money if there are insufficient funds
 public void withdraw(double deposit, String type){
  if(totalMoney>deposit){
      if(type.equals("checking") && checkingBalance!=0){
          checkingBalance-=deposit;
          System.out.printf("You have withdraw %s from you Checking Account : \n" , checkingBalance);
      }else if(type.equals("savings") && savingsBalance!=0){
          System.out.printf("You have withdraw %s from you SavingAccount Account  : \n " , savingsBalance);
          savingsBalance-=deposit;
      }
  }else{
      System.out.println("Sry Cant Withdraw money right now you have no Money : " +totalMoney);
  }
}
public double getBalance() {
  return checkingBalance + savingsBalance;
}
public static  double getTotalMoneyAll(){
  return totalMoney;
}

public static int getAccountsAll(){
  return accounts;
}
 // - all deposits and withdrawals should affect totalMoney
 // getBalance
 // - display total balance for checking and savings of a particular bank account
}
