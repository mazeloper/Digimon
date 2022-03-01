package com.mazeloper.dev.digimoncard.data.vo

import com.google.gson.annotations.SerializedName

data class DigimonVo(
    @SerializedName("artist")
    val artist: Any? = null,
    @SerializedName("attribute")
    val attribute: String? = null,
    @SerializedName("card_sets")
    val cardSets: List<String>? = null,
    @SerializedName("cardnumber")
    val cardnumber: String? = null,
    @SerializedName("cardrarity")
    val cardrarity: Any? = null,
    @SerializedName("color")
    val color: String? = null,
    @SerializedName("dp")
    val dp: Any? = null,
    @SerializedName("evolution_cost")
    val evolutionCost: Any? = null,
    @SerializedName("image_url")
    val imageUrl: String? = null,
    @SerializedName("level")
    val level: Any? = null,
    @SerializedName("maineffect")
    val maineffect: Any? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("play_cost")
    val playCost: Any? = null,
    @SerializedName("set_name")
    val setName: String? = null,
    @SerializedName("soureeffect")
    val soureeffect: Any? = null,
    @SerializedName("stage")
    val stage: String? = null,
    @SerializedName("type")
    val type: String? = null
)