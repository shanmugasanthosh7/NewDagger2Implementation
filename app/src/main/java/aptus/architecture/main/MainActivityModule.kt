package aptus.architecture.main

import aptus.architecture.*
import aptus.architecture.main.MainActivity
import aptus.architecture.main.MainPresenter
import aptus.architecture.main.MainPresenterImpl
import aptus.architecture.main.MainView
import aptus.architecture.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides fun provideMainView(mainActivity: MainActivity): MainView {
        return mainActivity
    }

    @Provides fun provideMainPresenter(mainView: MainView,
                                       apiService: ApiService,
                                       schedulerProvider: SchedulerProvider): MainPresenter {
        return MainPresenterImpl(mainView, apiService, schedulerProvider)
    }
}