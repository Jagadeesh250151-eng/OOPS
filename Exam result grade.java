class Exam:
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks

    def calculate_grade(self):
        avg = sum(self.marks) / len(self.marks)

        if avg >= 90:
            grade = "A"
        elif avg >= 75:
            grade = "B"
        elif avg >= 50:
            grade = "C"
        else:
            grade = "Fail"

        print("Student:", self.name)
        print("Grade:", grade)

e = Exam("Arun", [85, 90, 80])
e.calculate_grade()
