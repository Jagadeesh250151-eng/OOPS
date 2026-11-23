class TrafficSignal:
    def __init__(self, vehicles):
        self.vehicles = vehicles

    def signal(self):
        if self.vehicles > 50:
            print("Green Signal: 60 seconds")
        elif self.vehicles > 20:
            print("Green Signal: 40 seconds")
        else:
            print("Green Signal: 20 seconds")

t = TrafficSignal(65)
t.signal()
