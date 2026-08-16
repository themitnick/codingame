class WaterTank {
  private empty = true;

  isEmpty(): boolean {
    return this.empty;
  }

  setEmpty(empty: boolean): void {
    this.empty = empty;
  }
}

// Modele du moniteur en TS (mono-thread) : attente gardee via des promesses,
// equivalent des wait()/notifyAll() de la version Java.
class WaterTankMonitor {
  private waiters: (() => void)[] = [];

  constructor(private readonly tank: WaterTank) {}

  private wait(): Promise<void> {
    return new Promise(resolve => this.waiters.push(resolve));
  }

  private notifyAll(): void {
    const pending = this.waiters;
    this.waiters = [];
    pending.forEach(resolve => resolve());
  }

  async empty(): Promise<void> {
    while (this.tank.isEmpty()) {
      await this.wait();
    }
    this.tank.setEmpty(true);
    this.notifyAll();
  }

  async fill(): Promise<void> {
    while (!this.tank.isEmpty()) {
      await this.wait();
    }
    this.tank.setEmpty(false);
    this.notifyAll();
  }
}

export { WaterTank, WaterTankMonitor };
