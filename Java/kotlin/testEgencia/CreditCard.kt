package kotlin.testEgencia

class CreditCard : PaymentMode {
    private var amount: Double = 0.0
    private var cardNumber: String? = null

    override fun processPaiement(): Boolean {
        return true
    }
}

