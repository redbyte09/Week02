package Item;

public class Item {
    private String itemName;
    private int itemCode;
    private double price;

    public Item(String itemName,int itemCode,double price)
    {
        this.itemName=itemName;
        this.itemCode=itemCode;
        this.price=price;
    }
    public void displayDetails()
    {
        System.out.println("Name"+itemName);
        System.out.println("Price"+price);
        System.out.println("Code"+itemCode);
    }
    public double Total()
    {
        return price*itemCode;
    }
    public static void main(String[] args) {
        Item item=new Item("Mobile", 05, 15000);
        item.displayDetails();
        double totalCost=item.Total();
        
        System.out.println("Total Cost"+totalCost);
        
    }
}

