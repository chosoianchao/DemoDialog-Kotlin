package com.dcht69.demodialogk10fkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        findViewById<TextView>(R.id.tv_show).setOnClickListener {
            MyToast(this).showToast()
        }
    }

    override fun onBackPressed() {
        val dialog = CloseDialog(this)
        val callBack = object : CloseDialog.OnActionCallBack {
            override fun callBack(data: Objects?, key: String) {
                if (key == CloseDialog.KEY_CLOSE) {
                    finish()
                }
            }

        }
        dialog.callBack = callBack
        dialog.show()
//        var alert: AlertDialog = AlertDialog.Builder(this).create()
//        alert.setTitle("Thông báo")
//        alert.setMessage("Bạn có muốn đóng ứng dụng")
//        alert.setButton(
//            AlertDialog.BUTTON_POSITIVE,
//            "OK",
//            DialogInterface.OnClickListener { dialogInterface, i -> finish() })
//        alert.setButton(
//            AlertDialog.BUTTON_NEGATIVE,
//            "Cancel",
//            DialogInterface.OnClickListener { dialogInterface, i -> })
//
//        alert.setCancelable(false)
//        alert.setCanceledOnTouchOutside(false)
//        alert.show()
    }
}