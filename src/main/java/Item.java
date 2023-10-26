public class Item
{
    private double price;
    private int quantity;
    private String name;

    public Item(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public double itemTotalCost() {
    return price*quantity;
}
}
