# Fruit Shop POS App

This is a Java Swing application that simulates a simple point-of-sale system for a fruit shop.  
Users can select products sold by the kilogram, add them to a cart, apply VAT, and generate a visual receipt.

## Features
- Add products to the cart by entering weight in kilograms  
- Automatic calculation of **net price**, **VAT amount**, and **total price**  
- Update or merge quantities if the same product is added multiple times  
- Checkout process with change calculation  
- Reset function to clear cart and start a new order  
- Printable ASCII-art receipt with purchase details and date/time  

## Technologies
- **Java 11+**  
- **Swing** (GUI)  
- **NetBeans IDE**  

## How to Run
1. Open the project in **NetBeans** (or another Java IDE)  
2. Make sure your environment supports Java 11 or newer  
3. Run the main JFrame class (e.g., `FruitShopJFrame`)  

## Notes
- Default VAT is set to **21%** (can be changed via combo box)  
- Example product list is hardcoded in the application (can be extended)  
- Designed as an educational project to practice Swing, event handling, and basic business logic  
