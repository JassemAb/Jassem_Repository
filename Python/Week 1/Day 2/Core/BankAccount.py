class BankAcccount:
    #A class to represent a banc account.

    def __init__(self, balance=0, interest_rate=0.01):
        self.balance = balance
        self.interest_rate = interest_rate

        def deposit(self, amount):
            self.balance += amount

        def withdraw(self, amount):
            if self.balance >=amount:
                self.balance -=amount
            else:
                print("insufficient funds")
                self.balance -=5
    def display_account_info(self):
        print(f"balance: {self.balance}")

    def yield_interest(self):
        if self.balance>0:
            self.balance+=self.balance * self.interest_rate