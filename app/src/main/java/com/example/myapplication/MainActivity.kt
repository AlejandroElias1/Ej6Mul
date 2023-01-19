package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        actboton(binding)
        borrartext(binding)
        imageTexto(binding)
    }

}

fun actboton(binding: ActivityMainBinding){
    binding.button.setOnClickListener{
        if (binding.button.text=="Comenzar"){
            binding.editTextTextPersonName.visibility = View.VISIBLE
            binding.button.text = "Finalizar"
        } else {
            binding.editTextTextPersonName.visibility = View.INVISIBLE
            binding.button.text = "Comenzar"
        }
    }
}
fun borrartext(binding: ActivityMainBinding){
    binding.editTextTextPersonName.setOnFocusChangeListener { v, hasFocus ->
        if (hasFocus) {
            binding.editTextTextPersonName.hint = ""
        } else {
            if (binding.editTextTextPersonName.text.isEmpty()) {
                binding.editTextTextPersonName.setText("Introduce tu nombre")
            }
        }
    }
}

fun imageTexto(binding: ActivityMainBinding){
    binding.editTextTextPersonName.addTextChangedListener {
        if (binding.editTextTextPersonName.text.toString()=="Wayne"){
        binding.imageView.visibility = View.VISIBLE
    } else if (binding.editTextTextPersonName.text.toString()=="Joker"){
        binding.root.setBackgroundColor(Color.rgb(128,0,128))
        binding.editTextTextPersonName.setTextColor(Color.rgb(0,0,0))
        binding.button.setTextColor(Color.rgb(0,0,0))
    }
    } }

