package com.indrapush.programmingmcq.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.ActivityComputerNetworkBinding

class ComputerNetworkActivity : AppCompatActivity() {

    private var binding : ActivityComputerNetworkBinding? = null
    private lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComputerNetworkBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        MobileAds.initialize(this ) {}
        mAdView = binding?.adViewComputer!!
        val adrequest = AdRequest.Builder().build()
        mAdView.loadAd(adrequest)

        mAdView = binding?.adViewComputer1!!
        val adrequest1 = AdRequest.Builder().build()
        mAdView.loadAd(adrequest1)

        mAdView = binding?.adViewComputer2!!
        val adrequest2 = AdRequest.Builder().build()
        mAdView.loadAd(adrequest2)



        binding?.tvApplication?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "application")
            startActivity(intent)
        }

        binding?.tvOsi?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "osi")
            startActivity(intent)
        }

        binding?.tvIntro?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "intro")
            startActivity(intent)
        }

        binding?.tvPhysical?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "physical")
            startActivity(intent)
        }

        binding?.tvTransport?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "transport")
            startActivity(intent)
        }

        binding?.tvNetworking?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "networking")
            startActivity(intent)
        }

        binding?.tvDns?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "dns")
            startActivity(intent)
        }

        binding?.tvDhcp?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "dhcp")
            startActivity(intent)
        }

        binding?.tvHttp?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "http")
            startActivity(intent)
        }

        binding?.tvSmtp?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "smtp")
            startActivity(intent)
        }

        binding?.tvSnmp?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "snmp")
            startActivity(intent)
        }

        binding?.tvSsh?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "ssh")
            startActivity(intent)
        }

        binding?.tvIpv4?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "ipv4")
            startActivity(intent)
        }

        binding?.tvIpv6?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "ipv6")
            startActivity(intent)
        }

        binding?.tvWww?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "www")
            startActivity(intent)
        }

        binding?.tvIpsecurity?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "ipsecurity")
            startActivity(intent)
        }

        binding?.tvVpn?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "vpn")
            startActivity(intent)
        }

        binding?.tvWireless?.setOnClickListener{
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subject", "cn")
            intent.putExtra("topic" , "wireless")
            startActivity(intent)
        }
    }
}