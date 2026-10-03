package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class nc1 {
    public byte[] a;
    public List<a> b = new ArrayList();

    public static class a {
        public static final int TYPE_MANUFACTURER_DATA = 255;
        public static final int TYPE_SERVICE_DATA_2 = 22;
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f14437c;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("@Len = %02X, @Type = 0x%02X", Integer.valueOf(this.a), Integer.valueOf(this.b)));
            int i = this.b;
            String str = (i == 8 || i == 9) ? "%c" : "%02X ";
            sb.append(" -> ");
            StringBuilder sb2 = new StringBuilder();
            try {
                for (byte b : this.f14437c) {
                    sb2.append(String.format(str, Integer.valueOf(b & 255)));
                }
                sb.append(sb2.toString());
            } catch (Exception unused) {
                sb.append(qd2.b(this.f14437c));
            }
            return sb.toString();
        }
    }

    public nc1(byte[] bArr) {
        byte[] bArrG = qd2.g(bArr);
        this.a = bArrG;
        System.arraycopy(bArr, 0, bArrG, 0, bArrG.length);
        b(bArr);
    }

    public static nc1 c(byte[] bArr) {
        if (qd2.e(bArr)) {
            return null;
        }
        return new nc1(bArr);
    }

    public final a a(byte[] bArr, int i) {
        int i2;
        if (bArr.length - i >= 2 && (i2 = bArr[i]) > 0) {
            byte b = bArr[i + 1];
            int i3 = i + 2;
            if (i3 < bArr.length) {
                a aVar = new a();
                int length = (i3 + i2) - 2;
                if (length >= bArr.length) {
                    length = bArr.length - 1;
                }
                aVar.b = b & 255;
                aVar.a = i2;
                aVar.f14437c = qd2.c(bArr, i3, length);
                return aVar;
            }
        }
        return null;
    }

    public void b(byte[] bArr) {
        a aVarA;
        int i = 0;
        while (i < bArr.length && (aVarA = a(bArr, i)) != null) {
            this.b.add(aVarA);
            i += aVarA.a + 1;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("preParse: %s\npostParse:\n", qd2.b(this.a)));
        for (int i = 0; i < this.b.size(); i++) {
            sb.append(this.b.get(i).toString());
            if (i != this.b.size() - 1) {
                sb.append(Weather.SEPARATOR);
            }
        }
        return sb.toString();
    }
}
