package de.dertyp7214.rboardthememanager.core

import java.net.HttpURLConnection
import java.net.URL

fun URL.getTextFromUrl(): String {
    return try {
        readText()
    } catch (e: Exception) {
        ""
    }
}

fun URL.isReachable(): Boolean {
    return (openConnection() as HttpURLConnection).responseCode == 200
}