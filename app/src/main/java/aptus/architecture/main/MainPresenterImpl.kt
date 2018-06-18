package aptus.architecture.main

import aptus.architecture.ApiService
import aptus.architecture.rx.SchedulerProvider
import aptus.architecture.vo.Post
import javax.inject.Inject


class MainPresenterImpl @Inject constructor(var mainView: MainView,
                                            apiService: ApiService,
                                            schedulerProvider: SchedulerProvider)
    : MainPresenter, MainInteractor.OnFinishedListener {

    private var mainInteractor: MainInteractor = MainInteractorImpl(apiService, schedulerProvider)

    override fun onLoadView() {
        mainInteractor.onLoadView(this)
    }

    override fun onFinishLoadView(posts: ArrayList<Post>) {
        mainView.loadView(posts)
    }
}