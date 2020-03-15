package com.example.batmanproj.db

import android.content.Context
import androidx.databinding.adapters.Converters
import androidx.room.*
import retrofit2.Converter
import java.util.concurrent.Executors

@Database(entities = arrayOf(BatmanListEntitiy::class, BatmanDetailEntitiy::class), version = 2)

@TypeConverters(SearchConverter::class)

abstract class DbClient : RoomDatabase() {
    abstract fun batmanListDao(): BatmanListDao
    abstract fun batmanDetailDao(): BatmanDetailDao

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