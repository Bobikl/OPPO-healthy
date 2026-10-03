package com.heytap.health.watchface.business.creation.category.classic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ClassicStyleBean implements Parcelable {
    public static final Parcelable.Creator<ClassicStyleBean> CREATOR = new a();

    @SerializedName("background")
    private String background;

    @SerializedName("pointer")
    private String pointer;

    @SerializedName("scale")
    private String scale;

    @SerializedName("seriesId")
    private String seriesId;

    @SerializedName("widgets")
    private List<ClassicWidgetBean> widgetBeans;

    @SerializedName("widgetId")
    private String widgetId;

    public class a implements Parcelable.Creator<ClassicStyleBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassicStyleBean createFromParcel(Parcel parcel) {
            return new ClassicStyleBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClassicStyleBean[] newArray(int i) {
            return new ClassicStyleBean[i];
        }
    }

    public ClassicStyleBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBackground() {
        return this.background;
    }

    public String getPointer() {
        return this.pointer;
    }

    public String getScale() {
        return this.scale;
    }

    public String getSeriesId() {
        return this.seriesId;
    }

    public List<ClassicWidgetBean> getWidgetBeans() {
        return this.widgetBeans;
    }

    public String getWidgetId() {
        return this.widgetId;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setPointer(String str) {
        this.pointer = str;
    }

    public void setScale(String str) {
        this.scale = str;
    }

    public void setSeriesId(String str) {
        this.seriesId = str;
    }

    public void setWidgetBeans(List<ClassicWidgetBean> list) {
        this.widgetBeans = list;
    }

    public void setWidgetId(String str) {
        this.widgetId = str;
    }

    public String toString() {
        return "ClassicStyleBean{, seriesId='" + this.seriesId + "', background='" + this.background + "', pointer=" + this.pointer + ", scale=" + this.scale + ", widgetId=" + this.widgetId + ", widgetBeans=" + this.widgetBeans + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.seriesId);
        parcel.writeString(this.background);
        parcel.writeString(this.pointer);
        parcel.writeString(this.scale);
        parcel.writeString(this.widgetId);
        parcel.writeTypedList(this.widgetBeans);
    }

    public ClassicStyleBean(Parcel parcel) {
        this.seriesId = parcel.readString();
        this.background = parcel.readString();
        this.pointer = parcel.readString();
        this.scale = parcel.readString();
        this.widgetId = parcel.readString();
        this.widgetBeans = parcel.createTypedArrayList(ClassicWidgetBean.CREATOR);
    }
}
