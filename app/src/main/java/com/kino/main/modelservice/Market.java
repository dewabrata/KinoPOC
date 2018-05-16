
package com.kino.main.modelservice;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Market implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("master_market")
    @Expose
    private MasterMarket masterMarket;
    public final static Creator<Market> CREATOR = new Creator<Market>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Market createFromParcel(Parcel in) {
            return new Market(in);
        }

        public Market[] newArray(int size) {
            return (new Market[size]);
        }

    }
    ;
    private final static long serialVersionUID = 5565618154686713289L;

    protected Market(Parcel in) {
        this.status = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.masterMarket = ((MasterMarket) in.readValue((MasterMarket.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Market() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param masterMarket
     */
    public Market(boolean status, String message, MasterMarket masterMarket) {
        super();
        this.status = status;
        this.message = message;
        this.masterMarket = masterMarket;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Market withStatus(boolean status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Market withMessage(String message) {
        this.message = message;
        return this;
    }

    public MasterMarket getMasterMarket() {
        return masterMarket;
    }

    public void setMasterMarket(MasterMarket masterMarket) {
        this.masterMarket = masterMarket;
    }

    public Market withMasterMarket(MasterMarket masterMarket) {
        this.masterMarket = masterMarket;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(message);
        dest.writeValue(masterMarket);
    }

    public int describeContents() {
        return  0;
    }

}
