package com.oplus.aiunit.vision;

import android.os.AsyncTask;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes18.dex */
public abstract class dgc implements fgc {
    public final LinkedList<AsyncTask> a = new LinkedList<>();
    public final com.heytap.nearx.uikit.internal.utils.blur.a b;

    public dgc(com.heytap.nearx.uikit.internal.utils.blur.a aVar) {
        this.b = aVar;
    }

    @Override // com.oplus.aiunit.vision.fgc
    public void destroy() {
        Iterator<AsyncTask> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        this.a.clear();
    }
}
