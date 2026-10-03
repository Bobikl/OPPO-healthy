package com.oppo.bluetooth.btnet.bluetoothproxyserver.server;

import android.os.Trace;
import com.oplus.aiunit.vision.c3f;
import com.oplus.aiunit.vision.coa;
import com.oplus.aiunit.vision.ij9;
import com.oplus.aiunit.vision.mug;
import com.oplus.aiunit.vision.s72;
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

/* JADX INFO: loaded from: classes9.dex */
public class a implements coa, b.a {
    public long a;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SocketChannel f20194c;
    public final Selector d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SelectionKey f20195e;
    public InetSocketAddress f;
    public volatile ByteBuffer g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile ij9 f20197l;
    public volatile ByteBuffer m;
    public volatile ij9 o;
    public volatile ij9 p;
    public mug r;
    public volatile int s;
    public volatile boolean h = false;
    public volatile boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f20196j = false;
    public volatile boolean k = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f20198n = false;
    public ConcurrentLinkedQueue<ij9> q = new ConcurrentLinkedQueue<>();

    public a(long j2, Selector selector, b bVar, mug mugVar, int i) {
        this.a = -1L;
        this.a = j2;
        this.d = selector;
        this.b = bVar;
        this.r = mugVar;
        this.s = i;
        if (i == 2) {
            this.g = ByteBuffer.allocate(10240);
        } else {
            this.g = ByteBuffer.allocate(24576);
        }
        if (s72.c()) {
            Trace.beginSection("BtNet_Tcp_ctor sid=" + this.a);
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(InetSocketAddress inetSocketAddress) {
        try {
            this.f20195e = this.f20194c.register(this.d, 8, this);
            this.f20194c.connect(inetSocketAddress);
        } catch (Exception e2) {
            c3f.b("TCPTunnel", "onExcute: ex " + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f20196j = false;
        D();
        c3f.e("TCPTunnel", "resumeRemoteReadBundledWithTransportSwitch sid=" + this.a);
    }

    public final void A() {
        mug mugVar;
        if (this.o == null || (mugVar = this.r) == null || !mugVar.z(this.o)) {
            return;
        }
        this.o = null;
        this.f20198n = false;
        if (s72.c()) {
            Trace.beginSection("BtNet_backpressure_flushPendingOk sid=" + this.a);
            Trace.endSection();
        }
        c3f.d("TCPTunnel", "tryFlushPendingToClient ok sid=" + this.a);
    }

    public void B() {
        SocketChannel socketChannel;
        if (this.k && (socketChannel = this.f20194c) != null && socketChannel.isConnected()) {
            if (this.m == null || !this.m.hasRemaining()) {
                this.f20197l = null;
                this.m = null;
                this.k = false;
                D();
                return;
            }
            if (s72.c()) {
                Trace.beginSection("BtNet_backpressure_relieve_writeToServer sid=" + this.a);
            }
            try {
                if (G(this.m)) {
                    this.f20197l = null;
                    this.m = null;
                    this.k = false;
                    if (s72.c()) {
                        Trace.beginSection("BtNet_backpressure_relieved_write sid=" + this.a);
                        Trace.endSection();
                    }
                }
                D();
            } catch (Exception e2) {
                c3f.b("TCPTunnel", "tryRelieveBackpressure: " + e2);
            } finally {
                if (s72.c()) {
                    Trace.endSection();
                }
            }
        }
    }

    public void C() {
        if (s72.c()) {
            Trace.beginSection("BtNet_backpressure_relieve_sendQueue sid=" + this.a);
        }
        A();
        z();
        D();
        if (s72.c()) {
            Trace.endSection();
        }
    }

    public void D() {
        if (!this.f20194c.isConnected()) {
            c3f.e("TCPTunnel", "updateInterests mInnerChannel not connected:");
            SelectionKey selectionKey = this.f20195e;
            if (selectionKey == null || !selectionKey.isValid()) {
                return;
            }
            this.f20195e.interestOps(8);
            return;
        }
        int i = 0;
        boolean z = this.f20198n || this.p != null;
        if ((this.m != null && this.m.hasRemaining()) || !this.q.isEmpty()) {
            i = (this.f20196j || this.k || z) ? 4 : 5;
            if (s72.c()) {
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
            c3f.d("TCPTunnel", sb2.toString());
        } else if (this.f20196j || this.k || z) {
            if (this.f20196j) {
                c3f.d("TCPTunnel", "updateInterests remove R ops :0");
            }
            c3f.d("TCPTunnel", "updateInterests remove W ops :0");
        } else {
            if (s72.c()) {
                Trace.beginSection("BtNet_Tcp_updateInterest sid=" + this.a + " R");
                Trace.endSection();
            }
            c3f.d("TCPTunnel", "updateInterests SelectionKey.OP_READ ops :1");
            i = 1;
        }
        SelectionKey selectionKey2 = this.f20195e;
        if (selectionKey2 != null && selectionKey2.isValid()) {
            this.f20195e.interestOps(i);
        }
        c3f.d("TCPTunnel", "updateInterests ops:" + i);
    }

    public void E(byte[] bArr) {
        if (this.r == null) {
            c3f.b("TCPTunnel", "writeToClient mServerTransportSession is null");
            return;
        }
        ij9 ij9VarB = HttpDataFactory.b(HttpDataFactory.TLS, this.a, (byte) 0, bArr.length, bArr);
        if (ij9VarB == null) {
            c3f.b("TCPTunnel", "writeToClient reqData is null");
            return;
        }
        this.r.i.a(bArr.length, this.a, this.s);
        ij9VarB.f = this.s;
        if (this.r.z(ij9VarB)) {
            return;
        }
        if (s72.c()) {
            Trace.beginSection("BtNet_backpressure_sendQueueFull sid=" + this.a);
            Trace.endSection();
        }
        c3f.d("TCPTunnel", "writeToClient send queue full, backpressure sid=" + this.a);
        this.o = ij9VarB;
        this.f20198n = true;
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
        if (s72.c()) {
            Trace.beginSection("BtNet_backpressure_writeToServer_bytes sid=" + this.a);
            Trace.endSection();
        }
        this.m = byteBufferWrap;
        this.f20197l = null;
        this.k = true;
    }

    public boolean G(ByteBuffer byteBuffer) throws Exception {
        if (byteBuffer != null && byteBuffer.hasRemaining()) {
            c3f.d("TCPTunnel", ">>>>>>>>>>write<<<<<<<");
            while (byteBuffer.hasRemaining()) {
                if (this.f20194c.write(byteBuffer) == 0) {
                    if (s72.c()) {
                        Trace.beginSection("BtNet_backpressure_writeToServer sid=" + this.a);
                        Trace.endSection();
                    }
                    c3f.d("TCPTunnel", ">>>>>>>>>>write backpressure<<<<<<< ");
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
            c3f.c("TCPTunnel", ">>>>>>>>>>onExcute mIsClosed = true<<<<<<<socketid" + this.a);
            this.r.w(this.a);
            j();
        }
    }

    @Override // com.oplus.aiunit.vision.coa
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
        mug mugVar;
        if (this.i) {
            return;
        }
        if (s72.c()) {
            Trace.beginSection("BtNet_Tcp_close sid=" + this.a);
        }
        try {
            SelectionKey selectionKey = this.f20195e;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            SocketChannel socketChannel = this.f20194c;
            if (socketChannel != null) {
                socketChannel.close();
            }
        } catch (Exception e2) {
            c3f.e("TCPTunnel", "error to close tcp channel,error is " + e2.getMessage());
        }
        if (s72.c()) {
            Trace.endSection();
        }
        this.q.clear();
        this.f20197l = null;
        this.m = null;
        this.k = false;
        this.o = null;
        this.f20198n = false;
        if (this.p != null && (mugVar = this.r) != null) {
            mugVar.j(this.p);
            this.p = null;
        }
        ij9 ij9VarA = HttpDataFactory.a(this.a, (byte) 4, HttpDataFactory.HTTP_DATA_EOT);
        ij9VarA.f = this.s;
        mug mugVar2 = this.r;
        if (mugVar2 != null) {
            mugVar2.p().C(ij9VarA);
        } else {
            c3f.b("TCPTunnel", "finish() mServerTransportSession is null");
        }
        this.i = true;
    }

    public final void h(ij9 ij9Var) {
        byte[] bArrE = ij9Var.e();
        if (bArrE == null || bArrE.length < 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("MIGRATE_LINK_DIAG phone FLUSH gate bad payload sid=");
            sb.append(this.a);
            sb.append(" len=");
            sb.append(bArrE == null ? -1 : bArrE.length);
            c3f.b("TCPTunnel", sb.toString());
            return;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrE).order(ByteOrder.BIG_ENDIAN);
        long j2 = byteBufferOrder.getLong();
        int i = byteBufferOrder.getInt();
        mug mugVar = this.r;
        if (mugVar == null) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate no session sid=" + this.a + " reqId=" + j2);
            return;
        }
        ColorConnectManager colorConnectManagerP = mugVar.p();
        if (colorConnectManagerP == null) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate no ConnectManager sid=" + this.a + " reqId=" + j2);
            return;
        }
        ij9 ij9VarI = colorConnectManagerP.i(this.a, j2, i, 0, this.s);
        if (ij9VarI == null) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate build ack failed sid=" + this.a + " reqId=" + j2);
            return;
        }
        if (this.r.z(ij9VarI)) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH polled sid=" + this.a + " reqId=" + j2 + " dir=" + i + " -> tryAddData2SendQue ok (FLUSH_ACK will go DownLink)");
            return;
        }
        this.p = ij9VarI;
        c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH polled sid=" + this.a + " reqId=" + j2 + " -> tryAddData2SendQue full, mPendingFlushAck (no drop)");
        f(this);
        this.d.wakeup();
    }

    public void i(final InetSocketAddress inetSocketAddress) throws Exception {
        SocketChannel socketChannelOpen = SocketChannel.open();
        this.f20194c = socketChannelOpen;
        socketChannelOpen.configureBlocking(false);
        this.f = inetSocketAddress;
        f(new b.a() { // from class: com.oplus.aiunit.vision.slj
            @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b.a
            public final void a() {
                this.a.p(inetSocketAddress);
            }
        });
        this.d.wakeup();
    }

    public void j() {
        if (s72.c()) {
            Trace.beginSection("BtNet_Tcp_dispose sid=" + this.a);
        }
        c3f.c("TCPTunnel", ">>>>>>>>>>dispose<<<<<<< socketid:" + this.a);
        g();
        this.b.n(this.a);
        if (s72.c()) {
            Trace.endSection();
        }
    }

    public final void k(byte b, int i) {
        if (this.r == null) {
            c3f.b("TCPTunnel", "enqueuePauseResumeAckToWatch: session null sid=" + this.a);
            return;
        }
        byte b2 = b == 5 ? (byte) 7 : (byte) 8;
        ij9 ij9VarB = HttpDataFactory.b(HttpDataFactory.TLS, this.a, b2, 0, new byte[0]);
        if (ij9VarB == null) {
            c3f.b("TCPTunnel", "enqueuePauseResumeAckToWatch: getHttpData null sid=" + this.a);
            return;
        }
        ij9VarB.f = i;
        ColorConnectManager colorConnectManagerP = this.r.p();
        if (colorConnectManagerP == null) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone send TLS_ACK fallback_sendQue sid=" + this.a + " g=" + ((int) b2) + " (ConnectManager null)");
            this.r.j(ij9VarB);
            return;
        }
        colorConnectManagerP.C(ij9VarB);
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
        c3f.b("TCPTunnel", sb.toString());
    }

    public void l(final long j2, final int i) {
        x(new Runnable() { // from class: com.oplus.aiunit.vision.qlj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.q(j2, i);
            }
        });
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void q(long j2, int i) {
        mug mugVar = this.r;
        ColorConnectManager colorConnectManagerP = mugVar != null ? mugVar.p() : null;
        if (this.h) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate skip tunnel_closed sid=" + this.a + " reqId=" + j2);
            if (colorConnectManagerP != null) {
                colorConnectManagerP.A(this.a, j2, i, 1);
                return;
            }
            return;
        }
        if (this.q.size() >= 256) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate NACK queue_full sid=" + this.a + " reqId=" + j2);
            if (colorConnectManagerP != null) {
                colorConnectManagerP.A(this.a, j2, i, 3);
                return;
            }
            return;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.putLong(j2);
        byteBufferOrder.putInt(i);
        byte[] bArrArray = byteBufferOrder.array();
        ij9 ij9VarB = HttpDataFactory.b(HttpDataFactory.TLS, this.a, (byte) 9, bArrArray.length, bArrArray);
        if (ij9VarB == null) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate NACK build_fail sid=" + this.a + " reqId=" + j2);
            if (colorConnectManagerP != null) {
                colorConnectManagerP.A(this.a, j2, i, 2);
                return;
            }
            return;
        }
        this.q.offer(ij9VarB);
        c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone FLUSH gate enqueued sid=" + this.a + " reqId=" + j2 + " dir=" + i + " qSize=" + this.q.size());
        f(this);
        this.d.wakeup();
    }

    public boolean n() {
        return this.f20198n || this.p != null;
    }

    public boolean o() {
        return this.k;
    }

    public void s() {
        c3f.c("TCPTunnel", ">>>>>>>>>>onConnectable<<<<<<< socketid:" + this.a);
        if (s72.c()) {
            s72.a("Tcp_onConnectable sid=" + this.a);
        }
        try {
            if (this.f20194c.finishConnect()) {
                D();
            } else {
                j();
            }
        } catch (Exception e2) {
            c3f.b("TCPTunnel", "onConnectable: ex " + e2);
            j();
        } finally {
            if (s72.c()) {
                s72.b();
            }
        }
    }

    public void t(SelectionKey selectionKey) {
        c3f.d("TCPTunnel", ">>>>>>>>>>onReadable<<<<<<<socketid" + this.a);
        if (this.h) {
            c3f.e("TCPTunnel", "onReadable: closed dispose");
            j();
            return;
        }
        try {
            this.g.clear();
            int i = this.f20194c.read(this.g);
            if (s72.c()) {
                Trace.beginSection("BtNet_Tcp_read sid=" + this.a + " size=" + i);
            }
            if (i > 0) {
                this.g.flip();
                E(Arrays.copyOf(this.g.array(), i));
            } else if (i < 0) {
                c3f.b("TCPTunnel", ">>>>>>>>>>onReadable error<<<<<<< socketid: " + this.a);
                j();
            }
            if (s72.c()) {
                Trace.endSection();
            }
        } catch (Exception e2) {
            if (s72.c()) {
                Trace.endSection();
            }
            c3f.b("TCPTunnel", ">>>>>>>>>>onReadable <<<<<<< onReadable catch an exception:" + e2);
            j();
        }
    }

    public void u(SelectionKey selectionKey) {
        c3f.d("TCPTunnel", ">>>>>>>>>>onWritable<<<<<<<sid:" + this.a);
        try {
            if (s72.c()) {
                Trace.beginSection("BtNet_Tcp_write sid=" + this.a);
            }
            if (this.m != null) {
                if (!G(this.m)) {
                    if (s72.c()) {
                        Trace.beginSection("BtNet_backpressure_onWritable_curBuf sid=" + this.a);
                        Trace.endSection();
                    }
                    this.k = true;
                    D();
                    if (s72.c()) {
                        Trace.endSection();
                        return;
                    }
                    return;
                }
                this.f20197l = null;
                this.m = null;
                this.k = false;
            }
            ij9 ij9VarPoll = this.q.poll();
            if (ij9VarPoll == null) {
                c3f.c("TCPTunnel", "<<<<<< Socket  " + this.a + "  mNeedWriteData poll empty");
                D();
                if (s72.c()) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            if (ij9VarPoll.e() != null) {
                int length = ij9VarPoll.e().length;
            }
            if (ij9VarPoll.l() == 1536) {
                c3f.c("TCPTunnel", "<<<<<< Socket " + this.a + "  thread exit <<<<<< [NO_MORE_DATA]");
                if (s72.c()) {
                    Trace.endSection();
                }
                D();
                return;
            }
            c3f.a("TCPTunnel", "onWritable  mSocketID = " + this.a + "   group = " + ((int) ij9VarPoll.f()));
            if (ij9VarPoll.f() == 4) {
                c3f.a("TCPTunnel", "client request to close socket mSocketID" + this.a);
                mug mugVar = this.r;
                if (mugVar != null) {
                    mugVar.w(this.a);
                } else {
                    c3f.b("TCPTunnel", "finish() mServerTransportSession is null");
                }
                D();
                j();
                c3f.c("TCPTunnel", "<<<<<< Socket " + this.a + " thread exit <<<<<< [CONNECTION CLOSE]");
                if (s72.c()) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            if (ij9VarPoll.f() == 9) {
                h(ij9VarPoll);
                D();
                if (s72.c()) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            if (ij9VarPoll.f() != 5 && ij9VarPoll.f() != 6) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(ij9VarPoll.e() != null ? ij9VarPoll.e() : new byte[0]);
                if (!G(byteBufferWrap)) {
                    if (s72.c()) {
                        Trace.beginSection("BtNet_backpressure_onWritable_newPkt sid=" + this.a);
                        Trace.endSection();
                    }
                    this.f20197l = ij9VarPoll;
                    this.m = byteBufferWrap;
                    this.k = true;
                }
                if (s72.c()) {
                    Trace.endSection();
                }
                D();
                return;
            }
            k(ij9VarPoll.f(), ij9VarPoll.f);
            D();
        } catch (Exception e2) {
            if (s72.c()) {
                Trace.endSection();
            }
            c3f.c("TCPTunnel", "onWritable catch an exception:" + e2);
            j();
        }
    }

    public void v(ij9 ij9Var) {
        if (ij9Var.l() == 1556) {
            c3f.e("TCPTunnel", "processPacket: drop BTNET_FLUSH_ACK_MSG from peer sid=" + this.a);
            return;
        }
        if (ij9Var.f() == 9) {
            c3f.e("TCPTunnel", "processPacket: drop FLUSH_GATE from peer (internal-only) sid=" + this.a);
            return;
        }
        if (ij9Var.f() == 4) {
            this.q.offer(ij9Var);
            this.h = true;
            f(this);
            this.d.wakeup();
            return;
        }
        if (this.q.size() >= 256) {
            c3f.b("TCPTunnel", "write queue overflow sid=" + this.a + " size=" + this.q.size() + ", dispose tunnel");
            this.h = true;
            f(this);
            this.d.wakeup();
            return;
        }
        this.q.offer(ij9Var);
        if (ij9Var.f() == 5) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone recv TLS PAUSE(0x05) sid=" + this.a + " (入 mNeedWriteData，onWritable 后回 PAUSE_ACK)");
            this.f20196j = true;
        } else if (ij9Var.f() == 6) {
            c3f.b("TCPTunnel", "MIGRATE_LINK_DIAG phone recv TLS RESUME(0x06) sid=" + this.a + " (入队，onWritable 后回 RESUME_ACK)");
            this.f20196j = false;
        }
        f(this);
        this.d.wakeup();
    }

    public void w() {
        x(new Runnable() { // from class: com.oplus.aiunit.vision.rlj
            @Override // java.lang.Runnable
            public final void run() {
                this.i.r();
            }
        });
    }

    public final void x(final Runnable runnable) {
        Objects.requireNonNull(runnable);
        f(new b.a() { // from class: com.oplus.aiunit.vision.tlj
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
            this.g = ByteBuffer.allocate(10240);
        } else {
            this.g = ByteBuffer.allocate(24576);
        }
        f(this);
        this.d.wakeup();
        c3f.e("TCPTunnel", "setPhoneSideTransportType sid=" + this.a + " -> " + i);
    }

    public final void z() {
        mug mugVar;
        if (this.p == null || (mugVar = this.r) == null || !mugVar.z(this.p)) {
            return;
        }
        this.p = null;
        c3f.e("TCPTunnel", "tryFlushPendingFlushAck ok sid=" + this.a);
    }
}
