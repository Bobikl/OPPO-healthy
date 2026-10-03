package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.oplus.instant.router.callback.Callback;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class jbm extends ContentObserver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Handler f12827e;
    public static HandlerThread f;
    public static final Object g = new Object();
    public Context a;
    public Map<String, Object> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Callback f12828c;
    public Uri d;

    public jbm(Context context, Map<String, Object> map, Callback callback, Uri uri) {
        super(a());
        this.a = context;
        this.b = map;
        this.f12828c = callback;
        this.d = uri;
    }

    public static Handler a() {
        Handler handler;
        synchronized (g) {
            HandlerThread handlerThread = f;
            if (handlerThread == null || !handlerThread.isAlive()) {
                HandlerThread handlerThread2 = new HandlerThread("instant_callback");
                f = handlerThread2;
                handlerThread2.start();
                Looper looper = f.getLooper();
                f12827e = looper != null ? new Handler(looper) : new Handler();
            }
            handler = f12827e;
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
        Callback callback = this.f12828c;
        if (callback != null) {
            callback.onResponse(this.b, mrm.b(context, uri));
        }
        this.a.getContentResolver().unregisterContentObserver(this);
    }
}
