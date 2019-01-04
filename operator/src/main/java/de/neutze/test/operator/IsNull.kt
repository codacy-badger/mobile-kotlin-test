package de.neutze.test.operator

import java.util.*
import kotlin.test.assertNull

infix fun Any?.`is`(nil: Any?) {
    if (nil != null) {
        throw InputMismatchException("must be null!")
    } else {
        assertNull(
            actual = this
        )
    }
}
