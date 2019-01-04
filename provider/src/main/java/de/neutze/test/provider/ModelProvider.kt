package de.neutze.test.provider

import com.google.gson.Gson
import java.lang.reflect.Type
import kotlin.reflect.KClass

object ModelProvider {

    fun <T : Any> get(path: String, clazz: KClass<T>) =
        Gson().fromJson(
            FileReader.getJson(path),
            clazz.java
        )!!

    fun <T> get(path: String, type: Type) =
        Gson().fromJson<T>(
            FileReader.getJson(path),
            type
        )!!

}
