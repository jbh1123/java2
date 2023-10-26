import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice
{
    private ShoppingCart cart;
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

    public Invoice(ShoppingCart cart, String name, String address, String city, String state, int zip) {
        this.cart = cart;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Ship to:\n");
        result.append("  " + name + "\n");
        result.append("  " + address + "\n");
        result.append("  " + city + ", " + state + " " + zip + "\n");
        result.append("\nItems");
        result.append("\n_____\n");
        for ( Item item : cart.getCart() ) {
            result.append(item.toString() + "\n");
        }
        String shipping = ( cart.getShippingCharge() == 0.0 ) ? "Free" : currencyFormatter.format(cart.getShippingCharge());
        result.append("\nShipping: " + shipping);
        result.append("\n\nTotal Cost");
        result.append("\n_________");
        result.append("\n" + cart.getTotal());
        return result.toString();
    }
}