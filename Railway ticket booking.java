class Train:
    def __init__(self, seats):
        self.seats = seats

    def book_ticket(self, count):
        if count <= self.seats:
            self.seats -= count
            print("Tickets Booked:", count)
        else:
            print("Seats Not Available")

    def show_seats(self):
        print("Available Seats:", self.seats)

t = Train(50)
t.book_ticket(3)
t.show_seats()
