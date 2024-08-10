package com.streamliners.timify.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.streamliners.timify.domain.TaskInfo

@Dao
interface TaskInfoDao {

    @Query("SELECT * FROM TasksInfo WHERE date = :date")
    suspend fun getList(date: String): List<TaskInfo>

    @Query("DELETE FROM TasksInfo")
    suspend fun clear()

    @Insert
    suspend fun add(taskInfo: TaskInfo)

}