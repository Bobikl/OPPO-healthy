package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.qxm;

/* JADX INFO: loaded from: classes12.dex */
public class DistrictSearchQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<DistrictSearchQuery> CREATOR = new a();
    public static final String KEYWORDS_BUSINESS = "biz_area";
    public static final String KEYWORDS_CITY = "city";
    public static final String KEYWORDS_COUNTRY = "country";
    public static final String KEYWORDS_DISTRICT = "district";
    public static final String KEYWORDS_PROVINCE = "province";
    private int a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f962c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f963e;
    private boolean f;
    private boolean g;
    private int h;

    public static class a implements Parcelable.Creator<DistrictSearchQuery> {
        public static DistrictSearchQuery a(Parcel parcel) {
            DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
            districtSearchQuery.setKeywords(parcel.readString());
            districtSearchQuery.setKeywordsLevel(parcel.readString());
            districtSearchQuery.setPageNum(parcel.readInt());
            districtSearchQuery.setPageSize(parcel.readInt());
            districtSearchQuery.setShowChild(parcel.readByte() == 1);
            districtSearchQuery.setShowBoundary(parcel.readByte() == 1);
            districtSearchQuery.setShowBusinessArea(parcel.readByte() == 1);
            districtSearchQuery.setSubDistrict(parcel.readInt());
            return districtSearchQuery;
        }

        public static DistrictSearchQuery[] b(int i) {
            return new DistrictSearchQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictSearchQuery createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictSearchQuery[] newArray(int i) {
            return b(i);
        }
    }

    public DistrictSearchQuery() {
        this.a = 1;
        this.b = 20;
        this.f963e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
    }

    public boolean checkKeyWords() {
        String str = this.f962c;
        return (str == null || str.trim().equalsIgnoreCase("")) ? false : true;
    }

    public boolean checkLevels() {
        String str = this.d;
        if (str == null) {
            return false;
        }
        return str.trim().equals("country") || this.d.trim().equals(KEYWORDS_PROVINCE) || this.d.trim().equals(KEYWORDS_CITY) || this.d.trim().equals(KEYWORDS_DISTRICT) || this.d.trim().equals(KEYWORDS_BUSINESS);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictSearchQuery districtSearchQuery = (DistrictSearchQuery) obj;
        if (this.g != districtSearchQuery.g) {
            return false;
        }
        String str = this.f962c;
        if (str == null) {
            if (districtSearchQuery.f962c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.f962c)) {
            return false;
        }
        return this.a == districtSearchQuery.a && this.b == districtSearchQuery.b && this.f963e == districtSearchQuery.f963e && this.h == districtSearchQuery.h;
    }

    public String getKeywords() {
        return this.f962c;
    }

    public String getKeywordsLevel() {
        return this.d;
    }

    public int getPageNum() {
        int i = this.a;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public int getPageSize() {
        return this.b;
    }

    public int getSubDistrict() {
        return this.h;
    }

    public int hashCode() {
        int i = ((this.g ? 1231 : 1237) + 31) * 31;
        String str = this.f962c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.a) * 31) + this.b) * 31) + (this.f963e ? 1231 : 1237)) * 31) + this.h;
    }

    public boolean isShowBoundary() {
        return this.g;
    }

    public boolean isShowBusinessArea() {
        return this.f;
    }

    public boolean isShowChild() {
        return this.f963e;
    }

    public void setKeywords(String str) {
        this.f962c = str;
    }

    public void setKeywordsLevel(String str) {
        this.d = str;
    }

    public void setPageNum(int i) {
        this.a = i;
    }

    public void setPageSize(int i) {
        this.b = i;
    }

    public void setShowBoundary(boolean z) {
        this.g = z;
    }

    public void setShowBusinessArea(boolean z) {
        this.f = z;
    }

    public void setShowChild(boolean z) {
        this.f963e = z;
    }

    public void setSubDistrict(int i) {
        this.h = i;
    }

    public boolean weakEquals(DistrictSearchQuery districtSearchQuery) {
        if (this == districtSearchQuery) {
            return true;
        }
        if (districtSearchQuery == null) {
            return false;
        }
        String str = this.f962c;
        if (str == null) {
            if (districtSearchQuery.f962c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.f962c)) {
            return false;
        }
        return this.b == districtSearchQuery.b && this.f963e == districtSearchQuery.f963e && this.g == districtSearchQuery.g && this.h == districtSearchQuery.h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f962c);
        parcel.writeString(this.d);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeByte(this.f963e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.h);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DistrictSearchQuery m4484clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            qxm.g(e2, "DistrictSearchQuery", "clone");
        }
        DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
        districtSearchQuery.setKeywords(this.f962c);
        districtSearchQuery.setKeywordsLevel(this.d);
        districtSearchQuery.setPageNum(this.a);
        districtSearchQuery.setPageSize(this.b);
        districtSearchQuery.setShowChild(this.f963e);
        districtSearchQuery.setSubDistrict(this.h);
        districtSearchQuery.setShowBoundary(this.g);
        districtSearchQuery.setShowBusinessArea(this.f);
        return districtSearchQuery;
    }

    public DistrictSearchQuery(String str, String str2, int i) {
        this.b = 20;
        this.f963e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
        this.f962c = str;
        this.d = str2;
        this.a = i;
    }

    public DistrictSearchQuery(String str, String str2, int i, boolean z, int i2) {
        this(str, str2, i);
        this.f963e = z;
        this.b = i2;
    }
}
