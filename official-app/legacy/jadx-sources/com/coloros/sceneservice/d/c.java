package com.coloros.sceneservice.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneFlightData;

/* JADX INFO: loaded from: classes13.dex */
public class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public SceneFlightData createFromParcel(Parcel parcel) {
        return new SceneFlightData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public SceneFlightData[] newArray(int i) {
        return new SceneFlightData[i];
    }
}
