package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.drs.core.model.OTrackEvent;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public final class a66 {
    public static final ConcurrentHashMap<String, a66> b = new ConcurrentHashMap<>();
    public final e66 a;

    public a66(Context context, String str) {
        this.a = new e66(context, str);
    }

    public static a66 d(Context context, String str) {
        ConcurrentHashMap<String, a66> concurrentHashMap = b;
        a66 a66Var = concurrentHashMap.get(str);
        if (a66Var != null) {
            return a66Var;
        }
        synchronized (concurrentHashMap) {
            a66 a66Var2 = concurrentHashMap.get(str);
            if (a66Var2 != null) {
                return a66Var2;
            }
            a66 a66Var3 = new a66(context, str);
            concurrentHashMap.put(str, a66Var3);
            return a66Var3;
        }
    }

    public void a(OTrackEvent oTrackEvent, bf3 bf3Var) {
        this.a.d(oTrackEvent, bf3Var);
    }

    public void b(OTrackEvent oTrackEvent, bf3 bf3Var) {
        this.a.e(oTrackEvent, bf3Var);
    }

    public void c() {
        this.a.g();
    }

    public void e(df3 df3Var) {
        this.a.h(df3Var);
    }
}
