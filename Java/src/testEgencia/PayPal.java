package testEgencia;

public class PayPal implements PaymentMode{
    private double amount;
    private String email;

    @Override
    public boolean processPaiement() {
        return true;
    }
}
