package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import com.heytap.store.platform.barcode.util.LogUtils;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class c6a {
    public final Activity a;
    public final BroadcastReceiver b = new b(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9966c = false;
    public AsyncTask<Object, Object, Object> d;

    public static class a extends AsyncTask<Object, Object, Object> {
        public WeakReference<Activity> a;

        public a(Activity activity) {
            this.a = new WeakReference<>(activity);
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000L);
                LogUtils.i("Finishing activity due to inactivity");
                this.a.get();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    public static class b extends BroadcastReceiver {
        public WeakReference<c6a> a;

        public b(c6a c6aVar) {
            this.a = new WeakReference<>(c6aVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c6a c6aVar;
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            if (!"android.intent.action.BATTERY_CHANGED".equals(intent.getAction()) || (c6aVar = this.a.get()) == null) {
                return;
            }
            if (intent.getIntExtra("plugged", -1) <= 0) {
                c6aVar.c();
            } else {
                c6aVar.b();
            }
        }
    }

    public c6a(Activity activity) {
        this.a = activity;
        c();
    }

    public final void b() {
        AsyncTask<Object, Object, Object> asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
    }

    public void c() {
        b();
        a aVar = new a(this.a);
        this.d = aVar;
        try {
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        } catch (RejectedExecutionException unused) {
            LogUtils.w("Couldn't schedule inactivity task; ignoring");
        }
    }

    public void d() {
        b();
        if (!this.f9966c) {
            LogUtils.w("PowerStatusReceiver was never registered?");
        } else {
            this.a.unregisterReceiver(this.b);
            this.f9966c = false;
        }
    }

    public void e() {
        if (this.f9966c) {
            LogUtils.w("PowerStatusReceiver was already registered?");
        } else {
            this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f9966c = true;
        }
        c();
    }

    public void f() {
        b();
    }
}
