package aptus.architecture.main

import aptus.architecture.ApiService
import aptus.architecture.rx.TestSchedulerProvider
import aptus.architecture.vo.Post
import io.reactivex.Observable
import io.reactivex.schedulers.TestScheduler
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainPresenterImplTest {

    @Mock
    private lateinit var apiService: ApiService

    @Mock
    private lateinit var mainView: MainView

    private lateinit var testScheduler: TestScheduler

    private lateinit var mainPresenter: MainPresenter

    @Mock
    private lateinit var posts: ArrayList<Post>

    @Before
    fun setUp() {
        testScheduler = TestScheduler()
        val testSchedulerProvider = TestSchedulerProvider(testScheduler)
        mainPresenter = MainPresenterImpl(mainView, apiService, testSchedulerProvider)
    }

    @Test
    fun loadViewTest() {
        doReturn(Observable.just(posts))
                .`when`(apiService)
                .getPosts()
        mainPresenter.onLoadView()
        testScheduler.triggerActions()
        verify(mainView).loadView(posts)
    }


    @After
    fun tearDown() {
    }
}