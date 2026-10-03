package com.oplus.drs.core.ntp;

import com.oplus.aiunit.vision.f05;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes6.dex */
public class a extends f05 {
    public int f = 3;

    public e e(InetAddress inetAddress) throws IOException {
        return f(inetAddress, 123);
    }

    public e f(InetAddress inetAddress, int i) throws IOException {
        if (!b()) {
            c();
        }
        c cVar = new c();
        cVar.b(3);
        cVar.setVersion(this.f);
        DatagramPacket datagramPacketC = cVar.c();
        if (datagramPacketC != null) {
            datagramPacketC.setAddress(inetAddress);
            datagramPacketC.setPort(i);
        }
        c cVar2 = new c();
        DatagramPacket datagramPacketC2 = cVar2.c();
        cVar.f(TimeStamp.getCurrentTime());
        this.b.send(datagramPacketC);
        this.b.receive(datagramPacketC2);
        return new e(cVar2, System.currentTimeMillis(), false);
    }
}
