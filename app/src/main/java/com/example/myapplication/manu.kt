package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplication.databinding.ActivityManuBinding
import com.google.android.material.textfield.TextInputEditText


class Manu : AppCompatActivity() {

    lateinit var  textView: TextView
    lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manu);

        textView = findViewById(R.id.textView80)
        textView2= findViewById(R.id.textView)

        var intent = intent

        var text = intent.getStringExtra("key")
        var text2 = intent.getStringExtra("key2")

        textView2.text = text2
        textView.text = text


    }



}