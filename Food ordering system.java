class Restaurant:
    def __init__(self):
        self.menu = {"Pizza": 200, "Burger": 100}

    def order(self, item):
        if item in self.menu:
            print("Amount:", self.menu[item])
        else:
            print("Item Not Available")

r = Restaurant()
r.order("Pizza")
