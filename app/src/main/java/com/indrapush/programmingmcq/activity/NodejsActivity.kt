package com.indrapush.programmingmcq.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.ActivityNodejsBinding

class NodejsActivity : AppCompatActivity() {
    private var binding : ActivityNodejsBinding? = null
    private lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNodejsBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        //Google Ada
        MobileAds.initialize(this ) {}
        mAdView = binding?.adViewNodejs!!
        val adrequest = AdRequest.Builder().build()
        mAdView.loadAd(adrequest)


        binding?.tvBasic?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "nodejs")
            intent.putExtra("topic" , "basic")
            startActivity(intent)
        }


        binding?.tvBasic1?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "nodejs")
            intent.putExtra("topic" , "basic1")
            startActivity(intent)
        }


    }
}