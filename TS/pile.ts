class Stack<T> {
  private elements: (T | null)[] = [];
  private size = 0;

  push(object: T): void {
    this.elements[this.size++] = object;
  }

  pop(): T {
    if (this.size === 0) {
      throw new Error("EmptyStackException");
    }

    const result = this.elements[--this.size] as T;
    this.elements[this.size] = null; // supprime la reference obsolete (evite la fuite memoire)
    return result;
  }
}

export { Stack };
