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

    Node find2(int value) {  // A privilegé
        Node current = this;
        while (null != current) {
            if(current.value == value) return current;
            current = value < current.value ? current.left : current.right;
        }
        return  null;
    }
}
