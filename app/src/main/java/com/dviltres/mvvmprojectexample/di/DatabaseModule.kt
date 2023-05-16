package com.dviltres.mvvmprojectexample.di

import android.app.Application
import androidx.room.Room
import com.dviltres.mvvmprojectexample.common.UtilConstants
import com.dviltres.mvvmprojectexample.data.local.MyAppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): MyAppDatabase {
        return Room.databaseBuilder(
            app,
            MyAppDatabase::class.java,
            UtilConstants.DATABASE_NAME,
        ).build()
    }
}