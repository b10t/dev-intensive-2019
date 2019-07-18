package ru.skillbranch.devintensive.extensions

import android.app.Activity
import android.util.Log
import android.view.inputmethod.InputMethodManager



fun Activity?.hideKeyboard() {
    val inputMethodManager = this?.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(this?.currentFocus.windowToken, 0)
    Log.d("M_Activity", "hideKeyboard()")
}