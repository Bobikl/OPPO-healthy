package com.heytap.health.watchface.business.creation.category.classic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ClassicCommonBean implements Parcelable {
    public static final Parcelable.Creator<ClassicCommonBean> CREATOR = new a();
    private String id;

    public class a implements Parcelable.Creator<ClassicCommonBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassicCommonBean createFromParcel(Parcel parcel) {
            return new ClassicCommonBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClassicCommonBean[] newArray(int i) {
            return new ClassicCommonBean[i];
        }
    }

    public ClassicCommonBean(Parcel parcel) {
        this.id = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String toString() {
        return "ClassicCommonBean{id='" + this.id + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
    }
}
