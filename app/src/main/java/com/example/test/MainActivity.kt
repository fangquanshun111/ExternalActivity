package com.example.test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener(){
            //show google map instantly------>
            //val intent: Intent = Intent(this, AboutActivity::class.java)
            //startActivity(intent)
            //val geo = Uri.parse("geo: 3.140853 , 101.693207")
            //val mapIntent = Intent(Intent.ACTION_VIEW,geo)

            //startActivity(mapIntent)


            //show different access method ---->>>>>
            //val intent = Intent(Intent.ACTION_SEND)
            //intent.setType("Text/plain")
            //intent.putExtra(Intent.EXTRA_TEXT,"Hello")

            //make phone call
            val value = Uri.parse("tel: 0123456789")

            val intent = Intent(Intent.ACTION_DIAL,value)

            try{
                startActivity(intent)
            }catch(e: ActivityNotFoundException){
                Toast.makeText(this,"No match application",Toast.LENGTH_LONG).show()
            }
        }
    }
}