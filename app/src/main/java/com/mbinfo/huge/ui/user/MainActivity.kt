package com.mbinfo.huge.ui.user

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.mbinfo.huge.R
import com.mbinfo.huge.data.network.APIClient
import com.mbinfo.huge.ui.fragment.BottomSheetFragment
import com.mbinfo.huge.utility.*
import io.navendra.retrofitkotlindeferred.service.ApiFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class MainActivity : AppCompatActivity(), View.OnClickListener, ConnectivityReceiver.ConnectivityReceiverListener {
    private var login: MaterialButton? = null
    private var register: MaterialButton? = null
    var permissionUtil: PermissionUtil? = null
    lateinit var mobile: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        login = findViewById(R.id.login)
        register = findViewById(R.id.register)
        login!!.setOnClickListener(this)
        register!!.setOnClickListener(this)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkAndRequestPermission()
        }
    }

    private fun checkAndRequestPermission() {
        permissionUtil = PermissionUtil()
        permissionUtil!!.checkAndRequestPermissions(this,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA,
                Manifest.permission.READ_SMS,
                Manifest.permission.RECEIVE_SMS)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.login -> {
                mobile = id_mobile.text.toString()
                if (Validation.isValidPhone(mobile)) {
                    PrefsHelper.save("mobile",mobile)
                    sendOtp()
                } else {
                    id_mobile.setError("Enter valid mobile number")
                }


            }
            R.id.register -> {
                val i = Intent(this@MainActivity, RegisterActivity::class.java)
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_right)
                startActivity(i)
                finish()
            }
        }
    }

    private fun sendOtp() {
        val deviceid: String = PrefsHelper.getDeviceID(this@MainActivity)
        val service = ApiFactory.placeholderApi
        CoroutineScope(Dispatchers.IO).launch {
            val response = service?.processOtp(mobile, deviceid)
            withContext(Dispatchers.Main) {
                try {
                    if (response!!.isSuccessful) {
                        if (response.body()?.status == 200) {
                            val fragment = BottomSheetFragment()
                            fragment.show(supportFragmentManager, TAG)
                            var msg: String = response.body()?.message!!

                        }
                        //Do something with response e.g show to the UI.
                        toast("message ${response.body()?.message}")
                    } else {
                        toast("Error: ${response.code()}")
                    }
                } catch (e: HttpException) {
                    toast("Exception ${e.message}")
                } catch (e: Throwable) {
                    toast("Ooops: Something else went wrong")
                }
            }

        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        permissionUtil!!.onRequestPermissionsResult(this, requestCode, permissions, grantResults)
    }

    companion object {
        const val TAG = "bottom_sheet"
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {

    }


}







