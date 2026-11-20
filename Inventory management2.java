class Inventory:
    def __init__(self, product, quantity):
        self.product = product
        self.quantity = quantity

    def sell(self, count):
        if count <= self.quantity:
            self.quantity -= count
            print("Product Sold")
        else:
            print("Insufficient Stock")

    def display(self):
        print(self.product, "Stock:", self.quantity)

i = Inventory("Laptop", 20)
i.sell(5)
i.display()
