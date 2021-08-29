package com.example.edunavigation

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.edunavigation.databinding.ActivityThirdPageSecondLessonBinding

class third_Page_Second_lesson : AppCompatActivity() {

    private lateinit var binding: ActivityThirdPageSecondLessonBinding

    private val myName: MyName = MyName("Roma Invicta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_third_page_second_lesson)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_third_page_second_lesson)

        binding.myName = myName

        //findViewById<Button>(R.id.done_button).setOnClickListener {
        //    addNickname(it)
        //}

        binding.doneButton.setOnClickListener {
            addNickname(it)
        }

    }


    private fun addNickname(view: View){
        binding.apply {
            binding.nicknameText.text = binding.nicknameEdit.text
            invalidateAll()
            binding.nicknameEdit.visibility = View.GONE
            binding.doneButton.visibility = View.GONE
            binding.nicknameText.visibility = View.VISIBLE
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}