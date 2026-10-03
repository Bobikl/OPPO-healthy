package com.oplus.aiunit.vision;

import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public abstract class n5h implements View.OnClickListener {
    public long i;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.i) > 1000) {
            a(view);
            this.i = jCurrentTimeMillis;
        }
    }
}
