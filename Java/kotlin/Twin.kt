package kotlin

object Twin {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = "Marion"
        val b = "Romain"
        val result = isTwin(a, b)
        println(result)
    }

    fun isTwin(a: String, b: String): Boolean {
        if (a.length != b.length) {
            return false
        }
        val sortedA = a.lowercase().toCharArray().sorted().joinToString("")
        val sortedB = b.lowercase().toCharArray().sorted().joinToString("")
        return sortedA == sortedB
    }
}

