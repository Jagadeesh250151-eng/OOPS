class PowerMonitor:
    def __init__(self, units):
        self.units = units

    def check_usage(self):
        if self.units <= 100:
            print("Low Consumption")
        elif self.units <= 300:
            print("Moderate Consumption")
        else:
            print("High Consumption")

p = PowerMonitor(350)
p.check_usage()
