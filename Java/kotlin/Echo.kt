package kotlin

object Echo {
    @JvmStatic
    fun main(args: Array<String>) {
        for (arg in args) {
            println(arg)
        }
    }
}

