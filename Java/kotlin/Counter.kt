package kotlin

object Counter {
    private var count = 0

    @Synchronized
    fun increment(): Int {
        count++
        return count
    }
}

