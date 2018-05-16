
package com.kino.main.modelservice;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("outlet_id")
    @Expose
    private String outletId;
    @SerializedName("market_id")
    @Expose
    private String marketId;
    @SerializedName("produk_name")
    @Expose
    private String produkName;
    @SerializedName("plu")
    @Expose
    private String plu;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("ispromo")
    @Expose
    private String ispromo;
    @SerializedName("promo")
    @Expose
    private String promo;
    @SerializedName("activity_id")
    @Expose
    private String activityId;
    @SerializedName("activity_que")
    @Expose
    private String activityQue;
    @SerializedName("std_display")
    @Expose
    private String stdDisplay;
    @SerializedName("min_qty")
    @Expose
    private String minQty;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("latlon")
    @Expose
    private Object latlon;
    public final static Creator<Product> CREATOR = new Creator<Product>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return (new Product[size]);
        }

    }
    ;
    private final static long serialVersionUID = 273856198799542773L;

    protected Product(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.outletId = ((String) in.readValue((String.class.getClassLoader())));
        this.marketId = ((String) in.readValue((String.class.getClassLoader())));
        this.produkName = ((String) in.readValue((String.class.getClassLoader())));
        this.plu = ((String) in.readValue((String.class.getClassLoader())));
        this.sku = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.ispromo = ((String) in.readValue((String.class.getClassLoader())));
        this.promo = ((String) in.readValue((String.class.getClassLoader())));
        this.activityId = ((String) in.readValue((String.class.getClassLoader())));
        this.activityQue = ((String) in.readValue((String.class.getClassLoader())));
        this.stdDisplay = ((String) in.readValue((String.class.getClassLoader())));
        this.minQty = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.latlon = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param marketId
     * @param produkName
     * @param promo
     * @param minQty
     * @param image
     * @param sku
     * @param type
     * @param id
     * @param activityId
     * @param latlon
     * @param activityQue
     * @param ispromo
     * @param outletId
     * @param stdDisplay
     * @param plu
     */
    public Product(String id, String outletId, String marketId, String produkName, String plu, String sku, String type, String ispromo, String promo, String activityId, String activityQue, String stdDisplay, String minQty, String image, Object latlon) {
        super();
        this.id = id;
        this.outletId = outletId;
        this.marketId = marketId;
        this.produkName = produkName;
        this.plu = plu;
        this.sku = sku;
        this.type = type;
        this.ispromo = ispromo;
        this.promo = promo;
        this.activityId = activityId;
        this.activityQue = activityQue;
        this.stdDisplay = stdDisplay;
        this.minQty = minQty;
        this.image = image;
        this.latlon = latlon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product withId(String id) {
        this.id = id;
        return this;
    }

    public String getOutletId() {
        return outletId;
    }

    public void setOutletId(String outletId) {
        this.outletId = outletId;
    }

    public Product withOutletId(String outletId) {
        this.outletId = outletId;
        return this;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public Product withMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }

    public String getProdukName() {
        return produkName;
    }

    public void setProdukName(String produkName) {
        this.produkName = produkName;
    }

    public Product withProdukName(String produkName) {
        this.produkName = produkName;
        return this;
    }

    public String getPlu() {
        return plu;
    }

    public void setPlu(String plu) {
        this.plu = plu;
    }

    public Product withPlu(String plu) {
        this.plu = plu;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Product withSku(String sku) {
        this.sku = sku;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product withType(String type) {
        this.type = type;
        return this;
    }

    public String getIspromo() {
        return ispromo;
    }

    public void setIspromo(String ispromo) {
        this.ispromo = ispromo;
    }

    public Product withIspromo(String ispromo) {
        this.ispromo = ispromo;
        return this;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public Product withPromo(String promo) {
        this.promo = promo;
        return this;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Product withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    public String getActivityQue() {
        return activityQue;
    }

    public void setActivityQue(String activityQue) {
        this.activityQue = activityQue;
    }

    public Product withActivityQue(String activityQue) {
        this.activityQue = activityQue;
        return this;
    }

    public String getStdDisplay() {
        return stdDisplay;
    }

    public void setStdDisplay(String stdDisplay) {
        this.stdDisplay = stdDisplay;
    }

    public Product withStdDisplay(String stdDisplay) {
        this.stdDisplay = stdDisplay;
        return this;
    }

    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(String minQty) {
        this.minQty = minQty;
    }

    public Product withMinQty(String minQty) {
        this.minQty = minQty;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product withImage(String image) {
        this.image = image;
        return this;
    }

    public Object getLatlon() {
        return latlon;
    }

    public void setLatlon(Object latlon) {
        this.latlon = latlon;
    }

    public Product withLatlon(Object latlon) {
        this.latlon = latlon;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(outletId);
        dest.writeValue(marketId);
        dest.writeValue(produkName);
        dest.writeValue(plu);
        dest.writeValue(sku);
        dest.writeValue(type);
        dest.writeValue(ispromo);
        dest.writeValue(promo);
        dest.writeValue(activityId);
        dest.writeValue(activityQue);
        dest.writeValue(stdDisplay);
        dest.writeValue(minQty);
        dest.writeValue(image);
        dest.writeValue(latlon);
    }

    public int describeContents() {
        return  0;
    }

}
