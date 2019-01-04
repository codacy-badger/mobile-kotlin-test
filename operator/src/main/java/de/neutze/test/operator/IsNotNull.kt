package de.neutze.test.operator

import java.util.*
import kotlin.test.assertNotNull


infix fun Any?.`is not`(nil: Any?) {
    if (nil != null) {
        throw InputMismatchException("must be null!")
    } else {
        assertNotNull(
            actual = this
        )
    }
}
