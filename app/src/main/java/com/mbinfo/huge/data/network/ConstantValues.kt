package com.mbinfo.huge.data.network

/**
 * ConstantValues contains some constant variables, used all over the App.
 */
object ConstantValues {
    //*********** API Base URL ********//
    //    public static final String ECOMMERCE_URL = "http://ecommerce.sale24mart.com/";
    const val HUGE_URL = "https://www.hugeamzon.com/apis/"
    //public static final String ECOMMERCE_URL = "http://sale24mart.com/ecomv1/";
    var GOOGLE_MAP_URL = "https://maps.googleapis.com/"
    var FIREBASE_URL = "https://fcm.googleapis.com/"
    var PAYTM_URL = "http://paytm.sale24mart.com/"

    // "false" if compiling the project for Demo, "true" otherwise
    const val IS_CLIENT_ACTIVE = true
    var APP_HEADER: String? = null
    var DEFAULT_HOME_STYLE: String? = null
    var DEFAULT_CATEGORY_STYLE: String? = null
    var LANGUAGE_ID = 0
    var LANGUAGE_CODE: String? = null
    var CURRENCY_SYMBOL: String? = null
    var NEW_PRODUCT_DURATION: Long = 0
    var IS_GOOGLE_LOGIN_ENABLED = false
    var IS_FACEBOOK_LOGIN_ENABLED = false
    var IS_ADD_TO_CART_BUTTON_ENABLED = false
    var IS_ADMOBE_ENABLED = false
    var ADMOBE_ID: String? = null
    var AD_UNIT_ID_BANNER: String? = null
    var AD_UNIT_ID_INTERSTITIAL: String? = null
    var ABOUT_US: String? = null
    var TERMS_SERVICES: String? = null
    var PRIVACY_POLICY: String? = null
    var REFUND_POLICY: String? = null
    var IS_USER_LOGGED_IN = false
    var IS_PUSH_NOTIFICATIONS_ENABLED = false
    var IS_LOCAL_NOTIFICATIONS_ENABLED = false
    const val URL_STORAGE_REFERENCE = "gs://bouto-251506.appspot.com"
    const val FOLDER_STORAGE_IMG = "images"
}