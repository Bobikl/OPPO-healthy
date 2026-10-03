package com.oplus.aiunit.vision;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public abstract class xsc implements View.OnClickListener {
    public int i = 500;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f18748j = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f18748j > this.i) {
            this.f18748j = timeInMillis;
            a(view);
        }
    }
}
