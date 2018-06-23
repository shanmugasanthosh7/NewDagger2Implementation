package aptus.architecture.main

import android.os.Bundle
import android.util.Log
import aptus.architecture.R
import aptus.architecture.vo.Post
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainView {

    companion object {
        val TAG = MainActivity::class.simpleName
    }

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickHere.setOnClickListener {
            mainPresenter.onLoadView()
        }
    }

    override fun loadView(posts: ArrayList<Post>) {
        // Do UI update
        Log.d(TAG, "UI Updated.")
    }
}
