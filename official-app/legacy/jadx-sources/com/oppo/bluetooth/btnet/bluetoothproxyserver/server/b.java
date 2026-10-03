package com.oppo.bluetooth.btnet.bluetoothproxyserver.server;

import android.os.Trace;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.wearable.btnet.proto.HBProxyConfig;
import com.heytap.wearable.btnet.proto.SocketProto;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c3f;
import com.oplus.aiunit.vision.coa;
import com.oplus.aiunit.vision.f6c;
import com.oplus.aiunit.vision.ij9;
import com.oplus.aiunit.vision.mug;
import com.oplus.aiunit.vision.qv8;
import com.oplus.aiunit.vision.s72;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes9.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Selector f20199j;
    public mug k;
    public ConcurrentLinkedQueue<a> m;
    public String i = "TCPUDPServer";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20200l = 150;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20201n = false;
    public final MyLRUCache<Packet, c> o = new MyLRUCache<>(300, new MyLRUCache.a() { // from class: com.oplus.aiunit.vision.vlj
        @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
        public final void a(Object obj) {
            ((com.oppo.bluetooth.btnet.bluetoothproxyserver.server.c) obj).e();
        }
    });
    public final MyLRUCache<Long, com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a> p = new MyLRUCache<>(400, new MyLRUCache.a() { // from class: com.oplus.aiunit.vision.wlj
        @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
        public final void a(Object obj) {
            ((com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a) obj).g();
        }
    });

    public interface a {
        void a();
    }

    public b(mug mugVar) {
        this.k = mugVar;
        try {
            this.f20199j = Selector.open();
        } catch (IOException e2) {
            c3f.b(this.i, "TCPUDPServer: ex " + e2);
        }
        this.m = new ConcurrentLinkedQueue<>();
    }

    public void a(a aVar) {
        this.m.add(aVar);
    }

    public void b() {
        a7b.f(this.i, "Close all p2p tunnel");
        synchronized (this.p) {
            for (com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar : new ArrayList(this.p.values())) {
                if (aVar.s == 1) {
                    aVar.j();
                }
            }
        }
    }

    public void c() {
        c3f.c(this.i, ">>>closeAllTCPConn start");
        synchronized (this.p) {
            Iterator<Map.Entry<Long, com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a>> it = this.p.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().g();
                it.remove();
            }
        }
        c3f.c(this.i, "<<<closeAllTCPConn end");
    }

    public void d() {
        c3f.c(this.i, ">>>closeAllUDPConn start");
        synchronized (this.o) {
            Iterator<Map.Entry<Packet, c>> it = this.o.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().e();
                it.remove();
            }
        }
        c3f.c(this.i, "<<<closeAllUDPConn end");
    }

    public void e(c cVar) {
        c3f.c(this.i, ">>>closeUDPConn start");
        synchronized (this.o) {
            cVar.e();
            this.o.remove(cVar.f());
        }
        c3f.c(this.i, "<<<closeUDPConn end");
    }

    public com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a f(long j2) {
        com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar;
        synchronized (this.p) {
            aVar = this.p.get(Long.valueOf(j2));
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

    public void j(ij9 ij9Var) {
        if (ij9Var.l() != 1544) {
            com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVarF = f(ij9Var.i());
            if (aVarF != null) {
                aVarF.v(ij9Var);
                return;
            }
            return;
        }
        if (f(ij9Var.i()) != null) {
            c3f.b(this.i, "should not into here processTCPPacket:" + ij9Var.i());
            return;
        }
        boolean z = false;
        try {
            if (s72.c()) {
                Trace.beginSection("BtNet_Tcp_newTunnel sid=" + ij9Var.i());
                z = true;
            }
            SocketProto from = SocketProto.parseFrom(ij9Var.e());
            int port = from.getPort();
            String address = from.getAddress();
            if (from.getPackageName() != null) {
                from.getPackageName();
            }
            com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVarA = this.k.k.a(address, port, ij9Var.i(), this.f20199j, this, this.k, ij9Var.f);
            l(ij9Var.i(), aVarA);
            c3f.c(this.i, "BtNet create tunnel，call package=" + from.getPackageName() + " transportType=" + ij9Var.f);
            c3f.a(this.i, "BtNet request host=" + address + " port=" + port + " socketId=" + ij9Var.i() + " transportType=" + ij9Var.f);
            aVarA.i(new InetSocketAddress(InetAddress.getByName(address), port));
        } catch (Exception e2) {
            c3f.b(this.i, "processTCPPacket: ex " + e2);
            n(ij9Var.i());
        } finally {
            if (z && s72.c()) {
                Trace.endSection();
            }
        }
    }

    public void k(Packet packet) {
        c cVarG = g(packet);
        ByteBuffer byteBuffer = packet.backingBuffer;
        int iLimit = byteBuffer != null ? byteBuffer.limit() - packet.backingBuffer.position() : 0;
        if (cVarG != null) {
            if (s72.c()) {
                Trace.beginSection("BtNet_Udp_packet size=" + iLimit);
            }
            cVarG.k(packet);
            if (s72.c()) {
                Trace.endSection();
                return;
            }
            return;
        }
        if (s72.c()) {
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
        c3f.c(this.i, "processUDPPacket :" + packet.toString());
        c cVar = new c(this.f20199j, this, packet, this.k);
        m(packet, cVar);
        cVar.h();
        if (s72.c()) {
            Trace.endSection();
        }
    }

    public void l(long j2, com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar) {
        synchronized (this.p) {
            this.p.put(Long.valueOf(j2), aVar);
        }
    }

    public void m(Packet packet, c cVar) {
        synchronized (this.o) {
            this.o.put(packet, cVar);
        }
    }

    public void n(long j2) {
        synchronized (this.p) {
            this.p.remove(Long.valueOf(j2));
        }
    }

    public void o() {
        new qv8(this, "TCPUDPServer").start();
    }

    public final void p() {
        ArrayList<com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a> arrayList;
        synchronized (this.p) {
            arrayList = new ArrayList(this.p.values());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (s72.c()) {
            Trace.beginSection("BtNet_backpressure_relieve_loop n=" + arrayList.size());
        }
        for (com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar : arrayList) {
            aVar.B();
            if (aVar.n() && this.k.u(aVar.s)) {
                aVar.C();
            }
        }
        if (s72.c()) {
            Trace.endSection();
        }
    }

    public void q(HBProxyConfig hBProxyConfig) {
        synchronized (this.p) {
            for (com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVar : this.p.values()) {
                if (aVar instanceof f6c) {
                    f6c f6cVar = (f6c) aVar;
                    if (f6cVar.L(hBProxyConfig.getIp(), hBProxyConfig.getPort())) {
                        f6cVar.U(hBProxyConfig);
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
    */
    public void run() {
        while (true) {
            try {
                if (this.m.peek() != null) {
                    a aVarPoll = this.m.poll();
                    if (aVarPoll != null) {
                        if (s72.c()) {
                            Trace.beginSection("BtNet_Nio_callback");
                        }
                        aVarPoll.a();
                        if (s72.c()) {
                            Trace.endSection();
                        }
                    }
                } else {
                    this.k.i.b();
                    boolean zH = h();
                    if (s72.c()) {
                        Trace.beginSection(zH ? "BtNet_Nio_select_300ms_bp" : "BtNet_Nio_select");
                    }
                    int iSelect = zH ? this.f20199j.select(300L) : this.f20199j.select();
                    if (s72.c()) {
                        Trace.endSection();
                    }
                    if (iSelect == 0) {
                        if (s72.c()) {
                            Trace.beginSection("BtNet_Nio_sleep");
                        }
                        Thread.sleep(5L);
                        if (s72.c()) {
                            Trace.endSection();
                        }
                    }
                    Iterator<SelectionKey> it = this.f20199j.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        if (next.isValid()) {
                            try {
                                Object objAttachment = next.attachment();
                                if (objAttachment instanceof coa) {
                                    if (s72.c()) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("BtNet_Nio_keyReady ");
                                        sb.append(next.isReadable() ? "R" : "");
                                        sb.append(next.isWritable() ? ExifInterface.LONGITUDE_WEST : "");
                                        sb.append(next.isConnectable() ? "C" : "");
                                        Trace.beginSection(sb.toString());
                                    }
                                    ((coa) objAttachment).b(next);
                                    if (s72.c()) {
                                        Trace.endSection();
                                    }
                                }
                            } catch (Exception unused) {
                                if (s72.c()) {
                                    Trace.endSection();
                                }
                                c3f.b(this.i, "ProxyServer iterate SelectionKey catch an exception:");
                            }
                        }
                        it.remove();
                    }
                    p();
                }
            } catch (Exception e2) {
                c3f.b(this.i, "run: ex " + e2);
                c3f.b(this.i, "ProxyServer catch an exception: " + e2.toString());
            }
        }
    }
}
