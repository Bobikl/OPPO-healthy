package com.oplus.aiunit.vision;

import java.net.DatagramSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f05 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i05 f11154e = new f45();
    public int a = 0;
    public DatagramSocket b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11155c = false;
    public i05 d = f11154e;

    public void a() {
        DatagramSocket datagramSocket = this.b;
        if (datagramSocket != null) {
            datagramSocket.close();
        }
        this.b = null;
        this.f11155c = false;
    }

    public boolean b() {
        return this.f11155c;
    }

    public void c() throws SocketException {
        DatagramSocket datagramSocketA = this.d.a();
        this.b = datagramSocketA;
        datagramSocketA.setSoTimeout(this.a);
        this.f11155c = true;
    }

    public void d(int i) {
        this.a = i;
    }
}
