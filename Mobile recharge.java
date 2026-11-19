class Recharge:
    def __init__(self, balance):
        self.balance = balance

    def recharge(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print("Recharge Successful")
            print("Remaining Balance:", self.balance)
        else:
            print("Insufficient Balance")

r = Recharge(1000)
r.recharge(299)
