package com.heytap.health.watchface.business.creation.base.custom;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;
import com.oplus.aiunit.vision.fal;

/* JADX INFO: loaded from: classes19.dex */
public class WatchFaceCustomStyleListBean<T extends WatchFaceCustomStyleListItem> extends fal<T> implements Parcelable {
    public static final Parcelable.Creator<WatchFaceCustomStyleListBean> CREATOR = new a();
    private String index;
    private boolean showBottomLine;
    private String title;
    private String type;

    public class a implements Parcelable.Creator<WatchFaceCustomStyleListBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchFaceCustomStyleListBean createFromParcel(Parcel parcel) {
            return new WatchFaceCustomStyleListBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WatchFaceCustomStyleListBean[] newArray(int i) {
            return new WatchFaceCustomStyleListBean[i];
        }
    }

    public WatchFaceCustomStyleListBean() {
        this.type = "type_square_69_69";
        this.showBottomLine = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getIndex() {
        return this.index;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public boolean isShowBottomLine() {
        return this.showBottomLine;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setShowBottomLine(boolean z) {
        this.showBottomLine = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.index);
        parcel.writeString(this.type);
        parcel.writeByte(this.showBottomLine ? (byte) 1 : (byte) 0);
    }

    public WatchFaceCustomStyleListBean(Parcel parcel) {
        this.type = "type_square_69_69";
        this.showBottomLine = true;
        this.title = parcel.readString();
        this.index = parcel.readString();
        this.type = parcel.readString();
        this.showBottomLine = parcel.readByte() != 0;
    }
}
