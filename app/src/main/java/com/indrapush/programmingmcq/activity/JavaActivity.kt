package com.indrapush.programmingmcq.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.ActivityJavaBinding

class JavaActivity : AppCompatActivity() {

    var binding : ActivityJavaBinding? = null
    private lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJavaBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        //Google Ada
        MobileAds.initialize(this ) {}
        mAdView = binding?.adViewJava!!
        val adrequest = AdRequest.Builder().build()
        mAdView.loadAd(adrequest)

        binding?.tvBasic?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "java")
            startActivity(intent)
        }

        binding?.tvDataType?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "datatype")
            startActivity(intent)
        }

        binding?.tvDataStructure?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "ds")
            startActivity(intent)
        }

        binding?.tvOops?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "oops")
            startActivity(intent)
        }

        binding?.tvString?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "string")
            startActivity(intent)
        }

        binding?.tvException?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "exception")
            startActivity(intent)
        }

        binding?.tvServlet?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "servlet")
            startActivity(intent)
        }

        binding?.tvThread?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "java")
            intent.putExtra("topic" , "thread")
            startActivity(intent)
        }
    }
}