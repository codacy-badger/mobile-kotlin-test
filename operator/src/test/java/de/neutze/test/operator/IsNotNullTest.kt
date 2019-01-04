package de.neutze.test.operator

import de.neutze.test.operator.`is not`
import org.junit.Test
import java.util.*

class IsNotNullTest {

    //region IsNotNull

    @Test
    fun `is not null`() {
        val actual = "no match"

        actual `is not` null
    }

    @Test(expected = AssertionError::class)
    fun `is not null fails`() {
        val actual = null

        actual `is not` null
    }

    @Test(expected = InputMismatchException::class)
    fun `is not null wrong input`() {
        val expected = "InputMismatchException"
        val actual = null

        actual `is not` expected
    }

    //endregion

}
