package comgenix.daggernewpractise

import io.reactivex.Observable
import retrofit2.http.GET


/**
 * Created by santhosh on 15-11-2016.
 */

interface ApiService {

    @GET("wp-json/wp/v2/posts")
    fun getPosts(): Observable<ArrayList<String>>

}