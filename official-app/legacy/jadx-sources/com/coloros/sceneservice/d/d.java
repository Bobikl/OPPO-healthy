package com.coloros.sceneservice.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneHotelData;

/* JADX INFO: loaded from: classes13.dex */
public class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public SceneHotelData createFromParcel(Parcel parcel) {
        return new SceneHotelData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public SceneHotelData[] newArray(int i) {
        return new SceneHotelData[i];
    }
}
