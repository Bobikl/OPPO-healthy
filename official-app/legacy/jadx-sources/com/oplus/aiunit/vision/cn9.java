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

/* JADX INFO: loaded from: classes9.dex */
public class cn9 implements ey9 {
    public BlockingQueue<Packet> a = new LinkedBlockingQueue(500);
    public MyLRUCache<Long, Packet> b = new MyLRUCache<>(200, new MyLRUCache.a() { // from class: com.oplus.aiunit.vision.an9
        @Override // com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.MyLRUCache.a
        public final void a(Object obj) {
            cn9.f((Packet) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileDescriptor f10160c;
    public mug d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f10161e;
    public c f;

    public class a extends c {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
            while (!this.i) {
                try {
                    byteBufferAllocate.clear();
                    byteBufferAllocate.position(20);
                    new InetSocketAddress(0);
                    try {
                        int i = Os.read(cn9.this.f10160c, byteBufferAllocate);
                        byteBufferAllocate.position(20);
                        Packet.ICMPHeader iCMPHeader = new Packet.ICMPHeader(byteBufferAllocate);
                        Packet packetG = cn9.this.g(iCMPHeader.seq);
                        if (packetG == null) {
                            c3f.b("ICMPSocketHandle", "recvfrom newpacket is null icmpHeader: " + iCMPHeader.toString());
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
                            ij9 ij9VarB = HttpDataFactory.b(HttpDataFactory.DNS_DATA, 0L, (byte) 0, i2, bArr2);
                            if (cn9.this.d != null) {
                                cn9.this.d.j(ij9VarB);
                            }
                        }
                    } catch (ErrnoException e2) {
                        c3f.b("ICMPSocketHandle", "run: ex " + e2);
                        return;
                    }
                } catch (IOException e3) {
                    c3f.b("ICMPSocketHandle", "run: ex " + e3);
                    this.i = true;
                    return;
                }
            }
            c3f.c("ICMPSocketHandle", "<<<< Ping2ClientThread exit");
        }

        public a() {
        }
    }

    public class b extends c {
        @Override // com.oplus.aiunit.vision.cn9.c
        public void a() {
            this.i = true;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!this.i) {
                try {
                    Packet packetTake = cn9.this.a.take();
                    if (cn9.this.f10160c != null && packetTake != null) {
                        ByteBuffer byteBuffer = packetTake.backingBuffer;
                        byteBuffer.position(20);
                        try {
                            Os.sendto(cn9.this.f10160c, byteBuffer, 0, packetTake.ip4Header.destinationAddress, 0);
                        } catch (ErrnoException | SocketException e2) {
                            c3f.b("ICMPSocketHandle", "run: ex " + e2);
                        }
                    }
                } catch (InterruptedException e3) {
                    c3f.b("ICMPSocketHandle", "run: ex " + e3);
                    return;
                }
            }
            cn9.this.a.clear();
            c3f.c("ICMPSocketHandle", "<<<< Ping2ServerThread exit");
        }

        public b() {
        }
    }

    public static abstract class c extends qv8 {
        public boolean i;

        public c() {
            super("BtNetPing");
            this.i = false;
        }

        public void a() {
            this.i = true;
            interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cn9(mug mugVar) {
        Object[] objArr = 0;
        this.f10160c = null;
        this.f10161e = null;
        this.f = null;
        c3f.c("ICMPSocketHandle", "ICMPSocketHandle:");
        this.d = mugVar;
        try {
            this.f10160c = Os.socket(OsConstants.AF_INET, OsConstants.SOCK_DGRAM, OsConstants.IPPROTO_ICMP);
            this.f = new a();
            this.f10161e = new b();
            Executor executorA = jr0.a();
            if (executorA != null) {
                executorA.execute(this.f);
                executorA.execute(this.f10161e);
            }
        } catch (ErrnoException e2) {
            c3f.b("ICMPSocketHandle", "ICMPSocketHandle: ex " + e2);
        }
    }

    public static /* synthetic */ void f(Packet packet) {
        c3f.e("ICMPSocketHandle", "remove Packet:" + packet.toString());
    }

    @Override // com.oplus.aiunit.vision.ey9
    public void a() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a();
            this.f = null;
        }
        b bVar = this.f10161e;
        if (bVar != null) {
            bVar.a();
            this.f10161e = null;
        }
        this.a.clear();
    }

    public void e(Packet packet) {
        synchronized (this.b) {
            this.b.put(Long.valueOf(packet.mICMPHeader.seq), packet);
        }
    }

    @Override // com.oplus.aiunit.vision.ey9
    public void finish() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a();
            this.f = null;
        }
        b bVar = this.f10161e;
        if (bVar != null) {
            bVar.a();
            this.f10161e = null;
        }
        this.a.clear();
        synchronized (this.b) {
            this.b.clear();
        }
        FileDescriptor fileDescriptor = this.f10160c;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException e2) {
                c3f.b("ICMPSocketHandle", "finish: ex " + e2);
            }
            this.f10160c = null;
        }
    }

    public Packet g(long j2) {
        Packet packetRemove;
        synchronized (this.b) {
            packetRemove = this.b.remove(Long.valueOf(j2));
        }
        return packetRemove;
    }
}
