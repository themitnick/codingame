package kotlin

object ComputeMultipleSum {
    @JvmStatic
    fun main(args: Array<String>) {
        println(computeMultipleSum(-11)) // Example usage
    }

    fun computeMultipleSum(n: Int): Int {
        require(n > 0 && n <= 1000) {
            "n must be greater than 0 and less than or equal to 1000"
        }

        return (1..n)
            .filter { it % 3 == 0 || it % 5 == 0 || it % 7 == 0 }
            .sum()
    }
}

