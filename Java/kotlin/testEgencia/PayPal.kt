package kotlin.testEgencia

class PayPal : PaymentMode {
    private var amount: Double = 0.0
    private var email: String? = null

    override fun processPaiement(): Boolean {
        return true
    }
}

