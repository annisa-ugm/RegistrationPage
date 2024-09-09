package com.example.registrationpage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi kolom EditText
        val emailEditText = findViewById<TextInputEditText>(R.id.edit_text_email)
        val fullnameEditText = findViewById<TextInputEditText>(R.id.edit_text_fullname)
        val usernameEditText = findViewById<TextInputEditText>(R.id.edit_text_username)
        val passwordEditText = findViewById<TextInputEditText>(R.id.edit_text_password)

        // Inisialisasi tombol sign up
        val signUpButton = findViewById<Button>(R.id.btn_toast)

        // Mengatur listener saat tombol di-klik
        signUpButton.setOnClickListener {
            // Mengambil nilai input dari kolom EditText
            val email = emailEditText.text.toString()
            val fullname = fullnameEditText.text.toString()
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Menampilkan Toast yang berisi data input
            val toastMessage = "Email: $email\nFull Name: $fullname\nUsername: $username\nPassword: $password"
            Toast.makeText(this@MainActivity, toastMessage, Toast.LENGTH_LONG).show()
        }
    }
}