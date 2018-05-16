
package com.kino.main.modelservice;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllMarket implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("market_name")
    @Expose
    private String marketName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("desciption")
    @Expose
    private String desciption;
    @SerializedName("group_outlet")
    @Expose
    private List<GroupOutlet> groupOutlet = null;
    public final static Parcelable.Creator<AllMarket> CREATOR = new Creator<AllMarket>() {


        @SuppressWarnings({
                "unchecked"
        })
        public AllMarket createFromParcel(Parcel in) {
            return new AllMarket(in);
        }

        public AllMarket[] newArray(int size) {
            return (new AllMarket[size]);
        }

    }
            ;
    private final static long serialVersionUID = 4287035869609317708L;

    protected AllMarket(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.marketName = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.desciption = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.groupOutlet, (com.kino.main.modelservice.GroupOutlet.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public AllMarket() {
    }

    /**
     *
     * @param id
     * @param desciption
     * @param marketName
     * @param image
     * @param groupOutlet
     */
    public AllMarket(String id, String marketName, String image, String desciption, List<GroupOutlet> groupOutlet) {
        super();
        this.id = id;
        this.marketName = marketName;
        this.image = image;
        this.desciption = desciption;
        this.groupOutlet = groupOutlet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AllMarket withId(String id) {
        this.id = id;
        return this;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public AllMarket withMarketName(String marketName) {
        this.marketName = marketName;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public AllMarket withImage(String image) {
        this.image = image;
        return this;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public AllMarket withDesciption(String desciption) {
        this.desciption = desciption;
        return this;
    }

    public List<GroupOutlet> getGroupOutlet() {
        return groupOutlet;
    }

    public void setGroupOutlet(List<GroupOutlet> groupOutlet) {
        this.groupOutlet = groupOutlet;
    }

    public AllMarket withGroupOutlet(List<GroupOutlet> groupOutlet) {
        this.groupOutlet = groupOutlet;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(marketName);
        dest.writeValue(image);
        dest.writeValue(desciption);
        dest.writeList(groupOutlet);
    }

    public int describeContents() {
        return  0;
    }

}
