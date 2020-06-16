package com.mbinfo.huge.utility

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.Build
import android.provider.Settings
import java.util.*

/**
 * Created by Varun on 09-01-2018.
 */
class Utility(private val mContext: Context) {
    fun IsLogin(): Boolean {
        return mPref.getBoolean(
            LOGIN,
            false
        )
    }

    fun setLogin() {
        val editor =
            mPref.edit()
        editor.putBoolean(LOGIN, true)
        editor.commit()
    }

    companion object {
        private const val USER_NAME = "user_name"
        private const val USER_BIO = "bio"
        private const val USER_FULL_NAME = "fullname"
        private const val LOGIN = "login"
        private const val USER_EMAIL = "user_email"
        const val USER_MOBILE_NUMBER = "user_mobile_number"
        private const val USER_ADDRESS = "user_address"
        private const val USER_UID = "user_uid"
        private const val IMAGE_URL = "image_url"
        private const val PID = "pid"
        private const val CATID = "catid"
        private const val STATEID = "stateid"
        private const val CITYID = "cityid"
        private const val TESID = "tesid"
        const val PREFS_NAME = "medico_app_pref"
        private lateinit var mPref: SharedPreferences
        val randomColorCode: Int
            get() {
                val rnd = Random()
                return Color.argb(
                    255,
                    rnd.nextInt(256),
                    rnd.nextInt(256),
                    rnd.nextInt(256)
                )
            }

        fun haveNetworkConnection(context: Context): Boolean {
            val cm = context
                .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = cm.activeNetworkInfo
            return if (netInfo == null) false else {
                if (netInfo.isConnected) true else false
            }
        }

        var userName: String?
            get() = mPref.getString(
                USER_NAME,
                null
            )
            set(userName) {
                val editor =
                    mPref.edit()
                editor.putString(USER_NAME, userName)
                editor.commit()
            }

        var fullName: String?
            get() = mPref.getString(
                USER_FULL_NAME,
                null
            )
            set(fullName) {
                val editor =
                    mPref.edit()
                editor.putString(
                    USER_FULL_NAME,
                    fullName
                )
                editor.commit()
            }

        var bio: String?
            get() = mPref.getString(
                USER_BIO,
                null
            )
            set(userName) {
                val editor =
                    mPref.edit()
                editor.putString(USER_BIO, userName)
                editor.commit()
            }

        var userEmail: String?
            get() = mPref.getString(
                USER_EMAIL,
                null
            )
            set(email) {
                val editor =
                    mPref.edit()
                editor.putString(USER_EMAIL, email)
                editor.commit()
            }

        var userMobileNumber: String?
            get() = mPref.getString(
                USER_MOBILE_NUMBER,
                null
            )
            set(mobileNumber) {
                val editor =
                    mPref.edit()
                editor.putString(
                    USER_MOBILE_NUMBER,
                    mobileNumber
                )
                editor.commit()
            }

        var userAddress: String?
            get() = mPref.getString(
                USER_ADDRESS,
                null
            )
            set(address) {
                val editor =
                    mPref.edit()
                editor.putString(USER_ADDRESS, address)
                editor.commit()
            }

        var userUid: String?
            get() = mPref.getString(
                USER_UID,
                null
            )
            set(userName) {
                val editor =
                    mPref.edit()
                editor.putString(USER_UID, userName)
                editor.commit()
            }

        var imageUrl: String?
            get() = mPref.getString(
                IMAGE_URL,
                null
            )
            set(imageUrl) {
                val editor =
                    mPref.edit()
                editor.putString(IMAGE_URL, imageUrl)
                editor.commit()
            }

        fun getOs(context: Context?): String {
            val release = Build.VERSION.RELEASE
            val sdkVersion = Build.VERSION.SDK_INT
            return "Android SDK: $sdkVersion ($release)"
        }

        fun getDeviceID(context: Context): String {
            return Settings.Secure.getString(
                context.contentResolver,
                Settings.Secure.ANDROID_ID
            )
        }

        fun getDeviceModel(context: Context?): String {
            val manufacturer = Build.MANUFACTURER
            return Build.MODEL
        }

        val deviceName: String
            get() = Build.MANUFACTURER

        fun getPID(): String? {
            return mPref.getString(
                PID,
                null
            )
        }

        fun setPid(pid: String?) {
            val editor =
                mPref.edit()
            editor.putString(PID, pid)
            editor.commit()
        }



        var catid: Int
            get() = mPref.getInt(
                CATID,
                0
            )
            set(catid) {
                val editor =
                    mPref.edit()
                editor.putInt(CATID, catid)
                editor.commit()
            }

    }

    init {
        mPref = mContext.applicationContext
            .getSharedPreferences(
                PREFS_NAME,
                Context.MODE_PRIVATE
            )
    }
}