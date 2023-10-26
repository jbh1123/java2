import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart
{
    private ArrayList<Item> cart;
    private double cartTotal = 0.0;
    private double shippingCharge = 0.0;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();


    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public ShoppingCart(double shippingCharge) {
        cart = new ArrayList<>();
        this.shippingCharge = shippingCharge;
    }

    public void setShippingCharge(double shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public double getShippingCharge() {
        return shippingCharge;
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void calculateTotal() {
        for ( Item i : cart) {
            cartTotal += i.itemTotalCost();
        }
        cartTotal *= 1.10;
        if ( cartTotal >= 10.00 ) { shippingCharge = 0.0; }
        cartTotal += shippingCharge;
    }

    public String getTotal() {
        return currencyFormatter.format(cartTotal);
    }

    public ArrayList<Item> getCart() {
        return cart;
    }

    public Invoice shipOrder(String name, String address, String city, String state, int zip) {
        return new Invoice(this, name, address, city, state, zip);
    }
}
