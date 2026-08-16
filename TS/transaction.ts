interface Service {
  execute(): void;
  setConnection(c: Connection): void;
}

interface Connection {
  commit(): void;
  rollback(): void;
  close(): void;
}

// Version robuste : preserve l'exception principale, rollback et close ne la masquent pas
function a(s: Service, c: Connection): void {
  try {
    s.setConnection(c);
    s.execute();
    try {
      c.commit();
    } catch (e) {
      try {
        c.rollback();
      } catch (rollbackEx) {
        // on ignore l'erreur de rollback pour ne pas masquer l'exception principale
      }
      throw e;
    }
  } finally {
    try {
      c.close();
    } catch (closeEx) {
      // on ignore l'erreur de fermeture pour ne pas masquer l'exception principale
    }
  }
}

function a2(s: Service, c: Connection): void {
  try {
    s.setConnection(c);
    s.execute();
    c.commit();
  } catch (e) {
    c.rollback();
    throw e;
  } finally {
    c.close();
  }
}

export { Service, Connection, a, a2 };
