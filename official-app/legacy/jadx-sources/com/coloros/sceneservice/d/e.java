package com.coloros.sceneservice.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneMovieData;

/* JADX INFO: loaded from: classes13.dex */
public class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public SceneMovieData createFromParcel(Parcel parcel) {
        return new SceneMovieData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public SceneMovieData[] newArray(int i) {
        return new SceneMovieData[i];
    }
}
