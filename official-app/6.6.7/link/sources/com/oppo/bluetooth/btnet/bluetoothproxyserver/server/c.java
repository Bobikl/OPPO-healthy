package com.oppo.bluetooth.btnet.bluetoothproxyserver.server;

import android.os.Trace;
import com.oplus.aiunit.vision.cyg;
import com.oplus.aiunit.vision.g82;
import com.oplus.aiunit.vision.i5i;
import com.oplus.aiunit.vision.lpa;
import com.oplus.aiunit.vision.o5f;
import com.oplus.aiunit.vision.ok9;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class c implements lpa, b.a {
    public final Selector a;
    public final b b;
    public Packet c;
    public SelectionKey d;
    public Packet e;
    public DatagramChannel f;
    public final ConcurrentLinkedQueue<Packet> g = new ConcurrentLinkedQueue<>();
    public ByteBuffer h = ByteBuffer.allocate(1500);
    public String i;
    public cyg j;

    public c(Selector selector, b bVar, Packet packet, cyg cygVar) {
        this.a = selector;
        this.b = bVar;
        this.c = packet;
        this.i = packet.getIpAndPort();
        this.e = packet.duplicated();
        this.j = cygVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        try {
            this.d = this.f.register(this.a, 1, this);
            o5f.c("UDPTunnel", "register ops:SelectionKey.OP_READ,ip" + this.i);
        } catch (ClosedChannelException e) {
            o5f.b("UDPTunnel", "onExcute: ex " + e);
        }
    }

    @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b.a
    public void a() {
        n();
    }

    @Override // com.oplus.aiunit.vision.lpa
    public void b(SelectionKey selectionKey) {
        j(selectionKey);
    }

    public void d(Packet packet) {
        this.g.offer(packet);
    }

    public void e() {
        try {
            SelectionKey selectionKey = this.d;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            DatagramChannel datagramChannel = this.f;
            if (datagramChannel != null) {
                datagramChannel.close();
            }
        } catch (Exception e) {
            o5f.e("UDPTunnel", "error to close UDP channel IpAndPort" + this.i + ",error is " + e.getMessage());
        }
    }

    public Packet f() {
        return this.c;
    }

    public Packet g() {
        return this.g.poll();
    }

    public void h() {
        o5f.c("UDPTunnel", "init  ipAndPort:" + this.i);
        Packet packet = this.c;
        InetAddress inetAddress = packet.ip4Header.destinationAddress;
        int i = packet.udpHeader.destinationPort;
        try {
            DatagramChannel datagramChannelOpen = DatagramChannel.open();
            this.f = datagramChannelOpen;
            datagramChannelOpen.configureBlocking(false);
            this.f.connect(new InetSocketAddress(inetAddress, i));
            this.b.a(new b.a() { // from class: com.oplus.aiunit.vision.qik
                @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b.a
                public final void a() {
                    this.a.i();
                }
            });
            this.c.swapSourceAndDestination();
            k(this.c);
        } catch (IOException e) {
            o5f.b("UDPTunnel", "initConnection: ex " + e);
            i5i.a(this.f);
        }
    }

    public final void j(SelectionKey selectionKey) {
        if (selectionKey.isWritable()) {
            m();
        } else if (selectionKey.isReadable()) {
            l();
        }
        n();
    }

    public void k(Packet packet) {
        d(packet);
        this.b.a(this);
        Selector selector = this.a;
        if (selector != null) {
            selector.wakeup();
        } else {
            o5f.e("UDPTunnel", "selector is null");
        }
    }

    public final void l() {
        o5f.c("UDPTunnel", "processReceived:" + this.i);
        this.h.position(28);
        try {
            int i = this.f.read(this.h);
            if (g82.c()) {
                Trace.beginSection("BtNet_Udp_read size=" + i);
            }
            if (i == -1) {
                this.b.e(this);
                o5f.c("UDPTunnel", "read  data error :" + this.i);
            } else if (i == 0) {
                o5f.c("UDPTunnel", "read no data :" + this.i);
            } else {
                o5f.c("UDPTunnel", "read readBytes:" + i + "ipAndPort:" + this.i);
                this.c.duplicated().updateUDPBuffer(this.h, i);
                this.h.flip();
                int i2 = i + 28;
                this.h.limit(i2);
                byte[] bArr = new byte[i2];
                this.h.get(bArr, 0, i2);
                ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.DNS_DATA, 0L, (byte) 0, i2, bArr);
                cyg cygVar = this.j;
                if (cygVar != null) {
                    cygVar.p().C(ok9VarB);
                }
            }
            if (g82.c()) {
                Trace.endSection();
            }
        } catch (Exception unused) {
            o5f.a("UDPTunnel", "failed to read udp datas ");
            this.b.e(this);
        }
    }

    public final void m() {
        o5f.c("UDPTunnel", "processWriteUDPData " + this.i);
        Packet packetG = g();
        if (packetG == null) {
            o5f.a("UDPTunnel", "write data  no packet ");
            return;
        }
        ByteBuffer byteBuffer = packetG.backingBuffer;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (g82.c()) {
            Trace.beginSection("BtNet_Udp_write size=" + iLimit);
        }
        try {
            byteBuffer.position(28);
            while (byteBuffer.hasRemaining()) {
                o5f.c("UDPTunnel", "channel.write ");
                this.f.write(byteBuffer);
            }
        } catch (IOException unused) {
            o5f.e("UDPTunnel", "Network write error: " + this.i);
            this.b.e(this);
        } finally {
            if (g82.c()) {
                Trace.endSection();
            }
        }
    }

    public void n() {
        int i;
        if (this.g.isEmpty()) {
            if (g82.c()) {
                Trace.beginSection("BtNet_Udp_updateInterest R");
                Trace.endSection();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("updateInterests SelectionKey.OP_READ ops :");
            i = 1;
            sb.append(1);
            sb.append(",ip");
            sb.append(this.i);
            o5f.d("UDPTunnel", sb.toString());
        } else {
            if (g82.c()) {
                Trace.beginSection("BtNet_Udp_updateInterest RW");
                Trace.endSection();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateInterests SelectionKey.OP_WRITE | SelectionKey.OP_READ ops :");
            i = 5;
            sb2.append(5);
            sb2.append(",ip");
            sb2.append(this.i);
            o5f.d("UDPTunnel", sb2.toString());
        }
        SelectionKey selectionKey = this.d;
        if (selectionKey != null && selectionKey.isValid()) {
            this.d.interestOps(i);
        }
        o5f.d("UDPTunnel", "updateInterests ops:" + i + ",ip" + this.i);
    }
}
