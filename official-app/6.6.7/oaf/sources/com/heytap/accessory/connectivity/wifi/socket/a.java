package com.heytap.accessory.connectivity.wifi.socket;

import android.os.Handler;
import android.os.Looper;
import com.heytap.accessory.connectivity.params.e;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a extends com.heytap.accessory.connectivity.a {
    public static final String o = "a";
    public static final Object p = new Object();
    public static Handler q;
    public static Handler r;
    public static Handler s;
    public d g;
    public long h;
    public com.heytap.accessory.base.bean.b i;
    public com.heytap.accessory.connectivity.interfaces.a j;
    public Socket k;
    public InputStream l;
    public OutputStream m;
    public volatile boolean n;

    public final class b implements Runnable {
        public final com.heytap.accessory.message.b a;
        public final long b;

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.a.c());
            if (a.this.j != null) {
                a.this.j.a(a.this.h, a.this.d, this.b, this.a);
            }
        }

        public b(com.heytap.accessory.message.b bVar, long j) {
            this.a = bVar;
            this.b = j;
        }
    }

    public class c implements Runnable {
        public byte[] a;
        public byte[] b;
        public byte[] c;
        public byte[] d;
        public Buffer e;

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.a(a.o, "initialized Wifi Reader acc:" + a.this.h);
            while (a.this.n) {
                try {
                    if (!a.this.l()) {
                        break;
                    }
                    int iB = a.this.b(this.d, "payload length (Wifi)");
                    int iA = a.this.a(this.d, this.c);
                    com.heytap.accessory.base.logging.a.a(a.o, "readHeaderState:" + iB + " readPayloadLenCrcState:" + iA);
                    if (iB != 0 || iA != 0) {
                        break;
                        break;
                    }
                    byte[] bArr = this.d;
                    int i = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
                    if (i > 0) {
                        Buffer bufferObtain = BufferPool.obtain(i);
                        this.e = bufferObtain;
                        byte[] buffer = bufferObtain.getBuffer();
                        this.b = buffer;
                        int iA2 = a.this.a(i, buffer);
                        if (iA2 == 0) {
                            com.heytap.accessory.base.logging.a.a(a.o, "readPayloadState:" + iA2);
                            int iA3 = a.this.a(this.e, this.a);
                            com.heytap.accessory.base.logging.a.a(a.o, "readPayloadCrc:" + iA3);
                            if (iA3 == -1) {
                                com.heytap.accessory.base.logging.a.b(a.o, "readPayloadCrc error,ignore this packet");
                            } else if (a.this.n && a.this.a != 2) {
                                com.heytap.accessory.base.logging.a.c(a.o, "Wifi READ Len(frameLen):" + i);
                                if (a.this.j != null) {
                                    if (FrameworkService.sConnectionLogOpened) {
                                        a.this.a(this.e.getBuffer(), "WifiSocketConnection onMessageReceived");
                                    }
                                    a.this.j.a(a.this.h, a.this.d, this.e);
                                } else {
                                    com.heytap.accessory.base.logging.a.b(a.o, "mConnectionEventListener is null");
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    a.this.n = false;
                    a.this.b = 3;
                    com.heytap.accessory.base.logging.a.c(a.o, "WifiReaderThread: IOexception:" + e.getMessage());
                    try {
                        try {
                            if (a.this.k != null) {
                                a.this.k.close();
                            }
                            a.this.k = null;
                        } catch (IOException e2) {
                            com.heytap.accessory.base.logging.a.c(a.o, "WifiReaderThread: socket close IOException:" + e2.getMessage());
                            a.this.k = null;
                        }
                    } catch (Throwable th) {
                        a.this.k = null;
                        throw th;
                    }
                }
            }
            a.this.k();
        }

        public c() {
            this.d = new byte[2];
            this.c = new byte[2];
            this.a = new byte[2];
        }
    }

    public final class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.e(a.o, "Wifi connection timed out");
            if (a.this.n) {
                a.this.b = 0;
                a.this.a = 2;
                if (a.this.m()) {
                    a.this.d();
                }
                a.this.j.a(a.this.i.l(), a.this.d, a.this.b, a.this.a);
            }
        }

        public d() {
        }
    }

    static {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            s = new Handler(looperB);
        }
    }

    public a(com.heytap.accessory.connectivity.params.c cVar) {
        super(cVar, cVar.a);
        this.n = false;
        this.g = new d();
        this.h = -1L;
        this.b = 0;
        this.a = 0;
    }

    @Override // com.heytap.accessory.connectivity.a
    public int b() {
        return 0;
    }

    public final boolean o() {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("WIFI_SOCKET_WRITE" + this.d);
        if (looperB == null) {
            return false;
        }
        q = new Handler(looperB);
        com.heytap.accessory.base.logging.a.a(o, "initialized Wifi Writer");
        return true;
    }

    public final boolean p() {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("WIFI_SOCKET_READ" + this.d);
        if (looperB == null) {
            return false;
        }
        Handler handler = new Handler(looperB);
        r = handler;
        handler.post(new c());
        com.heytap.accessory.base.logging.a.a(o, "initialized Wifi Reader");
        return true;
    }

    public final void q() {
        Handler handler = q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            if (com.heytap.accessory.base.thread.a.b().e("WIFI_SOCKET_WRITE" + this.d)) {
                return;
            }
            com.heytap.accessory.base.logging.a.e(o, "Error while closing Wifi writer Thread");
        }
    }

    public final void r() {
        Handler handler = r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            if (com.heytap.accessory.base.thread.a.b().e("WIFI_SOCKET_READ" + this.d)) {
                return;
            }
            com.heytap.accessory.base.logging.a.e(o, "Error while closing Wifi read Thread");
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void d() {
        this.a = 0;
        this.b = 2;
        this.n = false;
        c();
    }

    @Override // com.heytap.accessory.connectivity.a
    public void e() {
        if (this.k == null) {
            com.heytap.accessory.base.logging.a.b(o, "Wifi socket is null");
        } else {
            com.heytap.accessory.base.logging.a.e(o, "Force Closing Wifi socket connection...");
            c();
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void f() {
        if (p()) {
            return;
        }
        com.heytap.accessory.base.logging.a.b(o, "error initializeReader!");
    }

    @Override // com.heytap.accessory.connectivity.a
    public void g() {
        if (o()) {
            return;
        }
        com.heytap.accessory.base.logging.a.b(o, "error initializeWriter!");
    }

    public final String i() {
        InetAddress localAddress = this.k.getLocalAddress();
        com.heytap.accessory.base.logging.a.d(o, "IP address " + PlatformUtils.getAddrforLog(localAddress.getHostAddress()));
        return localAddress.getHostAddress();
    }

    public final String j() {
        InetAddress inetAddress = this.k.getInetAddress();
        return inetAddress != null ? inetAddress.getHostAddress() : "";
    }

    public final void k() {
        String str = o;
        com.heytap.accessory.base.logging.a.e(str, "handleReaderThreadClosure : Wifi read error!");
        if (this.n || 2 == this.a || 3 == this.b) {
            this.b = 3;
            if (this.a != 2) {
                this.a = 1;
            }
            this.n = false;
            com.heytap.accessory.base.logging.a.e(str, "Wifi Connection closed - Accessory : " + this.h);
            com.heytap.accessory.connectivity.interfaces.a aVar = this.j;
            if (aVar != null) {
                aVar.a(this.h, this.d, this.b, this.a);
            }
            com.heytap.accessory.base.logging.a.d(str, "Wifi Connection status: " + this.b + " !");
        }
    }

    public final boolean l() {
        if (!m() && this.l != null) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(o, "Wifi Socket is not connected! Connection status: " + this.b + ")");
        return false;
    }

    public final boolean m() {
        Socket socket = this.k;
        if (socket == null) {
            return true;
        }
        return !socket.isConnected();
    }

    public final void n() {
        s.postDelayed(this.g, 10000L);
    }

    @Override // com.heytap.accessory.connectivity.a
    public void c() {
        try {
            Socket socket = this.k;
            if (socket != null) {
                socket.close();
                this.k = null;
            }
            OutputStream outputStream = this.m;
            if (outputStream != null) {
                outputStream.close();
            }
            InputStream inputStream = this.l;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
            this.b = 3;
        }
        r();
        q();
    }

    @Override // com.heytap.accessory.connectivity.a
    public int b(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        this.b = 0;
        this.a = 0;
        this.n = false;
        this.j = aVar;
        if (!(bVar instanceof com.heytap.accessory.connectivity.wifi.a)) {
            com.heytap.accessory.base.logging.a.b(o, "Not Wifi accessory " + bVar.l());
            return this.b;
        }
        com.heytap.accessory.base.logging.a.d(o, "Setting socket accessoryId:" + bVar.l());
        a(bVar.H(), bVar.g());
        this.h = bVar.l();
        if (bVar.c(this.d) != null && (bVar.c(this.d) instanceof Socket)) {
            try {
                this.k = (Socket) bVar.c(this.d);
                bVar.e(i());
                bVar.d(j());
                if (m()) {
                    this.b = 3;
                    return 3;
                }
                this.l = this.k.getInputStream();
                this.m = this.k.getOutputStream();
                this.n = true;
                this.b = 1;
                return 1;
            } catch (IOException e) {
                com.heytap.accessory.base.logging.a.b(o, "server openConnection error:" + e);
                try {
                    this.k.close();
                } catch (IOException unused) {
                    this.b = 3;
                    this.a = 1;
                    com.heytap.accessory.base.logging.a.b(o, "IOException when closing Wifi Socket (status: " + this.b + ")");
                }
                return 0;
            }
        }
        s.removeCallbacks(this.g);
        return this.b;
    }

    public static a a(com.heytap.accessory.connectivity.params.c cVar) {
        a aVar;
        synchronized (p) {
            aVar = new a(cVar);
        }
        return aVar;
    }

    public static a a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.params.c cVar) {
        a aVarA = a(cVar);
        aVarA.k = (Socket) bVar.c(cVar.a);
        return aVarA;
    }

    @Override // com.heytap.accessory.connectivity.a
    public void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        this.b = 0;
        this.a = 0;
        this.j = aVar;
        this.i = bVar;
        if (!(bVar instanceof com.heytap.accessory.connectivity.wifi.a) || !(this.e instanceof e)) {
            return;
        }
        a(bVar.H(), bVar.g());
        this.h = bVar.l();
        this.n = false;
        try {
            e eVar = (e) this.e;
            Socket socket = new Socket();
            this.k = socket;
            socket.bind(null);
            if (this.d == 1) {
                int i = eVar.b;
                int iA = com.heytap.accessory.connectivity.wifi.tools.a.b().a();
                int[] iArr = com.heytap.accessory.connectivity.wifi.tools.a.c;
                if (iA < iArr.length) {
                    i = iArr[iA];
                }
                com.heytap.accessory.base.logging.a.a(o, "Connect to " + PlatformUtils.getAddrforLog(bVar.d()) + " port :" + i);
                this.k.connect(new InetSocketAddress(bVar.d(), i));
                bVar.e(i());
                bVar.d(j());
            } else {
                com.heytap.accessory.base.logging.a.a(o, "Connect to " + PlatformUtils.getAddrforLog(bVar.d()) + " port :" + eVar.b);
                this.k.connect(new InetSocketAddress(bVar.d(), eVar.b));
            }
            this.l = this.k.getInputStream();
            this.m = this.k.getOutputStream();
            this.b = 1;
            this.n = true;
            com.heytap.accessory.base.logging.a.d(o, "ReaderThread is now free to run!");
            n();
        } catch (IOException unused) {
            com.heytap.accessory.base.logging.a.b(o, "connect error.");
            this.b = 2;
            this.a = -1110;
            Socket socket2 = this.k;
            if (socket2 != null) {
                socket2.close();
            }
        } catch (IOException e) {
            com.heytap.accessory.base.logging.a.b(o, "Wifi Socket closure failed! " + e);
            this.a = -1110;
        } finally {
            s.removeCallbacks(this.g);
            this.j.a(this.h, this.d, this.b, this.a);
        }
    }

    public final int b(byte[] bArr, String str) throws IOException {
        int i = this.l.read(bArr, 0, 2);
        if (i <= 0) {
            com.heytap.accessory.base.logging.a.b(o, "Error reading " + str + " bytesRead:" + i);
            return -1;
        }
        if (i != 1 || this.l.read(bArr, 1, 1) > 0) {
            return 0;
        }
        com.heytap.accessory.base.logging.a.b(o, "Error reading 2nd byte of " + str);
        return -1;
    }

    @Override // com.heytap.accessory.connectivity.a
    public void a(boolean z) {
        this.c = z;
    }

    @Override // com.heytap.accessory.connectivity.a
    public int a(com.heytap.accessory.message.b bVar, long j) {
        Handler handler = q;
        if (handler != null && handler.post(new b(bVar, j))) {
            return 0;
        }
        com.heytap.accessory.base.logging.a.b(o, "Message not posted");
        return 1;
    }

    public final void a(com.heytap.accessory.message.a aVar) {
        if (1 != this.b) {
            com.heytap.accessory.base.logging.a.e(o, "ConnectionStatus:" + this.b);
        }
        if (m()) {
            this.b = 3;
            return;
        }
        try {
            try {
                super.b(aVar, 1);
                if (this.m != null) {
                    com.heytap.accessory.base.d.e(this.h);
                    this.m.write(aVar.f().getBuffer(), aVar.e(), aVar.g());
                    this.m.flush();
                    com.heytap.accessory.base.d.d(this.h);
                }
                com.heytap.accessory.base.logging.a.c(o, "WIFI WRITE Len:" + aVar.g());
            } catch (IOException unused) {
                this.b = 3;
                if (this.a != 2) {
                    this.a = 1;
                }
                com.heytap.accessory.base.logging.a.e(o, "Wifi Socket closed during write (status: " + this.b + ")");
            }
        } finally {
            super.a(aVar, 1);
        }
    }

    public final int a(byte[] bArr, byte[] bArr2) throws IOException {
        if (!this.c) {
            return 0;
        }
        if (b(bArr2, "payload length crc (Wifi)") != 0) {
            return -1;
        }
        if (!a(bArr, bArr2, 2, "payload length")) {
            return 0;
        }
        this.a = 2;
        return -1;
    }

    public final int a(int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i > 0) {
            int i3 = this.l.read(bArr, i2, i);
            if (i3 == -1) {
                com.heytap.accessory.base.logging.a.b(o, "Error reading in Bluetooth socket");
                return -1;
            }
            i -= i3;
            i2 += i3;
        }
        return 0;
    }

    public final int a(Buffer buffer, byte[] bArr) throws IOException {
        if (this.c) {
            return (b(bArr, "payload crc (Wifi)") == 0 && !a(buffer.getBuffer(), bArr, buffer.getLength(), "payload, ignoring packet")) ? 0 : -1;
        }
        return 0;
    }

    public final boolean a(byte[] bArr, byte[] bArr2, int i, String str) {
        int iB = com.heytap.accessory.misc.utils.c.b(bArr, 0, i);
        int i2 = (bArr2[1] & 255) | ((bArr2[0] & 255) << 8);
        if (iB != i2) {
            com.heytap.accessory.base.logging.a.b(o, "CRC ERROR in " + str + ", computeCrc eval:" + iB + " expect Crc:" + i2);
        }
        return iB != i2;
    }
}
