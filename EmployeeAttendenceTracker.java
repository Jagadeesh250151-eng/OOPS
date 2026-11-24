class Attendance:
    def __init__(self, name, present, total):
        self.name = name
        self.present = present
        self.total = total

    def calculate(self):
        percentage = (self.present / self.total) * 100

        print("Employee:", self.name)
        print("Attendance:", percentage, "%")

        if percentage >= 75:
            print("Eligible")
        else:
            print("Not Eligible")

a = Attendance("Arun", 22, 25)
a.calculate()
