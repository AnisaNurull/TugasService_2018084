package com.project.tugasservice_2018084.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Azhar Rivaldi on 10-06-2021
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * Linkedin : https://www.linkedin.com/in/project-rivaldi
 */

class ModelDetail {

    @SerializedName("geometry")
    val modelGeometry: ModelGeometry? = null

    @SerializedName("name")
    val name: String? = null

    @SerializedName("formatted_address")
    val formatted_address: String? = null

    @SerializedName("formatted_phone_number")
    val formatted_phone_number: String? = null

}