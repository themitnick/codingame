package kotlin

object FindSmallestInterval {
    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(47, 19, 8, 9, 3, -6, -3)
        val result = findSmallestInterval(intArray)
        println(result)
    }

    fun findSmallestInterval(numbers: IntArray?): Int {
        val NO_RANGE_FOUND = -1
        if (numbers == null || numbers.size < 2 || numbers.size > 100000) {
            return NO_RANGE_FOUND
        }

        numbers.sort()
        return numbers.indices
            .dropLast(1)
            .map { i -> numbers[i + 1] - numbers[i] }
            .minOrNull() ?: NO_RANGE_FOUND
    }
}

