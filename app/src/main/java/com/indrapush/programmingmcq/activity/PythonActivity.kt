package com.indrapush.programmingmcq.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.ActivityPythonBinding

class PythonActivity : AppCompatActivity() {

    private var binding : ActivityPythonBinding? = null
    private lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPythonBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        MobileAds.initialize(this ) {}
        mAdView = binding?.adViewPython!!
        val adrequest = AdRequest.Builder().build()
        mAdView.loadAd(adrequest)


        binding?.tvBasic?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "basic")
            startActivity(intent)
        }

        binding?.tvDataType?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "datatype")
            startActivity(intent)
        }

        binding?.tvDataStructure?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "ds")
            startActivity(intent)
        }

        binding?.tvList?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "list")
            startActivity(intent)
        }

        binding?.tvPython?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "python")
            startActivity(intent)
        }

        binding?.tvFuncation?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "function")
            startActivity(intent)
        }

        binding?.tvPackage?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "package")
            startActivity(intent)
        }

        binding?.tvString?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "python")
            intent.putExtra("topic" , "string")
            startActivity(intent)
        }


    }
}