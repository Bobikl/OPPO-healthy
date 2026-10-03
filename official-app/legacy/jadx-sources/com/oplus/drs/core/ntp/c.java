package com.oplus.drs.core.ntp;

import java.net.DatagramPacket;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class c implements d {
    public final byte[] a = new byte[48];
    public volatile DatagramPacket b = null;

    public static int x(byte b) {
        return b & 255;
    }

    public static long y(byte b) {
        return ((long) b) & 255;
    }

    @Override // com.oplus.drs.core.ntp.d
    public TimeStamp a() {
        return r(24);
    }

    @Override // com.oplus.drs.core.ntp.d
    public void b(int i) {
        byte[] bArr = this.a;
        bArr[0] = (byte) ((i & 7) | (bArr[0] & 248));
    }

    @Override // com.oplus.drs.core.ntp.d
    public synchronized DatagramPacket c() {
        if (this.b == null) {
            byte[] bArr = this.a;
            this.b = new DatagramPacket(bArr, bArr.length);
            this.b.setPort(123);
        }
        return this.b;
    }

    @Override // com.oplus.drs.core.ntp.d
    public TimeStamp d() {
        return r(32);
    }

    @Override // com.oplus.drs.core.ntp.d
    public TimeStamp e() {
        return r(40);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
    }

    @Override // com.oplus.drs.core.ntp.d
    public void f(TimeStamp timeStamp) {
        w(40, timeStamp);
    }

    public final int g(int i) {
        return x(this.a[i + 3]) | (x(this.a[i]) << 24) | (x(this.a[i + 1]) << 16) | (x(this.a[i + 2]) << 8);
    }

    public final long h(int i) {
        return y(this.a[i + 7]) | (y(this.a[i]) << 56) | (y(this.a[i + 1]) << 48) | (y(this.a[i + 2]) << 40) | (y(this.a[i + 3]) << 32) | (y(this.a[i + 4]) << 24) | (y(this.a[i + 5]) << 16) | (y(this.a[i + 6]) << 8);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public int i() {
        return (x(this.a[0]) >> 0) & 7;
    }

    public int j() {
        return this.a[2];
    }

    public int k() {
        return this.a[3];
    }

    public int l() {
        return g(12);
    }

    public String m() {
        int iS = s();
        int iQ = q();
        if (iS == 3 || iS == 4) {
            if (iQ == 0 || iQ == 1) {
                return v();
            }
            if (iS == 4) {
                return t();
            }
        }
        return iQ >= 2 ? u() : t();
    }

    public int n() {
        return g(4);
    }

    public int o() {
        return g(8);
    }

    public double p() {
        return ((double) o()) / 65.536d;
    }

    public int q() {
        return x(this.a[1]);
    }

    public final TimeStamp r(int i) {
        return new TimeStamp(h(i));
    }

    public int s() {
        return (x(this.a[0]) >> 3) & 7;
    }

    @Override // com.oplus.drs.core.ntp.d
    public void setVersion(int i) {
        byte[] bArr = this.a;
        bArr[0] = (byte) (((i & 7) << 3) | (bArr[0] & 199));
    }

    public final String t() {
        return Integer.toHexString(l());
    }

    public String toString() {
        return "[version:" + s() + ", mode:" + i() + ", poll:" + j() + ", precision:" + k() + ", delay:" + n() + ", dispersion(ms):" + p() + ", id:" + m() + ", xmitTime:" + e().toDateString() + " ]";
    }

    public final String u() {
        return x(this.a[12]) + "." + x(this.a[13]) + "." + x(this.a[14]) + "." + x(this.a[15]);
    }

    public final String v() {
        char c2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 3 && (c2 = (char) this.a[i + 12]) != 0; i++) {
            sb.append(c2);
        }
        return sb.toString();
    }

    public final void w(int i, TimeStamp timeStamp) {
        long jNtpValue = timeStamp != null ? timeStamp.ntpValue() : 0L;
        for (int i2 = 7; i2 >= 0; i2--) {
            this.a[i + i2] = (byte) (255 & jNtpValue);
            jNtpValue >>>= 8;
        }
    }
}
