package com.asym.kasir

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.widget.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_content)

        // get reference to all views
        var tvData1 = findViewById(R.id.tv_data1) as TextView
        var lvdata = findViewById(R.id.lv_result) as ListView

        if( intent.extras != null ){
            val bundle = intent.extras
            tvData1.setText(bundle.getString("login 1"))
        }else{
            tvData1.setText(intent.getStringExtra("login 1"))
        }
    }
}
