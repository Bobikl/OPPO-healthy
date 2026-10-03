package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
public class gu1 {
    public final b a;
    public final boolean b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11901e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11900c = 0;
    public boolean d = false;
    public int f = 1;
    public boolean g = false;
    public boolean h = false;

    @SuppressLint({"HandlerLeak"})
    public Handler i = new a(z2c.a());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public iu1.c f11902j = new iu1.c() { // from class: com.oplus.aiunit.vision.fu1
        @Override // com.oplus.aiunit.vision.iu1.c
        public final void a(String str, int i) {
            this.a.m(str, i);
        }
    };

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    gu1.this.a.disconnect();
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    gu1.this.a.connect();
                    sendEmptyMessageDelayed(1, 12000L);
                    gu1.this.f11900c++;
                    return;
                }
            }
            wil.d("BluetoothPinMonitor", "passKey timeout");
            if (!gu1.this.d) {
                wil.d("BluetoothPinMonitor", "not retry");
                return;
            }
            if (gu1.this.f11900c >= gu1.this.f) {
                gu1.this.f = 0;
                gu1.this.d = false;
            }
            gu1.this.a.disconnect();
            sendEmptyMessageDelayed(3, 500L);
        }
    }

    public interface b {
        boolean connect();

        void disconnect();
    }

    public gu1(String str, boolean z, b bVar) {
        this.f11901e = str;
        this.b = z;
        this.a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i) {
        if (TextUtils.equals(str, this.f11901e)) {
            if (i == 11) {
                wil.d("BluetoothPinMonitor", "BOND_BONDING");
                this.h = true;
                this.i.removeMessages(1);
                this.i.removeMessages(3);
                this.d = false;
                return;
            }
            if (i == 12) {
                wil.d("BluetoothPinMonitor", "BOND_BONDED");
                this.h = true;
                this.i.removeMessages(1);
                this.i.removeMessages(3);
                this.d = false;
            }
        }
    }

    public void i() {
        k();
        this.h = false;
        int bondState = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.f11901e).getBondState();
        wil.d("BluetoothPinMonitor", "createBond: bondState=" + bondState);
        if (!this.b || bondState != 10) {
            this.d = false;
            this.a.connect();
            return;
        }
        this.d = true;
        if (this.i.hasMessages(1) || this.i.hasMessages(3)) {
            wil.d("BluetoothPinMonitor", "createBond: bonding ignore");
        } else {
            this.a.connect();
            this.i.sendEmptyMessageDelayed(1, 12000L);
        }
    }

    public void j() {
        this.i.removeMessages(1);
        this.i.removeMessages(3);
        this.i.sendEmptyMessage(2);
    }

    public synchronized void k() {
        if (!this.g) {
            this.g = true;
            this.h = false;
            iu1.h().e(this.f11902j);
        }
    }

    public boolean l() {
        return this.d;
    }

    public synchronized void n() {
        iu1.h().m(this.f11902j);
        this.g = false;
        this.h = false;
    }

    public boolean o() {
        return this.h;
    }
}
