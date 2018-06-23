package aptus.architecture.rx

import io.reactivex.Scheduler
import io.reactivex.schedulers.TestScheduler

class TestSchedulerProvider(private val testScheduler: TestScheduler) : SchedulerProvider {

    override fun io(): Scheduler = testScheduler

    override fun ui(): Scheduler = testScheduler

    override fun newThread(): Scheduler = testScheduler

    override fun computation(): Scheduler = testScheduler
}