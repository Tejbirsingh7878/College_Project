package com.example.workme.welcome

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.workme.R

class SignUpActivity : AppCompatActivity() {

    /*Declaring XML elements*/
    private lateinit var userNameField: EditText
    private lateinit var passwordField: EditText
    private lateinit var rePasswordField: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        /*Initializing XML elements*/
        userNameField = findViewById(R.id.userNameField)
        passwordField = findViewById(R.id.passwordField)
        rePasswordField = findViewById(R.id.rePasswordField)
    }

    fun takeCredentials(view: View) {
        if (userNameField.text.toString() == "" || passwordField.text.toString() == "") {
            Toast.makeText(this, "Username or Password can't be empty", Toast.LENGTH_SHORT).show()
        }
//            We dont need to check password as it is a signUp page to a Login
//        else if (passwordField.text.toString() != rePasswordField.text.toString()) {
//            Toast.makeText(this, "Passwords don't match", Toast.LENGTH_SHORT).show()
//        }
        else {
            val intentToTakeCredentials = Intent(this, TakeCredentialsActivity::class.java)
            startActivity(intentToTakeCredentials)
        }
    }


}