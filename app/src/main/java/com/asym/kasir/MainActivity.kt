package com.asym.kasir

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.widget.*
//import User.java


class MainActivity : AppCompatActivity() {

//    var sqliteHelper: SqliteHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button
        var register = findViewById(R.id.tv_register) as TextView

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text.trim().toString();
            val password = et_password.text.trim().toString();
//            val currentUser = sqliteHelper.Authenticate(User(user_name, null, password))

//            if(currentUser != null) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("login 1", user_name)
                intent.putExtra("login 2", password)
                startActivity(intent)

                Toast.makeText(this@MainActivity, "berhasil login", Toast.LENGTH_LONG).show()
//            }else{
//                Toast.makeText(this@MainActivity, "tidak berhasil", Toast.LENGTH_LONG).show()
//            }
        }
        register.setOnClickListener{
            val i = Intent(this, RegisterActivity::class.java)
            startActivities(arrayOf(i))
        }
    }
}

