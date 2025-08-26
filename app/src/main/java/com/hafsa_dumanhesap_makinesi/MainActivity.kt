package com.hafsa_dumanhesap_makinesi

import android.annotation.SuppressLint
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ScrollingView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hafsa_dumanhesap_makinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number1 : Double? =null
    var number2 : Double? =null
    var result: Double? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    @SuppressLint("SetTextI18n")
    fun MySum (view : View){
        number1 = binding.number1text.text.toString().toDoubleOrNull()
         number2 = binding.number2text.text.toString().toDoubleOrNull()
        if(number1 !=null && number2 !=null){
            result = number1!! + number2!!
            binding.resultText.text = "result :${result}"
        }else
            binding.resultText.text = "enter number !"

    }
    fun MySub (view : View){
        number1 = binding.number1text.text.toString().toDoubleOrNull()
        number2 = binding.number2text.text.toString().toDoubleOrNull()
        if(number1 !=null && number2 !=null){
            result = number1!! - number2!!
            binding.resultText.text = "result :${result}"
        }else
            binding.resultText.text = "enter number !"

    }
    fun MyMult (view : View){
        number1 = binding.number1text.text.toString().toDoubleOrNull()
        number2 = binding.number2text.text.toString().toDoubleOrNull()
        if(number1 !=null && number2 !=null){
            result = number1!! * number2!!
            binding.resultText.text = "result :${result}"
        }else
            binding.resultText.text = "enter number !"
    }
    fun MyDiv (view : View){
        number1 = binding.number1text.text.toString().toDoubleOrNull()
        number2 = binding.number2text.text.toString().toDoubleOrNull()
        if(number1 !=null && number2 !=null){
            result = number1!! / number2!!
            binding.resultText.text = "result :${result}"
        }else
            binding.resultText.text = "enter number !"
    }
}