package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {

    lateinit var editText: TextInputEditText
    lateinit var button: Button
    lateinit var editText2: TextInputEditText
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var button10: Button
    lateinit var button11: Button
    lateinit var button12: Button
    lateinit var button13: Button
    lateinit var button14: Button
    lateinit var button15: Button
    lateinit var button16: Button
    lateinit var button17: Button
    lateinit var button18: Button
    lateinit var button19: Button
    lateinit var button20: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.textInputEditText)
        button = findViewById(R.id.button1)
        button2 = findViewById(R.id.Cumpleaños2)
        button3 = findViewById(R.id.Cumpleaños3)
        button4 = findViewById(R.id.Cumpleaños4)
        button5 = findViewById(R.id.Finaño1)
        button6 = findViewById(R.id.Finaño2)
        button7 = findViewById(R.id.Finaño3)
        button8 = findViewById(R.id.Finaño4)
        button9 = findViewById(R.id.Navidad1)
        button10 = findViewById(R.id.Navidad2)
        button11 = findViewById(R.id.Navidad3)
        button12 = findViewById(R.id.navidad4)
        button13 = findViewById(R.id.vacaciones1)
        button14 = findViewById(R.id.vacaciones2)
        button15 = findViewById(R.id.vacaciones3)
        button16 = findViewById(R.id.vacaciones4)
        button17 = findViewById(R.id.pascua1)
        button18 = findViewById(R.id.pascua2)
        button19 = findViewById(R.id.pascua3)
        button20 = findViewById(R.id.pascua4)
        editText2= findViewById(R.id.textInputEditText2)

        button.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }

        button2.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Cumple2::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button3.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button4.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button5.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button6.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button7.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button8.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button9.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button10.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button11.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button12.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button13.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button14.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button15.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button16.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button17.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button18.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button19.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
        button20.setOnClickListener() {
            var text = editText.text.toString()
            var text2 = editText2.text.toString()
            var intent: Intent = Intent(this, Manu::class.java)
            intent.putExtra("key", text)
            intent.putExtra("key2", text2)
            startActivity(intent)
        }
    }
}