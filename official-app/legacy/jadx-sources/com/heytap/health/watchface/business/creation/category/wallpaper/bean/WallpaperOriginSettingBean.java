package com.heytap.health.watchface.business.creation.category.wallpaper.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean;

/* JADX INFO: loaded from: classes19.dex */
public class WallpaperOriginSettingBean extends WatchFaceCustomStyleListBean {
    public static final Parcelable.Creator<WallpaperOriginSettingBean> CREATOR = new a();
    private String originPath;

    public class a implements Parcelable.Creator<WallpaperOriginSettingBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WallpaperOriginSettingBean createFromParcel(Parcel parcel) {
            return new WallpaperOriginSettingBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WallpaperOriginSettingBean[] newArray(int i) {
            return new WallpaperOriginSettingBean[i];
        }
    }

    public WallpaperOriginSettingBean() {
    }

    @Override // com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOriginPath() {
        return this.originPath;
    }

    public void setOriginPath(String str) {
        this.originPath = str;
    }

    @Override // com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.originPath);
    }

    public WallpaperOriginSettingBean(Parcel parcel) {
        super(parcel);
        parcel.readString();
    }
}
