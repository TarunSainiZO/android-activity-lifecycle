package com.win95.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener( ){
            DestroyActivity()
        }
    }

    //on change orientation
    //  onPause(), onStop(), and onDestroy() callbacks triggered


    //can't be override because protected in parent class
     fun DestroyActivity(){
        super.onDestroy()
        Toast.makeText(this@MainActivity,"onDestroy",Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this@MainActivity,"onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this@MainActivity,"onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this@MainActivity,"onDestroy",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this@MainActivity,"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this@MainActivity,"onRestart",Toast.LENGTH_SHORT).show()
    }
}
