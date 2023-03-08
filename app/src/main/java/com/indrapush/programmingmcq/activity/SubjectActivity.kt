package com.indrapush.programmingmcq.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.indrapush.programmingmcq.R
import com.indrapush.programmingmcq.databinding.ActivitySubjectBinding
import kotlin.system.exitProcess

class SubjectActivity : AppCompatActivity() {

    private var binding : ActivitySubjectBinding? = null
    private lateinit var mAdView : AdView
    private var mInterstitialAd: InterstitialAd? = null
    private var adRequest = AdRequest.Builder().build()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubjectBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        MobileAds.initialize(this) {}
        mAdView = binding?.adViewSubject!!

        mAdView.loadAd(adRequest)
        binding!!.adViewSubjectBottom.loadAd(adRequest)
        interstitialAd()

        binding?.tvJava?.setOnClickListener {
            startActivity(Intent(this, JavaActivity::class.java))
        }

        binding?.tvCpp?.setOnClickListener {
            startActivity(Intent(this , CppActivity::class.java))
        }

        binding?.tvPython?.setOnClickListener {
            startActivity(Intent(this, PythonActivity::class.java))
        }

        binding?.tvJavaScript?.setOnClickListener {
            startActivity(Intent(this, JavaScriptActivity::class.java))
        }

        binding?.tvDbms?.setOnClickListener {
            startActivity(Intent(this, DbmsActivity::class.java))
        }

        binding?.tvComputerNet?.setOnClickListener {
            startActivity(Intent(this, ComputerNetworkActivity::class.java))
        }

        binding?.tvNodejs?.setOnClickListener {
            startActivity(Intent(this, NodejsActivity::class.java))
        }

        binding?.tvReact?.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "react")
            intent.putExtra("topic" , "basic")
            startActivity(intent)
        }

        binding?.logout?.setOnClickListener {
            if(mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
            Firebase.auth.signOut()
            exitByBackKey()
        }


    }

    private fun interstitialAd () {
        InterstitialAd.load(this ,"ca-app-pub-2248293766990577/4849221552", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                mInterstitialAd = null
            }
            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                mInterstitialAd = interstitialAd
            }
        })
    }

    private fun exitByBackKey() {
        val builder = AlertDialog.Builder(this)
            .create()
        val view = layoutInflater.inflate(R.layout.exit_screen_layout ,null)

        val  btnNo = view.findViewById<Button>(R.id.btn_no)
        val btnYes = view.findViewById<Button>(R.id.btn_yes)
        builder.setView(view)
        btnNo.setOnClickListener {
            interstitialAd()
            builder.dismiss()
        }

        btnYes.setOnClickListener {
            exitProcess(0)
        }
        builder.setCanceledOnTouchOutside(false)
        builder.show()

    }
    override fun onBackPressed() {
        if(mInterstitialAd != null) {
            mInterstitialAd?.show(this)
        }
        exitByBackKey()
        interstitialAd()
    }
}
