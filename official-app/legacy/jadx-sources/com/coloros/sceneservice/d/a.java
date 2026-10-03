package com.coloros.sceneservice.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneBankData;

/* JADX INFO: loaded from: classes13.dex */
public class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public SceneBankData createFromParcel(Parcel parcel) {
        return new SceneBankData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public SceneBankData[] newArray(int i) {
        return new SceneBankData[i];
    }
}
