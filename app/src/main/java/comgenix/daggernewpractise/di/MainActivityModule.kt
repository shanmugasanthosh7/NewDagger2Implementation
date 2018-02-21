package comgenix.daggernewpractise.di

import comgenix.daggernewpractise.MainActivity
import comgenix.daggernewpractise.MainPresenter
import comgenix.daggernewpractise.MainPresenterImpl
import comgenix.daggernewpractise.MainView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun provideMainView(mainActivity: MainActivity): MainView {
        return mainActivity
    }

    @Provides
    fun provideApiService(): String {
        return "Apiservice"
    }

    @Provides
    fun provideMainPresenter(mainView: MainView, apiService: String): MainPresenter {
        return MainPresenterImpl(mainView, apiService)
    }

}