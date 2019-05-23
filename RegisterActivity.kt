package com.asym.kasir

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.widget.*


class RegisterActivity : AppCompatActivity() {
//    var sqliteHelper: SqliteHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_content)

        // get reference to all views
        var user_name = findViewById(R.id.et_user_name) as EditText
        var password = findViewById(R.id.et_password) as EditText
        var repassword = findViewById(R.id.et_repassword) as EditText
        var btn_login = findViewById(R.id.btn_login) as Button
        var btn_register = findViewById(R.id.btn_register) as Button

        btn_login.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn_register.setOnClickListener{
            val user = user_name.text.trim().toString()
            val pass = password.text.trim().toString()
            val repass = repassword.text.trim().toString()
//            val token = "kunam"

            if (user.isNotEmpty()|| pass.isNotEmpty() || repass.isNotEmpty()){
                if(pass.equals(repass)){
                    Toast.makeText(this, "password tidak sama", Toast.LENGTH_LONG).show()
                }else{
//                    if(!sqliteHelper!!.isUsernameExists(user)){
//                        sqliteHelper!!.addUser(User(user,token,pass))
//                    }
                    Toast.makeText(this, "Register berhasil", Toast.LENGTH_LONG).show()
                }
                Toast.makeText(this, "username sudah ada", Toast.LENGTH_LONG).show()
            }
            Toast.makeText(this, "username or password kosong", Toast.LENGTH_LONG).show()
        }

    }
}
