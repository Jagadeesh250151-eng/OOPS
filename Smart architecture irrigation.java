class Irrigation:
    def __init__(self, moisture):
        self.moisture = moisture

    def check_soil(self):
        if self.moisture < 30:
            print("Motor ON")
        else:
            print("Motor OFF")

i = Irrigation(20)
i.check_soil()
