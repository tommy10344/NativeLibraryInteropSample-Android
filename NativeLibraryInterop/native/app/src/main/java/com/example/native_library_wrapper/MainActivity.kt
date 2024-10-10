package com.example.native_library_wrapper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wrapper.LottieWrapperView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<LottieWrapperView>(R.id.lottie_wrapper).apply {
            setAnimation(R.raw.bullseye)
            setLoop(true)
            playAnimation()
        }
    }
}