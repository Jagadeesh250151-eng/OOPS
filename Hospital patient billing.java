class Patient:
    def __init__(self, name, room, medicine):
        self.name = name
        self.room = room
        self.medicine = medicine

    def bill(self):
        total = self.room + self.medicine
        print("Patient:", self.name)
        print("Bill:", total)

p = Patient("Ravi", 2000, 1500)
p.bill()
