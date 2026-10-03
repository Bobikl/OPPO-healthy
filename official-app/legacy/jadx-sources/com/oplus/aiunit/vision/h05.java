package com.oplus.aiunit.vision;

import java.net.DatagramSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h05 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k05 f11950e = new h45();
    public int a = 0;
    public DatagramSocket b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11951c = false;
    public k05 d = f11950e;

    public void a() {
        DatagramSocket datagramSocket = this.b;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this.b = null;
        this.f11951c = false;
    }

    public boolean b() {
        return this.f11951c;
    }

    public void c() throws SocketException {
        DatagramSocket datagramSocketA = this.d.a();
        this.b = datagramSocketA;
        datagramSocketA.setSoTimeout(this.a);
        this.f11951c = true;
    }

    public void d(int i) {
        this.a = i;
    }
}
