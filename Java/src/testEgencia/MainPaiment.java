package testEgencia;

import java.util.List;

public class MainPaiment {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        List<PaymentMode> paymentModeList = List.of(creditCard, payPal);

    }
}
