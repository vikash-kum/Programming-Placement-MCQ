package com.indrapush.programmingmcq.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.ActivityCpp2Binding

class CppActivity : AppCompatActivity() {

    private var binding : ActivityCpp2Binding? = null
    private lateinit var mAdView : AdView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCpp2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Google Ada
        MobileAds.initialize(this ) {}
        mAdView = binding?.adViewCpp!!
        val adrequest = AdRequest.Builder().build()
        mAdView.loadAd(adrequest)


        binding?.tvBasic?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "basic")
            startActivity(intent)
        }

        binding?.tvDataType?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "datatype")
            startActivity(intent)
        }

        binding?.tvCAndCpp?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "c")
            startActivity(intent)
        }

        binding?.tvAboutLanguage?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "cpp")
            startActivity(intent)
        }

        binding?.tvDataStructure?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "ds")
            startActivity(intent)
        }

        binding?.tvOops?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "opps")
            startActivity(intent)
        }

        binding?.tvString?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "string")
            startActivity(intent)
        }

        binding?.tvPointer?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "pointer")
            startActivity(intent)
        }

        binding?.tvFunction?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "function")
            startActivity(intent)
        }

        binding?.tvException?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cpp")
            intent.putExtra("topic" , "exception")
            startActivity(intent)
        }
    }
}