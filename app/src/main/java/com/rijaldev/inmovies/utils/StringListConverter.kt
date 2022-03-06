package com.rijaldev.inmovies.utils

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class StringListConverter {

    @TypeConverter
    fun toString(stringList: List<String>): String {
        return Gson().toJson(stringList)
    }

    @TypeConverter
    fun fromString(value: String?): List<String> {
        val listType = object : TypeToken<ArrayList<String>>() {}.type
        return Gson().fromJson(value, listType)
    }
}