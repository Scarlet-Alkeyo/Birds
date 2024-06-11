

package com.example.birds_assignments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


import com.example.birds_assignments.databinding.ActivityThirdBirdBinding

class ThirdBirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener {
            finish()
        }
        binding.btnNext3.setOnClickListener {
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso.get()
            .load("https://images.unsplash.com/photo-1555169062-013468b47731?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView)
    }
}


