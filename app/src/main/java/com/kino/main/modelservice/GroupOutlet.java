
package com.kino.main.modelservice;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupOutlet implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("market_id")
    @Expose
    private String marketId;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("outlet")
    @Expose
    private List<Outlet> outlet = null;
    public final static Creator<GroupOutlet> CREATOR = new Creator<GroupOutlet>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GroupOutlet createFromParcel(Parcel in) {
            return new GroupOutlet(in);
        }

        public GroupOutlet[] newArray(int size) {
            return (new GroupOutlet[size]);
        }

    }
    ;
    private final static long serialVersionUID = 5183298204979298791L;

    protected GroupOutlet(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.marketId = ((String) in.readValue((String.class.getClassLoader())));
        this.nama = ((String) in.readValue((String.class.getClassLoader())));
        this.alamat = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.outlet, (com.kino.main.modelservice.Outlet.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public GroupOutlet() {
    }

    /**
     * 
     * @param marketId
     * @param id
     * @param outlet
     * @param nama
     * @param alamat
     */
    public GroupOutlet(String id, String marketId, String nama, String alamat, List<Outlet> outlet) {
        super();
        this.id = id;
        this.marketId = marketId;
        this.nama = nama;
        this.alamat = alamat;
        this.outlet = outlet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupOutlet withId(String id) {
        this.id = id;
        return this;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public GroupOutlet withMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public GroupOutlet withNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public GroupOutlet withAlamat(String alamat) {
        this.alamat = alamat;
        return this;
    }

    public List<Outlet> getOutlet() {
        return outlet;
    }

    public void setOutlet(List<Outlet> outlet) {
        this.outlet = outlet;
    }

    public GroupOutlet withOutlet(List<Outlet> outlet) {
        this.outlet = outlet;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(marketId);
        dest.writeValue(nama);
        dest.writeValue(alamat);
        dest.writeList(outlet);
    }

    public int describeContents() {
        return  0;
    }

}
