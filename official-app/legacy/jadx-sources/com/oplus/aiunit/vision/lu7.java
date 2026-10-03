package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;

/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class lu7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BackpressureOverflowStrategy.values().length];
        a = iArr;
        try {
            iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
