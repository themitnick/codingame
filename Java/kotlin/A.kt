package kotlin

class A {
    @Throws(Exception::class)
    fun a(s: Service, c: Connection) {
        try {
            s.setConnection(c)
            s.execute()
            try {
                c.commit()
            } catch (e: Exception) {
                try {
                    c.rollback()
                } catch (rollbackEx: Exception) {
                    e.addSuppressed(rollbackEx)
                }
                throw e
            }
        } finally {
            try {
                c.close()
            } catch (closeEx: Exception) {
                // Log l'exception de fermeture mais ne la propage pas
                // car elle ne doit pas masquer l'exception principale
            }
        }
    }
}

interface Service {
    @Throws(Exception::class)
    fun execute()
    fun setConnection(c: Connection)
}

interface Connection {
    fun commit()
    fun rollback()
    fun close()
}

