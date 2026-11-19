class Appointment:
    def __init__(self):
        self.booked_slots = []

    def book(self, patient, time):
        if time not in self.booked_slots:
            self.booked_slots.append(time)
            print("Appointment Confirmed for", patient)
        else:
            print("Slot Already Booked")

a = Appointment()
a.book("Ravi", "10 AM")
a.book("Kumar", "10 AM")
