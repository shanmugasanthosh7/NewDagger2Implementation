package comgenix.daggernewpractise.di

import android.app.Application
import comgenix.daggernewpractise.DgApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent : AndroidInjector<DaggerApplication> {

    /*@Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerApplication>() {}*/

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(dgApplication: DgApplication)

    override fun inject(instance: DaggerApplication?)

}