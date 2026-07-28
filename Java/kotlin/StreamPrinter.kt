package kotlin

import java.io.IOException
import java.io.Reader

class StreamPrinter {
    @Throws(IOException::class)
    fun print(reader: Reader?) {
        requireNotNull(reader) { "Reader cannot be null" }

        reader.use { r ->
            var code: Int
            while (r.read().also { code = it } != -1) {
                println(code.toChar())
            }
        }
    }
}

