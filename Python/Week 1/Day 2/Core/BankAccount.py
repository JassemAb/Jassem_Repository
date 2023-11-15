class BankAccount:
    #A class to represent a banc account.

    def __init__(self, balance=0, interest_rate=0.01):
        self.balance = balance
        self.interest_rate = interest_rate

    def deposit(self, amount):
        self.balance += amount
        return self
    def withdraw(self, amount):
        if self.balance >=amount:
            self.balance -=amount
            return self
        else:
            print("insufficient funds")
            self.balance -=5
            return self
    def display_account_info(self):
        print(f"balance: {self.balance}")
        return None

    def yield_interest(self):
        
        self.balance+=self.balance * self.interest_rate
        return self


account1=BankAccount()
account1.deposit(100).deposit(200).deposit(200).withdraw(200).yield_interest().display_account_info()
account1.display_account_info()

account2=BankAccount()
account2.deposit(160).deposit(140).withdraw(50).withdraw(10).withdraw(15).withdraw(20).yield_interest().display_account_info()
account2.display_account_info()
