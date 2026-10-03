package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class CloudItem implements Parcelable {
    public static final Parcelable.Creator<CloudItem> CREATOR = new a();
    private String a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f946c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, String> f947e;
    private List<CloudImage> f;
    protected final LatLonPoint mPoint;
    protected final String mSnippet;
    protected final String mTitle;

    public static class a implements Parcelable.Creator<CloudItem> {
        public static CloudItem a(Parcel parcel) {
            return new CloudItem(parcel);
        }

        public static CloudItem[] b(int i) {
            return new CloudItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudItem[] newArray(int i) {
            return b(i);
        }
    }

    public CloudItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.b = -1;
        this.a = str;
        this.mPoint = latLonPoint;
        this.mTitle = str2;
        this.mSnippet = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudItem)) {
            return false;
        }
        CloudItem cloudItem = (CloudItem) obj;
        String str = this.a;
        if (str == null) {
            if (cloudItem.a != null) {
                return false;
            }
        } else if (!str.equals(cloudItem.a)) {
            return false;
        }
        return true;
    }

    public List<CloudImage> getCloudImage() {
        return this.f;
    }

    public String getCreatetime() {
        return this.f946c;
    }

    public HashMap<String, String> getCustomfield() {
        return this.f947e;
    }

    public int getDistance() {
        return this.b;
    }

    public String getID() {
        return this.a;
    }

    public LatLonPoint getLatLonPoint() {
        return this.mPoint;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUpdatetime() {
        return this.d;
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public void setCreatetime(String str) {
        this.f946c = str;
    }

    public void setCustomfield(HashMap<String, String> map) {
        this.f947e = map;
    }

    public void setDistance(int i) {
        this.b = i;
    }

    public void setUpdatetime(String str) {
        this.d = str;
    }

    public void setmCloudImage(List<CloudImage> list) {
        this.f = list;
    }

    public String toString() {
        return this.mTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeValue(this.mPoint);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mSnippet);
        parcel.writeString(this.f946c);
        parcel.writeString(this.d);
        parcel.writeMap(this.f947e);
        parcel.writeList(this.f);
    }

    public CloudItem(Parcel parcel) {
        this.b = -1;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.mPoint = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.mTitle = parcel.readString();
        this.mSnippet = parcel.readString();
        this.f946c = parcel.readString();
        this.d = parcel.readString();
        HashMap<String, String> map = new HashMap<>();
        this.f947e = map;
        parcel.readMap(map, HashMap.class.getClassLoader());
        List arrayList = new ArrayList();
        this.f = arrayList;
        parcel.readList(arrayList, getClass().getClassLoader());
    }
}
