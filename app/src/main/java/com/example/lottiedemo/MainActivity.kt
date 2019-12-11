package com.example.lottiedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import android.animation.Animator
import android.content.Intent
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.anim)

        lottieAnimationView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                lottieAnimationView.playAnimation()
                lottieAnimationView.setVisibility(View.VISIBLE)
            }
        })
        lottieAnimationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {

            }

            override fun onAnimationEnd(animation: Animator) {
//                startActivity(Intent(this@MainActivity, MainActivity::class.java))
            }

            override fun onAnimationCancel(animation: Animator) {
                //                lottieAnimationView.cancelAnimation();
                //                lottieAnimationView.clearColorFilters();
            }

            override fun onAnimationRepeat(animation: Animator) {

            }
        })
    }
}
