package com.example.workme.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.workme.R

class LogInActivity : AppCompatActivity() {

    /*Declaring XML elements*/
    private lateinit var userNameField : EditText
    private lateinit var passwordField : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        /*Initializing XML elements*/
        userNameField = findViewById(R.id.userNameField)
        passwordField = findViewById(R.id.passwordField)


    }

    fun doLogIn(view : View){
        if (userNameField.text.toString() == "" || passwordField.text.toString() ==""){
            Toast.makeText(this, "Username or Password can't be empty", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Good to go", Toast.LENGTH_SHORT).show()
        }
    }
}