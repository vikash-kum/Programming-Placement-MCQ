package com.indrapush.programmingmcq.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.amplifyframework.core.model.query.Where
import com.amplifyframework.datastore.generated.model.Questions
import com.amplifyframework.kotlin.core.Amplify
import com.indrapush.programmingmcq.R
import com.indrapush.programmingmcq.databinding.ActivityQuestionBinding
import com.indrapush.programmingmcq.helper.QuestionAdapter
import kotlinx.coroutines.launch

class QuestionActivity : AppCompatActivity() {

    private var binding: ActivityQuestionBinding? = null
    private val correctOption = R.drawable.question_option_correct
    private val wrongOption = R.drawable.question_option_wrong


    private lateinit var questionList : ArrayList<Questions>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        binding!!.recyclerView.apply {
            val layoutManager = LinearLayoutManager(this@QuestionActivity , LinearLayoutManager.HORIZONTAL, false)
            binding!!.recyclerView.layoutManager = layoutManager
            setHasFixedSize(true)
            itemAnimator = DefaultItemAnimator()
        }

        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding!!.recyclerView)

        questionList = arrayListOf()

        val subject = intent.getStringExtra("subject")
        val topic = intent.getStringExtra("topic")

        if (subject != null && topic != null) {
                getQuestionData(subject , topic)
            }
    }


    private fun getQuestionData(subject : String, topic : String) {
        binding!!.recyclerView.visibility = View.GONE

        lifecycleScope.launch {
            Amplify.DataStore
                .query(Questions::class, Where.matches(Questions.SUBJECT.eq(subject)
                    .and(Questions.TOPIC.eq(topic))))
                .collect { questionList.add(it)
                }
            val adapter = QuestionAdapter(questionList , correctOption , wrongOption, this@QuestionActivity)

            if(questionList.isNotEmpty()) {
                binding!!.tvFirst.visibility = View.GONE
                binding!!.tvSecond.visibility = View.GONE
            }
            binding!!.recyclerView.adapter = adapter
            binding!!.recyclerView.visibility = View.VISIBLE
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}