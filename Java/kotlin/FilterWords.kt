package kotlin

object FilterWords {
    @JvmStatic
    fun main(args: Array<String>) {
        val wordsValue = arrayOf("the", "dog", "got", "a", "bone", "manière", "end")
        val letters = "ad"
        val result = filterWords(wordsValue, letters)
        println(result.contentToString())
    }

    fun filterWords(words: Array<String>, letters: String): Array<String> {
        return words.filter { word ->
            letters.any { letter -> word.contains(letter) }
        }.toTypedArray()
    }
}

