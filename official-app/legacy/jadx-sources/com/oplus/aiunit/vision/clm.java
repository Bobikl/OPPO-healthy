package com.oplus.aiunit.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public final class clm implements Parcelable.Creator<com.appaac.haptic.sync.b> {
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.appaac.haptic.sync.b createFromParcel(Parcel parcel) {
        return new com.appaac.haptic.sync.b(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.appaac.haptic.sync.b[] newArray(int i) {
        return new com.appaac.haptic.sync.b[i];
    }
}
