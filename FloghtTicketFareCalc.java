class Flight:
    def __init__(self, distance, passengers):
        self.distance = distance
        self.passengers = passengers

    def calculate_fare(self):
        fare = self.distance * 5 * self.passengers
        print("Total Fare:", fare)

f = Flight(500, 2)
f.calculate_fare()
