package com.heytap.health.watchface.business.creation.category.classic.bean;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.ge3;
import com.oplus.aiunit.vision.i11;
import com.oplus.aiunit.vision.kd3;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class SubSeriesBean implements Parcelable {
    public static final Parcelable.Creator<SubSeriesBean> CREATOR = new a();

    @SerializedName("isSelected")
    private boolean isSelected;

    @SerializedName("preview")
    private String previewFileName;

    @SerializedName("classicDial")
    private ClassicStyleBean styleBean;

    @SerializedName("title")
    private String title;
    private transient Bitmap watchFaceBitmap;

    public class a implements Parcelable.Creator<SubSeriesBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SubSeriesBean createFromParcel(Parcel parcel) {
            return new SubSeriesBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SubSeriesBean[] newArray(int i) {
            return new SubSeriesBean[i];
        }
    }

    public SubSeriesBean(Parcel parcel) {
        this.title = parcel.readString();
        this.isSelected = parcel.readByte() != 0;
        this.previewFileName = parcel.readString();
        this.styleBean = (ClassicStyleBean) parcel.readParcelable(ClassicStyleBean.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPreviewFileName() {
        return this.previewFileName;
    }

    public ClassicStyleBean getStyleBean() {
        return this.styleBean;
    }

    public String getTitle() {
        return this.title;
    }

    public Bitmap getWatchFaceBitmap(i11 i11Var) {
        if (this.watchFaceBitmap == null) {
            if (!TextUtils.isEmpty(this.previewFileName)) {
                this.watchFaceBitmap = kd3.a(i11Var, this.previewFileName);
            }
            if (this.watchFaceBitmap == null) {
                this.watchFaceBitmap = ge3.a(i11Var, this.styleBean);
            }
        }
        return this.watchFaceBitmap;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setPreviewFileName(String str) {
        this.previewFileName = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setStyleBean(ClassicStyleBean classicStyleBean) {
        this.styleBean = classicStyleBean;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "SubSeriesBean{title='" + this.title + "', isSelected=" + this.isSelected + ", styleBean=" + this.styleBean + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        parcel.writeString(this.previewFileName);
        parcel.writeParcelable(this.styleBean, i);
    }
}
