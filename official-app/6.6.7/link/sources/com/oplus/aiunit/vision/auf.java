package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class auf extends ContentObserver {
    public static Handler e;
    public static HandlerThread f;
    public static final Object g = new Object();
    public Context a;
    public Map<String, Object> b;
    public kt2 c;
    public Uri d;

    public auf(Context context, Map<String, Object> map, kt2 kt2Var, Uri uri) {
        super(a());
        this.a = context;
        this.b = map;
        this.c = kt2Var;
        this.d = uri;
    }

    public static Handler a() {
        Handler handler;
        synchronized (g) {
            HandlerThread handlerThread = f;
            if (handlerThread == null || !handlerThread.isAlive()) {
                HandlerThread handlerThread2 = new HandlerThread("xgame_router");
                f = handlerThread2;
                handlerThread2.start();
                Looper looper = f.getLooper();
                e = looper != null ? new Handler(looper) : new Handler();
            }
            handler = e;
        }
        return handler;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Uri uri = this.d;
        if (uri != null) {
            onChange(z, uri);
            return;
        }
        Context context = this.a;
        if (context != null) {
            context.getContentResolver().unregisterContentObserver(this);
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        Context context;
        Uri uri2 = this.d;
        if (uri2 == null || !uri2.equals(uri) || (context = this.a) == null) {
            return;
        }
        kt2 kt2Var = this.c;
        if (kt2Var != null) {
            kt2Var.b(this.b, z5n.b(context, uri));
        }
        this.a.getContentResolver().unregisterContentObserver(this);
    }
}
