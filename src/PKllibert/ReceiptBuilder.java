package PKllibert;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.text.DecimalFormat;

public class ReceiptBuilder {

    private final List<CartItem> cart;
    private final double netPrice;
    private final double vatAmount;
    private final double totalPrice;
    private final double moneyDelivered;
    private final double moneyReturned;
    private final String vatPercentage;
    private final DateTimeFormatter dateFormatter;
    private final DateTimeFormatter timeFormatter;
    private final DecimalFormat df;

    public ReceiptBuilder(List<CartItem> cart,
            double netPrice, double vatAmount, double totalPrice,
            double moneyDelivered, double moneyReturned,
            String vatPercentage,
            DateTimeFormatter dateFormatter,
            DateTimeFormatter timeFormatter) {
        this.cart = cart;
        this.netPrice = netPrice;
        this.vatAmount = vatAmount;
        this.totalPrice = totalPrice;
        this.moneyDelivered = moneyDelivered;
        this.moneyReturned = moneyReturned;
        this.vatPercentage = vatPercentage;
        this.dateFormatter = dateFormatter;
        this.timeFormatter = timeFormatter;
        this.df = new DecimalFormat("0.00");
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        LocalDateTime now = LocalDateTime.now();

        appendCartItems(sb);
        appendTotals(sb);
        appendPaymentInfo(sb);
        appendThankYouMessage(sb);
        appendDateTime(sb, now);

        return sb.toString();
    }

    private void appendCartItems(StringBuilder sb) {
        for (CartItem item : cart) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("\n ------------------------------------------------------------ \n\n");
    }

    private void appendTotals(StringBuilder sb) {
        sb.append(" -> Net price:        ").append(df.format(netPrice)).append(" €\n");
        sb.append(" -> VAT (").append(vatPercentage).append("%):         ").append(df.format(vatAmount)).append(" €\n");
        sb.append(" -> Total:            ").append(df.format(totalPrice)).append(" €\n\n");
    }

    private void appendPaymentInfo(StringBuilder sb) {
        sb.append(" → Amount paid:      ").append(df.format(moneyDelivered)).append(" €\n");
        sb.append(" → Change returned:  ").append(df.format(moneyReturned)).append(" €\n");
    }

    private void appendThankYouMessage(StringBuilder sb) {
        sb.append("\n"
                + "          ******       ******\n"
                + "        **********   **********\n"
                + "      ************* *************\n"
                + "     *****************************\n"
                + "     *****************************\n"
                + "     *****************************\n"
                + "      ***************************\n"
                + "        ***********************\n"
                + "          *******************\n"
                + "            ***************\n"
                + "              ***********\n"
                + "                *******\n"
                + "                  ***\n"
                + "                   *\n");
        sb.append("\n Thank you for shopping at GoodFruit! :D\n");
    }

    private void appendDateTime(StringBuilder sb, LocalDateTime now) {
        sb.append(" Date: ").append(now.format(dateFormatter)).append("\n");
        sb.append(" Time: ").append(now.format(timeFormatter));
    }
}
