package aptus.architecture.main

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.test.runner.AndroidJUnitRunner
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.Rule
import org.junit.Test
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import aptus.architecture.R


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @Test
    fun onLoadViewUIVisibility() {
        onView(withId(R.id.hello)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.clickHere)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun onLoadView_WithClickButton() {
        onView(withId(R.id.clickHere)).perform(click())
    }

    @After
    fun tearDown() {
    }
}