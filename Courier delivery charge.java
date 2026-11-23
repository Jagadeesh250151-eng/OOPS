class Delivery:
    def __init__(self, weight, distance):
        self.weight = weight
        self.distance = distance

    def calculate_charge(self):
        charge = (self.weight * 10) + (self.distance * 2)
        print("Delivery Charge:", charge)

d = Delivery(5, 20)
d.calculate_charge()
