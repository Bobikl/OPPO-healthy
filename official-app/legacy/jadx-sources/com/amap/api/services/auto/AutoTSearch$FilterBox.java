package com.amap.api.services.auto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class AutoTSearch$FilterBox implements Parcelable, Cloneable {
    public static final Parcelable.Creator<AutoTSearch$FilterBox> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f931c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f932e;

    public static class a implements Parcelable.Creator<AutoTSearch$FilterBox> {
        public static AutoTSearch$FilterBox a(Parcel parcel) {
            return new AutoTSearch$FilterBox(parcel);
        }

        public static AutoTSearch$FilterBox[] b(int i) {
            return new AutoTSearch$FilterBox[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AutoTSearch$FilterBox createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AutoTSearch$FilterBox[] newArray(int i) {
            return b(i);
        }
    }

    public AutoTSearch$FilterBox() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCheckedLevel() {
        return this.b;
    }

    public String getClassifyV2Data() {
        return this.f931c;
    }

    public String getClassifyV2Level2Data() {
        return this.d;
    }

    public String getClassifyV2Level3Data() {
        return this.f932e;
    }

    public String getRetainState() {
        return this.a;
    }

    public void setCheckedLevel(String str) {
        this.b = str;
    }

    public void setClassifyV2Data(String str) {
        this.f931c = str;
    }

    public void setClassifyV2Level2Data(String str) {
        this.d = str;
    }

    public void setClassifyV2Level3Data(String str) {
        this.f932e = str;
    }

    public void setRetainState(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f931c);
        parcel.writeString(this.d);
        parcel.writeString(this.f932e);
    }

    public AutoTSearch$FilterBox(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f931c = parcel.readString();
        this.d = parcel.readString();
        this.f932e = parcel.readString();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AutoTSearch$FilterBox m4482clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
        }
        AutoTSearch$FilterBox autoTSearch$FilterBox = new AutoTSearch$FilterBox();
        autoTSearch$FilterBox.setRetainState(this.a);
        autoTSearch$FilterBox.setCheckedLevel(this.b);
        autoTSearch$FilterBox.setClassifyV2Data(this.f931c);
        autoTSearch$FilterBox.setClassifyV2Level2Data(this.d);
        autoTSearch$FilterBox.setClassifyV2Level3Data(this.f932e);
        return autoTSearch$FilterBox;
    }
}
