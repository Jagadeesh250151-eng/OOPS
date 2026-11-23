class BusPass:
    def __init__(self, balance, fare):
        self.balance = balance
        self.fare = fare

    def travel(self):
        if self.balance >= self.fare:
            self.balance -= self.fare
            print("Journey Allowed")
        else:
            print("Recharge Required")

        print("Remaining Balance:", self.balance)

b = BusPass(500, 30)
b.travel()
