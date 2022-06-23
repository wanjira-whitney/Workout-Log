package dev.wanjira.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.wanjira.workoutlog.databinding.ActivityHomepageBinding
import dev.wanjira.workoutlog.databinding.ActivityLoginBinding
import dev.wanjira.workoutlog.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_sign_up)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogIn.setOnClickListener {
            val intent= Intent (this,LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            validate()
        }

    }
    fun validate(){
        val firstname= binding.etFirstName.text.toString()
        val lastname= binding.etLastName.text.toString()
        val email=binding.etEmail.text.toString()
        val password=binding.etPassword.text.toString()
        val confirm=binding.etConfirmPassword.text.toString()

        if (firstname.isBlank()){
           binding.tilFirstName.error="invalid"
        }
        if (lastname.isBlank()){
            binding.tilLastName.error="invalid"
        }
        if (email.isBlank()){
            binding.tilEmail.error="invalid"
        }
        if (password.isBlank()){
            binding.tilPassword.error="invalid"
        }
        if (confirm.isBlank()){
            binding.tilConfirmPassword.error="invalid"
        }
        if (password != confirm){
            binding.tilConfirmPassword.error="Not matched"
        }
    }
}
