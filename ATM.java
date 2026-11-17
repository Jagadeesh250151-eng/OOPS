class ATM:
    def __init__(self, balance):
        self.balance = balance

    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print("Remaining:", self.balance)
        else:
            print("Insufficient Balance")

a = ATM(5000)
a.withdraw(2000)
