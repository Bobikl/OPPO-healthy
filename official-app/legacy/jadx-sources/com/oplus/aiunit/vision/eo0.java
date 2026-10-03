package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import com.heytap.store.platform.barcode.Preferences;
import com.heytap.store.platform.barcode.util.LogUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class eo0 implements Camera.AutoFocusCallback {
    public static final Collection<String> f;
    public boolean a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10993c;
    public final Camera d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AsyncTask<?, ?, ?> f10994e;

    public static class a extends AsyncTask<Object, Object, Object> {
        public WeakReference<eo0> a;

        public a(eo0 eo0Var) {
            this.a = new WeakReference<>(eo0Var);
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(h27.FAMILY_PULL_REFRESH_DELAY);
            } catch (InterruptedException unused) {
            }
            eo0 eo0Var = this.a.get();
            if (eo0Var == null) {
                return null;
            }
            eo0Var.c();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public eo0(Context context, Camera camera) {
        this.d = camera;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        boolean z = defaultSharedPreferences.getBoolean(Preferences.KEY_AUTO_FOCUS, true) && f.contains(focusMode);
        this.f10993c = z;
        LogUtils.i("Current focus mode '" + focusMode + "'; use auto focus? " + z);
        c();
    }

    public final synchronized void a() {
        try {
            if (!this.a && this.f10994e == null) {
                a aVar = new a(this);
                try {
                    aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                    this.f10994e = aVar;
                } catch (RejectedExecutionException e2) {
                    LogUtils.w("Could not request auto focus", e2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        AsyncTask<?, ?, ?> asyncTask = this.f10994e;
        if (asyncTask != null) {
            if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.f10994e.cancel(true);
            }
            this.f10994e = null;
        }
    }

    public synchronized void c() {
        if (this.f10993c) {
            this.f10994e = null;
            if (!this.a && !this.b) {
                try {
                    this.d.autoFocus(this);
                    this.b = true;
                } catch (RuntimeException e2) {
                    LogUtils.w("Unexpected exception while focusing", e2);
                    a();
                }
            }
        }
    }

    public synchronized void d() {
        this.a = true;
        if (this.f10993c) {
            b();
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e2) {
                LogUtils.w("Unexpected exception while cancelling focusing", e2);
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.b = false;
        a();
    }
}
