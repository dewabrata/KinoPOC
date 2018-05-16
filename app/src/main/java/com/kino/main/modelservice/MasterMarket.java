
package com.kino.main.modelservice;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MasterMarket implements Serializable, Parcelable
{

    @SerializedName("all_market")
    @Expose
    private List<AllMarket> allMarket = null;
    public final static Creator<MasterMarket> CREATOR = new Creator<MasterMarket>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MasterMarket createFromParcel(Parcel in) {
            return new MasterMarket(in);
        }

        public MasterMarket[] newArray(int size) {
            return (new MasterMarket[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3203743262130526295L;

    protected MasterMarket(Parcel in) {
        in.readList(this.allMarket, (AllMarket.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public MasterMarket() {
    }

    /**
     * 
     * @param allMarket
     */
    public MasterMarket(List<AllMarket> allMarket) {
        super();
        this.allMarket = allMarket;
    }

    public List<AllMarket> getAllMarket() {
        return allMarket;
    }

    public void setAllMarket(List<AllMarket> allMarket) {
        this.allMarket = allMarket;
    }

    public MasterMarket withAllMarket(List<AllMarket> allMarket) {
        this.allMarket = allMarket;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(allMarket);
    }

    public int describeContents() {
        return  0;
    }

}
