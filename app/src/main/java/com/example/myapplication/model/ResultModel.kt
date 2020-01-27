package com.example.primus.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class ResultModel {
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("adx_keywords")
    @Expose
    private var adxKeywords: String? = null
    @SerializedName("column")
    @Expose
    private var column: Any? = null
    @SerializedName("section")
    @Expose
    private var section: String? = null
    @SerializedName("byline")
    @Expose
    private var byline: String? = null
    @SerializedName("type")
    @Expose
    private var type: String? = null
    @SerializedName("title")
    @Expose
    private var title: String? = null
    @SerializedName("abstract")
    @Expose
    private var _abstract: String? = null
    @SerializedName("published_date")
    @Expose
    private var publishedDate: String? = null
    @SerializedName("source")
    @Expose
    private var source: String? = null
    @SerializedName("id")
    @Expose
    private var id: Long? = null
    @SerializedName("asset_id")
    @Expose
    private var assetId: Long? = null
    @SerializedName("views")
    @Expose
    private var views: Int? = null
    /*@SerializedName("des_facet")
    @Expose
    private var desFacet: List<String>? = null
    @SerializedName("org_facet")
    @Expose
    private var orgFacet: List<String>? = null*/
   /* @SerializedName("per_facet")
    @Expose
    private var perFacet: List<String>? = null*/
/*    @SerializedName("geo_facet")
    @Expose
    private var geoFacet: String? = null*/
    @SerializedName("media")
    @Expose
    private var media: List<Medium>? = null
    @SerializedName("uri")
    @Expose
    private var uri: String? = null

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getAdxKeywords(): String? {
        return adxKeywords
    }

    fun setAdxKeywords(adxKeywords: String) {
        this.adxKeywords = adxKeywords
    }

    fun getColumn(): Any? {
        return column
    }

    fun setColumn(column: Any) {
        this.column = column
    }

    fun getSection(): String? {
        return section
    }

    fun setSection(section: String) {
        this.section = section
    }

    fun getByline(): String? {
        return byline
    }

    fun setByline(byline: String) {
        this.byline = byline
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String) {
        this.type = type
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getAbstract(): String? {
        return _abstract
    }

    fun setAbstract(_abstract: String) {
        this._abstract = _abstract
    }

    fun getPublishedDate(): String? {
        return publishedDate
    }

    fun setPublishedDate(publishedDate: String) {
        this.publishedDate = publishedDate
    }

    fun getSource(): String? {
        return source
    }

    fun setSource(source: String) {
        this.source = source
    }

    fun getId(): Long? {
        return id
    }

    fun setId(id: Long?) {
        this.id = id
    }

    fun getAssetId(): Long? {
        return assetId
    }

    fun setAssetId(assetId: Long?) {
        this.assetId = assetId
    }

    fun getViews(): Int? {
        return views
    }

    fun setViews(views: Int?) {
        this.views = views
    }

   /* fun getDesFacet(): List<String>? {
        return desFacet
    }

    fun setDesFacet(desFacet: List<String>) {
        this.desFacet = desFacet
    }

    fun getOrgFacet(): List<String>? {
        return orgFacet
    }

    fun setOrgFacet(orgFacet: List<String>) {
        this.orgFacet = orgFacet
    }*/

  /*  fun getPerFacet(): List<String>? {
        return perFacet
    }

    fun setPerFacet(perFacet: List<String>) {
        this.perFacet = perFacet
    }*/

   /* fun getGeoFacet(): String? {
        return geoFacet
    }

    fun setGeoFacet(geoFacet: String) {
        this.geoFacet = geoFacet
    }*/

    fun getMedia(): List<Medium>? {
        return media
    }

    fun setMedia(media: List<Medium>) {
        this.media = media
    }

    fun getUri(): String? {
        return uri
    }

    fun setUri(uri: String) {
        this.uri = uri
    }
}