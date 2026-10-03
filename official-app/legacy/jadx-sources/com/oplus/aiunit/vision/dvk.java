package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class dvk {
    public static final int FAIL_STATUS = 3;
    public static final int SUCCESS_STATUS = 2;
    public static final String TAG = "VersionQuery";
    public final ThreadPoolExecutor a;

    public static class b {
        public static final dvk a = new dvk();
    }

    public static dvk a() {
        return b.a;
    }

    public void b(Context context, ISplitUpdateManager iSplitUpdateManager, k6f k6fVar) {
        this.a.execute(new nfc(context, null));
        this.a.execute(new anc(context, iSplitUpdateManager, k6fVar));
    }

    public void c(Context context, ISplitUpdateManager iSplitUpdateManager, k6f k6fVar) {
        nfc nfcVar = new nfc(context, null);
        anc ancVar = new anc(context, iSplitUpdateManager, k6fVar);
        nfcVar.run();
        ancVar.run();
    }

    public dvk() {
        this.a = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b8i());
    }
}
