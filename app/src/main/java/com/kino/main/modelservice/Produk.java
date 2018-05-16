
package com.kino.main.modelservice;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Produk implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("produkall")
    @Expose
    private Produkall produkall;
    public final static Creator<Produk> CREATOR = new Creator<Produk>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Produk createFromParcel(Parcel in) {
            return new Produk(in);
        }

        public Produk[] newArray(int size) {
            return (new Produk[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1771411530968642883L;

    protected Produk(Parcel in) {
        this.status = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.produkall = ((Produkall) in.readValue((Produkall.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Produk() {
    }

    /**
     * 
     * @param message
     * @param produkall
     * @param status
     */
    public Produk(boolean status, String message, Produkall produkall) {
        super();
        this.status = status;
        this.message = message;
        this.produkall = produkall;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Produk withStatus(boolean status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Produk withMessage(String message) {
        this.message = message;
        return this;
    }

    public Produkall getProdukall() {
        return produkall;
    }

    public void setProdukall(Produkall produkall) {
        this.produkall = produkall;
    }

    public Produk withProdukall(Produkall produkall) {
        this.produkall = produkall;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(message);
        dest.writeValue(produkall);
    }

    public int describeContents() {
        return  0;
    }

}
