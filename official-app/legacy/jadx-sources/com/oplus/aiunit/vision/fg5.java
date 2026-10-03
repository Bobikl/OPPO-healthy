package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import com.heytap.health.oaf.LinkReasonBean;
import com.heytap.health.oaf.LinkReasonType;
import com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStore;

/* JADX INFO: loaded from: classes17.dex */
public class fg5 {
    public final String a;
    public final ys6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OafRecorder$DeviceEventStore.Builder f11336c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11337e;
    public String f;
    public long g;
    public boolean d = false;
    public int h = 0;

    public fg5(String str, ys6 ys6Var, OafRecorder$DeviceEventStore.Builder builder) {
        this.b = ys6Var;
        this.f11336c = builder;
        this.a = "Event:" + str.substring(str.length() - 5) + ":";
        builder.setMac(str);
    }

    public synchronized void a(String str) {
        if (TextUtils.isEmpty(this.f)) {
            this.g = System.currentTimeMillis();
            this.f = str;
        }
        this.f11337e = null;
    }

    public synchronized void b(String str) {
        if (TextUtils.isEmpty(this.f11337e)) {
            this.f11337e = str;
            this.g = System.currentTimeMillis();
        }
        this.f = null;
    }

    public long c() {
        return this.g;
    }

    public String d() {
        return this.f;
    }

    public int e() {
        return this.h;
    }

    public OafRecorder$DeviceEventStore.Builder f() {
        return this.f11336c;
    }

    public final void g(int i, int i2) {
        this.b.a(this.f11336c.getConnectedTime(), i, i2, this.f11336c.getMac(), this.f11336c.getDisconnectedTime(), this.f);
    }

    public final void h(int i, LinkReasonBean linkReasonBean, int i2, boolean z) {
        this.b.b(i, this.f11336c.getDisconnectedTime(), linkReasonBean, i2, this.f11336c.getMac(), this.f11336c.getConnectedTime(), z, this.f11337e);
    }

    public synchronized void i(boolean z, boolean z2) {
        wil.d(this.a, "markCalledConnect: " + z + ",isOutCall:" + z2 + ",currOutCalled:" + this.d);
        this.f11336c.setCallConnectedTime(System.currentTimeMillis());
        if (!this.d) {
            this.d = z2;
        }
    }

    public synchronized void j(boolean z, boolean z2) {
        wil.d(this.a, "markCalledDisconnect: " + z + ",isOutCall:" + z2);
        this.f11336c.setCallDisconnectTime(System.currentTimeMillis());
        this.d = z2;
    }

    public synchronized boolean k(LinkReasonBean linkReasonBean, fg5 fg5Var, int i) {
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long callConnectedTime = jCurrentTimeMillis - this.f11336c.getCallConnectedTime();
        int state = BluetoothAdapter.getDefaultAdapter().getState();
        boolean z = state != 12;
        String reason = linkReasonBean.getReason();
        if (z) {
            ot1.INSTANCE.c();
            linkReasonBean.setReasonType(LinkReasonType.DISCONNECT_NORMAL);
            linkReasonBean.setReason(linkReasonBean.getReason() + "&from=" + fg5Var.d() + ",BtOff");
            i2 = 2;
        } else {
            linkReasonBean.setReason(reason + "&from=" + fg5Var.d() + "," + (ot1.INSTANCE.b(linkReasonBean.getMac(), fg5Var.c()) ? "system bt conn" : "system bt disc"));
            i2 = 4;
        }
        boolean z2 = this.f11336c.getCallDisconnectTime() > this.f11336c.getCallConnectedTime();
        try {
            boolean connected = this.f11336c.getConnected();
            wil.d(this.a, "onConnectFailed mOutCalled:" + this.d + " storeConnected:" + connected);
            if (!this.d && !connected) {
                wil.d(this.a, "onConnectFailed: ignore this ");
                wil.d(this.a, "DEVICE-DISC notify:false intent:" + z2 + " BT:" + state + " delay:" + callConnectedTime + " " + linkReasonBean);
                return false;
            }
            this.d = false;
            this.f11336c.setConnected(false);
            this.f11336c.setDisconnectedTime(jCurrentTimeMillis);
            h(i2, linkReasonBean, i, z2);
            wil.d(this.a, "DEVICE-DISC notify:true intent:" + z2 + " BT:" + state + " delay:" + callConnectedTime + " " + linkReasonBean);
            return true;
        } catch (Throwable th) {
            wil.d(this.a, "DEVICE-DISC notify:false intent:" + z2 + " BT:" + state + " delay:" + callConnectedTime + " " + linkReasonBean);
            throw th;
        }
    }

    public synchronized boolean l(int i, int i2, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long callConnectedTime = jCurrentTimeMillis - this.f11336c.getCallConnectedTime();
        try {
            boolean connected = this.f11336c.getConnected();
            wil.d(this.a, "onConnectSuccess mOutCalled:" + this.d + " storeConnected:" + connected);
            if (!this.d && connected) {
                wil.k(this.a, "onConnectSuccess: preIsConnected, connected again");
                wil.d(this.a, "DEVICE-CONN notify:false delay:" + callConnectedTime + " " + str);
                return false;
            }
            this.d = false;
            this.f11336c.setConnected(true);
            this.f11336c.setConnectedTime(jCurrentTimeMillis);
            g(i, i2);
            wil.d(this.a, "DEVICE-CONN notify:true delay:" + callConnectedTime + " " + str);
            return true;
        } catch (Throwable th) {
            wil.d(this.a, "DEVICE-CONN notify:false delay:" + callConnectedTime + " " + str);
            throw th;
        }
    }

    public void m(String str) {
        this.b.c(System.currentTimeMillis(), this.f11336c.getMac(), str);
    }

    public synchronized void n() {
        this.f = null;
        this.f11337e = null;
    }

    public void o(int i) {
        this.h = i;
    }
}
