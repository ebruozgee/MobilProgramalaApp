package com.example.mobilprogramlamaproje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        btn_start.setOnClickListener {
            if (et_name.editText?.text.toString().isEmpty()) {
                Toast.makeText(this, "Lütfen isminizi giriniz", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity,Sorular::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.editText?.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}