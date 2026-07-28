class A {
    void a(Service s, Connection c) throws Exception {
        try {
            s.setConnection(c);
            s.execute();
            try {
                c.commit();
            } catch (Exception e) {
                try {
                    c.rollback();
                } catch (Exception rollbackEx) {
                    e.addSuppressed(rollbackEx);
                }
                throw e;
            }
        } finally {
            try {
                c.close();
            } catch (Exception closeEx) {
                // Log l'exception de fermeture mais ne la propage pas
                // car elle ne doit pas masquer l'exception principale
            }
        }
    }
}

interface Service {
    void execute() throws Exception;
    void setConnection(Connection c);
}

interface Connection {
    void commit();
    void rollback();
    void close();
}
