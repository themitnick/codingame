class TreeNode {
  left: TreeNode | null;
  right: TreeNode | null;
  value: number;

  constructor(value: number) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  // Recherche un noeud contenant la valeur v dans l'arbre
  find(v: number): TreeNode | null {
    if (this.value === v) return this;
    if (v < this.value && this.left !== null) return this.left.find(v);
    if (v > this.value && this.right !== null) return this.right.find(v);
    return null;
  }
}
