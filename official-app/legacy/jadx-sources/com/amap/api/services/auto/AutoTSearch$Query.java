package com.amap.api.services.auto;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class AutoTSearch$Query implements Parcelable, Cloneable {
    public static final Parcelable.Creator<AutoTSearch$Query> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f933c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f934e;
    private int f;
    private int g;
    private boolean h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f935j;
    private LatLonPoint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f936l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AutoTSearch$FilterBox f937n;
    private String o;
    private String p;

    public static class a implements Parcelable.Creator<AutoTSearch$Query> {
        public static AutoTSearch$Query a(Parcel parcel) {
            return new AutoTSearch$Query(parcel);
        }

        public static AutoTSearch$Query[] b(int i) {
            return new AutoTSearch$Query[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AutoTSearch$Query createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AutoTSearch$Query[] newArray(int i) {
            return b(i);
        }
    }

    public AutoTSearch$Query() {
        this.h = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccessKey() {
        return this.o;
    }

    public String getAdCode() {
        return this.a;
    }

    public String getCity() {
        return this.b;
    }

    public String getDataType() {
        return this.f933c;
    }

    public AutoTSearch$FilterBox getFilterBox() {
        return this.f937n;
    }

    public String getGeoObj() {
        return this.d;
    }

    public String getKeywords() {
        return this.f934e;
    }

    public LatLonPoint getLatLonPoint() {
        return this.k;
    }

    public int getPageNum() {
        return this.f;
    }

    public int getPageSize() {
        return this.g;
    }

    public String getQueryType() {
        return this.i;
    }

    public int getRange() {
        return this.f935j;
    }

    public String getSecretKey() {
        return this.p;
    }

    public String getUserCity() {
        return this.m;
    }

    public String getUserLoc() {
        return this.f936l;
    }

    public boolean isQii() {
        return this.h;
    }

    public void setAccessKey(String str) {
        this.o = str;
    }

    public void setAdCode(String str) {
        this.a = str;
    }

    public void setCity(String str) {
        this.b = str;
    }

    public void setDataType(String str) {
        this.f933c = str;
    }

    public void setFilterBox(AutoTSearch$FilterBox autoTSearch$FilterBox) {
        this.f937n = autoTSearch$FilterBox;
    }

    public void setGeoObj(String str) {
        this.d = str;
    }

    public void setKeywords(String str) {
        this.f934e = str;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.k = latLonPoint;
    }

    public void setPageNum(int i) {
        this.f = i;
    }

    public void setPageSize(int i) {
        this.g = i;
    }

    public void setQii(boolean z) {
        this.h = z;
    }

    public void setQueryType(String str) {
        this.i = str;
    }

    public void setRange(int i) {
        this.f935j = i;
    }

    public void setSecretKey(String str) {
        this.p = str;
    }

    public void setUserCity(String str) {
        this.m = str;
    }

    public void setUserLoc(String str) {
        this.f936l = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f933c);
        parcel.writeString(this.d);
        parcel.writeString(this.f934e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.i);
        parcel.writeInt(this.f935j);
        parcel.writeParcelable(this.k, i);
        parcel.writeString(this.f936l);
        parcel.writeString(this.m);
        parcel.writeParcelable(this.f937n, i);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AutoTSearch$Query m4483clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
        }
        AutoTSearch$Query autoTSearch$Query = new AutoTSearch$Query();
        autoTSearch$Query.setAdCode(this.a);
        autoTSearch$Query.setCity(this.b);
        autoTSearch$Query.setDataType(this.f933c);
        autoTSearch$Query.setGeoObj(this.d);
        autoTSearch$Query.setKeywords(this.f934e);
        autoTSearch$Query.setPageNum(this.f);
        autoTSearch$Query.setPageSize(this.g);
        autoTSearch$Query.setQii(this.h);
        autoTSearch$Query.setQueryType(this.i);
        autoTSearch$Query.setRange(this.f935j);
        autoTSearch$Query.setLatLonPoint(this.k);
        autoTSearch$Query.setUserLoc(this.f936l);
        autoTSearch$Query.setUserCity(this.m);
        autoTSearch$Query.setAccessKey(this.o);
        autoTSearch$Query.setSecretKey(this.p);
        autoTSearch$Query.setFilterBox(this.f937n);
        return autoTSearch$Query;
    }

    public AutoTSearch$Query(Parcel parcel) {
        this.h = false;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f933c = parcel.readString();
        this.d = parcel.readString();
        this.f934e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readByte() != 0;
        this.i = parcel.readString();
        this.f935j = parcel.readInt();
        this.k = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f936l = parcel.readString();
        this.m = parcel.readString();
        this.f937n = (AutoTSearch$FilterBox) parcel.readParcelable(AutoTSearch$FilterBox.class.getClassLoader());
        this.o = parcel.readString();
        this.p = parcel.readString();
    }
}
