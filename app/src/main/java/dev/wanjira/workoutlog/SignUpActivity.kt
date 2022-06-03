package dev.wanjira.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var etFirstName: EditText
    lateinit var tilFirstName: TextInputLayout
    lateinit var etLastName:TextInputEditText
    lateinit var tilLastName:TextInputLayout
    lateinit var etEmail:TextInputEditText
    lateinit var tilEmail:TextInputLayout
    lateinit var etPassword:TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etConfirmPassword:TextInputEditText
    lateinit var tilConfirmPassword:TextInputLayout
    lateinit var btnSignUp: Button
    lateinit var tvLogIn:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        etFirstName=findViewById(R.id.etFirstName)
        tilFirstName=findViewById(R.id.tilFirstName)
        etLastName=findViewById(R.id.etLastName)
        tilLastName=findViewById(R.id.tilLastName)
        etEmail=findViewById(R.id.etEmail)
        tilEmail=findViewById(R.id.tilEmail)
        etPassword=findViewById(R.id.etPassword)
        tilPassword=findViewById(R.id.tilPassword)
        etConfirmPassword=findViewById(R.id.etConfirmPassword)
        tilConfirmPassword=findViewById(R.id.tilConfirmPassword)
        btnSignUp= findViewById(R.id.btnSignUp)
        tvLogIn=findViewById(R.id.tvLogIn)
        tvLogIn.setOnClickListener {
            val intent= Intent (this,LoginActivity::class.java)
            startActivity(intent)
        }
        btnSignUp.setOnClickListener {
            validate()
        }

    }
    fun validate(){
        val firstname= etFirstName.text.toString()
        val lastname=etLastName.text.toString()
        val email=etEmail.text.toString()
        val password=etPassword.text.toString()
        val confirm=etConfirmPassword.text.toString()
        if (firstname.isBlank()){
            tilFirstName.error="invalid"
        }
        if (lastname.isBlank()){
            tilLastName.error="invalid"
        }
        if (email.isBlank()){
            tilEmail.error="invalid"
        }
        if (password.isBlank()){
            tilPassword.error="invalid"
        }
        if (confirm.isBlank()){
            tilConfirmPassword.error="invalid"
        }

    }
}
