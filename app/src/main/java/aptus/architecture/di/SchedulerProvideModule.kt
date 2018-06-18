package aptus.architecture.di

import aptus.architecture.rx.AppSchedulerProvider
import aptus.architecture.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SchedulerProvideModule {

    @Singleton @Provides
    fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()
}