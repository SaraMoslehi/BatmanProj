package com.example.bathmanproj.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BathmanListEntitiy::class], version = 1)
abstract class DbClient : RoomDatabase() {
    abstract fun bathmanListDao(): BathmanListDao

    companion object {

        private var db: DbClient? = null

        fun getDbClient(context: Context): DbClient? {
            if (db == null) {

                synchronized(DbClient::class.java) {
                    val db = Room.databaseBuilder(
                        context.applicationContext,
                        DbClient::class.java,
                        "Bathman_database"
                    ).allowMainThreadQueries()
                        .build()
                }
            }
            return db


        }
    }

}