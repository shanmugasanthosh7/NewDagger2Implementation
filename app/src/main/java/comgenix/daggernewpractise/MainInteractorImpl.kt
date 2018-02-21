package comgenix.daggernewpractise

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainInteractorImpl : MainInteractor {

    override fun onLoadView(apiService: ApiService, onFinishedListener: MainInteractor.OnFinishedListener) {
        apiService.getPosts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe()
        onFinishedListener.onFinishLoadView("success")
    }
}