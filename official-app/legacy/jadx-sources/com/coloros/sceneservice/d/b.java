package com.coloros.sceneservice.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneExpressageData;

/* JADX INFO: loaded from: classes13.dex */
public class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public SceneExpressageData createFromParcel(Parcel parcel) {
        return new SceneExpressageData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public SceneExpressageData[] newArray(int i) {
        return new SceneExpressageData[i];
    }
}
