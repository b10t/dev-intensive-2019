package ru.skillbranch.devintensive.extensions

import android.app.Activity
import android.content.res.Resources
import android.graphics.Rect
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager


fun Activity?.hideKeyboard() {
    val inputMethodManager = this?.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(this?.currentFocus.windowToken, 0)
    Log.d("M_Activity", "hideKeyboard()")
}


fun Activity?.isKeyboardOpen(): Boolean {
    return _isKeyboardOpen(this)
}


fun Activity?.isKeyboardClosed(): Boolean {
    return ! _isKeyboardOpen(this)
}


fun Activity.getActivityRoot(): View {
    return (findViewById<ViewGroup>(android.R.id.content)).getChildAt(0)
}


fun dip(value: Int): Int {
    return (value * Resources.getSystem().displayMetrics.density).toInt()
}

fun _isKeyboardOpen(activy: Activity?): Boolean {
    val KEYBOARD_VISIBLE_THRESHOLD_DP = 100
    val r = Rect()

    val activityRoot = activy?.getActivityRoot()
    val visibleThreshold = dip(KEYBOARD_VISIBLE_THRESHOLD_DP)

    activityRoot?.getWindowVisibleDisplayFrame(r)

    val heightDiff = activityRoot?.rootView?.height?.minus(r.height())

    if (heightDiff != null) {
        return heightDiff > visibleThreshold
    }

    return false
}
