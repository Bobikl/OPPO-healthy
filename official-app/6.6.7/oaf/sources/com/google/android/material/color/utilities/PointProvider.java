package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface PointProvider {
    double distance(double[] dArr, double[] dArr2);

    double[] fromInt(int i);

    int toInt(double[] dArr);
}
