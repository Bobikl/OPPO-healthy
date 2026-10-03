package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public abstract class kym<T, V> extends lxm<T, V> {
    public kym(Context context, T t) {
        super(context, t);
    }

    public static boolean t(String str) {
        return str == null || str.equals("") || str.equals("[]");
    }
}
