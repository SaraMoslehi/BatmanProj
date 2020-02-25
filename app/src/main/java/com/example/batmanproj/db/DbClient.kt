package com.example.batmanproj.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.util.concurrent.Executors

@Database(entities = [BatmanListEntitiy::class], version = 1)
abstract class DbClient : RoomDatabase() {
    abstract fun batmanListDao(): BatmanListDao

    companion object {

        @Volatile
        private var dbInstance: DbClient? = null

        var executorsService = Executors.newFixedThreadPool(4)


        fun getDbClient(context: Context): DbClient {
            val db = dbInstance
            if (db != null) {
                return db
            }

            synchronized(DbClient::class.java) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DbClient::class.java,
                    "Batman_database"
                ).allowMainThreadQueries()
                    .build()
                dbInstance = instance
                return instance
            }
        }

//        fun getDbClient(context: Context): DbClient? {
//            if (db == null) {
//                synchronized(DbClient::class.java) {
//                    val db = Room.databaseBuilder(
//                        context.applicationContext,
//                        DbClient::class.java,
//                        "Batman_database"
//                    ).allowMainThreadQueries()
//                        .build()
//                }
//            }
//            return db
//
//
//        }
    }

}