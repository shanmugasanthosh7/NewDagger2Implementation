package aptus.architecture.main

import aptus.architecture.ApiService
import aptus.architecture.rx.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainInteractorImpl(var apiService: ApiService,
                         schedulerProvider: SchedulerProvider) : MainInteractor {

    override fun onLoadView(onFinishedListener: MainInteractor.OnFinishedListener) {
        apiService.getPosts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(onFinishedListener::onFinishLoadView)
    }
}