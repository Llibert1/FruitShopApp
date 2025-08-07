/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
