class Movie:
    def __init__(self, seats, price):
        self.seats = seats
        self.price = price

    def book(self, count):
        if count <= self.seats:
            self.seats -= count
            print("Total Amount:", count * self.price)
            print("Booking Successful")
        else:
            print("Seats Full")

m = Movie(100, 150)
m.book(3)
