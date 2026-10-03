package com.oplus.aiunit.vision;

import android.os.Trace;
import android.util.LongSparseArray;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.wearable.btnet.proto.HBProxyConfig;
import com.heytap.wearable.btnet.proto.HttpDataProto;
import com.heytap.wearable.btnet.proto.ProxyACKReq;
import com.heytap.wearable.btnet.proto.ProxyACKRsp;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.ColorConnectManager;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.Packet;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class cyg implements MyLRUCache.a<lz9> {
    public d c;
    public a d;
    public c e;
    public fp4 f;
    public com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b g;
    public final int h;
    public ipc i;
    public spj k;
    public ColorConnectManager l;
    public final MyLRUCache<Long, lz9> a = new MyLRUCache<>(23, this);
    public final byte[] b = new byte[0];
    public final LongSparseArray<ok9> j = new LongSparseArray<>();
    public final LinkedBlockingQueue<ok9> m = new LinkedBlockingQueue<>(10);
    public final LinkedBlockingQueue<ok9> n = new LinkedBlockingQueue<>(80);
    public final BlockingQueue<HttpDataWrapper> o = new LinkedBlockingQueue(200);
    public io9 p = null;

    public class a extends b {
        /* JADX WARN: Multi-variable type inference failed */
        public void a() {
            this.i = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                cyg.this.m.put(HttpDataFactory.b(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e) {
                o5f.b("ServerTransportSession", "stopThread: ex " + e);
            }
            interrupt();
        }

        public void run() {
            o5f.c("ServerTransportSession", ">>>>>> 发送数据到蓝牙线程启动 >>>>>>");
            while (!this.i) {
                o5f.a("ServerTransportSession", "获取数据发送到客户端...");
                try {
                    if (g82.c()) {
                        Trace.beginSection("BtNet_DownLink_get");
                    }
                    ok9 ok9VarR = cyg.this.r();
                    if (g82.c()) {
                        Trace.endSection();
                    }
                    if (ok9VarR == null) {
                        o5f.e("ServerTransportSession", "取到空数据 getDataFromSendQue!");
                    } else {
                        if (ok9VarR.l() == 1536) {
                            if (g82.c()) {
                                Trace.beginSection("BtNet_DownLink_noMore");
                                Trace.endSection();
                            }
                            o5f.c("ServerTransportSession", "<<<<<< 发送数据到蓝牙线程退出 <<<<<<");
                            cyg.this.m.clear();
                            return;
                        }
                        if (ok9VarR.l() == 1553) {
                            ProxyACKReq from = ProxyACKReq.parseFrom(ok9VarR.e());
                            if (g82.c()) {
                                Trace.beginSection("BtNet_DownLink_ackReq id=" + from.getId());
                            }
                            synchronized (cyg.this.j) {
                                cyg.this.j.put(from.getId(), ok9VarR);
                            }
                            cyg.this.l.C(ok9VarR);
                            if (g82.c()) {
                                Trace.endSection();
                                Trace.beginSection("BtNet_DownLink_sleep id=" + from.getId());
                            }
                            synchronized (ok9VarR) {
                                int sleep = from.getSleep();
                                o5f.a("ServerTransportSession", "DownLinkThread >> run sleep:" + sleep + " req id:" + from.getId());
                                ok9VarR.wait((long) sleep);
                                o5f.a("ServerTransportSession", "DownLinkThread >> run after sleep:" + sleep + " req id:" + from.getId());
                            }
                            if (g82.c()) {
                                Trace.endSection();
                            }
                            synchronized (cyg.this.j) {
                                cyg.this.j.remove(from.getId());
                            }
                        } else {
                            if (g82.c()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("BtNet_DownLink_send type=");
                                sb.append((int) ok9VarR.l());
                                sb.append(" sid=");
                                sb.append(ok9VarR.i());
                                sb.append(" size=");
                                sb.append(ok9VarR.e() != null ? ok9VarR.e().length : 0);
                                Trace.beginSection(sb.toString());
                            }
                            o5f.d("ServerTransportSession", "取到数据发送到客户端 :" + ((int) ok9VarR.l()) + "    id = " + ok9VarR.i() + " tType=" + ok9VarR.f + "    " + ((int) ok9VarR.f()) + "    " + ok9VarR.k());
                            cyg.this.l.C(ok9VarR);
                            if (g82.c()) {
                                Trace.endSection();
                            }
                        }
                    }
                } catch (InvalidProtocolBufferException e) {
                    o5f.b("ServerTransportSession", "run: ex " + e);
                } catch (InterruptedException e2) {
                    if (g82.c()) {
                        Trace.endSection();
                    }
                    o5f.b("ServerTransportSession", "run: ex " + e2);
                    o5f.c("ServerTransportSession", "<<<<<< 发送数据到蓝牙线程退出 <<<<<< " + e2);
                    return;
                }
            }
            cyg.this.m.clear();
            o5f.c("ServerTransportSession", "<<<<<< 发送数据到蓝牙线程退出 <<<<<<");
        }

        public a() {
        }
    }

    public static abstract class b extends uw8 {
        public volatile boolean i;

        public b() {
            super("BtNetLink");
            this.i = false;
        }
    }

    public class c extends b {
        /* JADX WARN: Multi-variable type inference failed */
        public void a() {
            this.i = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                cyg.this.n.put(HttpDataFactory.b(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e) {
                o5f.b("ServerTransportSession", "P2PDownLinkThread stopThread: ex " + e);
            }
            interrupt();
        }

        public void run() {
            o5f.c("ServerTransportSession", ">>>>>> P2P 发送数据到蓝牙线程启动 >>>>>>");
            while (!this.i) {
                o5f.a("ServerTransportSession", "P2P 获取数据发送到客户端...");
                try {
                    if (g82.c()) {
                        Trace.beginSection("BtNet_P2PDownLink_get");
                    }
                    ok9 ok9VarQ = cyg.this.q();
                    if (g82.c()) {
                        Trace.endSection();
                    }
                    if (ok9VarQ == null) {
                        o5f.e("ServerTransportSession", "P2P 取到空数据 getDataFromP2PSendQue!");
                    } else {
                        if (ok9VarQ.l() == 1536) {
                            if (g82.c()) {
                                Trace.beginSection("BtNet_P2PDownLink_noMore");
                                Trace.endSection();
                            }
                            o5f.c("ServerTransportSession", "<<<<<< P2P 发送数据到蓝牙线程退出 <<<<<<");
                            cyg.this.n.clear();
                            return;
                        }
                        if (ok9VarQ.l() == 1553) {
                            ProxyACKReq from = ProxyACKReq.parseFrom(ok9VarQ.e());
                            if (g82.c()) {
                                Trace.beginSection("BtNet_P2PDownLink_ackReq id=" + from.getId());
                            }
                            synchronized (cyg.this.j) {
                                cyg.this.j.put(from.getId(), ok9VarQ);
                            }
                            cyg.this.l.C(ok9VarQ);
                            if (g82.c()) {
                                Trace.endSection();
                                Trace.beginSection("BtNet_P2PDownLink_sleep id=" + from.getId());
                            }
                            synchronized (ok9VarQ) {
                                int sleep = from.getSleep();
                                o5f.a("ServerTransportSession", "P2PDownLinkThread >> run sleep:" + sleep + " req id:" + from.getId());
                                ok9VarQ.wait((long) sleep);
                                o5f.a("ServerTransportSession", "P2PDownLinkThread >> run after sleep:" + sleep + " req id:" + from.getId());
                            }
                            if (g82.c()) {
                                Trace.endSection();
                            }
                            synchronized (cyg.this.j) {
                                cyg.this.j.remove(from.getId());
                            }
                        } else {
                            if (g82.c()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("BtNet_P2PDownLink_send type=");
                                sb.append((int) ok9VarQ.l());
                                sb.append(" sid=");
                                sb.append(ok9VarQ.i());
                                sb.append(" size=");
                                sb.append(ok9VarQ.e() != null ? ok9VarQ.e().length : 0);
                                Trace.beginSection(sb.toString());
                            }
                            o5f.d("ServerTransportSession", "P2P 取到数据发送到客户端 :" + ((int) ok9VarQ.l()) + "    id = " + ok9VarQ.i() + " tType=" + ok9VarQ.f + "    " + ((int) ok9VarQ.f()) + "    " + ok9VarQ.k());
                            cyg.this.l.C(ok9VarQ);
                            if (g82.c()) {
                                Trace.endSection();
                            }
                        }
                    }
                } catch (InvalidProtocolBufferException e) {
                    o5f.b("ServerTransportSession", "P2PDownLinkThread run: ex " + e);
                } catch (InterruptedException e2) {
                    if (g82.c()) {
                        Trace.endSection();
                    }
                    o5f.b("ServerTransportSession", "P2PDownLinkThread run: ex " + e2);
                    o5f.c("ServerTransportSession", "<<<<<< P2P 发送数据到蓝牙线程退出 <<<<<< " + e2);
                    return;
                }
            }
            cyg.this.n.clear();
            o5f.c("ServerTransportSession", "<<<<<< P2P 发送数据到蓝牙线程退出 <<<<<<");
        }

        public c() {
        }
    }

    public class d extends b {
        /* JADX WARN: Multi-variable type inference failed */
        public void a() {
            this.i = true;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.NO_MORE_DATA, -1L, (byte) 0, (short) bArr.length, bArr);
            HttpDataProto.Builder builderNewBuilder = HttpDataProto.newBuilder();
            builderNewBuilder.setHead(ByteString.copyFrom(ok9VarB.h()));
            builderNewBuilder.setBody(ByteString.copyFrom(ok9VarB.e()));
            try {
                cyg.this.o.put(new HttpDataWrapper(builderNewBuilder.build(), 2));
            } catch (InterruptedException e) {
                o5f.b("ServerTransportSession", "stopThread: ex " + e);
                stop();
            }
            interrupt();
        }

        public void run() {
            ok9 ok9Var;
            o5f.c("ServerTransportSession", ">>>>>> 蓝牙数据接收线程启动 >>>>>>");
            while (!this.i) {
                try {
                    HttpDataProto httpDta = null;
                    int transportType = 2;
                    try {
                        if (g82.c()) {
                            Trace.beginSection("BtNet_UpLink_take");
                        }
                        HttpDataWrapper httpDataWrapper = (HttpDataWrapper) cyg.this.o.take();
                        httpDta = httpDataWrapper.getHttpDta();
                        transportType = httpDataWrapper.getTransportType();
                        if (g82.c()) {
                            Trace.endSection();
                        }
                    } catch (InterruptedException e) {
                        if (g82.c()) {
                            Trace.endSection();
                        }
                        o5f.b("ServerTransportSession", "run: ex " + e);
                    }
                    if (httpDta != null) {
                        byte[] byteArray = httpDta.getHead().toByteArray();
                        short sM = ok9.m(byteArray);
                        long j = ok9.j(byteArray);
                        byte bG = ok9.g(byteArray);
                        int iN = ok9.n(byteArray);
                        byte[] byteArray2 = httpDta.getBody().toByteArray();
                        int length = byteArray2 != null ? byteArray2.length : 0;
                        o5f.a("ServerTransportSession", "head length:" + iN + " body length:" + byteArray2.length);
                        if (sM == 1536) {
                            if (g82.c()) {
                                Trace.beginSection("BtNet_UpLink_noMore");
                                Trace.endSection();
                            }
                            o5f.c("ServerTransportSession", "<<<<<< Bt data download thread exit NO_MORE_DATA<<<<<<");
                            cyg.this.o.clear();
                            return;
                        }
                        if (sM != 1537) {
                            if (sM != 1539) {
                                if (sM == 1540) {
                                    if (g82.c()) {
                                        Trace.beginSection("BtNet_UpLink_dnsReq id=" + j + " size=" + length);
                                    }
                                    o5f.a("ServerTransportSession", "发送DNS请求...");
                                    if (cyg.this.f != null) {
                                        cyg.this.f.e(HttpDataFactory.b(sM, j, bG, (short) iN, byteArray2));
                                    } else {
                                        o5f.a("ServerTransportSession", "没有DNS处理Handler...");
                                    }
                                    if (g82.c()) {
                                        Trace.endSection();
                                    }
                                } else if (sM == 1553) {
                                    try {
                                        byte[] byteArray3 = ProxyACKRsp.newBuilder().setId(ProxyACKReq.parseFrom(byteArray2).getId()).build().toByteArray();
                                        ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.HTTP_ACK_RSP, j, (byte) 0, byteArray3.length, byteArray3);
                                        if (ok9VarB != null && cyg.this.l != null) {
                                            ok9VarB.f = transportType;
                                            cyg.this.l.C(ok9VarB);
                                        }
                                    } catch (InvalidProtocolBufferException e2) {
                                        o5f.b("ServerTransportSession", "HTTP_ACK_REQ parse ex " + e2);
                                    }
                                } else if (sM != 1554) {
                                    switch (sM) {
                                        case 1543:
                                        case 1544:
                                            break;
                                        case 1545:
                                            if (g82.c()) {
                                                Trace.beginSection("BtNet_UpLink_dnsData size=" + length);
                                            }
                                            Packet packet = new Packet(ByteBuffer.wrap(byteArray2));
                                            if (packet.isUDP) {
                                                cyg.this.g.k(packet);
                                            } else if (packet.isICMP) {
                                                if (cyg.this.p == null) {
                                                    cyg cygVar = cyg.this;
                                                    cygVar.p = new io9(cygVar);
                                                }
                                                cyg.this.p.a.offer(packet);
                                                cyg.this.p.e(packet);
                                            }
                                            if (!g82.c()) {
                                                continue;
                                            } else {
                                                Trace.endSection();
                                            }
                                            break;
                                        default:
                                            if (g82.c()) {
                                                Trace.beginSection("BtNet_UpLink_default type=" + ((int) sM) + " id=" + j + " size=" + length);
                                            }
                                            o5f.a("ServerTransportSession", "没有特别处理得类型:" + ((int) sM));
                                            cyg.this.g.j(HttpDataFactory.a(j, bG, byteArray2));
                                            if (!g82.c()) {
                                                continue;
                                            } else {
                                                Trace.endSection();
                                            }
                                            break;
                                    }
                                } else {
                                    try {
                                        ProxyACKRsp from = ProxyACKRsp.parseFrom(httpDta.getBody().toByteArray());
                                        if (g82.c()) {
                                            Trace.beginSection("BtNet_UpLink_ackRsp id=" + from.getId());
                                        }
                                        synchronized (cyg.this.j) {
                                            ok9Var = cyg.this.j.get(from.getId());
                                        }
                                        if (ok9Var != null) {
                                            synchronized (ok9Var) {
                                                o5f.a("ServerTransportSession", "<<<<<< downlink thread ack notify <<<<<< notify id:" + from.getId());
                                                ok9Var.notify();
                                            }
                                        } else {
                                            o5f.e("ServerTransportSession", "<<<<<< downlink thread wait ack time out<<<<<< notify id:" + from.getId());
                                        }
                                        if (g82.c()) {
                                            Trace.endSection();
                                        }
                                    } catch (InvalidProtocolBufferException e3) {
                                        o5f.b("ServerTransportSession", "run: ex " + e3);
                                    }
                                }
                            }
                            if (g82.c()) {
                                Trace.beginSection("BtNet_UpLink_tcpData type=" + ((int) sM) + " id=" + j + " size=" + length);
                            }
                            ok9 ok9VarB2 = HttpDataFactory.b(sM, j, bG, iN, byteArray2);
                            if (ok9VarB2 != null) {
                                ok9VarB2.f = transportType;
                                cyg.this.g.j(ok9VarB2);
                            }
                            if (g82.c()) {
                                Trace.endSection();
                            }
                        } else {
                            if (g82.c()) {
                                Trace.beginSection("BtNet_UpLink_httpReq id=" + j + " size=" + length);
                            }
                            cyg cygVar2 = cyg.this;
                            cygVar2.k(j, new d5i(byteArray2, j, 1537, cygVar2));
                            if (g82.c()) {
                                Trace.endSection();
                            }
                        }
                    }
                } catch (OutOfMemoryError | UnknownHostException e4) {
                    o5f.b("ServerTransportSession", "run: ex " + e4);
                    return;
                }
            }
            cyg.this.o.clear();
            o5f.c("ServerTransportSession", "<<<<<< 蓝牙数据接收线程退出 <<<<<<");
        }

        public d() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cyg(fp4 fp4Var, int i) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.g = null;
        this.h = i;
        this.f = fp4Var;
        fp4Var.g(this);
        d dVar = this.c;
        if (dVar != null) {
            dVar.a();
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.a();
        }
        this.c = new d();
        this.d = new a();
        this.e = new c();
        com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b bVar = new com.oppo.bluetooth.btnet.bluetoothproxyserver.server.b(this);
        this.g = bVar;
        bVar.o();
        as0.a().execute(this.c);
        as0.a().execute(this.d);
        as0.a().execute(this.e);
        this.i = new ipc(this);
        this.k = new w7c(i);
    }

    public void A(HBProxyConfig hBProxyConfig) {
        this.g.q(hBProxyConfig);
    }

    public void j(ok9 ok9Var) {
        LinkedBlockingQueue<ok9> linkedBlockingQueue = ok9Var.f == 1 ? this.n : this.m;
        if (g82.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("BtNet_addSendQue sid=");
            sb.append(ok9Var.i());
            sb.append(" size=");
            sb.append(ok9Var.e() != null ? ok9Var.e().length : 0);
            sb.append(" queue=");
            sb.append(linkedBlockingQueue.size());
            g82.a(sb.toString());
        }
        try {
            linkedBlockingQueue.put(ok9Var);
        } catch (InterruptedException e) {
            o5f.b("ServerTransportSession", "addData2SendQue: ex " + e);
        } finally {
            if (g82.c()) {
                g82.b();
            }
        }
    }

    public void k(long j, d5i d5iVar) {
        synchronized (this.b) {
            this.a.put(Long.valueOf(j), d5iVar);
        }
    }

    public void l(HttpDataWrapper httpDataWrapper) {
        try {
            if (this.o.size() > 100) {
                o5f.e("ServerTransportSession", "addReqestToReciveQueue: " + this.o.size());
            }
            this.o.put(httpDataWrapper);
        } catch (InterruptedException e) {
            o5f.b("ServerTransportSession", "addReqestToReciveQueue: ex " + e);
        }
    }

    @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(lz9 lz9Var) {
        if (lz9Var != null) {
            lz9Var.a();
        }
    }

    public void n() {
        while (!this.a.isEmpty()) {
            lz9 lz9Var = this.a.get(this.a.keySet().iterator().next());
            if (lz9Var != null) {
                lz9Var.finish();
            }
        }
        fp4 fp4Var = this.f;
        if (fp4Var != null) {
            fp4Var.f();
        }
        this.g.c();
        this.g.d();
        this.a.clear();
        this.m.clear();
        this.n.clear();
        io9 io9Var = this.p;
        if (io9Var != null) {
            io9Var.finish();
            this.p = null;
        }
    }

    public void o() {
        this.g.b();
    }

    public ColorConnectManager p() {
        return this.l;
    }

    public ok9 q() throws InterruptedException {
        return this.n.take();
    }

    public ok9 r() throws InterruptedException {
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
        return (i == 1 ? this.n : this.m).size() < (i == 1 ? 60 : 7);
    }

    public void v(long j) {
        synchronized (this.b) {
            this.a.remove(Long.valueOf(j));
        }
    }

    public void w(long j) {
        o5f.c("ServerTransportSession", ">>>removeSocketData socketid:" + j);
        x(this.m, j);
        x(this.n, j);
        o5f.c("ServerTransportSession", "<<<removeSocketData end socketid:" + j);
    }

    public final void x(LinkedBlockingQueue<ok9> linkedBlockingQueue, long j) {
        for (ok9 ok9Var : (ok9[]) linkedBlockingQueue.toArray(new ok9[0])) {
            if (ok9Var != null) {
                if (ok9Var.i() == j) {
                    linkedBlockingQueue.remove(ok9Var);
                } else {
                    o5f.c("ServerTransportSession", ">>>not match socketid:" + ok9Var.i());
                }
            }
        }
    }

    public void y(ColorConnectManager colorConnectManager) {
        this.l = colorConnectManager;
    }

    public boolean z(ok9 ok9Var) {
        if (ok9Var == null) {
            return false;
        }
        boolean zOffer = (ok9Var.f == 1 ? this.n : this.m).offer(ok9Var);
        if (g82.c() && zOffer) {
            g82.a("BtNet_tryAddSendQue sid=" + ok9Var.i());
            g82.b();
        }
        return zOffer;
    }
}
