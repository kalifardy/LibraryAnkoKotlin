package com.keyalive.kotlin.ankokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import android.telephony.SmsManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    buttonclick.setOnClickListener{
        intent.putExtra("hei","iya kamu")
        startActivity(intentFor<MainActivity2>("hei" to "iya kamu"))
    }

     btn_sms.setOnClickListener{
//         makeCall("081225071070")
         //menggunakan anko
         sendSMS("0843483")
     }
        btn_browse.setOnClickListener{
            browse("https://jalantikus.com/")
        }
        btn_share.setOnClickListener{
                     share("hei", "kalifardy56@gmail.com")
        }
        btn_email.setOnClickListener{
                     email("kalifardy56@gmail.com", "information", "hei")
        }
//        val smsManager = SmsManager.getDefault()
//        smsManager.sendTextMessage("phoneNo", null, "sms message", null, null)
//

//

    }


    override fun onBackPressed() {
        //Alert Dialog
        alert ("message"){
            noButton {
                toast("hei kenapa?")
            }
            yesButton {
                toast("hei hello")
                finish()
            }
        }.show()
    }
}
