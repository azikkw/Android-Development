package com.example.assignment2.di

import android.app.Application
import com.example.assignment2.room.AppDatabase
import com.example.assignment2.room.UserDao
import com.example.assignment2.room.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun providesUserRepository(userDao: UserDao): UserRepository {
        return UserRepository(userDao = userDao)
    }

    @Singleton
    @Provides
    fun provideAppDatabase(app: Application): AppDatabase {
        return AppDatabase.getInstance(context = app)
    }

    @Singleton
    @Provides
    fun provideUserDao(appDatabase: AppDatabase): UserDao {
        return appDatabase.userDao()
    }

}