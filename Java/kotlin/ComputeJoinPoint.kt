package kotlin

object ComputeJoinPoint {
    @JvmStatic
    fun main(args: Array<String>) {
        val seq1 = 471
        val seq2 = 480
        val result = computeJoinPoint(seq1, seq2)
        println(result)
    }

    fun computeJoinPoint(seq1: Int, seq2: Int): Int {
        val sumDigits: (Int) -> Int = { n ->
            var num = n
            var sum = 0
            while (num > 0) {
                sum += num % 10
                num /= 10
            }
            sum
        }

        var a = seq1
        var b = seq2
        while (a != b) {
            if (a < b) {
                a += sumDigits(a)
            } else {
                b += sumDigits(b)
            }
        }
        return a
    }
}

