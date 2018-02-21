package comgenix.daggernewpractise

interface MainInteractor {

    interface OnFinishedListener {
        fun onFinishLoadView(apiService: String)
    }

    fun onLoadView(apiService: String, onFinishedListener: OnFinishedListener)

}