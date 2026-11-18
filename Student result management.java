class Student:
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks

    def result(self):
        total = sum(self.marks)
        avg = total / len(self.marks)

        print("Name:", self.name)
        print("Total:", total)
        print("Average:", avg)

s = Student("Arun", [80, 90, 85])
s.result()
