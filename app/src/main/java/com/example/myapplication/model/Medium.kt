package com.example.primus.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



 class Medium {

  @SerializedName("type")
  @Expose
  private var type: String? = null
  @SerializedName("subtype")
  @Expose
  private var subtype: String? = null
  @SerializedName("caption")
  @Expose
  private var caption: String? = null
  @SerializedName("copyright")
  @Expose
  private var copyright: String? = null
  @SerializedName("approved_for_syndication")
  @Expose
  private var approvedForSyndication: Int? = null
  @SerializedName("media-metadata")
  @Expose
  private var mediaMetadata: List<MediaMetadatum?>? = null

  fun getType(): String? {
   return type
  }

  fun setType(type: String?) {
   this.type = type
  }

  fun getSubtype(): String? {
   return subtype
  }

  fun setSubtype(subtype: String?) {
   this.subtype = subtype
  }

  fun getCaption(): String? {
   return caption
  }

  fun setCaption(caption: String?) {
   this.caption = caption
  }

  fun getCopyright(): String? {
   return copyright
  }

  fun setCopyright(copyright: String?) {
   this.copyright = copyright
  }

  fun getApprovedForSyndication(): Int? {
   return approvedForSyndication
  }

  fun setApprovedForSyndication(approvedForSyndication: Int?) {
   this.approvedForSyndication = approvedForSyndication
  }

  fun getMediaMetadata(): List<MediaMetadatum?>? {
   return mediaMetadata
  }

  fun setMediaMetadata(mediaMetadata: List<MediaMetadatum?>?) {
   this.mediaMetadata = mediaMetadata
  }
 }
