/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PKllibert;

public class CartItem {
    
    private String productName;
    private double quantityKg;
    private double totalPrice;

    public CartItem(String productName, double quantityKg, double totalPrice) {
        this.productName = productName;
        this.quantityKg = quantityKg;
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantityKg() {
        return quantityKg;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addQuantity(double kg, double pricePerKg) {
        this.quantityKg += kg;
        this.totalPrice += kg * pricePerKg;
    }

    @Override
    public String toString() {
        return String.format("%s    -    %.2fkg    -    %.2f€", productName, quantityKg, totalPrice);
    }
}

