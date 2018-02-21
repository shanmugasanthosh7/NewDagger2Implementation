package comgenix.daggernewpractise.di

import comgenix.daggernewpractise.*
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun provideMainView(mainActivity: MainActivity): MainView {
        return mainActivity
    }

    @Provides
    fun provideMainPresenter(mainView: MainView, apiService: ApiService): MainPresenter {
        return MainPresenterImpl(mainView, apiService)
    }

}