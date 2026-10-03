package com.oplus.aiunit.vision;

import android.os.Trace;
import android.util.LongSparseArray;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.wearable.btnet.proto.HBProxyConfig;
import com.heytap.wearable.btnet.proto.HttpDataProto;
import com.heytap.wearable.btnet.proto.ProxyACKReq;
import com.heytap.wearable.btnet.proto.ProxyACKRsp;
import com.lifesense.android.bluetooth.core.bean.NetstrapPacket;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.ColorConnectManager;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.Packet;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes9.dex */
public class mug implements MyLRUCache.a<ey9> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f14235c;
    public a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f14236e;
    public po4 f;
    public com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b g;
    public final int h;
    public qnc i;
    public ulj k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorConnectManager f14238l;
    public final MyLRUCache<Long, ey9> a = new MyLRUCache<>(23, this);
    public final byte[] b = new byte[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray<ij9> f14237j = new LongSparseArray<>();
    public final LinkedBlockingQueue<ij9> m = new LinkedBlockingQueue<>(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedBlockingQueue<ij9> f14239n = new LinkedBlockingQueue<>(80);
    public final BlockingQueue<HttpDataWrapper> o = new LinkedBlockingQueue(200);
    public cn9 p = null;

    public class a extends b {
        public void a() {
            this.i = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                mug.this.m.put(HttpDataFactory.b(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e2) {
                c3f.b("ServerTransportSession", "stopThread: ex " + e2);
            }
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            c3f.c("ServerTransportSession", ">>>>>> 发送数据到蓝牙线程启动 >>>>>>");
            while (!this.i) {
                c3f.a("ServerTransportSession", "获取数据发送到客户端...");
                try {
                    if (s72.c()) {
                        Trace.beginSection("BtNet_DownLink_get");
                    }
                    ij9 ij9VarR = mug.this.r();
                    if (s72.c()) {
                        Trace.endSection();
                    }
                    if (ij9VarR == null) {
                        c3f.e("ServerTransportSession", "取到空数据 getDataFromSendQue!");
                    } else {
                        if (ij9VarR.l() == 1536) {
                            if (s72.c()) {
                                Trace.beginSection("BtNet_DownLink_noMore");
                                Trace.endSection();
                            }
                            c3f.c("ServerTransportSession", "<<<<<< 发送数据到蓝牙线程退出 <<<<<<");
                            mug.this.m.clear();
                            return;
                        }
                        if (ij9VarR.l() == 1553) {
                            ProxyACKReq from = ProxyACKReq.parseFrom(ij9VarR.e());
                            if (s72.c()) {
                                Trace.beginSection("BtNet_DownLink_ackReq id=" + from.getId());
                            }
                            synchronized (mug.this.f14237j) {
                                mug.this.f14237j.put(from.getId(), ij9VarR);
                            }
                            mug.this.f14238l.C(ij9VarR);
                            if (s72.c()) {
                                Trace.endSection();
                                Trace.beginSection("BtNet_DownLink_sleep id=" + from.getId());
                            }
                            synchronized (ij9VarR) {
                                int sleep = from.getSleep();
                                c3f.a("ServerTransportSession", "DownLinkThread >> run sleep:" + sleep + " req id:" + from.getId());
                                ij9VarR.wait((long) sleep);
                                c3f.a("ServerTransportSession", "DownLinkThread >> run after sleep:" + sleep + " req id:" + from.getId());
                            }
                            if (s72.c()) {
                                Trace.endSection();
                            }
                            synchronized (mug.this.f14237j) {
                                mug.this.f14237j.remove(from.getId());
                            }
                        } else {
                            if (s72.c()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("BtNet_DownLink_send type=");
                                sb.append((int) ij9VarR.l());
                                sb.append(" sid=");
                                sb.append(ij9VarR.i());
                                sb.append(" size=");
                                sb.append(ij9VarR.e() != null ? ij9VarR.e().length : 0);
                                Trace.beginSection(sb.toString());
                            }
                            c3f.d("ServerTransportSession", "取到数据发送到客户端 :" + ((int) ij9VarR.l()) + "    id = " + ij9VarR.i() + " tType=" + ij9VarR.f + "    " + ((int) ij9VarR.f()) + "    " + ij9VarR.k());
                            mug.this.f14238l.C(ij9VarR);
                            if (s72.c()) {
                                Trace.endSection();
                            }
                        }
                    }
                } catch (InvalidProtocolBufferException e2) {
                    c3f.b("ServerTransportSession", "run: ex " + e2);
                } catch (InterruptedException e3) {
                    if (s72.c()) {
                        Trace.endSection();
                    }
                    c3f.b("ServerTransportSession", "run: ex " + e3);
                    c3f.c("ServerTransportSession", "<<<<<< 发送数据到蓝牙线程退出 <<<<<< " + e3);
                    return;
                }
            }
            mug.this.m.clear();
            c3f.c("ServerTransportSession", "<<<<<< 发送数据到蓝牙线程退出 <<<<<<");
        }

        public a() {
        }
    }

    public static abstract class b extends qv8 {
        public volatile boolean i;

        public b() {
            super("BtNetLink");
            this.i = false;
        }
    }

    public class c extends b {
        public void a() {
            this.i = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                mug.this.f14239n.put(HttpDataFactory.b(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e2) {
                c3f.b("ServerTransportSession", "P2PDownLinkThread stopThread: ex " + e2);
            }
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            c3f.c("ServerTransportSession", ">>>>>> P2P 发送数据到蓝牙线程启动 >>>>>>");
            while (!this.i) {
                c3f.a("ServerTransportSession", "P2P 获取数据发送到客户端...");
                try {
                    if (s72.c()) {
                        Trace.beginSection("BtNet_P2PDownLink_get");
                    }
                    ij9 ij9VarQ = mug.this.q();
                    if (s72.c()) {
                        Trace.endSection();
                    }
                    if (ij9VarQ == null) {
                        c3f.e("ServerTransportSession", "P2P 取到空数据 getDataFromP2PSendQue!");
                    } else {
                        if (ij9VarQ.l() == 1536) {
                            if (s72.c()) {
                                Trace.beginSection("BtNet_P2PDownLink_noMore");
                                Trace.endSection();
                            }
                            c3f.c("ServerTransportSession", "<<<<<< P2P 发送数据到蓝牙线程退出 <<<<<<");
                            mug.this.f14239n.clear();
                            return;
                        }
                        if (ij9VarQ.l() == 1553) {
                            ProxyACKReq from = ProxyACKReq.parseFrom(ij9VarQ.e());
                            if (s72.c()) {
                                Trace.beginSection("BtNet_P2PDownLink_ackReq id=" + from.getId());
                            }
                            synchronized (mug.this.f14237j) {
                                mug.this.f14237j.put(from.getId(), ij9VarQ);
                            }
                            mug.this.f14238l.C(ij9VarQ);
                            if (s72.c()) {
                                Trace.endSection();
                                Trace.beginSection("BtNet_P2PDownLink_sleep id=" + from.getId());
                            }
                            synchronized (ij9VarQ) {
                                int sleep = from.getSleep();
                                c3f.a("ServerTransportSession", "P2PDownLinkThread >> run sleep:" + sleep + " req id:" + from.getId());
                                ij9VarQ.wait((long) sleep);
                                c3f.a("ServerTransportSession", "P2PDownLinkThread >> run after sleep:" + sleep + " req id:" + from.getId());
                            }
                            if (s72.c()) {
                                Trace.endSection();
                            }
                            synchronized (mug.this.f14237j) {
                                mug.this.f14237j.remove(from.getId());
                            }
                        } else {
                            if (s72.c()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("BtNet_P2PDownLink_send type=");
                                sb.append((int) ij9VarQ.l());
                                sb.append(" sid=");
                                sb.append(ij9VarQ.i());
                                sb.append(" size=");
                                sb.append(ij9VarQ.e() != null ? ij9VarQ.e().length : 0);
                                Trace.beginSection(sb.toString());
                            }
                            c3f.d("ServerTransportSession", "P2P 取到数据发送到客户端 :" + ((int) ij9VarQ.l()) + "    id = " + ij9VarQ.i() + " tType=" + ij9VarQ.f + "    " + ((int) ij9VarQ.f()) + "    " + ij9VarQ.k());
                            mug.this.f14238l.C(ij9VarQ);
                            if (s72.c()) {
                                Trace.endSection();
                            }
                        }
                    }
                } catch (InvalidProtocolBufferException e2) {
                    c3f.b("ServerTransportSession", "P2PDownLinkThread run: ex " + e2);
                } catch (InterruptedException e3) {
                    if (s72.c()) {
                        Trace.endSection();
                    }
                    c3f.b("ServerTransportSession", "P2PDownLinkThread run: ex " + e3);
                    c3f.c("ServerTransportSession", "<<<<<< P2P 发送数据到蓝牙线程退出 <<<<<< " + e3);
                    return;
                }
            }
            mug.this.f14239n.clear();
            c3f.c("ServerTransportSession", "<<<<<< P2P 发送数据到蓝牙线程退出 <<<<<<");
        }

        public c() {
        }
    }

    public class d extends b {
        public void a() {
            this.i = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            ij9 ij9VarB = HttpDataFactory.b(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr);
            HttpDataProto.Builder builderNewBuilder = HttpDataProto.newBuilder();
            builderNewBuilder.setHead(ByteString.copyFrom(ij9VarB.h()));
            builderNewBuilder.setBody(ByteString.copyFrom(ij9VarB.e()));
            try {
                mug.this.o.put(new HttpDataWrapper(builderNewBuilder.build(), 2));
            } catch (InterruptedException e2) {
                c3f.b("ServerTransportSession", "stopThread: ex " + e2);
                stop();
            }
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ij9 ij9Var;
            c3f.c("ServerTransportSession", ">>>>>> 蓝牙数据接收线程启动 >>>>>>");
            while (!this.i) {
                try {
                    HttpDataProto httpDataProtoA = null;
                    int iB = 2;
                    try {
                        if (s72.c()) {
                            Trace.beginSection("BtNet_UpLink_take");
                        }
                        HttpDataWrapper kj9Var = (HttpDataWrapper) mug.this.o.take();
                        httpDataProtoA = kj9Var.getHttpDta();
                        iB = kj9Var.getTransportType();
                        if (s72.c()) {
                            Trace.endSection();
                        }
                    } catch (InterruptedException e2) {
                        if (s72.c()) {
                            Trace.endSection();
                        }
                        c3f.b("ServerTransportSession", "run: ex " + e2);
                    }
                    if (httpDataProtoA != null) {
                        byte[] byteArray = httpDataProtoA.getHead().toByteArray();
                        short sM = ij9.m(byteArray);
                        long j2 = ij9.j(byteArray);
                        byte bG = ij9.g(byteArray);
                        int iN = ij9.n(byteArray);
                        byte[] byteArray2 = httpDataProtoA.getBody().toByteArray();
                        int length = byteArray2 != null ? byteArray2.length : 0;
                        c3f.a("ServerTransportSession", "head length:" + iN + " body length:" + byteArray2.length);
                        if (sM == 1536) {
                            if (s72.c()) {
                                Trace.beginSection("BtNet_UpLink_noMore");
                                Trace.endSection();
                            }
                            c3f.c("ServerTransportSession", "<<<<<< Bt data download thread exit NO_MORE_DATA<<<<<<");
                            mug.this.o.clear();
                            return;
                        }
                        if (sM != 1537) {
                            if (sM != 1539) {
                                if (sM == 1540) {
                                    if (s72.c()) {
                                        Trace.beginSection("BtNet_UpLink_dnsReq id=" + j2 + " size=" + length);
                                    }
                                    c3f.a("ServerTransportSession", "发送DNS请求...");
                                    if (mug.this.f != null) {
                                        mug.this.f.e(HttpDataFactory.b(sM, j2, bG, (short) iN, byteArray2));
                                    } else {
                                        c3f.a("ServerTransportSession", "没有DNS处理Handler...");
                                    }
                                    if (s72.c()) {
                                        Trace.endSection();
                                    }
                                } else if (sM == 1553) {
                                    try {
                                        byte[] byteArray3 = ProxyACKRsp.newBuilder().setId(ProxyACKReq.parseFrom(byteArray2).getId()).build().toByteArray();
                                        ij9 ij9VarB = HttpDataFactory.b(HttpDataFactory.HTTP_ACK_RSP, j2, (byte) 0, byteArray3.length, byteArray3);
                                        if (ij9VarB != null && mug.this.f14238l != null) {
                                            ij9VarB.f = iB;
                                            mug.this.f14238l.C(ij9VarB);
                                        }
                                    } catch (InvalidProtocolBufferException e3) {
                                        c3f.b("ServerTransportSession", "HTTP_ACK_REQ parse ex " + e3);
                                    }
                                } else if (sM != 1554) {
                                    switch (sM) {
                                        case NetstrapPacket.PDU_TYPE_WRITE_MAC_SOURCE_REQ /* 1543 */:
                                        case NetstrapPacket.PDU_TYPE_READ_MAC_SOURCE_REQ /* 1544 */:
                                            break;
                                        case 1545:
                                            if (s72.c()) {
                                                Trace.beginSection("BtNet_UpLink_dnsData size=" + length);
                                            }
                                            Packet packet = new Packet(ByteBuffer.wrap(byteArray2));
                                            if (packet.isUDP) {
                                                mug.this.g.k(packet);
                                            } else if (packet.isICMP) {
                                                if (mug.this.p == null) {
                                                    mug mugVar = mug.this;
                                                    mugVar.p = new cn9(mugVar);
                                                }
                                                mug.this.p.a.offer(packet);
                                                mug.this.p.e(packet);
                                            }
                                            if (!s72.c()) {
                                                continue;
                                            } else {
                                                Trace.endSection();
                                            }
                                            break;
                                        default:
                                            if (s72.c()) {
                                                Trace.beginSection("BtNet_UpLink_default type=" + ((int) sM) + " id=" + j2 + " size=" + length);
                                            }
                                            c3f.a("ServerTransportSession", "没有特别处理得类型:" + ((int) sM));
                                            mug.this.g.j(HttpDataFactory.a(j2, bG, byteArray2));
                                            if (!s72.c()) {
                                                continue;
                                            } else {
                                                Trace.endSection();
                                            }
                                            break;
                                    }
                                } else {
                                    try {
                                        ProxyACKRsp from = ProxyACKRsp.parseFrom(httpDataProtoA.getBody().toByteArray());
                                        if (s72.c()) {
                                            Trace.beginSection("BtNet_UpLink_ackRsp id=" + from.getId());
                                        }
                                        synchronized (mug.this.f14237j) {
                                            ij9Var = mug.this.f14237j.get(from.getId());
                                        }
                                        if (ij9Var != null) {
                                            synchronized (ij9Var) {
                                                c3f.a("ServerTransportSession", "<<<<<< downlink thread ack notify <<<<<< notify id:" + from.getId());
                                                ij9Var.notify();
                                            }
                                        } else {
                                            c3f.e("ServerTransportSession", "<<<<<< downlink thread wait ack time out<<<<<< notify id:" + from.getId());
                                        }
                                        if (s72.c()) {
                                            Trace.endSection();
                                        }
                                    } catch (InvalidProtocolBufferException e4) {
                                        c3f.b("ServerTransportSession", "run: ex " + e4);
                                    }
                                }
                            }
                            if (s72.c()) {
                                Trace.beginSection("BtNet_UpLink_tcpData type=" + ((int) sM) + " id=" + j2 + " size=" + length);
                            }
                            ij9 ij9VarB2 = HttpDataFactory.b(sM, j2, bG, iN, byteArray2);
                            if (ij9VarB2 != null) {
                                ij9VarB2.f = iB;
                                mug.this.g.j(ij9VarB2);
                            }
                            if (s72.c()) {
                                Trace.endSection();
                            }
                        } else {
                            if (s72.c()) {
                                Trace.beginSection("BtNet_UpLink_httpReq id=" + j2 + " size=" + length);
                            }
                            mug mugVar2 = mug.this;
                            mugVar2.k(j2, new m1i(byteArray2, j2, 1537, mugVar2));
                            if (s72.c()) {
                                Trace.endSection();
                            }
                        }
                    }
                } catch (OutOfMemoryError | UnknownHostException e5) {
                    c3f.b("ServerTransportSession", "run: ex " + e5);
                    return;
                }
            }
            mug.this.o.clear();
            c3f.c("ServerTransportSession", "<<<<<< 蓝牙数据接收线程退出 <<<<<<");
        }

        public d() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mug(po4 po4Var, int i) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.g = null;
        this.h = i;
        this.f = po4Var;
        po4Var.g(this);
        d dVar = this.f14235c;
        if (dVar != null) {
            dVar.a();
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        c cVar = this.f14236e;
        if (cVar != null) {
            cVar.a();
        }
        this.f14235c = new d();
        this.d = new a();
        this.f14236e = new c();
        com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b bVar = new com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b(this);
        this.g = bVar;
        bVar.o();
        jr0.a().execute(this.f14235c);
        jr0.a().execute(this.d);
        jr0.a().execute(this.f14236e);
        this.i = new qnc(this);
        this.k = new g6c(i);
    }

    public void A(HBProxyConfig hBProxyConfig) {
        this.g.q(hBProxyConfig);
    }

    public void j(ij9 ij9Var) {
        LinkedBlockingQueue<ij9> linkedBlockingQueue = ij9Var.f == 1 ? this.f14239n : this.m;
        if (s72.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("BtNet_addSendQue sid=");
            sb.append(ij9Var.i());
            sb.append(" size=");
            sb.append(ij9Var.e() != null ? ij9Var.e().length : 0);
            sb.append(" queue=");
            sb.append(linkedBlockingQueue.size());
            s72.a(sb.toString());
        }
        try {
            linkedBlockingQueue.put(ij9Var);
        } catch (InterruptedException e2) {
            c3f.b("ServerTransportSession", "addData2SendQue: ex " + e2);
        } finally {
            if (s72.c()) {
                s72.b();
            }
        }
    }

    public void k(long j2, m1i m1iVar) {
        synchronized (this.b) {
            this.a.put(Long.valueOf(j2), m1iVar);
        }
    }

    public void l(HttpDataWrapper kj9Var) {
        try {
            if (this.o.size() > 100) {
                c3f.e("ServerTransportSession", "addReqestToReciveQueue: " + this.o.size());
            }
            this.o.put(kj9Var);
        } catch (InterruptedException e2) {
            c3f.b("ServerTransportSession", "addReqestToReciveQueue: ex " + e2);
        }
    }

    @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(ey9 ey9Var) {
        if (ey9Var != null) {
            ey9Var.a();
        }
    }

    public void n() {
        while (!this.a.isEmpty()) {
            ey9 ey9Var = this.a.get(this.a.keySet().iterator().next());
            if (ey9Var != null) {
                ey9Var.finish();
            }
        }
        po4 po4Var = this.f;
        if (po4Var != null) {
            po4Var.f();
        }
        this.g.c();
        this.g.d();
        this.a.clear();
        this.m.clear();
        this.f14239n.clear();
        cn9 cn9Var = this.p;
        if (cn9Var != null) {
            cn9Var.finish();
            this.p = null;
        }
    }

    public void o() {
        this.g.b();
    }

    public ColorConnectManager p() {
        return this.f14238l;
    }

    public ij9 q() throws InterruptedException {
        return this.f14239n.take();
    }

    public ij9 r() throws InterruptedException {
        return this.m.take();
    }

    public com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b s() {
        return this.g;
    }

    public boolean t() {
        com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b bVar = this.g;
        return bVar != null && bVar.i();
    }

    public boolean u(int i) {
        return (i == 1 ? this.f14239n : this.m).size() < (i == 1 ? 60 : 7);
    }

    public void v(long j2) {
        synchronized (this.b) {
            this.a.remove(Long.valueOf(j2));
        }
    }

    public void w(long j2) {
        c3f.c("ServerTransportSession", ">>>removeSocketData socketid:" + j2);
        x(this.m, j2);
        x(this.f14239n, j2);
        c3f.c("ServerTransportSession", "<<<removeSocketData end socketid:" + j2);
    }

    public final void x(LinkedBlockingQueue<ij9> linkedBlockingQueue, long j2) {
        for (ij9 ij9Var : (ij9[]) linkedBlockingQueue.toArray(new ij9[0])) {
            if (ij9Var != null) {
                if (ij9Var.i() == j2) {
                    linkedBlockingQueue.remove(ij9Var);
                } else {
                    c3f.c("ServerTransportSession", ">>>not match socketid:" + ij9Var.i());
                }
            }
        }
    }

    public void y(ColorConnectManager colorConnectManager) {
        this.f14238l = colorConnectManager;
    }

    public boolean z(ij9 ij9Var) {
        if (ij9Var == null) {
            return false;
        }
        boolean zOffer = (ij9Var.f == 1 ? this.f14239n : this.m).offer(ij9Var);
        if (s72.c() && zOffer) {
            s72.a("BtNet_tryAddSendQue sid=" + ij9Var.i());
            s72.b();
        }
        return zOffer;
    }
}
