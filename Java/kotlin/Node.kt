package kotlin

class Node(
    var left: Node? = null,
    var right: Node? = null,
    var value: Int = 0
) {
    // Recherche un noeud contenant la valeur v dans l'arbre
    fun find(v: Int): Node? {
        if (this.value == v) return this
        if (v < this.value && left != null) return left?.find(v)
        if (v > this.value && right != null) return right?.find(v)
        return null
    }
}

