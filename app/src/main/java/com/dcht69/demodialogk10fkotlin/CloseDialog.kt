package com.dcht69.demodialogk10fkotlin

import android.app.Dialog
import android.content.Context
import android.widget.Button
import java.util.*

class CloseDialog(var mContext: Context) : Dialog(mContext) {
    var callBack: OnActionCallBack? = null
    companion object{
        const val KEY_CLOSE: String ="KEY_CLOSE"
    }
    init {
        setContentView(R.layout.view_close_app)
        setCancelable(false)
        setCanceledOnTouchOutside(false)
        initView()
    }

    private fun initView() {
        findViewById<Button>(R.id.bt_close).setOnClickListener {
            dismiss()
            //(mContext as Activity).finish()
            callBack?.callBack(null, KEY_CLOSE)
        }
        findViewById<Button>(R.id.bt_cancel).setOnClickListener {
            dismiss()
        }


    }


    interface OnActionCallBack {
        fun callBack(data: Objects?, key: String)

    }
}