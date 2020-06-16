package io.navendra.retrofitkotlindeferred.service

import com.mbinfo.huge.data.network.ApiRequestNet
import com.mbinfo.huge.data.network.ConstantValues


object ApiFactory{

   val placeholderApi : ApiRequestNet = RetrofitFactory.retrofit(ConstantValues.HUGE_URL)
                                                .create(ApiRequestNet::class.java)
/*
    val tmdbApi : TmdbApi = RetrofitFactory.retrofit(AppConstants.TMDB_BASE_URL)
        .create(TmdbApi::class.java)*/
}

