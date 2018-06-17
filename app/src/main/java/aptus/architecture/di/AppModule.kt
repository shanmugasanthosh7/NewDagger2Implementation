package aptus.architecture.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

//@Module(subcomponents = [MainActivityComponent::class])
@Module(includes = [NetworkModule::class])
abstract class AppModule {

    @Binds
    abstract fun application(application: Application): Context
}