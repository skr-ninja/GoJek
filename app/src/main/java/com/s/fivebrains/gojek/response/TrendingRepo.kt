package com.s.fivebrains.gojek.response

import BuiltBy
import com.google.gson.annotations.SerializedName

data class TrendingRepo (

	@SerializedName("author") val author : String,
	@SerializedName("name") val name : String,
	@SerializedName("avatar") val avatar : String,
	@SerializedName("url") val url : String,
	@SerializedName("description") val description : String,
	@SerializedName("language") val language : String,
	@SerializedName("languageColor") val languageColor : String,
	@SerializedName("stars") val stars : Int,
	@SerializedName("forks") val forks : Int,
	@SerializedName("currentPeriodStars") val currentPeriodStars : Int,
	@SerializedName("builtBy") val builtBy : List<BuiltBy>
)