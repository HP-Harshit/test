package MultilevelInheritance;

// Defining the superclass Order
class Order {
    // Class Attributes
    public int orderId;
    public String orderDate;

    // Defining Constructor
    public Order(int orderId, String orderDate) {
        // Initializing the attributes
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}

// Defining the subclass ShippedOrder
class ShippedOrder extends Order {
    // Class Attribute
    public String trackingNumber;

    // Defining Constructor
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        // Calling the superclass constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    // Overriding the displayOrderDetails method
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Defining the subclass DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    // Class Attribute
    public String deliveryDate;

    // Defining Constructor
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        // Calling the superclass constructor
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    // Overriding the displayOrderDetails method
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class
public class OnlineRetailOrderManagement {

    public static void main(String[] args) {
        // Creating instances of each class
        Order order = new Order(101, "2025-01-24");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-23", "TN12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-22", "TN54321", "2025-01-25");

        // Calling the displayOrderDetails method on each instance
        order.displayOrderDetails();
        System.out.println();

        shippedOrder.displayOrderDetails();
        System.out.println();

        deliveredOrder.displayOrderDetails();
    }
}