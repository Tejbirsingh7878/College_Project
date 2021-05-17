package com.example.workme.welcome

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.workme.R
import java.util.regex.Matcher
import java.util.regex.Pattern

class TakeCredentialsActivity : AppCompatActivity() {

    /*Declaring XML elements*/
    private lateinit var fullName: EditText
    private lateinit var agePicker: NumberPicker
    private lateinit var genderPicker: NumberPicker
    private lateinit var phoneNumberField: EditText

    /*Other variables*/
    private lateinit var phoneNumberPattern: Pattern
    private lateinit var matcher: Matcher

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_credentials)

        /*Initializing XML elements*/
        fullName = findViewById(R.id.nameField)
        phoneNumberField = findViewById(R.id.phoneNumberField)

        agePicker = findViewById(R.id.agePicker)
        agePicker.minValue = 14
        agePicker.maxValue = 70

        genderPicker = findViewById(R.id.genderPicker)
        genderPicker.minValue = 0
        genderPicker.maxValue = 2
        genderPicker.displayedValues = arrayOf("Male", "Female", "Other")

        /*Other variables */
        phoneNumberPattern =
            Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[6789]\\d{9}\$")
        matcher= phoneNumberPattern.matcher("+111 (202) 555-0125")
    }

    fun doSignUp(view: View) {
        if (fullName.text.toString() == "" || phoneNumberField.text.toString() == "") {
            Toast.makeText(this, "Fields can't be empty is a required field", Toast.LENGTH_SHORT).show()
        }
        phoneNumberPattern.matcher(phoneNumberField.text.toString())
        if (!matcher.matches()) {
            Toast.makeText(this, "Invalid Phone Number", Toast.LENGTH_SHORT).show()
        } else {
            val intentToTakeCredentials = Intent(this, TakeCredentialsActivity::class.java)
            startActivity(intentToTakeCredentials)
        }
    }
}