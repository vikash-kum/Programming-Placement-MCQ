package com.indrapush.programmingmcq.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.ActivityJavaScriptBinding

class JavaScriptActivity : AppCompatActivity() {

    private var binding: ActivityJavaScriptBinding? = null
    private lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJavaScriptBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Google Ada
        MobileAds.initialize(this ) {}
        mAdView = binding?.adViewJavascript!!
        val adrequest = AdRequest.Builder().build()
        mAdView.loadAd(adrequest)

        binding?.tvBasic?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "basic")
            startActivity(intent)
        }

        binding?.tvDataType?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "datatype")
            startActivity(intent)
        }

        binding?.tvDataStructure?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "ds")
            startActivity(intent)
        }

        binding?.tvJavascript?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "js")
            startActivity(intent)
        }

        binding?.tvWeb?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "server")
            startActivity(intent)
        }

        binding?.tvScripting?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "scripting")
            startActivity(intent)
        }

        binding?.tvError?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "error")
            startActivity(intent)
        }

        binding?.tvException?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "exception")
            startActivity(intent)
        }

        binding?.tvFunction?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "javascript")
            intent.putExtra("topic" , "function")
            startActivity(intent)
        }
    }


}