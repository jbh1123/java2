import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart
{
    private ArrayList<Item> items;
    private double cartTotal = 0.0;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotal() {
        for ( Item i : items ) {
            cartTotal += i.itemTotalCost();
        }
    }

    public String getTotal() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(cartTotal);
    }
}
