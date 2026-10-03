package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class yqf extends ContentObserver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Handler f19108e;
    public static HandlerThread f;
    public static final Object g = new Object();
    public Context a;
    public Map<String, Object> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ws2 f19109c;
    public Uri d;

    public yqf(Context context, Map<String, Object> map, ws2 ws2Var, Uri uri) {
        super(a());
        this.a = context;
        this.b = map;
        this.f19109c = ws2Var;
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
                f19108e = looper != null ? new Handler(looper) : new Handler();
            }
            handler = f19108e;
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
        ws2 ws2Var = this.f19109c;
        if (ws2Var != null) {
            ws2Var.b(this.b, z0n.b(context, uri));
        }
        this.a.getContentResolver().unregisterContentObserver(this);
    }
}
