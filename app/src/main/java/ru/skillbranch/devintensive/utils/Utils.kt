package ru.skillbranch.devintensive.utils

object Utils {

    fun parseName(fullName: String?) : Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }

    fun transliteration(fullName: String, divider: String = " "): String {
        TODO("Not yet implemented")
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO("Not yet implemented")
    }
}