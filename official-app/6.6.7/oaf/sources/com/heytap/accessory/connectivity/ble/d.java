package com.heytap.accessory.connectivity.ble;

import android.bluetooth.BluetoothGattServer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.pair.connectivity.ble.constant.BleConstants;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferException;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d extends com.heytap.accessory.connectivity.a implements com.heytap.accessory.connectivity.ble.interfaces.b {
    public static final Object q = new Object();
    public static final String r = "d";
    public final Object g;
    public long h;
    public com.heytap.accessory.connectivity.ble.interfaces.a i;
    public com.heytap.accessory.connectivity.interfaces.a j;
    public c k;
    public com.heytap.accessory.base.bean.b l;
    public Handler m;
    public int n;
    public String o;
    public String p;

    public final class b implements Runnable {
        public final com.heytap.accessory.message.b a;
        public final long b;

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.d(d.r, "ble send msg: " + this.a.d());
            d.this.a(this.a.c());
            if (d.this.j != null) {
                d.this.j.a(d.this.h, d.this.d, this.b, this.a);
            }
        }

        public b(com.heytap.accessory.message.b bVar, long j) {
            this.a = bVar;
            this.b = j;
        }
    }

    public static final class c extends Handler {
        public final WeakReference<d> a;
        public int b;
        public byte[] c;
        public int d;
        public int e;
        public int f;
        public byte[] g;
        public boolean h;
        public boolean i;
        public Buffer j;

        public final void a(d dVar, byte[] bArr) {
            int length;
            int i;
            if (!this.h) {
                int i2 = bArr[0] & 255;
                this.d = i2;
                this.e = i2 + 1;
                this.i = dVar.c;
                if (FrameworkService.sConnectionLogOpened) {
                    dVar.a(bArr, "BLE First Frame received");
                }
                int iMin = Math.min(20, bArr.length);
                byte[] bArr2 = new byte[iMin];
                SystemUtils.arraycopy(bArr, 0, bArr2, 0, iMin);
                com.heytap.accessory.base.logging.a.a(d.r, "handleDataReceived(first packet): mFrameLen = " + this.d + " message.length = " + bArr.length + ", message_start:" + HexUtils.byteArrayToHexStr(bArr2));
                if (this.i) {
                    int i3 = bArr[1] & 255;
                    int iB = com.heytap.accessory.misc.utils.c.b(bArr, 0, 1) & 255;
                    com.heytap.accessory.base.logging.a.a(d.r, "length crc eval:" + Integer.toHexString(iB) + ",received:" + Integer.toHexString(i3));
                    if (iB != i3) {
                        dVar.a = 2;
                        com.heytap.accessory.base.logging.a.b(d.r, "CRC LEN ERROR in payload length, received CRC >>>> = 0x" + Integer.toHexString(i3));
                        com.heytap.accessory.base.logging.a.b(d.r, "CRC LEN ERROR PACKET : " + com.heytap.accessory.misc.utils.c.a(bArr, 1, 1));
                        return;
                    }
                    this.e += 3;
                    i = 1;
                } else {
                    i = 0;
                }
                Buffer bufferObtain = BufferPool.obtain(this.d);
                this.j = bufferObtain;
                byte[] buffer = bufferObtain.getBuffer();
                this.g = buffer;
                this.b = 0;
                this.f = 0;
                int i4 = this.e;
                if (i4 == bArr.length) {
                    if (this.i) {
                        int length2 = ((bArr.length - 1) - i) - 2;
                        SystemUtils.arraycopy(bArr, i + 1, buffer, 0, length2);
                        this.b = length2;
                        byte[] bArr3 = this.c;
                        bArr3[0] = bArr[bArr.length - 2];
                        bArr3[1] = bArr[bArr.length - 1];
                    } else {
                        SystemUtils.arraycopy(bArr, 1, buffer, 0, bArr.length - 1);
                        this.b = bArr.length - 1;
                    }
                } else if (i4 - bArr.length == 1 && this.i) {
                    int length3 = ((bArr.length - 1) - i) - 1;
                    SystemUtils.arraycopy(bArr, i + 1, buffer, 0, length3);
                    this.b = length3;
                    this.c[0] = bArr[bArr.length - 1];
                    this.h = true;
                } else {
                    int i5 = i + 1;
                    int length4 = bArr.length - i5;
                    if (buffer.length - 0 < length4) {
                        dVar.a = 2;
                        com.heytap.accessory.base.logging.a.b(d.r, "BLE ERROR PACKET: Array Index Out Of Bounds, src.length = " + bArr.length + ", srcPos = " + i5 + ", dst.length = " + this.g.length + ", dstPos = " + this.b + ", length = " + length4);
                        return;
                    }
                    SystemUtils.arraycopy(bArr, i5, buffer, 0, length4);
                    this.b = length4;
                    this.h = true;
                }
                this.f += bArr.length;
            } else if (this.e - this.f > bArr.length) {
                com.heytap.accessory.base.logging.a.a(d.r, "handleDataReceived(reading): mFrameLen = " + this.d + " message.length = " + bArr.length + " this.mBytesRead = " + this.b);
                if (FrameworkService.sConnectionLogOpened) {
                    dVar.a(bArr, "BLE middle Frame received");
                }
                if ((this.e - this.f) - bArr.length == 1 && this.i) {
                    length = bArr.length - 1;
                    this.c[0] = bArr[bArr.length - 1];
                } else {
                    length = bArr.length;
                }
                SystemUtils.arraycopy(bArr, 0, this.g, this.b, length);
                this.b += length;
                this.f += bArr.length;
            } else {
                com.heytap.accessory.base.logging.a.a(d.r, "handleDataReceived(last packet): mFrameLen = " + this.d + " message.length = " + bArr.length + " this.mBytesRead = " + this.b);
                if (FrameworkService.sConnectionLogOpened) {
                    dVar.a(bArr, "BLE last Frame received");
                }
                int i6 = this.d;
                int i7 = this.b;
                int i8 = i6 - i7;
                if (i8 > 0) {
                    SystemUtils.arraycopy(bArr, 0, this.g, i7, i8);
                    int i9 = this.b;
                    this.b = i9 + (this.d - i9);
                }
                if (bArr.length == 1) {
                    this.c[1] = bArr[0];
                } else {
                    byte[] bArr4 = this.c;
                    bArr4[0] = bArr[bArr.length - 2];
                    bArr4[1] = bArr[bArr.length - 1];
                }
                this.h = false;
            }
            if (this.h) {
                return;
            }
            if (this.i) {
                int iB2 = com.heytap.accessory.misc.utils.c.b(this.g, 0, this.d);
                byte[] bArr5 = this.c;
                int i10 = (bArr5[1] & 255) | ((bArr5[0] & 255) << 8);
                com.heytap.accessory.base.logging.a.d(d.r, "payload crc evaluate:" + Integer.toHexString(iB2) + ",receiveCrc:" + Integer.toHexString(i10));
                if (iB2 != i10) {
                    com.heytap.accessory.base.logging.a.b(d.r, "CRC ERROR in payload, evaluateCrc:" + Integer.toHexString(iB2) + ",receiveCrc:" + Integer.toHexString(i10));
                    dVar.a(this.g, 0, this.d, "CRC ERROR PACKET");
                    return;
                }
            }
            if (1 == dVar.b) {
                com.heytap.accessory.base.logging.a.d(d.r, "Dispatching frame buffer to transport layer");
                dVar.j.a(dVar.l.l(), dVar.d, this.j);
                return;
            }
            com.heytap.accessory.base.logging.a.b(d.r, "CONNECTION_STATUS is not open, status = " + dVar.b);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] byteArray;
            d dVar = this.a.get();
            if (dVar == null) {
                com.heytap.accessory.base.logging.a.b(d.r, "MessageHandler() : reference to AFBleDevice is null! returning...");
                return;
            }
            if (message.what != 5) {
                com.heytap.accessory.base.logging.a.b(d.r, "Unknown event rece4ived in data reader handler =" + message);
                return;
            }
            Bundle data = message.getData();
            if (data == null || (byteArray = data.getByteArray(BleConstants.DATA_RECEIVED)) == null) {
                return;
            }
            if (byteArray.length == 0) {
                com.heytap.accessory.base.logging.a.d(d.r, "Empty Message");
            } else {
                a(dVar, byteArray);
            }
        }

        public c(Looper looper, d dVar) {
            super(looper);
            this.h = false;
            this.c = new byte[2];
            this.b = 0;
            this.d = 0;
            this.a = new WeakReference<>(dVar);
        }
    }

    public d(com.heytap.accessory.connectivity.params.c cVar) {
        super(cVar, 1);
        this.n = 20;
        this.g = new Object();
        this.b = 0;
        this.a = 0;
    }

    @Override // com.heytap.accessory.connectivity.a
    public int b() {
        return 0;
    }

    public com.heytap.accessory.connectivity.ble.b i() {
        return new com.heytap.accessory.connectivity.ble.b(this, (com.heytap.accessory.connectivity.params.a) this.e);
    }

    public e j() {
        return new e(this);
    }

    public final boolean k() {
        com.heytap.accessory.connectivity.ble.interfaces.a aVar = this.i;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    public void l() {
        this.i.c();
    }

    public final void m() {
        com.heytap.accessory.connectivity.ble.interfaces.a aVar = this.i;
        this.p = com.heytap.accessory.base.thread.a.b().a(4, (aVar == null || !(aVar instanceof com.heytap.accessory.connectivity.ble.b)) ? "S" : "C", "WRITE", 1);
        this.m = new Handler(com.heytap.accessory.base.thread.a.b().b(this.p));
        com.heytap.accessory.base.logging.a.a(r, "initialized Writer");
    }

    public final void n() {
        com.heytap.accessory.connectivity.ble.interfaces.a aVar = this.i;
        this.o = com.heytap.accessory.base.thread.a.b().a(4, (aVar == null || !(aVar instanceof com.heytap.accessory.connectivity.ble.b)) ? "S" : "C", "READ", 1);
        this.k = new c(com.heytap.accessory.base.thread.a.b().b(this.o), this);
        com.heytap.accessory.base.logging.a.a(r, "initialized Reader");
    }

    public final void o() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            com.heytap.accessory.base.thread.a.b().e(this.p);
            this.m = null;
        }
    }

    public final void p() {
        c cVar = this.k;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            com.heytap.accessory.base.thread.a.b().e(this.o);
            this.k = null;
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void d() {
        String str = r;
        com.heytap.accessory.base.logging.a.d(str, "close enter");
        if (this.b == 2) {
            com.heytap.accessory.base.logging.a.d(str, "Already Connection closed return");
            return;
        }
        this.b = 2;
        this.a = 0;
        c();
    }

    @Override // com.heytap.accessory.connectivity.a
    public void e() {
        if (this.i instanceof e) {
            c();
        } else {
            com.heytap.accessory.base.logging.a.b(r, "mBtSocket is null");
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void f() {
        n();
    }

    @Override // com.heytap.accessory.connectivity.a
    public void g() {
        m();
    }

    @Override // com.heytap.accessory.connectivity.a
    public void c() {
        com.heytap.accessory.connectivity.ble.interfaces.a aVar = this.i;
        if (aVar != null) {
            aVar.b();
        }
        p();
        o();
    }

    @Override // com.heytap.accessory.connectivity.a
    public int b(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        String str = r;
        com.heytap.accessory.base.logging.a.a(str, "Server Mode");
        this.b = 0;
        this.a = 0;
        this.j = aVar;
        if (!(bVar instanceof com.heytap.accessory.connectivity.ble.a)) {
            return 0;
        }
        a(bVar.H(), bVar.g());
        this.l = bVar;
        com.heytap.accessory.base.logging.a.a(str, "Setting Socket for Accessory Id : " + bVar.l() + " socket is : " + bVar.z());
        this.h = bVar.l();
        this.i = j();
        this.n = com.heytap.accessory.connectivity.ble.callback.a.d().e();
        this.b = this.i.a(bVar);
        bVar.d(this.i.e());
        bVar.e(ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS);
        return this.b;
    }

    public static d a(com.heytap.accessory.connectivity.params.c cVar) {
        d dVar;
        synchronized (q) {
            dVar = new d(cVar);
        }
        return dVar;
    }

    public final boolean c(byte[] bArr) {
        boolean zA = this.i.a(bArr);
        if (FrameworkService.sConnectionLogOpened) {
            a(bArr, "BLE WRITING SMALL PACKET");
        }
        return zA;
    }

    public static com.heytap.accessory.connectivity.a a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.params.c cVar) {
        d dVarA = a(cVar);
        dVarA.i = new e(dVarA, (BluetoothGattServer) bVar.z());
        return dVarA;
    }

    @Override // com.heytap.accessory.connectivity.a
    public void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        String str = r;
        com.heytap.accessory.base.logging.a.c(str, " do connect ble device:" + bVar.l());
        this.b = 0;
        this.a = 0;
        this.j = aVar;
        if (bVar instanceof com.heytap.accessory.connectivity.ble.a) {
            a(bVar.H(), bVar.g());
            this.l = bVar;
            this.h = bVar.l();
            com.heytap.accessory.connectivity.ble.b bVarI = i();
            this.i = bVarI;
            int iA = bVarI.a(bVar);
            this.a = iA;
            if (iA == 0) {
                this.l.d(this.i.e());
                bVar.e(ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS);
                return;
            }
            this.b = 3;
            this.j.a(bVar.l(), this.d, this.b, this.a);
            com.heytap.accessory.base.logging.a.d(str, "Connection   (status: " + this.b + ")");
        }
    }

    public final boolean b(byte[] bArr) {
        synchronized (this.g) {
            if (c(bArr)) {
                try {
                    this.g.wait();
                } catch (InterruptedException unused) {
                    com.heytap.accessory.base.logging.a.b(r, "InterruptedException while waiting to write");
                }
                return true;
            }
            com.heytap.accessory.base.logging.a.b(r, "Write Failed");
            return false;
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public void a(boolean z) {
        com.heytap.accessory.base.logging.a.d(r, "CRC is " + z + " for BLE");
        this.c = z;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.b
    public void a(byte[] bArr) {
        c cVar = this.k;
        if (cVar != null) {
            Message messageObtainMessage = cVar.obtainMessage();
            messageObtainMessage.what = 5;
            Bundle bundle = new Bundle();
            bundle.putByteArray(BleConstants.DATA_RECEIVED, bArr);
            messageObtainMessage.setData(bundle);
            this.k.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.b
    public void a(int i, int i2) {
        this.b = i;
        this.a = i2;
        com.heytap.accessory.connectivity.interfaces.a aVar = this.j;
        if (aVar != null) {
            aVar.a(this.h, this.d, i, i2);
        }
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.b
    public void a() {
        synchronized (this.g) {
            com.heytap.accessory.base.logging.a.a(r, "onMessageSent notifyAll");
            this.g.notifyAll();
        }
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.b
    public void a(int i) {
        this.n = i;
    }

    public final void a(byte[] bArr, int i) {
        if (i <= this.n) {
            b(bArr);
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            int iMin = Math.min(this.n + i2, i);
            int i3 = iMin - i2;
            Buffer bufferObtainExact = BufferPool.obtainExact(i3);
            try {
                bufferObtainExact.extractFrom(bArr, i2, i3);
            } catch (BufferException e) {
                com.heytap.accessory.base.logging.a.b(r, "writeBLEPacket: extractFrom error = " + e.toString());
            }
            if (!b(bufferObtainExact.getBuffer())) {
                bufferObtainExact.recycle();
                return;
            } else if (iMin >= i) {
                return;
            } else {
                i2 = iMin;
            }
        }
    }

    @Override // com.heytap.accessory.connectivity.a
    public int a(com.heytap.accessory.message.b bVar, long j) {
        Handler handler = this.m;
        if (handler != null && handler.post(new b(bVar, j))) {
            return 0;
        }
        com.heytap.accessory.base.logging.a.b(r, "Message not posted");
        return 1;
    }

    public final void a(com.heytap.accessory.message.a aVar) {
        if (1 != this.b) {
            com.heytap.accessory.base.logging.a.e(r, "ConnectionStatus: " + this.b);
        }
        if (!k()) {
            this.b = 3;
            return;
        }
        try {
            try {
                super.b(aVar, 4);
                int iMin = Math.min(20, aVar.g());
                byte[] bArr = new byte[iMin];
                SystemUtils.arraycopy(aVar.f().getBuffer(), aVar.f().getOffset(), bArr, 0, iMin);
                com.heytap.accessory.base.logging.a.a(r, "bleWriteProtocolFrame offset: " + aVar.e() + ", version = " + aVar.m() + ", ackStatus = " + aVar.a() + ", seq = " + aVar.i() + ", toPrint = " + HexUtils.byteArrayToHexStr(bArr));
                int payloadLength = aVar.f().getPayloadLength();
                if (payloadLength == aVar.f().getBufferLength()) {
                    a(aVar.f().getBuffer(), payloadLength);
                } else {
                    Buffer bufferObtainExact = BufferPool.obtainExact(payloadLength);
                    SystemUtils.arraycopy(aVar.f().getBuffer(), aVar.f().getOffset(), bufferObtainExact.getBuffer(), 0, payloadLength);
                    a(bufferObtainExact.getBuffer(), payloadLength);
                    bufferObtainExact.recycle();
                }
            } catch (Exception e) {
                com.heytap.accessory.base.logging.a.a(r, "Socket closed during write", e);
                this.b = 3;
                if (this.a != 2) {
                    this.a = 1;
                }
            }
        } finally {
            super.a(aVar, 4);
        }
    }
}
