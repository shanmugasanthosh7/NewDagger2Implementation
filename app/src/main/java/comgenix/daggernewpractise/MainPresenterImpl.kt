package comgenix.daggernewpractise

import javax.inject.Inject


class MainPresenterImpl @Inject constructor(var mainView: MainView, var apiService: ApiService) : MainPresenter, MainInteractor.OnFinishedListener {

    private var mainInteractor: MainInteractor = MainInteractorImpl()

    override fun onLoadView() {
        mainInteractor.onLoadView(apiService, this)
    }

    override fun onFinishLoadView(apiService: String) {
        mainView.loadView(apiService)
    }
}