package com.heytap.accessory.connectivity.bt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b extends com.heytap.accessory.connectivity.a {
    public static final String r = "b";
    public static final Object s = new Object();
    public Handler g;
    public d h;
    public long i;
    public BluetoothSocket j;
    public com.heytap.accessory.connectivity.interfaces.a k;
    public InputStream l;
    public boolean m;
    public OutputStream n;
    public Handler o;
    public boolean p;
    public BluetoothDevice q;

    public final class b implements Runnable {
        public final com.heytap.accessory.message.b a;
        public final long b;

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.d(b.r, "bt send msg: " + this.a.d());
            b.this.a(this.a.c());
            if (b.this.k != null) {
                b.this.k.a(b.this.i, b.this.d, this.b, this.a);
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
            com.heytap.accessory.base.logging.a.a(b.r, "initialized BT Reader acc:" + b.this.i);
            while (b.this.m) {
                try {
                    if (!b.this.r()) {
                        break;
                    }
                    com.heytap.accessory.base.logging.a.a(b.r, "start read bt");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (b.this.b(this.d, "payload length (BT)") != 0) {
                        com.heytap.accessory.base.logging.a.b(b.r, "readHeaderState error,close socket!");
                        break;
                    }
                    if (b.this.a(this.d, this.c) != 0) {
                        com.heytap.accessory.base.logging.a.b(b.r, "readPayloadLenCrcState error,ignore this packet");
                    } else {
                        byte[] bArr = this.d;
                        int i = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
                        if (i <= 0) {
                            com.heytap.accessory.base.logging.a.b(b.r, "frameLen <= 0,ignore this packet");
                        } else {
                            Buffer bufferObtain = BufferPool.obtain(i);
                            this.e = bufferObtain;
                            if (FrameworkService.sConnectionLogOpened) {
                                b.this.a(bufferObtain.getBuffer(), "BtRfConnection onMessageReceived");
                            }
                            byte[] buffer = this.e.getBuffer();
                            this.b = buffer;
                            int iA = b.this.a(i, buffer);
                            if (iA != 0) {
                                com.heytap.accessory.base.logging.a.b(b.r, "readPayloadState:" + iA + ",ignore this packet");
                            } else {
                                com.heytap.accessory.base.logging.a.a(b.r, "readPayloadState:" + iA + ",frameLen:" + i);
                                int iA2 = b.this.a(this.e, this.a);
                                com.heytap.accessory.base.logging.a.a(b.r, "readPayloadCrc:" + iA2);
                                if (iA2 == -1) {
                                    com.heytap.accessory.base.logging.a.b(b.r, "readPayloadCrc error,ignore this packet");
                                } else if (!b.this.m || b.this.a == 2) {
                                    com.heytap.accessory.base.logging.a.b(b.r, "Error unexpected :" + b.this.a);
                                } else {
                                    com.heytap.accessory.base.logging.a.c(b.r, "BT READ Len:" + i + " cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                                    if (b.this.k != null) {
                                        b.this.k.a(b.this.i, b.this.d, this.e);
                                    } else {
                                        com.heytap.accessory.base.logging.a.b(b.r, "ConnectionEventListener is null");
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    b.this.m = false;
                    b.this.b = 3;
                    com.heytap.accessory.base.logging.a.a(b.r, "BTReaderThread IOexception with uuid:" + b.this.o(), e);
                    try {
                        b.this.k();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            b.this.p();
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
            com.heytap.accessory.base.logging.a.e(b.r, "BT Socket connect time out with:" + b.this.o());
            b.this.u();
            if (b.this.m) {
                com.heytap.accessory.base.logging.a.e(b.r, "BT Socket has connect success, connect time out event can ignore now!");
                return;
            }
            com.heytap.accessory.base.logging.a.c(b.r, "Closing the BT streams ...");
            try {
                if (b.this.n != null) {
                    b.this.n.close();
                }
                if (b.this.l != null) {
                    b.this.l.close();
                }
                if (b.this.j != null) {
                    b.this.k();
                }
            } catch (Exception e) {
                b.this.b = 3;
                com.heytap.accessory.base.logging.a.a(b.r, "Closing the BT error", e);
            }
            boolean z = UUID.fromString("a49eaa15-cb06-495c-9f4f-bb80a90cdf00").equals(b.this.o()) || UUID.fromString("a49ebb15-cb06-495c-9f4f-bb80a90cdf00").equals(b.this.o());
            if (b.this.k == null || !z) {
                return;
            }
            b.this.b = 3;
            b.this.a = 1;
            b.this.k.a(b.this.i, b.this.d, b.this.b, b.this.a);
        }

        public d() {
        }
    }

    public b(com.heytap.accessory.connectivity.params.c cVar) {
        super(cVar, cVar.a);
        this.p = false;
        this.h = new d();
        this.b = 0;
        this.a = 0;
        this.i = -1L;
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("BT_CONNECT_" + this.d);
        if (looperB != null) {
            this.g = new Handler(looperB);
        }
        com.heytap.accessory.base.logging.a.a(r, "create BtRfConnection:" + this + ",mSocketTimeoutEventHandler" + this.h);
    }

    public static void j() {
    }

    @Override // com.heytap.accessory.connectivity.a
    public int b() {
        return 0;
    }

    public final boolean r() {
        if (this.b == 1) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(r, "BT Socket is not connected! Connection status: " + this.b + ")");
        return false;
    }

    public final boolean s() {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("BT_WRITE_" + this.d);
        if (looperB == null) {
            return false;
        }
        this.o = new Handler(looperB);
        com.heytap.accessory.base.logging.a.a(r, "initialized BT Writer");
        return true;
    }

    public final void t() {
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            if (com.heytap.accessory.base.thread.a.b().e("BT_WRITE_" + this.d)) {
                return;
            }
            com.heytap.accessory.base.logging.a.e(r, "Error while closing BT writer Thread");
        }
    }

    public final void u() {
        Handler handler = this.g;
        if (handler != null) {
            String str = r;
            com.heytap.accessory.base.logging.a.c(str, "Stop socket timer:" + this.h);
            handler.removeCallbacks(this.h);
            com.heytap.accessory.base.thread.a.b().e("BT_CONNECT_" + this.d);
            com.heytap.accessory.base.logging.a.a(str, "quitThread:BT_CONNECT_" + this.d);
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void e() {
        if (this.j == null) {
            com.heytap.accessory.base.logging.a.b(r, "mBtSocket is null");
        } else {
            com.heytap.accessory.base.logging.a.e(r, "Force Closing BT socket connection...");
            c();
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void f() {
        com.heytap.accessory.base.thread.a.b().a().execute(new c());
    }

    @Override // com.heytap.accessory.connectivity.a
    public void g() {
        s();
    }

    public void i() throws Exception {
        BluetoothSocket bluetoothSocket;
        if (this.p || (bluetoothSocket = this.j) == null) {
            return;
        }
        bluetoothSocket.close();
    }

    public void k() throws Exception {
        if (this.p) {
            com.heytap.accessory.connectivity.bt.ipc.b.a(PlatformUtils.getContext(), this.q, o());
            return;
        }
        if (this.j != null) {
            com.heytap.accessory.base.logging.a.c(r, "close socket:" + o());
            this.j.close();
            this.j = null;
        }
    }

    public InputStream l() throws IOException {
        return this.j.getInputStream();
    }

    public OutputStream m() throws IOException {
        return this.j.getOutputStream();
    }

    public String n() {
        return this.j.getRemoteDevice().getName();
    }

    public final UUID o() {
        return ((com.heytap.accessory.connectivity.params.b) this.e).b;
    }

    public final void p() {
        if (this.m || 2 == this.a || 3 == this.b) {
            this.b = 3;
            boolean z = true;
            if (this.a != 2) {
                this.a = 1;
            }
            this.m = false;
            String str = r;
            com.heytap.accessory.base.logging.a.e(str, "BT Connection closed - Accessory : " + this.i + "，this");
            if (!UUID.fromString("a49eaa15-cb06-495c-9f4f-bb80a90cdf00").equals(o()) && !UUID.fromString("a49ebb15-cb06-495c-9f4f-bb80a90cdf00").equals(o())) {
                z = false;
            }
            com.heytap.accessory.connectivity.interfaces.a aVar = this.k;
            if (aVar != null && z) {
                aVar.a(this.i, this.d, this.b, this.a);
            }
            com.heytap.accessory.base.logging.a.d(str, "BT Connection status: " + this.b + " !");
        }
    }

    public boolean q() {
        return this.j.isConnected();
    }

    @Override // com.heytap.accessory.connectivity.a
    public void c() {
        try {
            OutputStream outputStream = this.n;
            if (outputStream != null) {
                outputStream.close();
            }
            InputStream inputStream = this.l;
            if (inputStream != null) {
                inputStream.close();
            }
            if (this.j != null) {
                k();
            }
        } catch (Exception unused) {
            this.b = 3;
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void d() {
        this.m = false;
        this.a = 0;
        this.b = 2;
        if (!com.heytap.accessory.connectivity.c.b().c()) {
            t();
        }
        c();
        com.heytap.accessory.base.logging.a.d(r, "BT Connection is now closed (status: " + this.b + ")");
    }

    @Override // com.heytap.accessory.connectivity.a
    public int b(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        this.b = 0;
        this.a = 0;
        this.m = false;
        this.k = aVar;
        if (!(bVar instanceof com.heytap.accessory.connectivity.bt.a)) {
            return 0;
        }
        String str = r;
        com.heytap.accessory.base.logging.a.c(str, "Setting BT Socket for Accessory Id : " + bVar.l() + " address is : " + HexUtils.hideAddress(bVar.d()));
        a(bVar.H(), bVar.g());
        this.i = bVar.l();
        this.j = (BluetoothSocket) bVar.c(this.d);
        bVar.d(n());
        bVar.e(ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS);
        try {
            if (!q()) {
                com.heytap.accessory.base.logging.a.b(str, "Not Connected to BT Socket with  (status: " + this.b + ")");
                this.b = 3;
                return 3;
            }
            this.l = l();
            this.n = m();
            this.b = 1;
            com.heytap.accessory.base.logging.a.d(str, "openConnection(): status = " + this.b);
            this.m = true;
            return this.b;
        } catch (IOException e) {
            com.heytap.accessory.base.logging.a.a(r, "IOException when getting BT IO Stream", e);
            try {
                k();
            } catch (Exception unused) {
                this.b = 3;
                this.a = 1;
                com.heytap.accessory.base.logging.a.b(r, "IOException when closing BT Socket (status: " + this.b + ")");
            }
            return 0;
        }
    }

    public static b a(com.heytap.accessory.connectivity.params.c cVar) {
        b bVar;
        synchronized (s) {
            bVar = new b(cVar);
        }
        return bVar;
    }

    public static b a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.params.c cVar) {
        b bVarA = a(cVar);
        BluetoothSocket bluetoothSocket = (BluetoothSocket) bVar.c(cVar.a);
        bVarA.j = bluetoothSocket;
        if (bluetoothSocket != null) {
            try {
                bVarA.l = bluetoothSocket.getInputStream();
                bVarA.n = bVarA.j.getOutputStream();
            } catch (IOException e) {
                com.heytap.accessory.base.logging.a.a(r, "Catching IOException while opening bt socket", e);
            }
        }
        return bVarA;
    }

    @Override // com.heytap.accessory.connectivity.a
    public void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        this.b = 0;
        this.a = 0;
        this.k = aVar;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            try {
                if ((bVar instanceof com.heytap.accessory.connectivity.bt.a) && (this.e instanceof com.heytap.accessory.connectivity.params.b)) {
                    this.m = false;
                    this.i = bVar.l();
                    if (defaultAdapter == null) {
                        String str = r;
                        com.heytap.accessory.base.logging.a.b(str, "Connect failed! BTAdapter instance is null, returning...");
                        this.a = -1107;
                        u();
                        this.k.a(bVar.l(), this.d, this.b, this.a);
                        com.heytap.accessory.base.logging.a.c(str, "BT Connection result - status:" + this.b + " _error:" + this.a);
                        u();
                        this.k.a(bVar.l(), this.d, this.b, this.a);
                        com.heytap.accessory.base.logging.a.c(str, "BT Connection result - status:" + this.b + " _error:" + this.a);
                        return;
                    }
                    a(bVar.H(), bVar.g());
                    String str2 = r;
                    com.heytap.accessory.base.logging.a.c(str2, "Connect to " + HexUtils.hideAddress(bVar.d()));
                    this.q = defaultAdapter.getRemoteDevice(bVar.d());
                    com.heytap.accessory.base.logging.a.c(str2, "Create BT socket, param: " + ((com.heytap.accessory.connectivity.params.b) this.e).b);
                    i();
                    this.j = this.q.createRfcommSocketToServiceRecord(o());
                    a(10000L);
                    if (!this.p) {
                        try {
                            if (!this.j.isConnected()) {
                                this.j.connect();
                            }
                        } catch (Exception e) {
                            if (TextUtils.equals("Connect refused", e.getMessage())) {
                                com.heytap.accessory.base.logging.a.e(r, "[Socket Connect] Connect refused try ipc bt");
                                this.p = true;
                            } else {
                                throw e;
                            }
                        }
                    }
                    if (this.p) {
                        com.heytap.accessory.connectivity.bt.ipc.b.b(PlatformUtils.getContext(), this.q, o());
                    }
                    bVar.d(n());
                    bVar.e(ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS);
                    this.l = l();
                    this.n = m();
                    this.b = 1;
                    com.heytap.accessory.base.logging.a.d(r, "BT ReaderThread ready");
                    this.m = true;
                }
                u();
                this.k.a(bVar.l(), this.d, this.b, this.a);
                com.heytap.accessory.base.logging.a.c(r, "BT Connection result - status:" + this.b + " _error:" + this.a);
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.b(r, "Connect failed with:" + o(), e2);
                this.b = 3;
                this.a = -1111;
                if (this.j != null) {
                    try {
                        k();
                    } catch (Exception unused) {
                        com.heytap.accessory.base.logging.a.b(r, "BT Socket closure failed! Exception occurred, returning...");
                        this.a = -1110;
                    }
                }
                u();
                this.k.a(bVar.l(), this.d, this.b, this.a);
                com.heytap.accessory.base.logging.a.c(r, "BT Connection result - status:" + this.b + " _error:" + this.a);
            }
        } catch (Throwable th) {
            u();
            this.k.a(bVar.l(), this.d, this.b, this.a);
            com.heytap.accessory.base.logging.a.c(r, "BT Connection result - status:" + this.b + " _error:" + this.a);
            throw th;
        }
    }

    public final int b(byte[] bArr, String str) throws Exception {
        int iA;
        if (this.p) {
            iA = com.heytap.accessory.connectivity.bt.ipc.b.a(PlatformUtils.getContext(), this.q, o(), bArr, 0, 2);
        } else {
            iA = this.l.read(bArr, 0, 2);
        }
        if (iA <= 0) {
            com.heytap.accessory.base.logging.a.b(r, "Error reading " + str);
            return -1;
        }
        if (iA != 1 || this.l.read(bArr, 1, 1) > 0) {
            return 0;
        }
        com.heytap.accessory.base.logging.a.b(r, "Error reading 2nd byte of " + str);
        return -1;
    }

    @Override // com.heytap.accessory.connectivity.a
    public void a(boolean z) {
        this.c = z;
    }

    @Override // com.heytap.accessory.connectivity.a
    public int a(com.heytap.accessory.message.b bVar, long j) {
        Handler handler = this.o;
        if (handler != null && handler.post(new b(bVar, j))) {
            return 0;
        }
        com.heytap.accessory.base.logging.a.b(r, "BT Message not posted");
        return 1;
    }

    public final int a(int i, byte[] bArr) throws Exception {
        int iA;
        int i2 = 0;
        while (i > 0) {
            if (this.p) {
                iA = com.heytap.accessory.connectivity.bt.ipc.b.a(PlatformUtils.getContext(), this.q, o(), bArr, i2, i);
            } else {
                iA = this.l.read(bArr, i2, i);
            }
            if (iA == -1) {
                com.heytap.accessory.base.logging.a.b(r, "Error reading in Bluetooth socket");
                return -1;
            }
            i -= iA;
            i2 += iA;
        }
        return 0;
    }

    public final int a(byte[] bArr, byte[] bArr2) throws Exception {
        if (this.c) {
            if (b(bArr2, "payload length crc (BT)") != 0) {
                return -1;
            }
            if (!a(bArr, bArr2, 2, "payload length", 1)) {
                this.a = 2;
                return -1;
            }
            this.a = 0;
        }
        return 0;
    }

    public final int a(Buffer buffer, byte[] bArr) throws Exception {
        if (this.c) {
            if (b(bArr, "payload crc (BT)") != 0) {
                return -1;
            }
            if (!a(buffer.getBuffer(), bArr, buffer.getLength(), "payload ", 2)) {
                this.a = 2;
                return -1;
            }
            this.a = 0;
        }
        return 0;
    }

    public final boolean a(byte[] bArr, byte[] bArr2, int i, String str, int i2) {
        int iB = com.heytap.accessory.misc.utils.c.b(bArr, 0, i);
        int i3 = (bArr2[1] & 255) | ((bArr2[0] & 255) << 8);
        if (iB != i3) {
            String str2 = r;
            com.heytap.accessory.base.logging.a.b(str2, "CRC ERROR in " + str + ", receivedCRC >>>> = 0x" + Integer.toHexString(i3) + ",evaluateCRC=0x" + Integer.toHexString(iB));
            StringBuilder sb = new StringBuilder();
            sb.append("CRC ERROR PACKET is: ");
            sb.append(HexUtils.byteArrayToHexStr(bArr, 0, i));
            com.heytap.accessory.base.logging.a.b(str2, sb.toString());
        } else if (i2 == 2) {
            com.heytap.accessory.base.logging.a.a(r, "received payload CRC= 0x" + Integer.toHexString(i3) + ",evaluate payload Crc=0x" + Integer.toHexString(iB));
        }
        return iB == i3;
    }

    public final int a(com.heytap.accessory.message.a aVar) {
        if (1 != this.b) {
            com.heytap.accessory.base.logging.a.e(r, "writeProtocolFrame() BT ConnectionStatus: " + this.b);
        }
        int iG = aVar.g();
        String str = r;
        com.heytap.accessory.base.logging.a.a(str, "before writeProtocolFrame offset: " + aVar.e() + " PayloadLength: " + iG);
        int iG2 = -1;
        try {
            super.b(aVar, 2);
            if (this.n != null) {
                int iMin = Math.min(20, aVar.g());
                byte[] bArr = new byte[iMin];
                SystemUtils.arraycopy(aVar.f().getBuffer(), aVar.e(), bArr, 0, iMin);
                com.heytap.accessory.base.logging.a.a(str, "btWriteProtocolFrame offset: " + aVar.e() + ", version = " + aVar.m() + ", ackStatus = " + aVar.a() + ", seq = " + aVar.i() + ", toPrint = " + HexUtils.byteArrayToHexStr(bArr));
                if (FrameworkService.sConnectionLogOpened) {
                    a(aVar.f().getBuffer(), aVar.f().getOffset(), aVar.g(), "BT write data");
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.p) {
                    com.heytap.accessory.connectivity.bt.ipc.b.a(PlatformUtils.getContext(), this.q, o(), aVar.f().getBuffer(), aVar.e(), aVar.g(), true);
                } else {
                    this.n.write(aVar.f().getBuffer(), aVar.e(), aVar.g());
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                iG2 = aVar.g();
                com.heytap.accessory.base.d.d(this.i);
                com.heytap.accessory.base.logging.a.c(str, "BT WRITE Len:" + iG + ",cost:" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
            }
        } catch (Exception unused) {
            this.b = 3;
            if (this.a != 2) {
                this.a = 1;
            }
            com.heytap.accessory.base.logging.a.e(r, "BT Socket closed during write (status: " + this.b + ")");
        } finally {
            super.a(aVar, 2);
        }
        return iG2;
    }

    public final void a(long j) {
        if (this.g != null) {
            com.heytap.accessory.base.logging.a.c(r, "Start socket timer:" + this.h);
            this.g.postDelayed(this.h, j);
        }
    }
}
