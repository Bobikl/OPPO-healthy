package com.oplus.aiunit.vision;

import android.os.Looper;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class pzc extends Thread {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15551j;
    public Looper k;

    public pzc(String str, int i) {
        super(str);
        this.f15551j = -1;
        this.i = i;
    }

    public Looper a() {
        boolean z;
        if (!isAlive()) {
            return null;
        }
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            z = false;
            while (isAlive() && this.k == null) {
                if (System.currentTimeMillis() - jCurrentTimeMillis > 1000) {
                    Log.e("numberThread", "numberPick Wait for looper timeout");
                    break;
                }
                try {
                    wait(10L);
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return this.k;
    }

    public void b() {
    }

    public boolean c() {
        Looper looperA = a();
        if (looperA == null) {
            return false;
        }
        looperA.quit();
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f15551j = Process.myTid();
        Looper.prepare();
        synchronized (this) {
            this.k = Looper.myLooper();
            notifyAll();
        }
        Process.setThreadPriority(this.i);
        b();
        Looper.loop();
        this.f15551j = -1;
    }
}
