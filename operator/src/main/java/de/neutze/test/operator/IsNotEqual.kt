package de.neutze.test.operator

import kotlin.test.assertNotEquals

infix fun <T : Any> T?.`is not equal`(expected: T?) {
    assertNotEquals(
        illegal = expected,
        actual = this
    )
}
