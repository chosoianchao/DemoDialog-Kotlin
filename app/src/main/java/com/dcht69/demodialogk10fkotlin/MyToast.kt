package com.dcht69.demodialogk10fkotlin

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MyToast(var mContext: Context) {
    private var toast: Toast? = null

    companion object {
        val ID_FACE = arrayOf(
            R.drawable.ic_angry,
            R.drawable.ic_cry,
            R.drawable.ic_hungry,
            R.drawable.ic_sleep,
            R.drawable.ic_suprise,
            R.drawable.ic_smile
        )
        val TEXT_FACE = arrayOf("Angry", "Cry", "Hungry", "Sleep", "Surprise", "Smile")

    }

    fun showToast() {
        toast = Toast(mContext)
        val view = LayoutInflater.from(mContext).inflate(R.layout.item_face, null)
        val ivFace = view.findViewById<ImageView>(R.id.iv_face)
        val tvFace = view.findViewById<TextView>(R.id.tv_face)
        val rd = Random()
        val index = rd.nextInt(ID_FACE.size)
        ivFace.setImageResource(ID_FACE[index])
        tvFace.text = (TEXT_FACE[index])
        toast?.view = view
        toast?.duration = Toast.LENGTH_LONG
        toast?.show()

    }

}