package com.example.motionlayout

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.TransitionManager

class ObjectAnimatorActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_object_animator)
  }

  fun onClick(v: View) {
    TransitionManager.beginDelayedTransition(v.parent as ViewGroup)

    with(v.layoutParams as LinearLayout.LayoutParams) {
      height *= 2
      width *= 2
    }

    v.requestLayout()
  }
}
