interface Command {
  name(): string;
  execute(text: string): string;
}

function countWordsValue(text: string): string {
  if (text == null || text.trim().length === 0) {
    return "0";
  }
  return String(text.trim().split(/\s+/).length);
}

class CountWords implements Command {
  name(): string {
    return "CountWords";
  }

  execute(text: string): string {
    return countWordsValue(text);
  }
}

class Program {
  private readonly commands = new Map<string, Command>();

  register(command: Command): void {
    this.commands.set(command.name(), command);
  }

  // point d'entree conserve : extensible sans modifier Program (principe ouvert/ferme)
  exec(command: string, text: string): string {
    const handler = this.commands.get(command);
    if (!handler) {
      throw new Error(command);
    }
    return handler.execute(text);
  }
}

export { Command, CountWords, Program };
