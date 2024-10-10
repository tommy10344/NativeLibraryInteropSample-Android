package com.example.wrapper

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.airbnb.lottie.LottieAnimationView

class LottieWrapperView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private val lottieView: LottieAnimationView

    init {
        View.inflate(getContext(), R.layout.lottie_wrapper_view, this)
        lottieView = findViewById(R.id.lottie)
    }

    public fun setAnimation(rawRes: Int) {
        lottieView.setAnimation(rawRes)
    }
}