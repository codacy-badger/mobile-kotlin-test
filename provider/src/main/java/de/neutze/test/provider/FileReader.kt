package de.neutze.test.provider

import org.apache.commons.io.FileUtils
import java.io.File

object FileReader {

    //region val

    private const val encoding = "UTF-8"

    //endregion


    //region FileReader

    fun getJson(name: String?): String {
        val javaClazz = javaClass
        val resourceFile = javaClazz.getResource("/$name")!!
        val filePath  = resourceFile.file

        val file = File(filePath)
        val lines = FileUtils.readLines(file, encoding)
        val stringBuilder = StringBuilder()

        for (line in lines) {
            stringBuilder.append(line)
        }

        return stringBuilder.toString()
    }

    //endregion

}
