package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class gh1 {
    public static final String TAG = "BleRequest";
    public int a;
    public mqf b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qg1 f11760c;
    public Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UUID f11761e;
    public UUID f;
    public UUID g;
    public int h = 32000;

    public static gh1 b(UUID uuid, UUID uuid2) {
        gh1 gh1Var = new gh1();
        gh1Var.p(uuid);
        gh1Var.l(uuid2);
        return gh1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(int i, byte[] bArr) {
        this.f11760c.a(hh1.d(i, bArr));
    }

    public void c(int i, byte[] bArr) {
        j(i, bArr);
    }

    public UUID d() {
        return this.f;
    }

    public UUID e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    public UUID g() {
        return this.f11761e;
    }

    public int h() {
        return this.a;
    }

    public void j(final int i, final byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("postResult: ");
        sb.append(i);
        sb.append("    bleCallback:");
        sb.append(this.f11760c);
        sb.append("    callbackHandler:");
        sb.append(this.d);
        if (this.f11760c == null) {
            return;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        Handler handler = this.d;
        if (handler == null || handler.getLooper() == Looper.myLooper()) {
            this.f11760c.a(hh1.d(i, bArr));
        } else {
            this.d.post(new Runnable() { // from class: com.oplus.aiunit.vision.fh1
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.i(i, bArr);
                }
            });
        }
    }

    public void k(Handler handler) {
        this.d = handler;
    }

    public void l(UUID uuid) {
        this.f = uuid;
    }

    public void m(UUID uuid) {
        this.g = uuid;
    }

    public void n(mqf mqfVar) {
        this.b = mqfVar;
    }

    public gh1 o(int i) {
        this.h = i;
        return this;
    }

    public void p(UUID uuid) {
        this.f11761e = uuid;
    }

    public void q(int i) {
        this.a = i;
    }

    public void r(qg1 qg1Var) {
        this.f11760c = qg1Var;
        this.b.b(this);
    }

    public boolean s() {
        return false;
    }
}
