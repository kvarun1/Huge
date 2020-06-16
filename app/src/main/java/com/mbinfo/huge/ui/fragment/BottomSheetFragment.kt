package com.mbinfo.huge.ui.fragment

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mbinfo.huge.R
import com.mbinfo.huge.ui.user.MainActivity
import com.mbinfo.huge.ui.user.RegisterActivity
import com.mbinfo.huge.utility.PrefsHelper
import com.mbinfo.huge.utility.toast
import io.navendra.retrofitkotlindeferred.service.ApiFactory
import kotlinx.android.synthetic.main.otp_sheet.*
import kotlinx.android.synthetic.main.otp_sheet.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException


/**
 * Created by varun .
 */
class BottomSheetFragment : BottomSheetDialogFragment() {
    private var bottomSheetBehavior: BottomSheetBehavior<*>? = null
    var verify: Button? = null
    var mobile: String? = null
    var deviceid: String? = null
   // var otp:String?=null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        val view = View.inflate(context, R.layout.otp_sheet, null)
        verify = view.findViewById(R.id.verify)

        view.verify.setOnClickListener(){
           verifyOtp()
       }
        mobile = PrefsHelper.getValueString("mobile")
        System.out.println(mobile)
        dialog.setContentView(view)
        bottomSheetBehavior = BottomSheetBehavior.from(view.parent as View)
        return dialog
    }
    private fun verifyOtp() {
      var  otp = id_otp.text?.toString()
        val service = ApiFactory.placeholderApi
        CoroutineScope(Dispatchers.IO).launch {
            val response = service?.processVerify(otp,mobile,deviceid)
            withContext(Dispatchers.Main) {
                try {
                    if (response!!.isSuccessful) {
                        if (response.body()?.status == 200) {
                            openActivity()
                        }
                        //Do something with response e.g show to the UI.
                        activity?.toast("message ${response.body()?.message}")
                    } else {
                        activity?.toast("Error: ${response.code()}")
                    }
                } catch (e: HttpException) {
                    activity?.toast("Exception ${e.message}")
                } catch (e: Throwable) {
                    activity?.toast("Ooops: Something else went wrong")
                }
            }

        }
    }

    private fun openActivity() {
        val intent = Intent(activity, RegisterActivity::class.java)
        activity?.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_right)
        startActivity(intent)
        activity?.finish()
    }

    override fun onStart() {
        super.onStart()
        bottomSheetBehavior!!.isHideable = false
        bottomSheetBehavior!!.peekHeight = 900
        bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_EXPANDED
    }
}