package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?) : Pair<String?, String?>{

        val parts : List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)

        firstName = when(firstName){
            "" -> null
            else -> firstName
        }

        lastName = when(lastName){
            "" -> null
            else -> lastName
        }
//        return Pair(firstName, lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
        return "asd"
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return "asd"
    }
}