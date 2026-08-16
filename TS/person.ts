class Person {
  constructor(
    private readonly name: string,
    private readonly birthDay: string
  ) {}

  getName(): string {
    return this.name;
  }

  getBirthDay(): string {
    return this.birthDay;
  }
}

export { Person };
