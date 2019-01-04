package de.neutze.test.provider

import de.neutze.test.operator.`is not`
import de.neutze.test.provider.FileReader
import org.junit.After
import org.junit.Before
import org.junit.Test

class FileReaderTest {

    //region lateinit

    private lateinit var fileReader: FileReader

    //endregion


    //region UnitTest

    @Before
    fun setUp() {
        fileReader = FileReader
    }

    @After
    fun tearDown() {
    }

    //endregion


    //region FileReader

    @Test
    fun `get`() {
        val path = "exception.json"

        val actual = FileReader.getJson(path)

        actual `is not` null
    }

    @Test(expected = KotlinNullPointerException::class)
    fun `get fail`() {
        val path = "fun.json"

        val actual = FileReader.getJson(path)

        actual `is not` null
    }


    //endregion

}
