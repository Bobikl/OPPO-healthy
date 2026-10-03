package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes16.dex */
public abstract class i01 implements rm9 {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jeg f12328j;
    public final Handler k = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1001:
                    i01.this.c((st1) message.obj);
                    break;
                case 1002:
                case 1003:
                    i01.this.d();
                    break;
            }
        }
    }

    public i01(Context context) {
        this.i = context.getApplicationContext();
    }

    @Override // com.oplus.aiunit.vision.rm9
    public void a(jeg jegVar) {
        this.f12328j = null;
    }

    public BluetoothAdapter b() {
        return BluetoothAdapter.getDefaultAdapter();
    }

    public void c(st1 st1Var) {
        jeg jegVar = this.f12328j;
        if (jegVar != null) {
            jegVar.h(st1Var);
        }
    }

    public void d() {
        jeg jegVar = this.f12328j;
        if (jegVar != null) {
            jegVar.k();
        }
    }

    public void e(jeg jegVar) {
        this.f12328j = jegVar;
    }
}
