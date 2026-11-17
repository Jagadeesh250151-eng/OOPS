class Employee:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def calculate(self):
        bonus = self.salary * 0.10
        print("Total Salary:", self.salary + bonus)

e = Employee("Arun", 30000)
e.calculate()
