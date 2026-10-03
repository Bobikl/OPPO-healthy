package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.JsonWriter$OutputType;

/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class qma {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonWriter$OutputType.values().length];
        a = iArr;
        try {
            iArr[JsonWriter$OutputType.minimal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[JsonWriter$OutputType.javascript.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
