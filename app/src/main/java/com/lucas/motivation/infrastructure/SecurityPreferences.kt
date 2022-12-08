package com.lucas.motivation.infrastructure

import android.content.SharedPreferences
import android.content.Context

class SecurityPreferences(context: Context) {

    private val security: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, str: String) {
        security.edit().putString(key, str).apply()
    }

    fun getString(key: String): String {
        return security.getString(key, "") ?: ""
    }
}