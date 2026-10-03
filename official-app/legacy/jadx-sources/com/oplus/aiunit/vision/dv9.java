package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public abstract class dv9 {
    public WeakReference<Context> a;
    public View b;

    public dv9(Context context) {
        this.a = new WeakReference<>(context);
    }

    public abstract kde a();
}
