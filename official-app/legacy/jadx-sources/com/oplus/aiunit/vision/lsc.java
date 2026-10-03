package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes18.dex */
public class lsc {
    public static final Executor b = yq8.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handler f13816c = new Handler(Looper.getMainLooper());
    public a a;

    public interface a {
        void a(Object obj);
    }

    public lsc(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        final Object objG = g();
        f13816c.post(new Runnable() { // from class: com.oplus.aiunit.vision.ksc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.e(objG);
            }
        });
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void e(Object obj) {
        t6b.b("NfcTransmitTask", "  onPostExecute: " + obj + " callback: " + this.a);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(obj);
        }
        this.a = null;
    }

    public void d() {
        b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.jsc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f();
            }
        });
    }

    public final Object g() {
        vak vakVar = new vak();
        ydc.n().o(14, vakVar);
        return vakVar.c();
    }
}
