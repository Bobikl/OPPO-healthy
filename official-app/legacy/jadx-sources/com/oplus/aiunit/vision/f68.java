package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public abstract class f68 {
    public Handler a = new Handler(Looper.getMainLooper());
    public Runnable b = new Runnable() { // from class: com.oplus.aiunit.vision.e68
        @Override // java.lang.Runnable
        public final void run() {
            this.i.e();
        }
    };

    public class a extends w60<String> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            f68.this.f("0");
            f68.this.a.removeCallbacks(f68.this.b);
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(String str) {
            f68.this.f(str);
            f68.this.a.removeCallbacks(f68.this.b);
        }
    }

    public class b extends mz0<String> {
        @Override // com.oplus.aiunit.vision.c70
        public void onStart() {
            StringBuilder sb = new StringBuilder();
            ydc.n().p(sb);
            String string = sb.toString();
            t6b.b("BaseApduJob", "GetWatchApkVersionJob, version: " + string);
            if (TextUtils.isEmpty(string)) {
                notifyFailed(string);
            } else {
                notifyResult(string);
            }
        }

        public b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        t6b.b("GetWatchApkVersionTask", "get watch apk version time out!");
        f("0");
    }

    public void d() {
        this.a.postDelayed(this.b, 10000L);
        tpc.b().g(new b(), new a());
    }

    public abstract void f(String str);
}
