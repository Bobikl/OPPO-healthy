package com.oplus.aiunit.vision;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes15.dex */
public class l4g {
    public static <T> zn0<T> a(LifecycleOwner lifecycleOwner) {
        return un0.b(s20.i(lifecycleOwner));
    }

    public static <T> zn0<T> b(LifecycleOwner lifecycleOwner) {
        return un0.b(s20.j(lifecycleOwner, Lifecycle.Event.ON_DESTROY));
    }
}
