package com.coloros.sceneservice.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneTrainData;

/* JADX INFO: loaded from: classes13.dex */
public class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public SceneTrainData createFromParcel(Parcel parcel) {
        return new SceneTrainData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public SceneTrainData[] newArray(int i) {
        return new SceneTrainData[i];
    }
}
