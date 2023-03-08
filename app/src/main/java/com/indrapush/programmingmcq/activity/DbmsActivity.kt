package com.indrapush.programmingmcq.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.ActivityDbmsBinding

class DbmsActivity : AppCompatActivity() {
    private var binding : ActivityDbmsBinding? = null
    private lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDbmsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // Ads
        MobileAds.initialize(this ) {}
        mAdView = binding?.adViewDbms!!
        val adrequest = AdRequest.Builder().build()
        mAdView.loadAd(adrequest)


        binding?.tvBasic?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "dbms")
            intent.putExtra("topic" , "basic")
            startActivity(intent)
        }


        binding?.tvRdb?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "dbms")
            intent.putExtra("topic" , "rdb")
            startActivity(intent)
        }


        binding?.tvNf?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "dbms")
            intent.putExtra("topic" , "nf")
            startActivity(intent)
        }


        binding?.tvTransaction?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "dbms")
            intent.putExtra("topic" , "transaction")
            startActivity(intent)
        }


        binding?.tvIndexing?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "dbms")
            intent.putExtra("topic" , "indexing")
            startActivity(intent)
        }


        binding?.tvConcurrency?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "dbms")
            intent.putExtra("topic" , "concurrency")
            startActivity(intent)
        }













    }
}