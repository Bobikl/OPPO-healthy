package com.heytap.accessory.connectivity;

import com.heytap.accessory.utils.HexUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class a {
    public static final String f = "a";
    public int a;
    public int b;
    public boolean c = false;
    public int d;
    public com.heytap.accessory.connectivity.params.c e;

    public a(com.heytap.accessory.connectivity.params.c cVar, int i) {
        this.e = cVar;
        this.d = i;
    }

    public abstract int a(com.heytap.accessory.message.b bVar, long j);

    public abstract void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar);

    public synchronized void a(com.heytap.accessory.message.a aVar, int i) {
        try {
            if (i == 4) {
                aVar.e(1);
            } else {
                aVar.e(2);
            }
            if (this.c) {
                if (i == 4) {
                    aVar.e(1);
                } else {
                    aVar.e(2);
                }
                aVar.f(-2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void a(boolean z);

    public abstract int b();

    public abstract int b(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar);

    public synchronized void b(com.heytap.accessory.message.a aVar, int i) {
        int i2 = i == 4 ? 1 : 2;
        int iG = aVar.g();
        int iE = aVar.e();
        com.heytap.accessory.base.logging.a.a("Connection", "updateConnectivityData: frameLength = " + iG + " offset = " + iE + " data.length = " + aVar.f().getBufferLength() + " this.isCrcEnabled = " + this.c);
        aVar.c(i2);
        int i3 = 0;
        if (this.c) {
            int i4 = i == 4 ? 1 : 2;
            aVar.c(i4);
            int i5 = 0;
            while (i5 < i2) {
                int i6 = i5 + 1;
                aVar.a(i5, (byte) (iG >> ((i2 - i6) * 8)));
                i5 = i6;
            }
            int iB = com.heytap.accessory.misc.utils.c.b(aVar.f().getBuffer(), aVar.f().getOffset(), i4);
            while (i3 < i4) {
                int i7 = i2 + i3;
                i3++;
                aVar.a(i7, (byte) (iB >> ((i4 - i3) * 8)));
            }
            int iB2 = com.heytap.accessory.misc.utils.c.b(aVar.f().getBuffer(), iE, iG);
            int i8 = i2 + i4 + iG;
            aVar.f(2);
            aVar.a(i8, (byte) (iB2 >> 8));
            aVar.a(i8 + 1, (byte) iB2);
            com.heytap.accessory.base.logging.a.a(f, "crcPayload >> 0x" + Integer.toHexString(iB2));
        } else {
            while (i3 < i2) {
                int i9 = i3 + 1;
                aVar.a(i3, (byte) (iG >> ((i2 - i9) * 8)));
                i3 = i9;
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public void a(int i, byte b) {
        this.c = b == 1;
        com.heytap.accessory.base.logging.a.a(f, "setCrcEnabled = " + this.c);
    }

    public void a(byte[] bArr, String str) {
        if (bArr != null) {
            com.heytap.accessory.base.logging.a.d(f, str + ">> " + HexUtils.byteArrayToHexStr(bArr));
        }
    }

    public void a(byte[] bArr, int i, int i2, String str) {
        if (bArr != null) {
            com.heytap.accessory.base.logging.a.a(f, str + ">> " + HexUtils.byteArrayToHexStr(bArr, i, i2));
        }
    }
}
