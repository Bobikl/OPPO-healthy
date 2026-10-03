package com.heytap.accessory.message;

import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferException;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String k = "a";
    public final long a;
    public int b;
    public String c;
    public boolean d;
    public int e;
    public Buffer f;
    public long g;
    public String h;
    public int i;
    public boolean j;

    public a() {
        this.h = "";
        this.c = "";
        this.e = -1;
        this.a = -1L;
        this.g = -1L;
        this.i = -1;
        this.f = null;
        this.j = false;
    }

    public static synchronized a a(long j, long j2) {
        a aVar;
        synchronized (a.class) {
            aVar = new a(j2);
            aVar.a(j, j2, 1);
        }
        return aVar;
        return aVar;
    }

    public static synchronized a b(int i) {
        a aVar;
        synchronized (a.class) {
            aVar = new a();
            aVar.a(i);
        }
        return aVar;
        return aVar;
    }

    public static synchronized a c(long j, long j2, int i) {
        a aVar;
        synchronized (a.class) {
            if (i <= 0) {
                aVar = null;
            } else {
                a aVar2 = new a(j2);
                aVar2.a(j, j2, i);
                aVar = aVar2;
            }
        }
        return aVar;
        return aVar;
    }

    public synchronized byte d(int i) {
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot retrieve from null payload!");
            return (byte) -1;
        }
        if (i >= 0 && buffer.getOffset() + i < this.f.getLength()) {
            return this.f.getBuffer()[this.f.getOffset() + i];
        }
        throw new ArrayIndexOutOfBoundsException("Failed to get the payload data! [offset=" + i + "; payload offset=" + this.f.getOffset() + "; payload len=" + this.f.getPayloadLength() + "]");
    }

    public synchronized void e(int i) {
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot update offset value for null payload!");
        } else {
            if (buffer.getOffset() + i >= this.f.getLength()) {
                throw new ArrayIndexOutOfBoundsException("Failed to update offset while receiving the message! [offset=" + this.f.getOffset() + "; size=" + i + "; payload len=" + this.f.getPayloadLength() + "]");
            }
            Buffer buffer2 = this.f;
            buffer2.setOffset(buffer2.getOffset() + i);
            Buffer buffer3 = this.f;
            buffer3.setPayloadLength(buffer3.getPayloadLength() - i);
        }
    }

    public synchronized void f(int i) {
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot update offset value for null message!");
        } else {
            if (buffer.getPayloadLength() + i > this.f.getLength()) {
                throw new ArrayIndexOutOfBoundsException("Failed to update payload length! [payloadLen=" + this.f.getPayloadLength() + "; lengthToUpdate=" + i + "] dataLen=" + this.f.getLength());
            }
            Buffer buffer2 = this.f;
            buffer2.setPayloadLength(buffer2.getPayloadLength() + i);
        }
    }

    public synchronized int g() {
        return this.f.getPayloadLength();
    }

    public synchronized void h(int i) {
        this.e = i;
    }

    public synchronized void i(int i) {
        this.i = i;
    }

    public synchronized long j() {
        return this.a;
    }

    public synchronized String k() {
        return this.h;
    }

    public synchronized int l() {
        return this.i;
    }

    public int m() {
        return 0;
    }

    public synchronized boolean n() {
        return this.j;
    }

    public synchronized boolean o() {
        return this.d;
    }

    public String toString() {
        StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
        try {
            sbA.append("=========================================");
            sbA.append("\n SourceAgentId: ");
            sbA.append(this.h);
            sbA.append("\n DestinAgentId: ");
            sbA.append(this.c);
            sbA.append("\n TransactionId: ");
            sbA.append(this.i);
            sbA.append("\n Version  : ");
            sbA.append(0);
            sbA.append("\n MessageType  : ");
            sbA.append(this.e);
            sbA.append("\n Encrypted  : ");
            sbA.append(this.d);
            sbA.append("\n PayloadLength  : ");
            sbA.append(this.f.getPayloadLength());
            sbA.append("\n Status  : ");
            sbA.append(this.b);
            return sbA.toString();
        } finally {
            com.heytap.accessory.base.objectpool.a.a(sbA);
        }
    }

    public synchronized void g(int i) {
        this.b = i;
    }

    public String h() {
        try {
            int iMin = Math.min(20, f().getBuffer().length);
            byte[] bArr = new byte[iMin];
            SystemUtils.arraycopy(f().getBuffer(), 0, bArr, 0, iMin);
            return "length:" + g() + ", offset:" + e() + ", first20Bytes:" + HexUtils.byteArrayToHexStr(bArr);
        } catch (Exception e) {
            return e.toString();
        }
    }

    public synchronized long i() {
        return this.g;
    }

    public static synchronized a a(long j, byte[] bArr, int i, int i2, int i3, int i4) {
        a aVar;
        synchronized (a.class) {
            aVar = new a(j);
            aVar.b(bArr, i, i2, i3, i4);
        }
        return aVar;
        return aVar;
    }

    public static synchronized a b(long j, long j2, int i) {
        a aVar;
        synchronized (a.class) {
            if (i <= 0) {
                aVar = null;
            } else {
                a aVar2 = new a(j2);
                aVar2.a(j, i);
                aVar = aVar2;
            }
        }
        return aVar;
        return aVar;
    }

    public synchronized int c(int i) {
        int offset;
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot update offset value for null message!");
            offset = -1;
        } else if (buffer.getOffset() - i >= 0) {
            Buffer buffer2 = this.f;
            buffer2.setOffset(buffer2.getOffset() - i);
            Buffer buffer3 = this.f;
            buffer3.setPayloadLength(buffer3.getPayloadLength() + i);
            offset = this.f.getOffset();
        } else {
            throw new ArrayIndexOutOfBoundsException("Failed to update offset while sending the message! [offset=" + this.f.getOffset() + "; size=" + i + "]");
        }
        return offset;
    }

    public synchronized int d() {
        return this.e;
    }

    public synchronized Buffer f() {
        return this.f;
    }

    public synchronized int e() {
        return this.f.getOffset();
    }

    public static synchronized a b(long j, Buffer buffer, int i) {
        a aVar;
        synchronized (a.class) {
            aVar = new a(j, buffer);
            aVar.f().setOffset(i);
            aVar.f().setPayloadLength(aVar.f().getLength() - i);
        }
        return aVar;
        return aVar;
    }

    public final void a(long j, long j2, int i) {
        int i2;
        int iC = com.heytap.accessory.transport.d.f().c(j, j2);
        synchronized (this) {
            int i3 = iC + 4;
            if (com.heytap.accessory.transport.d.f().f(j)) {
                i3 += 2;
                i2 = 2;
            } else {
                i2 = 0;
            }
            Buffer bufferObtain = BufferPool.obtain(i3 + i + i2);
            this.f = bufferObtain;
            bufferObtain.setOffset(i3);
            this.f.setPayloadLength(i);
        }
    }

    public a(long j) {
        this.h = "";
        this.c = "";
        this.e = -1;
        this.a = j;
        this.g = -1L;
        this.i = -1;
        this.f = null;
        this.j = false;
    }

    public synchronized int c() {
        return this.f.getLength();
    }

    public synchronized void b(byte[] bArr, int i, int i2, int i3, int i4) {
        if (bArr != null) {
            if (bArr.length > 0 && i2 > 0 && i >= 0) {
                this.f = BufferPool.wrapPayloadInPlace(i, i2, bArr, i3, i4);
            }
        }
    }

    public final synchronized void a(long j, int i) {
        int i2;
        int i3;
        if (com.heytap.accessory.transport.d.f().f(j)) {
            i2 = 6;
            i3 = 2;
        } else {
            i2 = 4;
            i3 = 0;
        }
        Buffer bufferObtain = BufferPool.obtain(i2 + i + i3);
        this.f = bufferObtain;
        bufferObtain.setOffset(i2);
        this.f.setPayloadLength(i);
    }

    public synchronized void b(String str) {
        this.h = str;
    }

    public synchronized String b() {
        return this.c;
    }

    public synchronized void b(boolean z) {
        this.d = z;
    }

    public a(a aVar) {
        this.h = "";
        this.c = "";
        this.e = -1;
        this.a = aVar.j();
        this.g = aVar.i();
        this.i = aVar.l();
        this.h = aVar.k();
        this.c = aVar.b();
        this.e = aVar.d();
        this.d = aVar.o();
        this.b = aVar.a();
        Buffer bufferWrapPayload = BufferPool.wrapPayload(0, aVar.c(), aVar.f().getBuffer(), 0);
        this.f = bufferWrapPayload;
        bufferWrapPayload.setOffset(aVar.e());
        this.f.setPayloadLength(aVar.g());
        this.j = aVar.n();
    }

    public final synchronized void a(int i) {
        Buffer bufferObtain = BufferPool.obtain(i + 2);
        this.f = bufferObtain;
        bufferObtain.setOffset(2);
        this.f.setPayloadLength(i);
    }

    public synchronized void a(int i, byte b) {
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot update the null payload!");
        } else {
            if (i < 0 || i >= buffer.getPayloadLength()) {
                return;
            }
            this.f.getBuffer()[this.f.getOffset() + i] = b;
        }
    }

    public synchronized void a(byte[] bArr, int i, int i2, int i3) {
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot update the null payload!");
            return;
        }
        if (i2 >= 0 && i2 < buffer.getPayloadLength()) {
            SystemUtils.arraycopy(bArr, i, this.f.getBuffer(), this.f.getOffset() + i2, i3);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Failed to update the payload data range! [offset=" + i2 + "; payload len=" + this.f.getPayloadLength() + "]");
    }

    public void a(long j, long j2, byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length <= 0 || i2 <= 0 || i < 0) {
            return;
        }
        int iC = com.heytap.accessory.transport.d.f().c(j, j2);
        synchronized (this) {
            if (com.heytap.accessory.transport.d.f().f(j)) {
                this.f = BufferPool.wrapPayload(bArr, i, i2, iC + 6, 2);
            } else {
                this.f = BufferPool.wrapPayload(i, i2, bArr, iC + 4);
            }
        }
    }

    public a(long j, Buffer buffer) {
        this.h = "";
        this.c = "";
        this.e = -1;
        this.a = j;
        this.g = -1L;
        this.i = -1;
        this.f = buffer;
        this.j = false;
    }

    public void a(byte[] bArr, int i, int i2, int i3, int i4) {
        if (bArr == null || bArr.length <= 0 || i2 <= 0 || i < 0) {
            return;
        }
        synchronized (this) {
            try {
                if (i4 > 0) {
                    this.f = BufferPool.wrapPayload(bArr, i, i2, i3, i4);
                } else {
                    this.f = BufferPool.wrapPayload(i, i2, bArr, i3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void a(int i, byte[] bArr, int i2, int i3) {
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot update the null payload!");
        } else if (i >= buffer.getOffset() && i3 <= this.f.getPayloadLength()) {
            SystemUtils.arraycopy(this.f.getBuffer(), this.f.getOffset() + i, bArr, i2, i3);
        } else {
            throw new ArrayIndexOutOfBoundsException("Failed to get payload data range! [offset=" + i + "; payload len=" + this.f.getPayloadLength() + "]");
        }
    }

    public synchronized String a(int i, int i2) {
        String str;
        Buffer buffer = this.f;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(k, "Cannot update the null payload!");
            str = "";
        } else if (i >= buffer.getOffset() && i2 <= this.f.getPayloadLength()) {
            str = new String(this.f.getBuffer(), this.f.getOffset() + i, i2, Charset.forName("UTF-8"));
        } else {
            throw new ArrayIndexOutOfBoundsException("Failed to get payload data range! [offset=" + i + "; payload len=" + this.f.getPayloadLength() + "]");
        }
        return str;
    }

    public List<a> a(long j, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int payloadLength = this.f.getPayloadLength();
        int offset = this.f.getOffset();
        ArrayList arrayList = new ArrayList();
        int iC = com.heytap.accessory.transport.d.f().c(j, this.a);
        int i6 = 0;
        if (com.heytap.accessory.transport.d.f().f(j)) {
            if (i2 == 1 || i2 == 2) {
                i6 = iC + 6;
            } else if (i2 == 4) {
                i6 = iC + 4;
            }
            i5 = 2;
            i4 = i6;
        } else {
            if (i2 == 1 || i2 == 2) {
                i3 = iC + 4;
            } else if (i2 != 4) {
                i5 = 0;
                i4 = 0;
            } else {
                i3 = iC + 3;
            }
            i4 = i3;
            i5 = 0;
        }
        while (true) {
            int i7 = offset - offset;
            if (i7 >= payloadLength) {
                return arrayList;
            }
            int i8 = payloadLength - i7;
            if (i8 < i) {
                i = i8;
            }
            a aVar = new a(this.a);
            aVar.a(this.f.getBuffer(), offset, i, i4, i5);
            aVar.b(this.d);
            aVar.h(this.e);
            offset += i;
            arrayList.add(aVar);
        }
    }

    public synchronized void a(long j) {
        this.g = j;
    }

    public synchronized void a(String str) {
        this.c = str;
    }

    public synchronized int a() {
        return this.b;
    }

    public synchronized void a(long j, Buffer buffer, int i) {
        this.f = BufferPool.obtain(i);
        a(buffer);
    }

    public synchronized void a(Buffer buffer) {
        try {
            Buffer buffer2 = this.f;
            if (buffer2 == null) {
                com.heytap.accessory.base.logging.a.b(k, "Payload should be initialized using assemble(long, SABuffer, int) first!");
            } else {
                buffer2.extractFrom(buffer.getBuffer(), buffer.getOffset(), buffer.getPayloadLength());
            }
        } catch (BufferException unused) {
            com.heytap.accessory.base.logging.a.e(k, "assemble BufferException");
        }
    }

    public synchronized void a(boolean z) {
        this.j = z;
    }
}
