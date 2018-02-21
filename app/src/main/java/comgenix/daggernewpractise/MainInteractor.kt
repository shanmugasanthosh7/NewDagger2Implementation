package comgenix.daggernewpractise

interface MainInteractor {

    interface OnFinishedListener {
        fun onFinishLoadView(apiService: String)
    }

    fun onLoadView(apiService: ApiService, onFinishedListener: OnFinishedListener)

}