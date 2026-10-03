package com.oppo.bluetooth.btnet.bluetoothproxyserver.server;

import android.os.Trace;
import com.heytap.wearable.btnet.proto.HBProxyConfig;
import com.heytap.wearable.btnet.proto.SocketProto;
import com.oplus.aiunit.vision.cyg;
import com.oplus.aiunit.vision.g82;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o5f;
import com.oplus.aiunit.vision.ok9;
import com.oplus.aiunit.vision.uw8;
import com.oplus.aiunit.vision.v7c;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.c;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class b implements Runnable {
    public Selector j;
    public cyg k;
    public ConcurrentLinkedQueue<a> m;
    public String i = "TCPUDPServer";
    public final int l = 150;
    public boolean n = false;
    public final MyLRUCache<Packet, c> o = new MyLRUCache<>(300, new MyLRUCache.a() { // from class: com.oplus.aiunit.vision.tpj
        @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
        public final void a(Object obj) {
            ((c) obj).e();
        }
    });
    public final MyLRUCache<Long, com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a> p = new MyLRUCache<>(400, new MyLRUCache.a() { // from class: com.oplus.aiunit.vision.upj
        @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
        public final void a(Object obj) {
            ((a) obj).g();
        }
    });

    public interface a {
        void a();
    }

    public b(cyg cygVar) {
        this.k = cygVar;
        try {
            this.j = Selector.open();
        } catch (IOException e) {
            o5f.b(this.i, "TCPUDPServer: ex " + e);
        }
        this.m = new ConcurrentLinkedQueue<>();
    }

    public void a(a aVar) {
        this.m.add(aVar);
    }

    public void b() {
        m8b.f(this.i, "Close all p2p tunnel");
        synchronized (this.p) {
            for (com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar : new ArrayList(this.p.values())) {
                if (aVar.s == 1) {
                    aVar.j();
                }
            }
        }
    }

    public void c() {
        o5f.c(this.i, ">>>closeAllTCPConn start");
        synchronized (this.p) {
            Iterator<Map.Entry<Long, com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a>> it = this.p.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().g();
                it.remove();
            }
        }
        o5f.c(this.i, "<<<closeAllTCPConn end");
    }

    public void d() {
        o5f.c(this.i, ">>>closeAllUDPConn start");
        synchronized (this.o) {
            Iterator<Map.Entry<Packet, c>> it = this.o.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().e();
                it.remove();
            }
        }
        o5f.c(this.i, "<<<closeAllUDPConn end");
    }

    public void e(c cVar) {
        o5f.c(this.i, ">>>closeUDPConn start");
        synchronized (this.o) {
            cVar.e();
            this.o.remove(cVar.f());
        }
        o5f.c(this.i, "<<<closeUDPConn end");
    }

    public com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a f(long j) {
        com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar;
        synchronized (this.p) {
            aVar = this.p.get(Long.valueOf(j));
        }
        return aVar;
    }

    public c g(Packet packet) {
        c cVar;
        synchronized (this.o) {
            cVar = this.o.get(packet);
        }
        return cVar;
    }

    public final boolean h() {
        synchronized (this.p) {
            for (com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar : this.p.values()) {
                if (aVar.o() || aVar.n()) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean i() {
        synchronized (this.p) {
            Iterator<com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a> it = this.p.values().iterator();
            while (it.hasNext()) {
                if (it.next().s == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public void j(ok9 ok9Var) {
        if (ok9Var.l() != 1544) {
            com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVarF = f(ok9Var.i());
            if (aVarF != null) {
                aVarF.v(ok9Var);
                return;
            }
            return;
        }
        if (f(ok9Var.i()) != null) {
            o5f.b(this.i, "should not into here processTCPPacket:" + ok9Var.i());
            return;
        }
        boolean z = false;
        try {
            if (g82.c()) {
                Trace.beginSection("BtNet_Tcp_newTunnel sid=" + ok9Var.i());
                z = true;
            }
            SocketProto from = SocketProto.parseFrom(ok9Var.e());
            int port = from.getPort();
            String address = from.getAddress();
            if (from.getPackageName() != null) {
                from.getPackageName();
            }
            com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVarA = this.k.k.a(address, port, ok9Var.i(), this.j, this, this.k, ok9Var.f);
            l(ok9Var.i(), aVarA);
            o5f.c(this.i, "BtNet create tunnel，call package=" + from.getPackageName() + " transportType=" + ok9Var.f);
            o5f.a(this.i, "BtNet request host=" + address + " port=" + port + " socketId=" + ok9Var.i() + " transportType=" + ok9Var.f);
            aVarA.i(new InetSocketAddress(InetAddress.getByName(address), port));
        } catch (Exception e) {
            o5f.b(this.i, "processTCPPacket: ex " + e);
            n(ok9Var.i());
        } finally {
            if (z && g82.c()) {
                Trace.endSection();
            }
        }
    }

    public void k(Packet packet) {
        c cVarG = g(packet);
        ByteBuffer byteBuffer = packet.backingBuffer;
        int iLimit = byteBuffer != null ? byteBuffer.limit() - packet.backingBuffer.position() : 0;
        if (cVarG != null) {
            if (g82.c()) {
                Trace.beginSection("BtNet_Udp_packet size=" + iLimit);
            }
            cVarG.k(packet);
            if (g82.c()) {
                Trace.endSection();
                return;
            }
            return;
        }
        if (g82.c()) {
            String ipAndPort = packet.getIpAndPort();
            StringBuilder sb = new StringBuilder();
            sb.append("BtNet_Udp_newTunnel size=");
            sb.append(iLimit);
            sb.append(" ");
            if (ipAndPort != null && ipAndPort.length() > 20) {
                ipAndPort = ipAndPort.substring(0, 20);
            }
            sb.append(ipAndPort);
            Trace.beginSection(sb.toString());
        }
        o5f.c(this.i, "processUDPPacket :" + packet.toString());
        c cVar = new c(this.j, this, packet, this.k);
        m(packet, cVar);
        cVar.h();
        if (g82.c()) {
            Trace.endSection();
        }
    }

    public void l(long j, com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar) {
        synchronized (this.p) {
            this.p.put(Long.valueOf(j), aVar);
        }
    }

    public void m(Packet packet, c cVar) {
        synchronized (this.o) {
            this.o.put(packet, cVar);
        }
    }

    public void n(long j) {
        synchronized (this.p) {
            this.p.remove(Long.valueOf(j));
        }
    }

    public void o() {
        new uw8(this, "TCPUDPServer").start();
    }

    public final void p() {
        ArrayList<com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a> arrayList;
        synchronized (this.p) {
            arrayList = new ArrayList(this.p.values());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (g82.c()) {
            Trace.beginSection("BtNet_backpressure_relieve_loop n=" + arrayList.size());
        }
        for (com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar : arrayList) {
            aVar.B();
            if (aVar.n() && this.k.u(aVar.s)) {
                aVar.C();
            }
        }
        if (g82.c()) {
            Trace.endSection();
        }
    }

    public void q(HBProxyConfig hBProxyConfig) {
        synchronized (this.p) {
            for (com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar : this.p.values()) {
                if (aVar instanceof v7c) {
                    v7c v7cVar = (v7c) aVar;
                    if (v7cVar.L(hBProxyConfig.getIp(), hBProxyConfig.getPort())) {
                        v7cVar.U(hBProxyConfig);
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0104 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b.run():void");
    }
}
