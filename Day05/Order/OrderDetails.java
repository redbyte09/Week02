package Order;

class Order {
    int orderId;
    int orderDate;

    public Order(int orderId,int orderDate)
    {
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public void getOrderStatus()
    {
        System.out.println("Order ID "+orderId);
        System.out.println("Order Date is "+orderDate);
    }
}

class ShippedOrder extends Order
{
    int trackingNumber;

    public ShippedOrder(int orderId,int orderDate,int trackingNumber)
    {
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
    public void getOrderStatus()
    {
        super.getOrderStatus();
        System.out.println("Tracking number is  "+trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder
{
    int deliveryDate;

    public DeliveredOrder(int orderId,int orderDate,int trackingNumber,int deliveryDate)
    {
        super(orderId, orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    public void getOrderStatus()
    {
        super.getOrderStatus();
        System.out.println("Deliver date is "+deliveryDate);
    }
}

public class OrderDetails {
    public static void main(String[] args) {
        // Create objects and test the hierarchy
        Order order = new Order(101, 2025-01-20);
        order.getOrderStatus();

        System.out.println("\n");

        ShippedOrder shippedOrder = new ShippedOrder(102, 2025-01-21, 12345);
        shippedOrder.getOrderStatus();

        System.out.println("\n");

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, 2025-01-22, 67890, 2025-01-24);
        deliveredOrder.getOrderStatus();
    }
}
