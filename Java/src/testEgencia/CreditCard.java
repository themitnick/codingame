package testEgencia;

public class CreditCard implements PaymentMode{
    private double amount;
    private String cardNumber;

    @Override
    public boolean processPaiement() {
        return true;
    }
}
