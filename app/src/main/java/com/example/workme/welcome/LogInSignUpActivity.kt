package com.example.workme.welcome

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.workme.R

class MainActivity : AppCompatActivity() {

    //XML ELEMENTS DECLARATION
/*
    private lateinit var loginButton: Button
    private lateinit var signUpButton: Button
*/

    //OTHER VARIABLES DECLARATION
    private lateinit var toastMessage: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_signup)

        //XML ELEMENTS INITIALISATION
/*
        loginButton = findViewById(R.id.loginButton)
        signUpButton = findViewById(R.id.signUpButton)
*/

        //OTHER VARIABLES INITIALISATION
        toastMessage = Toast(this)
    }

    //WILL BE TRIGGERED WHEN LOG IN BUTTON WILL BE PRESSED IN THE STARTUP WINDOW
    fun doLogin(view: View) {
        if (toastMessage != null) {
            toastMessage.cancel();
        }
        toastMessage = Toast.makeText(this, "Fetching your account back", Toast.LENGTH_SHORT)
        toastMessage.show()

        val intent = Intent(this, LogInActivity::class.java)
        startActivity(intent)

    }

    //WILL BE TRIGGERED WHEN SIGN UP BUTTON WILL BE PRESSED IN THE STARTUP WINDOW
    fun doSignUp(view: View) {
        if (toastMessage != null) {
            toastMessage.cancel();
        }
        toastMessage = Toast.makeText(this, "Creating a new setup for you", Toast.LENGTH_SHORT)
        toastMessage.show()

        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
}