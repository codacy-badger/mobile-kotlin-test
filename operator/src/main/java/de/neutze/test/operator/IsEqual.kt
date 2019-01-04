package de.neutze.test.operator

import kotlin.test.assertEquals

infix fun <T : Any> T?.`is equal`(expected: T?) {
    assertEquals(
        expected = expected,
        actual = this
    )
}
