package com.example.bathmanproj.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BathmanListEntitiy::class], version = 1)
abstract class DbClient : RoomDatabase() {
    abstract fun bathmanListDao(): BathmanListDao

    companion object {

//        @Volatile
//        private var instance: DbClient? = null

        fun getDbClient(context: Context): DbClient {

            synchronized(this) {
                val db = Room.databaseBuilder(
                    context.applicationContext,
                    DbClient::class.java,
                    "Bathman_database"
                ).build()

                return db
            }


        }
    }

}