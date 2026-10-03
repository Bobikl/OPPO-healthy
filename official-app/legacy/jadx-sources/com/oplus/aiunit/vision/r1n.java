package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.heytap.store.base.core.state.Constants;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class r1n {
    public static final String a = w0n.t("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    public static r1n f;
    public List<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16020c;
    public final Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f16021e;

    public class a extends Thread {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f16022j;

        public a(String str, int i) {
            this.i = str;
            this.f16022j = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            String strH = x1n.h(this.i);
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            if ((this.f16022j & 1) > 0) {
                try {
                    if (Settings.System.canWrite(r1n.this.d)) {
                        Settings.System.putString(r1n.this.d.getContentResolver(), r1n.this.f16020c, strH);
                    }
                } catch (Exception unused) {
                }
            }
            if ((this.f16022j & 16) > 0) {
                t1n.b(r1n.this.d, r1n.this.f16020c, strH);
            }
            if ((this.f16022j & 256) > 0) {
                SharedPreferences.Editor editorEdit = r1n.this.d.getSharedPreferences(r1n.a, 0).edit();
                editorEdit.putString(r1n.this.f16020c, strH);
                editorEdit.apply();
            }
        }
    }

    public r1n(Context context) {
        this.d = context.getApplicationContext();
        if (Looper.myLooper() == null) {
            this.f16021e = new b(Looper.getMainLooper(), this);
        } else {
            this.f16021e = new b(this);
        }
    }

    public static r1n b(Context context) {
        if (f == null) {
            synchronized (r1n.class) {
                if (f == null) {
                    f = new r1n(context);
                }
            }
        }
        return f;
    }

    public final void d(String str) {
        this.f16020c = str;
    }

    public final synchronized void e(String str, int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new a(str, i).start();
            return;
        }
        String strH = x1n.h(str);
        if (!TextUtils.isEmpty(strH)) {
            if ((i & 1) > 0) {
                try {
                    Settings.System.putString(this.d.getContentResolver(), this.f16020c, strH);
                } catch (Exception unused) {
                }
            }
            if ((i & 16) > 0) {
                t1n.b(this.d, this.f16020c, strH);
            }
            if ((i & 256) > 0) {
                SharedPreferences.Editor editorEdit = this.d.getSharedPreferences(a, 0).edit();
                editorEdit.putString(this.f16020c, strH);
                editorEdit.apply();
            }
        }
    }

    public final void g(String str) {
        List<String> list = this.b;
        if (list != null) {
            list.clear();
            this.b.add(str);
        }
        e(str, Constants.QR_REQUEST_CODE);
    }

    public static final class b extends Handler {
        public final WeakReference<r1n> a;

        public b(r1n r1nVar) {
            this.a = new WeakReference<>(r1nVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            r1n r1nVar = this.a.get();
            if (r1nVar == null || message == null || (obj = message.obj) == null) {
                return;
            }
            r1nVar.e((String) obj, message.what);
        }

        public b(Looper looper, r1n r1nVar) {
            super(looper);
            this.a = new WeakReference<>(r1nVar);
        }
    }
}
