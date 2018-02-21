package comgenix.daggernewpractise.di

import comgenix.daggernewpractise.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    /* @Binds
     @IntoMap
     @ActivityKey(MainActivity::class)
     abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>*/

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

}