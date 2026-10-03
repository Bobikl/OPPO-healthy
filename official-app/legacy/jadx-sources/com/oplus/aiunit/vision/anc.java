package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.oms.split.full.splitdownload.DownloadUtil;
import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;

/* JADX INFO: loaded from: classes8.dex */
public class anc extends n81 {
    public final ISplitUpdateManager m;

    public anc(Context context, ISplitUpdateManager iSplitUpdateManager, k6f k6fVar) {
        super(context, k6fVar);
        this.m = iSplitUpdateManager;
    }

    @Override // com.oplus.aiunit.vision.n81
    public void d() {
        if (!qpc.c(this.f14390j)) {
            w7i.e("NetQuery", "net work is unavailable", new Object[0]);
            c(3);
            return;
        }
        if (this.m == null) {
            w7i.e("NetQuery", "download is null", new Object[0]);
            c(3);
            return;
        }
        if ((((long) qpc.b()) * 3600000) + this.m.getLastUpdateTime() >= System.currentTimeMillis()) {
            w7i.i("NetQuery", "queryFromNet no time to update", new Object[0]);
            c(2);
            return;
        }
        if (this.m.queryVersionFromCloud(this.f14390j, DownloadUtil.queryAllRequests(this.f14390j), false)) {
            c(2);
        } else {
            c(3);
        }
    }
}
