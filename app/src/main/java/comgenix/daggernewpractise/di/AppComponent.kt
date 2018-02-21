package comgenix.daggernewpractise.di

import comgenix.daggernewpractise.DgApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent : AndroidInjector<DgApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DgApplication>() {}

    /* @Component.Builder
     interface Builder {

         @BindsInstance
         fun application(application: Application): Builder

         fun build(): AppComponent

     }

     fun inject(dgApplication: DgApplication)*/

}