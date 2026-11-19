class Insurance:
    def __init__(self, age, coverage):
        self.age = age
        self.coverage = coverage

    def calculate(self):
        premium = self.coverage * 0.02

        if self.age > 50:
            premium += 2000

        print("Annual Premium:", premium)

i = Insurance(55, 500000)
i.calculate()
