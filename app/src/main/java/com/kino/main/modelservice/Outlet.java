
package com.kino.main.modelservice;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Outlet implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("group_outlet")
    @Expose
    private String groupOutlet;
    @SerializedName("outlet_name")
    @Expose
    private String outletName;
    @SerializedName("market_id")
    @Expose
    private String marketId;
    @SerializedName("market_city")
    @Expose
    private String marketCity;
    @SerializedName("market_address")
    @Expose
    private String marketAddress;
    public final static Creator<Outlet> CREATOR = new Creator<Outlet>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Outlet createFromParcel(Parcel in) {
            return new Outlet(in);
        }

        public Outlet[] newArray(int size) {
            return (new Outlet[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6922104054281064220L;

    protected Outlet(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.groupOutlet = ((String) in.readValue((String.class.getClassLoader())));
        this.outletName = ((String) in.readValue((String.class.getClassLoader())));
        this.marketId = ((String) in.readValue((String.class.getClassLoader())));
        this.marketCity = ((String) in.readValue((String.class.getClassLoader())));
        this.marketAddress = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Outlet() {
    }

    /**
     * 
     * @param marketId
     * @param id
     * @param marketAddress
     * @param outletName
     * @param marketCity
     * @param groupOutlet
     */
    public Outlet(String id, String groupOutlet, String outletName, String marketId, String marketCity, String marketAddress) {
        super();
        this.id = id;
        this.groupOutlet = groupOutlet;
        this.outletName = outletName;
        this.marketId = marketId;
        this.marketCity = marketCity;
        this.marketAddress = marketAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Outlet withId(String id) {
        this.id = id;
        return this;
    }

    public String getGroupOutlet() {
        return groupOutlet;
    }

    public void setGroupOutlet(String groupOutlet) {
        this.groupOutlet = groupOutlet;
    }

    public Outlet withGroupOutlet(String groupOutlet) {
        this.groupOutlet = groupOutlet;
        return this;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public Outlet withOutletName(String outletName) {
        this.outletName = outletName;
        return this;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public Outlet withMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }

    public String getMarketCity() {
        return marketCity;
    }

    public void setMarketCity(String marketCity) {
        this.marketCity = marketCity;
    }

    public Outlet withMarketCity(String marketCity) {
        this.marketCity = marketCity;
        return this;
    }

    public String getMarketAddress() {
        return marketAddress;
    }

    public void setMarketAddress(String marketAddress) {
        this.marketAddress = marketAddress;
    }

    public Outlet withMarketAddress(String marketAddress) {
        this.marketAddress = marketAddress;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(groupOutlet);
        dest.writeValue(outletName);
        dest.writeValue(marketId);
        dest.writeValue(marketCity);
        dest.writeValue(marketAddress);
    }

    public int describeContents() {
        return  0;
    }

}
