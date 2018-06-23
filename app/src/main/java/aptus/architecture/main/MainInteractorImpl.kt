package aptus.architecture.main

import aptus.architecture.ApiService
import aptus.architecture.rx.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainInteractorImpl(private val apiService: ApiService,
                         private val schedulerProvider: SchedulerProvider) : MainInteractor {

    override fun onLoadView(onFinishedListener: MainInteractor.OnFinishedListener) {
        apiService.getPosts()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(onFinishedListener::onFinishLoadView)
    }
}