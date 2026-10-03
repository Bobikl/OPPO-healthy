package com.oplus.aiunit.vision;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.server.Packet;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class io9 implements lz9 {
    public BlockingQueue<Packet> a = new LinkedBlockingQueue(500);
    public MyLRUCache<Long, Packet> b = new MyLRUCache<>(200, new MyLRUCache.a() { // from class: com.oplus.aiunit.vision.go9
        @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
        public final void a(Object obj) {
            io9.f((Packet) obj);
        }
    });
    public FileDescriptor c;
    public cyg d;
    public b e;
    public c f;

    public class a extends c {
        public void run() {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
            while (!this.i) {
                try {
                    byteBufferAllocate.clear();
                    byteBufferAllocate.position(20);
                    new InetSocketAddress(0);
                    try {
                        int i = Os.read(io9.this.c, byteBufferAllocate);
                        byteBufferAllocate.position(20);
                        Packet.ICMPHeader iCMPHeader = new Packet.ICMPHeader(byteBufferAllocate);
                        Packet packetG = io9.this.g(iCMPHeader.seq);
                        if (packetG == null) {
                            o5f.b("ICMPSocketHandle", "recvfrom newpacket is null icmpHeader: " + iCMPHeader.toString());
                        } else {
                            packetG.swapSourceAndDestination();
                            iCMPHeader.quench = packetG.mICMPHeader.quench;
                            iCMPHeader.checksum = 0;
                            byteBufferAllocate.position(20);
                            iCMPHeader.fillHeader(byteBufferAllocate);
                            byteBufferAllocate.position(20);
                            byte[] bArr = new byte[i];
                            byteBufferAllocate.get(bArr, 0, i);
                            iCMPHeader.checksum = Packet.checksum(bArr, i);
                            byteBufferAllocate.position(20);
                            iCMPHeader.fillHeader(byteBufferAllocate);
                            int i2 = i + 20;
                            byteBufferAllocate.limit(i2);
                            packetG.updateICMPBuffer(byteBufferAllocate, i);
                            byteBufferAllocate.flip();
                            byteBufferAllocate.limit(i2);
                            byte[] bArr2 = new byte[i2];
                            byteBufferAllocate.get(bArr2, 0, i2);
                            ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.DNS_DATA, 0L, (byte) 0, i2, bArr2);
                            if (io9.this.d != null) {
                                io9.this.d.j(ok9VarB);
                            }
                        }
                    } catch (ErrnoException e) {
                        o5f.b("ICMPSocketHandle", "run: ex " + e);
                        return;
                    }
                } catch (IOException e2) {
                    o5f.b("ICMPSocketHandle", "run: ex " + e2);
                    this.i = true;
                    return;
                }
            }
            o5f.c("ICMPSocketHandle", "<<<< Ping2ClientThread exit");
        }

        public a() {
        }
    }

    public class b extends c {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.oplus.aiunit.vision.io9.c
        public void a() {
            this.i = true;
            interrupt();
        }

        public void run() {
            while (!this.i) {
                try {
                    Packet packetTake = io9.this.a.take();
                    if (io9.this.c != null && packetTake != null) {
                        ByteBuffer byteBuffer = packetTake.backingBuffer;
                        byteBuffer.position(20);
                        try {
                            Os.sendto(io9.this.c, byteBuffer, 0, packetTake.ip4Header.destinationAddress, 0);
                        } catch (ErrnoException | SocketException e) {
                            o5f.b("ICMPSocketHandle", "run: ex " + e);
                        }
                    }
                } catch (InterruptedException e2) {
                    o5f.b("ICMPSocketHandle", "run: ex " + e2);
                    return;
                }
            }
            io9.this.a.clear();
            o5f.c("ICMPSocketHandle", "<<<< Ping2ServerThread exit");
        }

        public b() {
        }
    }

    public static abstract class c extends uw8 {
        public boolean i;

        public c() {
            super("BtNetPing");
            this.i = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a() {
            this.i = true;
            interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public io9(cyg cygVar) {
        Object[] objArr = 0;
        this.c = null;
        this.e = null;
        this.f = null;
        o5f.c("ICMPSocketHandle", "ICMPSocketHandle:");
        this.d = cygVar;
        try {
            this.c = Os.socket(OsConstants.AF_INET, OsConstants.SOCK_DGRAM, OsConstants.IPPROTO_ICMP);
            this.f = new a();
            this.e = new b();
            Executor executorA = as0.a();
            if (executorA != null) {
                executorA.execute(this.f);
                executorA.execute(this.e);
            }
        } catch (ErrnoException e) {
            o5f.b("ICMPSocketHandle", "ICMPSocketHandle: ex " + e);
        }
    }

    public static /* synthetic */ void f(Packet packet) {
        o5f.e("ICMPSocketHandle", "remove Packet:" + packet.toString());
    }

    @Override // com.oplus.aiunit.vision.lz9
    public void a() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a();
            this.f = null;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
            this.e = null;
        }
        this.a.clear();
    }

    public void e(Packet packet) {
        synchronized (this.b) {
            this.b.put(Long.valueOf(packet.mICMPHeader.seq), packet);
        }
    }

    @Override // com.oplus.aiunit.vision.lz9
    public void finish() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a();
            this.f = null;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
            this.e = null;
        }
        this.a.clear();
        synchronized (this.b) {
            this.b.clear();
        }
        FileDescriptor fileDescriptor = this.c;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException e) {
                o5f.b("ICMPSocketHandle", "finish: ex " + e);
            }
            this.c = null;
        }
    }

    public Packet g(long j) {
        Packet packetRemove;
        synchronized (this.b) {
            packetRemove = this.b.remove(Long.valueOf(j));
        }
        return packetRemove;
    }
}
