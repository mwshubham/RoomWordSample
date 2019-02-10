package com.example.roomwordsample

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface WordDao {

//    @Query("SELECT * from word_table ORDER BY word ASC")
//    fun getAllWords(): List<Word>

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    // @Insert(onConflict = OnConflictStrategy.REPLACE)
    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()
}