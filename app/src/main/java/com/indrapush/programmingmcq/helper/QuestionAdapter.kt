package com.indrapush.programmingmcq.helper

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amplifyframework.datastore.generated.model.Questions
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.indrapush.programmingmcq.databinding.RecycleviewItemLayoutBinding


class QuestionAdapter(private val questions: ArrayList<Questions>, private val correctOption: Int, private val wrongOption: Int ,
                      private val context : Context) : RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>() {

    private lateinit var mAdView: AdView
    private var adRequest = AdRequest.Builder().build()

    inner class QuestionViewHolder(itemBinding: RecycleviewItemLayoutBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        val question = itemBinding.tvQuestion
        var option1 = itemBinding.option1
        var option2 = itemBinding.option2
        var option3 = itemBinding.option3
        var option4 = itemBinding.option4
        var showAns = itemBinding.ans
        val description = itemBinding.tvDescription
        val ads = itemBinding.adViewQuestion

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        return QuestionViewHolder(RecycleviewItemLayoutBinding.
        inflate(LayoutInflater.from(parent.context),parent,false))
    }


    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        val question: Questions = questions[position]
        holder.question.text = question.question
        holder.option1.text = question.option1
        holder.option2.text = question.option2
        holder.option3.text = question.option3
        holder.option4.text = question.option4


        // Google ads
        MobileAds.initialize(context ) {}
        mAdView = holder.ads
        mAdView.loadAd(adRequest)
        holder.ads.loadAd(adRequest)

        holder.showAns.setOnClickListener {
            if (question.correctAns == 1) holder.option1.setBackgroundResource(correctOption)
            if (question.correctAns == 2) holder.option2.setBackgroundResource(correctOption)
            if (question.correctAns == 3) holder.option3.setBackgroundResource(correctOption)
            if (question.correctAns == 4) holder.option4.setBackgroundResource(correctOption)
            holder.option1.isEnabled = false
            holder.option2.isEnabled = false
            holder.option3.isEnabled = false
            holder.option4.isEnabled = false
            if(question.description != null) {
                holder.description.text = "Answer: " + question.description
            }else{
                holder.description.text = "Answer: "
            }
        }

        holder.option1.setOnClickListener {
            if(question.correctAns == 1) {
                holder.option1.setBackgroundResource(correctOption)

            } else {
                holder.option1.setBackgroundResource(wrongOption)
            }
            when(question.correctAns) {
                2 -> holder.option2.setBackgroundResource(correctOption)
                3 -> holder.option3.setBackgroundResource(correctOption)
                4 -> holder.option4.setBackgroundResource(correctOption)
            }
            holder.option1.isEnabled = false
            holder.option2.isEnabled = false
            holder.option3.isEnabled = false
            holder.option4.isEnabled = false
        }

        holder.option2.setOnClickListener {
            if(question.correctAns == 2) {
                holder.option2.setBackgroundResource(correctOption)
            }else {
                holder.option2.setBackgroundResource(wrongOption)
            }
            when(question.correctAns) {
                1 -> holder.option1.setBackgroundResource(correctOption)
                3 -> holder.option3.setBackgroundResource(correctOption)
                4 -> holder.option4.setBackgroundResource(correctOption)
            }
            holder.option1.isEnabled = false
            holder.option2.isEnabled = false
            holder.option3.isEnabled = false
            holder.option4.isEnabled = false
        }

        holder.option3.setOnClickListener {
            if(question.correctAns == 3) {
                holder.option3.setBackgroundResource(correctOption)
            } else holder.option3.setBackgroundResource(wrongOption)
            when(question.correctAns) {
                1 -> holder.option1.setBackgroundResource(correctOption)
                2 -> holder.option3.setBackgroundResource(correctOption)
                4 -> holder.option4.setBackgroundResource(correctOption)
            }
            holder.option1.isEnabled = false
            holder.option2.isEnabled = false
            holder.option3.isEnabled = false
            holder.option4.isEnabled = false
        }

        holder.option4.setOnClickListener {
            if(question.correctAns == 4) {
                holder.option4.setBackgroundResource(correctOption)
            } else {
                holder.option4.setBackgroundResource(wrongOption)
            }
            when(question.correctAns) {
                1 -> holder.option1.setBackgroundResource(correctOption)
                2 -> holder.option3.setBackgroundResource(correctOption)
                3 -> holder.option4.setBackgroundResource(correctOption)
            }
            holder.option1.isEnabled = false
            holder.option2.isEnabled = false
            holder.option3.isEnabled = false
            holder.option4.isEnabled = false
        }


//        holder.favorite.setOnClickListener {
//            val saving = GlobalScope.launch {
//                val tempQuestion= Question(
//                questions.id,
//                questions.question,
//                questions.option1,
//                questions.option2,
//                questions.option3,
//                questions.option4,
//                questions.correctAns,
//                questions.subject,
//                questions.topic
//                )
//                database?.questionDao()?.insert(tempQuestion)
//            }
//            Toast.makeText(context, "Added into favorite", Toast.LENGTH_SHORT).show()
//            saving.cancel()
//        }


    }


    override fun getItemCount(): Int {
        return questions.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

}
