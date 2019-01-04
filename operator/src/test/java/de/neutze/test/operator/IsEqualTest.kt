package de.neutze.test.operator

import de.neutze.test.operator.`is equal`
import org.junit.ComparisonFailure
import org.junit.Test

class IsEqualTest {

    //region Equals

    @Test
    fun equals() {
        val expected = "expected"
        val actual = "expected"

        actual `is equal` expected
    }

    @Test(expected = ComparisonFailure::class)
    fun `equals fails`() {
        val expected = "expected"
        val actual = "actual"

        actual `is equal` expected
    }

    //endregion

}

