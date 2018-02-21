package comgenix.daggernewpractise

class MainPresenterImpl(private val mainView: MainView, private val apiService: String) :
        MainPresenter, MainInteractor.OnFinishedListener {

    private var mainInteractor: MainInteractor = MainInteractorImpl()

    override fun onLoadView() {
        mainInteractor.onLoadView(apiService, this)
    }

    override fun onFinishLoadView(apiService: String) {
        mainView.loadView(apiService)
    }
}