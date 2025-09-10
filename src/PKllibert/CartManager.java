package PKllibert;

import java.util.List;

public class CartManager {

    private List<CartItem> cart;

    public CartManager(List<CartItem> cart) {
        this.cart = cart;
    }

    public void addOrUpdateItem(String productName, float kg, float pricePerKg) {
        for (CartItem item : cart) {
            if (item.getProductName().equalsIgnoreCase(productName)) {
                item.addQuantity(kg, pricePerKg);
                return;
            }
        }
        double itemTotal = kg * pricePerKg;
        cart.add(new CartItem(productName, kg, itemTotal));
    }

    public void resetCart() {
        cart.clear();
    }
}
