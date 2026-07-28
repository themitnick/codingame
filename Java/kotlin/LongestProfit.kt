
fun longestProfit(data: Array<Int>): Int {
    if (data.isEmpty()) return 0
    if (data.size == 1) return 1

    var maxLength = 1
    var minPrice = data[0]
    var minIndex = 0

    for (i in 1 until data.size) {
        if (data[i] > minPrice) {
            // Prix actuel > prix minimum, calculer la longueur
            val currentLength = i - minIndex
            if (currentLength > maxLength) {
                maxLength = currentLength
            }
        }
        
        if (data[i] < minPrice) {
            // Nouveau minimum trouvé
            minPrice = data[i]
            minIndex = i
        }
    }

    return maxLength
}