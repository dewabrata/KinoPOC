
package com.kino.main.modelservice;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Produkall implements Serializable, Parcelable
{

    @SerializedName("product")
    @Expose
    private List<Product> product = null;
    public final static Creator<Produkall> CREATOR = new Creator<Produkall>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Produkall createFromParcel(Parcel in) {
            return new Produkall(in);
        }

        public Produkall[] newArray(int size) {
            return (new Produkall[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6678176386489484018L;

    protected Produkall(Parcel in) {
        in.readList(this.product, (Product.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Produkall() {
    }

    /**
     * 
     * @param product
     */
    public Produkall(List<Product> product) {
        super();
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Produkall withProduct(List<Product> product) {
        this.product = product;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(product);
    }

    public int describeContents() {
        return  0;
    }

}
