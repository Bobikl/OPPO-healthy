package com.oplus.aiunit.vision;

import com.coloros.sceneservice.dataprovider.bean.SceneStatusInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class kke {
    public static jck a;
    public static qrg b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List<pke> f13325c;

    public static final class b {
        public qrg a;
        public List<pke> b;

        public List<pke> a() {
            return this.b;
        }

        public qrg b() {
            return this.a;
        }

        public boolean c() {
            return (a() == null || b() == null) ? false : true;
        }

        public b d(pke pkeVar) {
            if (pkeVar != null) {
                List<pke> list = this.b;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    this.b = arrayList;
                    arrayList.add(pkeVar);
                } else if (!list.contains(pkeVar)) {
                    this.b.add(pkeVar);
                }
            }
            return this;
        }

        public b(List<pke> list) {
            if (list != null) {
                this.b = new ArrayList(list);
            }
            this.a = new hx7();
        }
    }

    public static short a(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i % 8;
        short s = (short) (bArr2[i] & 255);
        return (bArr[i / 8] & oke.a[i2]) != 0 ? (short) (s | 256) : s;
    }

    public static int b(char c2) {
        int i = c2 - 19968;
        if (i < 0 || i >= 7000) {
            return (7000 > i || i >= 14000) ? a(nke.a, nke.b, i - 14000) : a(mke.a, mke.b, i - SceneStatusInfo.SceneConstant.TRIP_ARRIVE_END_STATION_IN_TIME);
        }
        return a(lke.a, lke.b, i);
    }

    public static void c(b bVar) {
        if (bVar == null) {
            f13325c = null;
            a = null;
            b = null;
        } else if (bVar.c()) {
            f13325c = Collections.unmodifiableList(bVar.a());
            a = krk.a(bVar.a());
            b = bVar.b();
        }
    }

    public static boolean d(char c2) {
        return (19968 <= c2 && c2 <= 40869 && b(c2) > 0) || 12295 == c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b e() {
        return new b(null);
    }

    public static String f(char c2) {
        if (d(c2)) {
            return c2 == 12295 ? "LING" : oke.b[b(c2)];
        }
        return String.valueOf(c2);
    }

    public static String g(String str, String str2) {
        return ln6.b(str, a, f13325c, str2, b);
    }
}
