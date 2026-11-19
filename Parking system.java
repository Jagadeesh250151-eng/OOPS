class Parking:
    def __init__(self, slots):
        self.slots = slots

    def park(self):
        if self.slots > 0:
            self.slots -= 1
            print("Vehicle Parked")
        else:
            print("Parking Full")

    def available(self):
        print("Available Slots:", self.slots)

p = Parking(3)
p.park()
p.available()
