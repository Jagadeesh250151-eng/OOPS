class Grocery:
    def __init__(self):
        self.items = {}

    def add_item(self, name, price):
        self.items[name] = price

    def generate_bill(self):
        total = sum(self.items.values())
        print("Total Bill:", total)

g = Grocery()
g.add_item("Rice", 100)
g.add_item("Sugar", 50)
g.add_item("Milk", 30)
g.generate_bill()
