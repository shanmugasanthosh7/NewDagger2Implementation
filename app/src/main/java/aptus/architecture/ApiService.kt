package aptus.architecture

import aptus.architecture.vo.Post
import io.reactivex.Observable
import retrofit2.http.GET


/**
 * Created by santhosh on 15-11-2016.
 */

interface ApiService {

    @GET("posts")
    fun getPosts(): Observable<ArrayList<Post>>
}