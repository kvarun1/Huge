package com.mbinfo.huge.utility

import android.content.Context
import android.content.SharedPreferences
import android.provider.Settings
import com.mbinfo.huge.data.prefs.SessionManager.KEY_NAME

object PrefsHelper {
     lateinit var prefs: SharedPreferences
    private const val PREFS_NAME = "huge"
    const val ID_MOBILE = "id_mobile"
    fun init(context: Context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }
    fun getDeviceID(context: Context): String {
        return Settings.Secure.getString(
                context.contentResolver,
                Settings.Secure.ANDROID_ID
        )
    }
    fun read(key: String, value: String): String? {
        return prefs.getString(key, value)
    }

    fun write(key: String, value: String) {
        val prefsEditor: SharedPreferences.Editor = prefs.edit()
        with(prefsEditor) {
            putString(key, value)
            commit()
        }
    }
    fun save(ID_MOBILE: String, mobile: String) {
        val editor: SharedPreferences.Editor = prefs.edit()
        editor.putString(ID_MOBILE,mobile )
        editor.commit()
    }
    fun getValueString(ID_MOBILE: String): String? {
        return prefs.getString(ID_MOBILE, null)
    }
}