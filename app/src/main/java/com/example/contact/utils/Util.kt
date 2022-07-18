package com.example.contact.utils

import android.app.Activity
import android.widget.Button
import android.widget.EditText
import com.example.contact.R
import com.example.contact.utils.MyClicListenner
import com.google.android.material.bottomsheet.BottomSheetDialog

fun showBottomSheetLayout(activity: Activity, listenner: MyClicListenner) {
    val bottomSheet = BottomSheetDialog(activity)

    val view = activity.layoutInflater.inflate(R.layout.layut_input_modal, null)
    val photo = view.findViewById<Button>(R.id.photo)
    val gallery = view.findViewById<Button>(R.id.gallery)
    val cancel = view.findViewById<Button>(R.id.cancel)
    val remove = view.findViewById<Button>(R.id.remove)

    photo.setOnClickListener {
        bottomSheet.dismiss()
        listenner.clic(0)
    }

    cancel.setOnClickListener {
        bottomSheet.dismiss()
    }
    gallery.setOnClickListener {
        bottomSheet.dismiss()
        listenner.clic(1)
    }
    remove.setOnClickListener {
        bottomSheet.dismiss()
        listenner.clic(2)
    }

    bottomSheet.setContentView(view)
    bottomSheet.show()
}