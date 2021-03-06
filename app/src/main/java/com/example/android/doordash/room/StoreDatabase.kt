package com.example.android.doordash.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [StoreCacheEntity::class, StoreDetailsCacheEntity::class], version = 4)
abstract class StoreDatabase: RoomDatabase() {
    abstract fun storeDao(): StoreDao
    abstract fun storeDetailsDao(): StoreDetailsDao

    companion object {
        const val DATABASE_NAME: String = "store_db"
    }
}
