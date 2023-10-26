import java.text.NumberFormat;

public class Item
{
    private double price;
    private int quantity;
    private String name;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();


    public Item(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public double itemTotalCost() {
    return price*quantity;
}

    @Override
    public String toString() {
        return name + "  " + currencyFormatter.format(price) + "  (" + quantity + ")  " + currencyFormatter.format(price*quantity);
    }
}