package kotlin

object CountFrequencies {
    @JvmStatic
    fun main(args: Array<String>) {
        val words = arrayOf("apple", "banana", "apple", "orange", "banana", "apple")
        countFrequencies(words)
    }

    fun countFrequencies(word: Array<String>) {
        val frequencyMap = mutableMapOf<String, Int>()

        for (w in word) {
            frequencyMap[w] = frequencyMap.getOrDefault(w, 0) + 1
        }

        for ((key, value) in frequencyMap) {
            println("$key = $value")
        }
    }
}

