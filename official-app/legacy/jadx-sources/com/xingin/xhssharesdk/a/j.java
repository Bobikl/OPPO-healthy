package com.xingin.xhssharesdk.a;

import com.oplus.aiunit.vision.pzm;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class j<K, V> {
    public final a<K, V> a;
    public final K b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f20424c = "";

    public static class a<K, V> {
        public final c0.a a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0.a f20425c;
        public final K b = "";
        public final V d = "";

        public a(c0.a.C1017a c1017a, c0.a.C1017a c1017a2) {
            this.a = c1017a;
            this.f20425c = c1017a2;
        }
    }

    public j(c0.a.C1017a c1017a, c0.a.C1017a c1017a2) {
        this.a = new a<>(c1017a, c1017a2);
    }

    public static <T> T a(c cVar, pzm pzmVar, c0.a aVar, T t) throws IOException {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 9) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        if (iOrdinal == 10) {
            k.a aVarD = ((l) t).d();
            int iE = cVar.e();
            if (cVar.h >= 100) {
                throw new m("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
            }
            int iC = cVar.c(iE);
            cVar.h++;
            aVarD.f();
            try {
                aVarD.f20427j.c(k.h.f20429c, cVar, pzmVar);
                if (cVar.f20413e != 0) {
                    throw new m("Protocol message end-group tag did not match expected tag.");
                }
                cVar.h--;
                cVar.g = iC;
                cVar.m();
                if (!aVarD.k) {
                    aVarD.f20427j.g();
                    aVarD.k = true;
                }
                return (T) aVarD.f20427j;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }
        if (iOrdinal == 13) {
            return (T) Integer.valueOf(cVar.e());
        }
        int i = d.d;
        c0.c.b bVar = c0.c.a;
        switch (aVar.ordinal()) {
            case 0:
                return (T) Double.valueOf(Double.longBitsToDouble(cVar.d()));
            case 1:
                return (T) Float.valueOf(Float.intBitsToFloat(cVar.a()));
            case 2:
                return (T) Long.valueOf(cVar.g());
            case 3:
                return (T) Long.valueOf(cVar.g());
            case 4:
                return (T) Integer.valueOf(cVar.e());
            case 5:
                return (T) Long.valueOf(cVar.d());
            case 6:
                return (T) Integer.valueOf(cVar.a());
            case 7:
                return (T) Boolean.valueOf(cVar.g() != 0);
            case 8:
                return (T) bVar.a(cVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                int iE2 = cVar.e();
                int i2 = cVar.b;
                int i3 = cVar.d;
                if (iE2 > i2 - i3 || iE2 <= 0) {
                    if (iE2 == 0) {
                        return (T) e.b;
                    }
                    byte[] bArrF = cVar.f(iE2);
                    e.d dVar = e.b;
                    return (T) new e.d(bArrF);
                }
                byte[] bArr = cVar.a;
                e.d dVar2 = e.b;
                T t2 = (T) new e.d(e.f20420c.a(bArr, i3, iE2));
                cVar.d += iE2;
                return t2;
            case 12:
                return (T) Integer.valueOf(cVar.e());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return (T) Integer.valueOf(cVar.a());
            case 15:
                return (T) Long.valueOf(cVar.d());
            case 16:
                int iE3 = cVar.e();
                return (T) Integer.valueOf((-(iE3 & 1)) ^ (iE3 >>> 1));
            case 17:
                long jG = cVar.g();
                return (T) Long.valueOf((-(jG & 1)) ^ (jG >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q<K, V> qVar, c cVar, pzm pzmVar) throws IOException {
        int iC = cVar.c(cVar.e());
        a<K, V> aVar = this.a;
        Object objA = aVar.b;
        Object objA2 = aVar.d;
        while (true) {
            int iK = cVar.k();
            if (iK == 0) {
                break;
            }
            if (iK == c0.a(1, this.a.a.b)) {
                objA = a(cVar, pzmVar, this.a.a, objA);
            } else if (iK == c0.a(2, this.a.f20425c.b)) {
                objA2 = a(cVar, pzmVar, this.a.f20425c, objA2);
            } else if (!cVar.h(iK)) {
                break;
            }
        }
        if (cVar.f20413e != 0) {
            throw new m("Protocol message end-group tag did not match expected tag.");
        }
        cVar.g = iC;
        cVar.m();
        qVar.put(objA, objA2);
    }
}
