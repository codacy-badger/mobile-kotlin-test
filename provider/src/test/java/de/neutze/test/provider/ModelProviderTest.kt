package de.neutze.test.provider

import de.neutze.test.operator.`is equal`
import com.google.gson.reflect.TypeToken
import de.neutze.test.provider.ModelProvider
import org.junit.After
import org.junit.Before
import org.junit.Test

class ModelProviderTest {

    //region lateinit

    private lateinit var modelProvider: ModelProvider

    //endregion


    //region UnitTest

    @Before
    fun setUp() {
        modelProvider = ModelProvider
    }

    @After
    fun tearDown() {
    }

    //endregion


    //region ModelProvider

    @Test
    fun `get`() {
        val clazz = Exception::class
        val path = "exception.json"

        val expected = "much error"
        val actual = ModelProvider.get(path, clazz)

        actual.message `is equal` expected
    }

    @Test
    fun `get TypeToken`() {
        val type = object : TypeToken<List<String>>() {}.type
        val path = "typeToken.json"

        val expected = listOf("rofl", "omg", "lol")

        val actual = ModelProvider.get<List<String>>(path, type)

        actual `is equal` expected
    }

    //endregion

}
