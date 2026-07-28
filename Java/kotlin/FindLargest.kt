package kotlin

object FindLargest {
    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = intArrayOf(25, 3, 5, 7, 2, 8, -1, 4, 85)
        println(findLargest(numbers)) // Example usage
    }

    fun findLargest(numbers: IntArray?): Int {
        if (numbers == null || numbers.isEmpty()) {
            return 0
        }

        return numbers.maxOrNull() ?: 0
    }
}

