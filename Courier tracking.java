class Courier:
    def __init__(self, tracking_id):
        self.tracking_id = tracking_id
        self.status = "Order Received"

    def update_status(self, new_status):
        self.status = new_status

    def track(self):
        print("Tracking ID:", self.tracking_id)
        print("Status:", self.status)

c = Courier("CR101")
c.update_status("Out for Delivery")
c.track()
