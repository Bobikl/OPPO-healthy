package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class w6c {
    public static final String TAG = "AppStoreMsgTimeoutManager";
    public static final int TIMEOUT = 10000;
    public Map<String, Runnable> a = new HashMap();
    public Map<String, g5> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f18141c;

    public w6c() {
        HandlerThread handlerThread = new HandlerThread("message_timeout_thread");
        handlerThread.start();
        this.f18141c = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(g5 g5Var, String str) {
        if (g5Var != null) {
            g5Var.getResponse().onFail(-3);
            this.b.remove(str);
            this.a.remove(str);
        }
    }

    public void b(final String str, final g5 g5Var) {
        s5l.a(TAG, "[addTimeout] the send message is timeout,actionAnchor = " + str);
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.v6c
            @Override // java.lang.Runnable
            public final void run() {
                this.i.c(g5Var, str);
            }
        };
        this.f18141c.postDelayed(runnable, 10000L);
        this.a.put(str, runnable);
    }

    public void d(String str) {
        s5l.a(TAG, "[removeTimeout] remove timeout,actionAnchor = " + str);
        Runnable runnable = this.a.get(str);
        if (runnable != null) {
            this.f18141c.removeCallbacks(runnable);
            this.a.remove(str);
        }
    }

    public void e(Map<String, g5> map) {
        this.b = map;
    }
}
