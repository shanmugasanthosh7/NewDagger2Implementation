package comgenix.daggernewpractise

class MainInteractorImpl : MainInteractor {

    override fun onLoadView(apiService: String, onFinishedListener: MainInteractor.OnFinishedListener) {
        onFinishedListener.onFinishLoadView(apiService)
    }
}