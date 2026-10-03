package com.oplus.aiunit.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.mini.result.QueryVendorPayStatusResult;

/* JADX INFO: loaded from: classes10.dex */
public final class o6f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final QueryVendorPayStatusResult createFromParcel(Parcel parcel) {
        return new QueryVendorPayStatusResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final QueryVendorPayStatusResult[] newArray(int i) {
        return new QueryVendorPayStatusResult[i];
    }
}
