package com.oplus.aiunit.vision;

import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public abstract class m5h implements View.OnClickListener {
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f13953j = 1000;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.i) > this.f13953j) {
            a(view);
            this.i = jCurrentTimeMillis;
        }
    }
}
