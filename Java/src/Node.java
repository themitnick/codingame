public class Node {
    Node left, right;
    int value;

    // Recherche un noeud contenant la valeur v dans l'arbre
    Node find(int v) {
        if (this.value == v) return this;
        if (v < this.value && left != null) return left.find(v);
        if (v > this.value && right != null) return right.find(v);
        return null;
    }
}
