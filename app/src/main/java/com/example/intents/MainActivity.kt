package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val login_button = findViewById<Button>(R.id.login_button)
        val login_email = findViewById<EditText>(R.id.login_email)
        val login_password = findViewById<EditText>(R.id.login_password)
        login_button.setOnClickListener{
            if (login_email.text.toString().equals("Admin") && login_password.text.toString().equals("admin")) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this, "Email or Password is Incorrect",Toast.LENGTH_SHORT).show()
        }

    }


}