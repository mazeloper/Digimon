package com.mazeloper.dev.digimoncard.data.vo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "digimon")
data class DigimonVo(
    @PrimaryKey val id: Int,

    @SerializedName("artist")
    @ColumnInfo(name = "artist")
    val artist: Any? = null,

    @SerializedName("attribute")
    @ColumnInfo(name = "attribute")
    val attribute: String? = null,

    @SerializedName("card_sets")
    @ColumnInfo(name = "card_sets")
    val cardSets: List<String>? = null,

    @SerializedName("cardnumber")
    @ColumnInfo(name = "cardnumber")
    val cardnumber: String? = null,

    @SerializedName("cardrarity")
    @ColumnInfo(name = "cardrarity")
    val cardrarity: Any? = null,

    @SerializedName("color")
    @ColumnInfo(name = "color")
    val color: String? = null,

    @SerializedName("dp")
    @ColumnInfo(name = "dp")
    val dp: Any? = null,

    @SerializedName("evolution_cost")
    @ColumnInfo(name = "evolutionCost")
    val evolutionCost: Any? = null,

    @SerializedName("image_url")
    @ColumnInfo(name = "imageUrl")
    val imageUrl: String? = null,

    @SerializedName("level")
    @ColumnInfo(name = "level")
    val level: Any? = null,

    @SerializedName("maineffect")
    @ColumnInfo(name = "maineffect")
    val maineffect: Any? = null,

    @SerializedName("name")
    @ColumnInfo(name = "name")
    val name: String? = null,

    @SerializedName("play_cost")
    @ColumnInfo(name = "playCost")
    val playCost: Any? = null,

    @SerializedName("set_name")
    @ColumnInfo(name = "setName")
    val setName: String? = null,

    @SerializedName("soureeffect")
    @ColumnInfo(name = "soureeffect")
    val soureeffect: Any? = null,

    @SerializedName("stage")
    @ColumnInfo(name = "stage")
    val stage: String? = null,

    @SerializedName("type")
    @ColumnInfo(name = "type")
    val type: String? = null

)