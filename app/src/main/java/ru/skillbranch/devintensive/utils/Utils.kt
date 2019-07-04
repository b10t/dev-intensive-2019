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
        var _first = firstName?.trim()
        var _secon = lastName?.trim()

        if (_first.isNullOrEmpty() && _secon.isNullOrEmpty()) return null

        _first = _first?.first()?.toUpperCase().toString()
        _secon = _secon?.first()?.toUpperCase().toString()

        return "$_first$_secon"
//        var ret_init: String? = null
//
//        var first_sym: Char? = null
//        var two_sym: Char? = null
//
//        var _firstName = firstName?.trim()
//        var _lastName = lastName?.trim()
//
//
//        first_sym = when(_firstName?.isEmpty()){
//            true -> null
//            else -> _firstName?.get(0)?.toUpperCase()
//        }
//
//        two_sym = when(_lastName?.isEmpty()){
//            true -> null
//            else -> _lastName?.get(0)?.toUpperCase()
//        }
//
//        if (first_sym != null) {
//            ret_init = first_sym.toString()
////            ret_init = first_sym + two_sym
//        }
//
//        if (two_sym != null) {
//            ret_init += two_sym.toString()
//        }
//
//        return if (first_sym.isEm)

//        val firstInitial = firstName.trimOrNull()?.first()?.toString()?.toUpperCase(Locale("ru")) ?: ""
//        val secondInitial = lastName.trimOrNull()?.first()?.toString()?.toUpperCase(Locale("ru")) ?: ""
//
//        return if (firstInitial.isEmpty() && secondInitial.isEmpty()) {
//            null
//        } else {
//            "$firstInitial$secondInitial"
//        }
    }
}