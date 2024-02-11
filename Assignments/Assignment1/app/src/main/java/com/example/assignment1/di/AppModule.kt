package com.example.assignment1.di

import android.app.Application
import com.example.assignment1.data.AppDatabase
import com.example.assignment1.data.UserDao
import com.example.assignment1.data.repository.UserRepository
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