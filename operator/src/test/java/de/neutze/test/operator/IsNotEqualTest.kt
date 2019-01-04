package de.neutze.test.operator

import de.neutze.test.operator.`is not equal`
import org.junit.Test

class IsNotEqualTest {

    //region IsNotEqualTest

    @Test
    fun `is not equal`() {
        val expected = "match"
        val actual = "no match"

        actual `is not equal` expected
    }

    @Test(expected = AssertionError::class)
    fun `is not equal fails`() {
        val expected = "match"
        val actual = "match"

        actual `is not equal` expected
    }

    //endregion

}

