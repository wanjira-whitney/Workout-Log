package dev.wanjira.workoutlog

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.wanjira.workoutlog.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvSignUp.setOnClickListener {
            val intent=Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            validate()
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }
    }
    fun validate(){
        val Email=binding.etEmail.text.toString()
        val Password=binding.etPassword.text.toString()

        binding.etEmail.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun afterTextChanged(s: Editable) {
            }
        })
        if (Email.isBlank()){
            binding.tilEmail.error="Invalid"
        }
        if (Password.isBlank()){
            binding.tilPassword.error="Invalid"
        }
    }
}
