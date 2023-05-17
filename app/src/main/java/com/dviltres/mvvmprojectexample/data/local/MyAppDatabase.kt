package com.dviltres.mvvmprojectexample.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity

@Database(
    entities = [ProductEntity::class],
    version = 1
)
abstract class MyAppDatabase: RoomDatabase() {
    abstract val productDao: ProductDao
}