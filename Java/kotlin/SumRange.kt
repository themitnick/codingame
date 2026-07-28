package kotlin

object SumRange {
    @JvmStatic
    fun main(args: Array<String>) {
        val ints = intArrayOf(1, 20, 3, 10, 100, -2, 110)
        val result = sumRange(ints)
        println(result)
    }

    fun sumRange(ints: IntArray): Int {
        return ints.filter { n -> n in 10..100 }.sum()
    }
}

