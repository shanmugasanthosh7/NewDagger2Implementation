package aptus.architecture.main

import aptus.architecture.vo.Post

interface MainView {

    fun loadView(posts: ArrayList<Post>)
}