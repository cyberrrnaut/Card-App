package com.example.giftkart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btn1(view: View){

        val name = editTextTextPersonName.editableText.toString()
        val intent = Intent(this,Card::class.java)
        intent.putExtra(Card.NAME_EXTRA, name)
        startActivity(intent)

    }
}