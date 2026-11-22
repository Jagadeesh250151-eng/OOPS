class Parking:
    def __init__(self, hours):
        self.hours = hours

    def calculate_fee(self):
        fee = 30 + max(0, self.hours - 1) * 20
        print("Parking Fee:", fee)

p = Parking(5)
p.calculate_fee()
