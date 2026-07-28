package kotlin

import java.util.concurrent.ForkJoinPool

object Boolean {
    @JvmStatic
    fun main(args: Array<String>) {
        println(a(-1, 2))
        val threadCount = ForkJoinPool.getCommonPoolParallelism()
        println("Number of threads: $threadCount")
    }

    fun a(i: Int, j: Int): kotlin.Boolean {
        return i == 1 || j == 1 || (i + j) == 1
    }
}

