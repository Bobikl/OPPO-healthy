package com.lifesense.android.bluetooth.core.protocol.frame;

import android.util.Log;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.enums.PackageType;
import com.lifesense.android.bluetooth.core.tools.e;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Serializable, Cloneable {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8617c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8618e;
    public String f;
    public String g;
    public String h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8619j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f8620l;
    public byte m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f8621n;

    public a a() {
        try {
            return m5133clone();
        } catch (CloneNotSupportedException e2) {
            Log.e("CloneNotSupported", e2.getMessage());
            return null;
        }
    }

    public String b() {
        return this.a;
    }

    public void c(int i) {
        this.f8618e = i;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a m5133clone() {
        return (a) super.clone();
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = aVar.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strM = m();
        String strM2 = aVar.m();
        if (strM != null ? !strM.equals(strM2) : strM2 != null) {
            return false;
        }
        if (o() != aVar.o() || i() != aVar.i() || h() != aVar.h()) {
            return false;
        }
        String strE = e();
        String strE2 = aVar.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = aVar.d();
        if (strD != null ? !strD.equals(strD2) : strD2 != null) {
            return false;
        }
        String strL = l();
        String strL2 = aVar.l();
        if (strL != null ? strL.equals(strL2) : strL2 == null) {
            return v() == aVar.v() && g() == aVar.g() && f() == aVar.f() && Arrays.equals(c(), aVar.c()) && n() == aVar.n() && j() == aVar.j();
        }
        return false;
    }

    public int f() {
        return this.k;
    }

    public int g() {
        return this.f8619j;
    }

    public int h() {
        return this.f8618e;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strM = m();
        int iHashCode2 = ((((((((iHashCode + 59) * 59) + (strM == null ? 43 : strM.hashCode())) * 59) + o()) * 59) + i()) * 59) + h();
        String strE = e();
        int iHashCode3 = (iHashCode2 * 59) + (strE == null ? 43 : strE.hashCode());
        String strD = d();
        int iHashCode4 = (iHashCode3 * 59) + (strD == null ? 43 : strD.hashCode());
        String strL = l();
        return (((((((((((((iHashCode4 * 59) + (strL != null ? strL.hashCode() : 43)) * 59) + (v() ? 79 : 97)) * 59) + g()) * 59) + f()) * 59) + Arrays.hashCode(c())) * 59) + n()) * 59) + j();
    }

    public int i() {
        return this.d;
    }

    public byte j() {
        return this.f8621n;
    }

    public PackageType k() {
        if (s()) {
            return PackageType.LOGIN_REQUEST_PACKAGE;
        }
        if (r()) {
            return PackageType.INIT_REQUEST_PACKAGE;
        }
        if (p()) {
            return PackageType.ACK_DATA_PACKAGE;
        }
        if (t()) {
            return PackageType.SETTING_RESPONSE_DATA_PACKAGE;
        }
        return u() ? PackageType.USER_INFO_DATA_PACKAGE : PackageType.MEASURE_DATA_PACKAGE;
    }

    public String l() {
        return this.h;
    }

    public String m() {
        return this.b;
    }

    public byte n() {
        return this.m;
    }

    public int o() {
        return this.f8617c;
    }

    public boolean p() {
        return g() == 0 && i() == 0;
    }

    public boolean q() {
        return i() == 0;
    }

    public boolean r() {
        return e().startsWith(e.c(e.a((short) PacketProfile.DEVICE_A6_RECEIVER_INIT.getCommndValue())));
    }

    public boolean s() {
        return e().startsWith(e.c(e.a((short) PacketProfile.DEVICE_A6_RECEIVER_AUTH.getCommndValue())));
    }

    public boolean t() {
        return e().startsWith(e.c(e.a((short) PacketProfile.DEVICE_A6_SETTING_CALLBACK.getCommndValue())));
    }

    public String toString() {
        return "DeviceDataPackage(commandVersion=" + b() + ", packetSerialNumber=" + m() + ", totalPacketLength=" + o() + ", frameSerialNumber=" + i() + ", frameLength=" + h() + ", data=" + e() + ", crc32Value=" + d() + ", packetCommand=" + l() + ", isVerified=" + v() + ", frameCount=" + g() + ", dataType=" + f() + ", contentData=" + Arrays.toString(c()) + ", sid=" + ((int) n()) + ", oid=" + ((int) j()) + ")";
    }

    public boolean u() {
        int i = Integer.parseInt(l(), 16);
        return i > 8192 && i < 12287;
    }

    public boolean v() {
        return this.i;
    }

    public void w() {
        a(true);
        if (g() > 1) {
            String strE = e();
            String strSubstring = strE.substring(strE.length() - 8);
            String strSubstring2 = strE.substring(0, strE.length() - 8);
            a(strSubstring);
            b(strSubstring2);
            a(StringUtils.equalsIgnoreCase(strSubstring, e.a(e())));
        }
    }

    public static a a(byte[] bArr) {
        String str;
        if (bArr.length <= 2) {
            return null;
        }
        byte b = bArr[0];
        int i = (b >> 4) & 15;
        int i2 = b & 15;
        int i3 = bArr[1] & 255;
        String strC = "";
        if (i3 + 2 <= bArr.length) {
            if (i2 == 0 && i != 0) {
                byte[] bArr2 = new byte[2];
                System.arraycopy(bArr, 2, bArr2, 0, 2);
                strC = e.c(bArr2);
            }
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, 2, bArr3, 0, i3);
            String str2 = strC;
            strC = e.c(bArr3);
            str = str2;
        } else {
            str = "";
        }
        a aVar = new a();
        aVar.b(i);
        aVar.d(i2);
        aVar.c(i3);
        aVar.b(strC);
        aVar.c(str);
        return aVar;
    }

    public void b(int i) {
        this.f8619j = i;
    }

    public void c(String str) {
        this.h = str;
    }

    public void d(int i) {
        this.d = i;
    }

    public void a(String str) {
        this.g = str;
    }

    public void b(String str) {
        this.f = str;
    }

    public byte[] c() {
        return this.f8620l;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public boolean a(int i) {
        return g() == i || p();
    }

    public boolean a(Object obj) {
        return obj instanceof a;
    }
}
