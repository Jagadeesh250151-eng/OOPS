class Book:
    def __init__(self, name):
        self.name = name
        self.issued = False

    def issue(self):
        if not self.issued:
            self.issued = True
            print("Book issued")
        else:
            print("Already issued")

b = Book("Python")
b.issue()
b.issue()
