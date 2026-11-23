class Course:
    def __init__(self, name, total, completed):
        self.name = name
        self.total = total
        self.completed = completed

    def progress(self):
        percentage = (self.completed / self.total) * 100
        print("Course:", self.name)
        print("Progress:", percentage, "%")

c = Course("Python", 20, 15)
c.progress()
