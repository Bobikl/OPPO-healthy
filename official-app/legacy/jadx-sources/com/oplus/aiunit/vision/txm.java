package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class txm implements jim {

    public static final class b implements ServiceConnection {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f17198j;

        public b() {
            this.i = false;
            this.f17198j = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (this.i) {
                throw new IllegalStateException();
            }
            this.i = true;
            return this.f17198j.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f17198j.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // com.oplus.aiunit.vision.jim
    public String a(Context context) {
        b bVar = new b();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, bVar, 1)) {
            try {
                return com.alipay.sdk.m.k0.a.AbstractBinderC0149a.a(bVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }
}
