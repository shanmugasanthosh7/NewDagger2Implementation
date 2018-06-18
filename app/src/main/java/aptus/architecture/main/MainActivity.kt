package aptus.architecture.main

import android.os.Bundle
import android.util.Log
import aptus.architecture.R
import aptus.architecture.vo.Post
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainView {

    @Inject lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.onLoadView()
    }

    override fun loadView(posts: ArrayList<Post>) {
        // Do UI update
    }
}
