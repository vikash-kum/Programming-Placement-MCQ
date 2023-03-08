package com.indrapush.programmingmcq.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.indrapush.programmingmcq.entity.Question

@Database(entities = [Question::class] , version = 3 , exportSchema = false)
abstract class MCQDatabase : RoomDatabase() {

    abstract fun questionDao() : QuestionDao

    companion object {

    }
}