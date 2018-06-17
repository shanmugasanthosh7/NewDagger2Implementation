package aptus.architecture.main

import aptus.architecture.ApiService

interface MainInteractor {

    interface OnFinishedListener {
        fun onFinishLoadView(apiService: String)
    }

    fun onLoadView(apiService: ApiService, onFinishedListener: OnFinishedListener)

}