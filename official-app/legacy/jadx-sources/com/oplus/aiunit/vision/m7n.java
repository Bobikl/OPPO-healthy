package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class m7n implements Runnable {
    public final /* synthetic */ Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13974j;
    public final /* synthetic */ q7n k;

    public m7n(q7n q7nVar, Context context, ArrayList arrayList) {
        this.k = q7nVar;
        this.i = context;
        this.f13974j = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k.c(this.i, this.f13974j, true);
    }
}
