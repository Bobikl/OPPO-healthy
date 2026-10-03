package com.heytap.health.watchface.business.creation.category.classic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ClassicWidgetBean implements Parcelable {
    public static final Parcelable.Creator<ClassicWidgetBean> CREATOR = new a();
    private String id;
    private int position;
    private String type;

    public class a implements Parcelable.Creator<ClassicWidgetBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassicWidgetBean createFromParcel(Parcel parcel) {
            return new ClassicWidgetBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClassicWidgetBean[] newArray(int i) {
            return new ClassicWidgetBean[i];
        }
    }

    public ClassicWidgetBean(String str, int i, String str2) {
        this.id = str;
        this.position = i;
        this.type = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.id;
    }

    public int getPosition() {
        return this.position;
    }

    public String getType() {
        return this.type;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "ClassicWidgetBean{id='" + this.id + "', position=" + this.position + ", type=" + this.type + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.position);
        parcel.writeString(this.type);
    }

    public ClassicWidgetBean(Parcel parcel) {
        this.id = parcel.readString();
        this.position = parcel.readInt();
        this.type = parcel.readString();
    }
}
