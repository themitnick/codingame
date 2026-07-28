package kotlin.testEgencia

object MainPaiment {
    @JvmStatic
    fun main(args: Array<String>) {
        val creditCard = CreditCard()
        val payPal = PayPal()

        val paymentModeList = listOf<PaymentMode>(creditCard, payPal)
    }
}

