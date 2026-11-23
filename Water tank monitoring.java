class WaterTank:
    def __init__(self, capacity, current):
        self.capacity = capacity
        self.current = current

    def check_level(self):
        percentage = (self.current / self.capacity) * 100

        print("Water Level:", percentage, "%")

        if percentage >= 90:
            print("Tank Almost Full")
        elif percentage <= 20:
            print("Low Water Level")
        else:
            print("Normal Water Level")

w = WaterTank(1000, 150)
w.check_level()
