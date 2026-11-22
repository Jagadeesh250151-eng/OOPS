class LibraryFine:
    def __init__(self, days):
        self.days = days

    def calculate(self):
        if self.days <= 0:
            fine = 0
        elif self.days <= 5:
            fine = self.days * 2
        else:
            fine = 10 + (self.days - 5) * 5

        print("Fine Amount:", fine)

l = LibraryFine(8)
l.calculate()
