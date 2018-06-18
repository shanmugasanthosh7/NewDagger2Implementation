package aptus.architecture.vo

import com.google.gson.annotations.SerializedName

data class Post(@SerializedName("userId") val userId: String?,
                @SerializedName("id") val id: String?,
                @SerializedName("title") val title: String?,
                @SerializedName("body") val body: String?)