class Loan:
    def __init__(self, name, salary, age):
        self.name = name
        self.salary = salary
        self.age = age

    def check_eligibility(self):
        if self.salary >= 25000 and self.age >= 21:
            print("Loan Eligible")
        else:
            print("Loan Not Eligible")

l = Loan("Arun", 35000, 25)
l.check_eligibility()
