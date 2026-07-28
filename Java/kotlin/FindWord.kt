package kotlin

object FindWord {
    @JvmStatic
    fun main(args: Array<String>) {
        // Test cases
        val test1 = listOf("P>E", "E>R", "R>U")
        println(findWord(test1)) // Should print "PERU"

        val test2 = listOf("I>N", "A>I", "P>A", "S>P")
        println(findWord(test2)) // Should print "SPAIN"

        val test3 = listOf("U>N", "G>A", "R>Y", "H>U", "N>G", "A>R")
        println(findWord(test3)) // Should print "HUNGARY"

        val test4 = listOf("I>F", "W>I", "S>W", "F>T")
        println(findWord(test4)) // Should print "SWIFT"

        val test5 = listOf("R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G")
        println(findWord(test5)) // Should print "PORTUGAL"

        val test6 = listOf("W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T")
        println(findWord(test6)) // Should print "SWITZERLAND"

        val test7 = listOf("O>K")
        println(findWord(test7)) // Should print "OK"
    }

    fun findWord(combinations: List<String>): String {
        // Create a map to store the edges (currentChar -> nextChar)
        val edgeMap = mutableMapOf<Char, Char>()
        // Create a set to keep track of all destination characters
        val destinations = mutableSetOf<Char>()

        // Populate the edge map and destination set
        for (combo in combinations) {
            val from = combo[0]
            val to = combo[2]
            edgeMap[from] = to
            destinations.add(to)
        }

        // Find the starting character (the one that isn't a destination)
        var start = ' '
        for (combo in combinations) {
            val candidate = combo[0]
            if (candidate !in destinations) {
                start = candidate
                break
            }
        }

        // Reconstruct the word by following the edges
        val word = StringBuilder()
        var current: Char? = start
        while (current != null && current != '\u0000') {
            word.append(current)
            current = edgeMap[current]
        }

        return word.toString()
    }
}

