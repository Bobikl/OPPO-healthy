package com.oppo.bluetooth.btnet.bluetoothproxyserver.server;

import android.os.Trace;
import com.oplus.aiunit.vision.cyg;
import com.oplus.aiunit.vision.g82;
import com.oplus.aiunit.vision.lpa;
import com.oplus.aiunit.vision.o5f;
import com.oplus.aiunit.vision.ok9;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.ColorConnectManager;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class a implements lpa, b.a {
    public long a;
    public final b b;
    public SocketChannel c;
    public final Selector d;
    public SelectionKey e;
    public InetSocketAddress f;
    public volatile ByteBuffer g;
    public volatile ok9 l;
    public volatile ByteBuffer m;
    public volatile ok9 o;
    public volatile ok9 p;
    public cyg r;
    public volatile int s;
    public volatile boolean h = false;
    public volatile boolean i = false;
    public volatile boolean j = false;
    public volatile boolean k = false;
    public volatile boolean n = false;
    public ConcurrentLinkedQueue<ok9> q = new ConcurrentLinkedQueue<>();

    public a(long j, Selector selector, b bVar, cyg cygVar, int i) {
        this.a = -1L;
        this.a = j;
        this.d = selector;
        this.b = bVar;
        this.r = cygVar;
        this.s = i;
        if (i == 2) {
            this.g = ByteBuffer.allocate(HttpDataFactory.DEF_LENGTH);
        } else {
            this.g = ByteBuffer.allocate(24576);
        }
        if (g82.c()) {
            Trace.beginSection("BtNet_Tcp_ctor sid=" + this.a);
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(InetSocketAddress inetSocketAddress) {
        try {
            this.e = this.c.register(this.d, 8, this);
            this.c.connect(inetSocketAddress);
        } catch (Exception e) {
            o5f.b("TCPTunnel", "onExcute: ex " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.j = false;
        D();
        o5f.e("TCPTunnel", "resumeRemoteReadBundledWithTransportSwitch sid=" + this.a);
    }

    public final void A() {
        cyg cygVar;
        if (this.o == null || (cygVar = this.r) == null || !cygVar.z(this.o)) {
            return;
        }
        this.o = null;
        this.n = false;
        if (g82.c()) {
            Trace.beginSection("BtNet_backpressure_flushPendingOk sid=" + this.a);
            Trace.endSection();
        }
        o5f.d("TCPTunnel", "tryFlushPendingToClient ok sid=" + this.a);
    }

    public void B() {
        SocketChannel socketChannel;
        if (this.k && (socketChannel = this.c) != null && socketChannel.isConnected()) {
            if (this.m == null || !this.m.hasRemaining()) {
                this.l = null;
                this.m = null;
                this.k = false;
                D();
                return;
            }
            if (g82.c()) {
                Trace.beginSection("BtNet_backpressure_relieve_writeToServer sid=" + this.a);
            }
            try {
                if (G(this.m)) {
                    this.l = null;
                    this.m = null;
                    this.k = false;
                    if (g82.c()) {
                        Trace.beginSection("BtNet_backpressure_relieved_write sid=" + this.a);
                        Trace.endSection();
                    }
                }
                D();
            } catch (Exception e) {
                o5f.b("TCPTunnel", "tryRelieveBackpressure: " + e);
            } finally {
                if (g82.c()) {
                    Trace.endSection();
                }
            }
        }
    }

    public void C() {
        if (g82.c()) {
            Trace.beginSection("BtNet_backpressure_relieve_sendQueue sid=" + this.a);
        }
        A();
        z();
        D();
        if (g82.c()) {
            Trace.endSection();
        }
    }

    public void D() {
        if (!this.c.isConnected()) {
            o5f.e("TCPTunnel", "updateInterests mInnerChannel not connected:");
            SelectionKey selectionKey = this.e;
            if (selectionKey == null || !selectionKey.isValid()) {
                return;
            }
            this.e.interestOps(8);
            return;
        }
        int i = 0;
        boolean z = this.n || this.p != null;
        if ((this.m != null && this.m.hasRemaining()) || !this.q.isEmpty()) {
            i = (this.j || this.k || z) ? 4 : 5;
            if (g82.c()) {
                String str = (this.k || z) ? "_bp" : "";
                StringBuilder sb = new StringBuilder();
                sb.append("BtNet_Tcp_updateInterest sid=");
                sb.append(this.a);
                sb.append(i == 4 ? " W" : " RW");
                sb.append(str);
                Trace.beginSection(sb.toString());
                Trace.endSection();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateInterests ops:");
            sb2.append(i);
            sb2.append(this.k ? " (backpressure)" : "");
            o5f.d("TCPTunnel", sb2.toString());
        } else if (this.j || this.k || z) {
            if (this.j) {
                o5f.d("TCPTunnel", "updateInterests remove R ops :0");
            }
            o5f.d("TCPTunnel", "updateInterests remove W ops :0");
        } else {
            if (g82.c()) {
                Trace.beginSection("BtNet_Tcp_updateInterest sid=" + this.a + " R");
                Trace.endSection();
            }
            o5f.d("TCPTunnel", "updateInterests SelectionKey.OP_READ ops :1");
            i = 1;
        }
        SelectionKey selectionKey2 = this.e;
        if (selectionKey2 != null && selectionKey2.isValid()) {
            this.e.interestOps(i);
        }
        o5f.d("TCPTunnel", "updateInterests ops:" + i);
    }

    public void E(byte[] bArr) {
        if (this.r == null) {
            o5f.b("TCPTunnel", "writeToClient mServerTransportSession is null");
            return;
        }
        ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.TLS, this.a, (byte) 0, bArr.length, bArr);
        if (ok9VarB == null) {
            o5f.b("TCPTunnel", "writeToClient reqData is null");
            return;
        }
        this.r.i.a(bArr.length, this.a, this.s);
        ok9VarB.f = this.s;
        if (this.r.z(ok9VarB)) {
            return;
        }
        if (g82.c()) {
            Trace.beginSection("BtNet_backpressure_sendQueueFull sid=" + this.a);
            Trace.endSection();
        }
        o5f.d("TCPTunnel", "writeToClient send queue full, backpressure sid=" + this.a);
        this.o = ok9VarB;
        this.n = true;
        f(this);
        this.d.wakeup();
    }

    public void F(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (G(byteBufferWrap)) {
            return;
        }
        if (g82.c()) {
            Trace.beginSection("BtNet_backpressure_writeToServer_bytes sid=" + this.a);
            Trace.endSection();
        }
        this.m = byteBufferWrap;
        this.l = null;
        this.k = true;
    }

    public boolean G(ByteBuffer byteBuffer) throws Exception {
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            o5f.d("TCPTunnel", ">>>>>>>>>>write<<<<<<<");
            while (byteBuffer.hasRemaining()) {
                if (this.c.write(byteBuffer) == 0) {
                    if (g82.c()) {
                        Trace.beginSection("BtNet_backpressure_writeToServer sid=" + this.a);
                        Trace.endSection();
                    }
                    o5f.d("TCPTunnel", ">>>>>>>>>>write backpressure<<<<<<< ");
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b.a
    public void a() {
        if (!this.h) {
            A();
            z();
            D();
        } else {
            o5f.c("TCPTunnel", ">>>>>>>>>>onExcute mIsClosed = true<<<<<<<socketid" + this.a);
            this.r.w(this.a);
            j();
        }
    }

    @Override // com.oplus.aiunit.vision.lpa
    public void b(SelectionKey selectionKey) {
        if (selectionKey.isReadable()) {
            t(selectionKey);
        }
        if (selectionKey.isWritable()) {
            u(selectionKey);
        }
        if (selectionKey.isConnectable()) {
            s();
        }
        D();
    }

    public final void f(b.a aVar) {
        this.b.a(aVar);
    }

    public void g() {
        cyg cygVar;
        if (this.i) {
            return;
        }
        if (g82.c()) {
            Trace.beginSection("BtNet_Tcp_close sid=" + this.a);
        }
        try {
            SelectionKey selectionKey = this.e;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            SocketChannel socketChannel = this.c;
            if (socketChannel != null) {
                socketChannel.close();
            }
        } catch (Exception e) {
            o5f.e("TCPTunnel", "error to close tcp channel,error is " + e.getMessage());
        }
        if (g82.c()) {
            Trace.endSection();
        }
        this.q.clear();
        this.l = null;
        this.m = null;
        this.k = false;
        this.o = null;
        this.n = false;
        if (this.p != null && (cygVar = this.r) != null) {
            cygVar.j(this.p);
            this.p = null;
        }
        ok9 ok9VarA = HttpDataFactory.a(this.a, (byte) 4, HttpDataFactory.HTTP_DATA_EOT);
        ok9VarA.f = this.s;
        cyg cygVar2 = this.r;
        if (cygVar2 != null) {
            cygVar2.p().C(ok9VarA);
        } else {
            o5f.b("TCPTunnel", "finish() mServerTransportSession is null");
        }
        this.i = true;
    }

    public final void h(ok9 ok9Var) {
        byte[] bArrE = ok9Var.e();
        if (bArrE == null || bArrE.length < 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("MIGRATE_LINK_DIAG phone FLUSH gate bad payload sid=");
            sb.append(this.a);
            sb.append(" len=");
            sb.append(bArrE == null ? -1 : bArrE.length);
            o5f.b("TCPTunnel", sb.toString());
            return;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrE).order(ByteOrder.BIG_ENDIAN);
        long j = byteBufferOrder.getLong();
        int i = byteBufferOrder.getInt();
        cyg cygVar = this.r;
        if (cygVar == null) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate no session sid=" + this.a + " reqId=" + j);
            return;
        }
        ColorConnectManager colorConnectManagerP = cygVar.p();
        if (colorConnectManagerP == null) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate no ConnectManager sid=" + this.a + " reqId=" + j);
            return;
        }
        ok9 ok9VarI = colorConnectManagerP.i(this.a, j, i, 0, this.s);
        if (ok9VarI == null) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate build ack failed sid=" + this.a + " reqId=" + j);
            return;
        }
        if (this.r.z(ok9VarI)) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH polled sid=" + this.a + " reqId=" + j + " dir=" + i + " -> tryAddData2SendQue ok (FLUSH_ACK will go DownLink)");
            return;
        }
        this.p = ok9VarI;
        o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH polled sid=" + this.a + " reqId=" + j + " -> tryAddData2SendQue full, mPendingFlushAck (no drop)");
        f(this);
        this.d.wakeup();
    }

    public void i(final InetSocketAddress inetSocketAddress) throws Exception {
        SocketChannel socketChannelOpen = SocketChannel.open();
        this.c = socketChannelOpen;
        socketChannelOpen.configureBlocking(false);
        this.f = inetSocketAddress;
        f(new b.a() { // from class: com.oplus.aiunit.vision.qpj
            @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b.a
            public final void a() {
                this.a.p(inetSocketAddress);
            }
        });
        this.d.wakeup();
    }

    public void j() {
        if (g82.c()) {
            Trace.beginSection("BtNet_Tcp_dispose sid=" + this.a);
        }
        o5f.c("TCPTunnel", ">>>>>>>>>>dispose<<<<<<< socketid:" + this.a);
        g();
        this.b.n(this.a);
        if (g82.c()) {
            Trace.endSection();
        }
    }

    public final void k(byte b, int i) {
        if (this.r == null) {
            o5f.b("TCPTunnel", "enqueuePauseResumeAckToWatch: session null sid=" + this.a);
            return;
        }
        byte b2 = b == 5 ? (byte) 7 : (byte) 8;
        ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.TLS, this.a, b2, 0, new byte[0]);
        if (ok9VarB == null) {
            o5f.b("TCPTunnel", "enqueuePauseResumeAckToWatch: getHttpData null sid=" + this.a);
            return;
        }
        ok9VarB.f = i;
        ColorConnectManager colorConnectManagerP = this.r.p();
        if (colorConnectManagerP == null) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone send TLS_ACK fallback_sendQue sid=" + this.a + " g=" + ((int) b2) + " (ConnectManager null)");
            this.r.j(ok9VarB);
            return;
        }
        colorConnectManagerP.C(ok9VarB);
        StringBuilder sb = new StringBuilder();
        sb.append("MIGRATE_LINK_DIAG phone send TLS_ACK sid=");
        sb.append(this.a);
        sb.append(" g=");
        sb.append((int) b2);
        sb.append(" (");
        sb.append(b2 == 7 ? "PAUSE_ACK(0x07)" : "RESUME_ACK(0x08)");
        sb.append(") replyTr=");
        sb.append(i);
        sb.append(" tunnelTr=");
        sb.append(this.s);
        sb.append(" via sendHttpData");
        o5f.b("TCPTunnel", sb.toString());
    }

    public void l(final long j, final int i) {
        x(new Runnable() { // from class: com.oplus.aiunit.vision.opj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.q(j, i);
            }
        });
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void q(long j, int i) {
        cyg cygVar = this.r;
        ColorConnectManager colorConnectManagerP = cygVar != null ? cygVar.p() : null;
        if (this.h) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate skip tunnel_closed sid=" + this.a + " reqId=" + j);
            if (colorConnectManagerP != null) {
                colorConnectManagerP.A(this.a, j, i, 1);
                return;
            }
            return;
        }
        if (this.q.size() >= 256) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate NACK queue_full sid=" + this.a + " reqId=" + j);
            if (colorConnectManagerP != null) {
                colorConnectManagerP.A(this.a, j, i, 3);
                return;
            }
            return;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.putLong(j);
        byteBufferOrder.putInt(i);
        byte[] bArrArray = byteBufferOrder.array();
        ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.TLS, this.a, (byte) 9, bArrArray.length, bArrArray);
        if (ok9VarB == null) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate NACK build_fail sid=" + this.a + " reqId=" + j);
            if (colorConnectManagerP != null) {
                colorConnectManagerP.A(this.a, j, i, 2);
                return;
            }
            return;
        }
        this.q.offer(ok9VarB);
        o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate enqueued sid=" + this.a + " reqId=" + j + " dir=" + i + " qSize=" + this.q.size());
        f(this);
        this.d.wakeup();
    }

    public boolean n() {
        return this.n || this.p != null;
    }

    public boolean o() {
        return this.k;
    }

    public void s() {
        o5f.c("TCPTunnel", ">>>>>>>>>>onConnectable<<<<<<< socketid:" + this.a);
        if (g82.c()) {
            g82.a("Tcp_onConnectable sid=" + this.a);
        }
        try {
            if (this.c.finishConnect()) {
                D();
            } else {
                j();
            }
        } catch (Exception e) {
            o5f.b("TCPTunnel", "onConnectable: ex " + e);
            j();
        } finally {
            if (g82.c()) {
                g82.b();
            }
        }
    }

    public void t(SelectionKey selectionKey) {
        o5f.d("TCPTunnel", ">>>>>>>>>>onReadable<<<<<<<socketid" + this.a);
        if (this.h) {
            o5f.e("TCPTunnel", "onReadable: closed dispose");
            j();
            return;
        }
        try {
            this.g.clear();
            int i = this.c.read(this.g);
            if (g82.c()) {
                Trace.beginSection("BtNet_Tcp_read sid=" + this.a + " size=" + i);
            }
            if (i > 0) {
                this.g.flip();
                E(Arrays.copyOf(this.g.array(), i));
            } else if (i < 0) {
                o5f.b("TCPTunnel", ">>>>>>>>>>onReadable error<<<<<<< socketid: " + this.a);
                j();
            }
            if (g82.c()) {
                Trace.endSection();
            }
        } catch (Exception e) {
            if (g82.c()) {
                Trace.endSection();
            }
            o5f.b("TCPTunnel", ">>>>>>>>>>onReadable <<<<<<< onReadable catch an exception:" + e);
            j();
        }
    }

    public void u(SelectionKey selectionKey) {
        o5f.d("TCPTunnel", ">>>>>>>>>>onWritable<<<<<<<sid:" + this.a);
        try {
            if (g82.c()) {
                Trace.beginSection("BtNet_Tcp_write sid=" + this.a);
            }
            if (this.m != null) {
                if (!G(this.m)) {
                    if (g82.c()) {
                        Trace.beginSection("BtNet_backpressure_onWritable_curBuf sid=" + this.a);
                        Trace.endSection();
                    }
                    this.k = true;
                    D();
                    if (g82.c()) {
                        Trace.endSection();
                        return;
                    }
                    return;
                }
                this.l = null;
                this.m = null;
                this.k = false;
            }
            ok9 ok9VarPoll = this.q.poll();
            if (ok9VarPoll == null) {
                o5f.c("TCPTunnel", "<<<<<< Socket  " + this.a + "  mNeedWriteData poll empty");
                D();
                if (g82.c()) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            if (ok9VarPoll.e() != null) {
                int length = ok9VarPoll.e().length;
            }
            if (ok9VarPoll.l() == 1536) {
                o5f.c("TCPTunnel", "<<<<<< Socket " + this.a + "  thread exit <<<<<< [NO_MORE_DATA]");
                if (g82.c()) {
                    Trace.endSection();
                }
                D();
                return;
            }
            o5f.a("TCPTunnel", "onWritable  mSocketID = " + this.a + "   group = " + ((int) ok9VarPoll.f()));
            if (ok9VarPoll.f() == 4) {
                o5f.a("TCPTunnel", "client request to close socket mSocketID" + this.a);
                cyg cygVar = this.r;
                if (cygVar != null) {
                    cygVar.w(this.a);
                } else {
                    o5f.b("TCPTunnel", "finish() mServerTransportSession is null");
                }
                D();
                j();
                o5f.c("TCPTunnel", "<<<<<< Socket " + this.a + " thread exit <<<<<< [CONNECTION CLOSE]");
                if (g82.c()) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            if (ok9VarPoll.f() == 9) {
                h(ok9VarPoll);
                D();
                if (g82.c()) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            if (ok9VarPoll.f() != 5 && ok9VarPoll.f() != 6) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(ok9VarPoll.e() != null ? ok9VarPoll.e() : new byte[0]);
                if (!G(byteBufferWrap)) {
                    if (g82.c()) {
                        Trace.beginSection("BtNet_backpressure_onWritable_newPkt sid=" + this.a);
                        Trace.endSection();
                    }
                    this.l = ok9VarPoll;
                    this.m = byteBufferWrap;
                    this.k = true;
                }
                if (g82.c()) {
                    Trace.endSection();
                }
                D();
                return;
            }
            k(ok9VarPoll.f(), ok9VarPoll.f);
            D();
        } catch (Exception e) {
            if (g82.c()) {
                Trace.endSection();
            }
            o5f.c("TCPTunnel", "onWritable catch an exception:" + e);
            j();
        }
    }

    public void v(ok9 ok9Var) {
        if (ok9Var.l() == 1556) {
            o5f.e("TCPTunnel", "processPacket: drop BTNET_FLUSH_ACK_MSG from peer sid=" + this.a);
            return;
        }
        if (ok9Var.f() == 9) {
            o5f.e("TCPTunnel", "processPacket: drop FLUSH_GATE from peer (internal-only) sid=" + this.a);
            return;
        }
        if (ok9Var.f() == 4) {
            this.q.offer(ok9Var);
            this.h = true;
            f(this);
            this.d.wakeup();
            return;
        }
        if (this.q.size() >= 256) {
            o5f.b("TCPTunnel", "write queue overflow sid=" + this.a + " size=" + this.q.size() + ", dispose tunnel");
            this.h = true;
            f(this);
            this.d.wakeup();
            return;
        }
        this.q.offer(ok9Var);
        if (ok9Var.f() == 5) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone recv TLS PAUSE(0x05) sid=" + this.a + " (入 mNeedWriteData，onWritable 后回 PAUSE_ACK)");
            this.j = true;
        } else if (ok9Var.f() == 6) {
            o5f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone recv TLS RESUME(0x06) sid=" + this.a + " (入队，onWritable 后回 RESUME_ACK)");
            this.j = false;
        }
        f(this);
        this.d.wakeup();
    }

    public void w() {
        x(new Runnable() { // from class: com.oplus.aiunit.vision.ppj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.r();
            }
        });
    }

    public final void x(final Runnable runnable) {
        Objects.requireNonNull(runnable);
        f(new b.a() { // from class: com.oplus.aiunit.vision.rpj
            @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b.a
            public final void a() {
                runnable.run();
            }
        });
        this.d.wakeup();
    }

    public void y(int i) {
        if (this.s == i) {
            return;
        }
        this.s = i;
        if (i == 2) {
            this.g = ByteBuffer.allocate(HttpDataFactory.DEF_LENGTH);
        } else {
            this.g = ByteBuffer.allocate(24576);
        }
        f(this);
        this.d.wakeup();
        o5f.e("TCPTunnel", "setPhoneSideTransportType sid=" + this.a + " -> " + i);
    }

    public final void z() {
        cyg cygVar;
        if (this.p == null || (cygVar = this.r) == null || !cygVar.z(this.p)) {
            return;
        }
        this.p = null;
        o5f.e("TCPTunnel", "tryFlushPendingFlushAck ok sid=" + this.a);
    }
}
