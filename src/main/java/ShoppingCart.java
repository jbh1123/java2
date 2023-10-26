import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart
{
    private ArrayList<Item> items;
    private double cartTotal = 0.0;
    private double shippingCharge = 0.0;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public ShoppingCart(double shippingCharge) {
        items = new ArrayList<Item>();
        this.shippingCharge = shippingCharge;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotal() {
        for ( Item i : items ) {
            cartTotal += i.itemTotalCost();
        }
        cartTotal *= 1.10;
        if ( cartTotal < 10.00 ) {
            cartTotal += shippingCharge;
        }
    }

    public String getTotal() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(cartTotal);
    }
}
