package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes11.dex */
public class ah8 extends Handler implements hoe {
    public final yde i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9361j;
    public final sr6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9362l;

    public ah8(sr6 sr6Var, Looper looper, int i) {
        super(looper);
        this.k = sr6Var;
        this.f9361j = i;
        this.i = new yde();
    }

    @Override // com.oplus.aiunit.vision.hoe
    public void a(d3j d3jVar, Object obj) {
        xde xdeVarA = xde.a(d3jVar, obj);
        synchronized (this) {
            this.i.a(xdeVarA);
            if (!this.f9362l) {
                this.f9362l = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                xde xdeVarB = this.i.b();
                if (xdeVarB == null) {
                    synchronized (this) {
                        xdeVarB = this.i.b();
                        if (xdeVarB == null) {
                            this.f9362l = false;
                            return;
                        }
                    }
                }
                this.k.g(xdeVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f9361j);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f9362l = true;
        } catch (Throwable th) {
            this.f9362l = false;
            throw th;
        }
    }
}
