package com.example.frankevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.frankevent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clickCounter = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)                      // need to call superclass
        binding = ActivityMainBinding.inflate(layoutInflater)   // create binding from layout xml
        setContentView(binding.root)                            // Show the tree from the top of ActivityMain

        binding.myButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.statusText.setText(""+ ++clickCounter)
                Log.i("FrankDebug", "Inside of BUTTON onClick!!! $clickCounter")
            }
        })

        binding.myLayout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.i("FrankDebug", "Inside of LAYOUT onClick!!!")
            }
        })

        binding.myButton.setOnLongClickListener(View.OnLongClickListener {
            Toast.makeText(this, "HEY... Long click detected", Toast.LENGTH_SHORT).show()
            true
        })
    }
}