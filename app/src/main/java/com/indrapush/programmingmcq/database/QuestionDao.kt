package com.indrapush.programmingmcq.database

import androidx.room.*
import com.indrapush.programmingmcq.entity.Question
import kotlinx.coroutines.flow.Flow


@Dao
interface QuestionDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(question: Question)

    @Delete
    suspend fun delete(question: Question)

    @Query("SELECT * FROM Question")
    fun fetchAllQuestion() : Flow<List<Question>>

    @Query("SELECT * FROM Question WHERE subject=:subject")
    fun fetchQuestionBySubject(subject : String) : Flow<List<Question>>

}