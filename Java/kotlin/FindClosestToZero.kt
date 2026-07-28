package kotlin

import kotlin.math.abs

object FindClosestToZero {
    @JvmStatic
    fun main(args: Array<String>) {
        val testValue = intArrayOf(5, 11, -6, 10, 5, -2, -15, -7, 9, 258, -96, 14, 98, -5, -6, -8, -87, -10, 125, 74, 96, -836, 147, 2)
        val result = closestToZero(testValue)
        println(result)
    }

    fun closestToZero(temps: IntArray?): Int {
        if (temps == null || temps.isEmpty() || temps.size > 10000) {
            return 0
        }

        return temps.minWithOrNull { a, b ->
            val compareAbs = abs(a).compareTo(abs(b))
            if (compareAbs != 0) compareAbs else b.compareTo(a)
        } ?: 0
    }
}

