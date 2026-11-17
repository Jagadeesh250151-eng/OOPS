class Cart:
    def __init__(self):
        self.items = []

    def add_item(self, name, price):
        self.items.append((name, price))

    def total(self):
        print("Total:", sum(price for name, price in self.items))

c = Cart()
c.add_item("Laptop", 50000)
c.add_item("Mouse", 500)
c.total()
