class Wallet:
    def __init__(self, balance):
        self.balance = balance

    def transfer(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print("Transfer Successful")
        else:
            print("Insufficient Balance")

    def display(self):
        print("Wallet Balance:", self.balance)

w = Wallet(5000)
w.transfer(1500)
w.display()
