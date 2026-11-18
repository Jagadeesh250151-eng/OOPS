class Vehicle:
    def __init__(self, name, rent):
        self.name = name
        self.rent = rent

    def calculate_rent(self, days):
        print("Rent:", self.rent * days)

v = Vehicle("Car", 1500)
v.calculate_rent(3)
