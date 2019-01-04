package de.neutze.test.operator

import de.neutze.test.operator.`is`
import org.junit.Test
import java.util.*

class IsNullTest {

    //region IsNull

    @Test
    fun `is  null`() {
        val actual = null

        actual `is` null
    }

    @Test(expected = AssertionError::class)
    fun `is  null fails`() {
        val actual = "AssertionError"

        actual `is` null
    }

    @Test(expected = InputMismatchException::class)
    fun `is  null wrong input`() {
        val expected = "InputMismatchException"
        val actual = null

        actual `is` expected
    }

    //endregion

}

