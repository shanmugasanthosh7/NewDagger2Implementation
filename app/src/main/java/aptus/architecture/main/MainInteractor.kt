package aptus.architecture.main

import aptus.architecture.ApiService
import aptus.architecture.vo.Post

interface MainInteractor {

    interface OnFinishedListener {
        fun onFinishLoadView(posts: ArrayList<Post>)
    }

    fun onLoadView(onFinishedListener: OnFinishedListener)

}