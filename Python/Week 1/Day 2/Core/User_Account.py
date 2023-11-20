class User_Account:
    # A class to represent a banc account.

    def __init__(self, balance=100,):
        self.balance = balance

    def deposit(self, balance):
        self.balance += balance
        return self
    