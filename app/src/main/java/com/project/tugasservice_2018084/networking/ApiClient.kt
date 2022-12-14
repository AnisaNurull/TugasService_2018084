package com.project.tugasservice_2018084.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Azhar Rivaldi on 18-05-2021
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * Linkedin : https://www.linkedin.com/in/project-rivaldi
 */

class ApiClient {

    companion object {

        private const val BASE_URL = "https://maps.googleapis.com/maps/api/place/"

        fun getClient(): ApiInterface {
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }

}