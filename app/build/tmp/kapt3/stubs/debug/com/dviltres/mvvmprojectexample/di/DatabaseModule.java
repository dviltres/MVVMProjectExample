package com.dviltres.mvvmprojectexample.di;

import android.app.Application;
import androidx.room.Room;
import com.dviltres.mvvmprojectexample.common.UtilConstants;
import com.dviltres.mvvmprojectexample.data.local.MyAppDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/dviltres/mvvmprojectexample/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/dviltres/mvvmprojectexample/data/local/MyAppDatabase;", "app", "Landroid/app/Application;", "app_debug"})
@dagger.Module
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.dviltres.mvvmprojectexample.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.dviltres.mvvmprojectexample.data.local.MyAppDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
}