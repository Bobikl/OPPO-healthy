package com.xingin.xhssharesdk.a;

import com.xingin.xhssharesdk.a.d.a;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class d<FieldDescriptorType extends a<FieldDescriptorType>> {
    public static final /* synthetic */ int d = 0;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20419c = false;
    public final o a = p.b(16);

    public interface a<T extends a<T>> extends Comparable<T> {
        void a();

        void b();

        c0.b c();

        k.a k(l.a aVar, l lVar);
    }

    static {
        new d(0);
    }

    public d() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    public static int a(c0.a aVar, int i, String str) {
        int iB;
        int iV;
        int iN = g.n(i);
        if (aVar == c0.a.d) {
            iN *= 2;
        }
        int iD = 4;
        switch (aVar.ordinal()) {
            case 0:
                ((Double) str).doubleValue();
                iD = 8;
                return iN + iD;
            case 1:
                ((Float) str).floatValue();
                return iN + iD;
            case 2:
                iD = g.d(((Long) str).longValue());
                return iN + iD;
            case 3:
                iD = g.d(((Long) str).longValue());
                return iN + iD;
            case 4:
                iD = g.b(((Integer) str).intValue());
                return iN + iD;
            case 5:
            case 15:
                ((Long) str).longValue();
                iD = 8;
                return iN + iD;
            case 6:
            case 14:
                ((Integer) str).intValue();
                return iN + iD;
            case 7:
                ((Boolean) str).booleanValue();
                iD = 1;
                return iN + iD;
            case 8:
                if (str instanceof e) {
                    iD = g.e((e) str);
                } else {
                    iD = g.g(str);
                }
                return iN + iD;
            case 9:
                iD = ((l) str).b();
                return iN + iD;
            case 10:
                if (str instanceof h) {
                    h hVar = (h) str;
                    if (hVar.b != null) {
                        iB = hVar.b.d.length;
                    } else {
                        iB = hVar.a != null ? hVar.a.b() : 0;
                    }
                    iV = g.v(iB);
                    iD = iV + iB;
                } else {
                    iD = g.f((l) str);
                }
                return iN + iD;
            case 11:
                if (str instanceof e) {
                    iD = g.e((e) str);
                } else {
                    iB = ((byte[]) str).length;
                    iV = g.v(iB);
                    iD = iV + iB;
                }
                return iN + iD;
            case 12:
                iD = g.v(((Integer) str).intValue());
                return iN + iD;
            case 13:
                iD = str instanceof f.a ? g.b(((f.a) str).a()) : g.b(((Integer) str).intValue());
                return iN + iD;
            case 16:
                int iIntValue = ((Integer) str).intValue();
                iD = g.v((iIntValue >> 31) ^ (iIntValue << 1));
                return iN + iD;
            case 17:
                long jLongValue = ((Long) str).longValue();
                iD = g.d((jLongValue >> 63) ^ (jLongValue << 1));
                return iN + iD;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0028  */
    public static void d(c0.a aVar, Object obj) {
        obj.getClass();
        boolean z = false;
        switch (aVar.a) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof e) || (obj instanceof byte[])) {
                    z = true;
                }
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof f.a)) {
                    z = true;
                }
                break;
            case MESSAGE:
                if ((obj instanceof l) || (obj instanceof h)) {
                    z = true;
                }
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(g gVar, c0.a aVar, int i, String str) {
        if (aVar == c0.a.d) {
            gVar.o(i, 3);
            ((l) str).a(gVar);
            gVar.o(i, 4);
            return;
        }
        gVar.o(i, aVar.b);
        switch (aVar.ordinal()) {
            case 0:
                gVar.q(Double.doubleToRawLongBits(((Double) str).doubleValue()));
                return;
            case 1:
                gVar.x(Float.floatToRawIntBits(((Float) str).floatValue()));
                return;
            case 2:
                gVar.y(((Long) str).longValue());
                return;
            case 3:
                gVar.y(((Long) str).longValue());
                return;
            case 4:
                gVar.z(((Integer) str).intValue());
                return;
            case 5:
                gVar.q(((Long) str).longValue());
                return;
            case 6:
                gVar.x(((Integer) str).intValue());
                return;
            case 7:
                gVar.i(((Boolean) str).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(str instanceof e)) {
                    gVar.t(str);
                    return;
                }
                break;
            case 9:
                ((l) str).a(gVar);
                return;
            case 10:
                gVar.s((l) str);
                return;
            case 11:
                if (!(str instanceof e)) {
                    byte[] bArr = (byte[]) str;
                    gVar.m(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                gVar.A(((Integer) str).intValue());
                return;
            case 13:
                gVar.z(str instanceof f.a ? ((f.a) str).a() : ((Integer) str).intValue());
                return;
            case 14:
                gVar.x(((Integer) str).intValue());
                return;
            case 15:
                gVar.q(((Long) str).longValue());
                return;
            case 16:
                int iIntValue = ((Integer) str).intValue();
                gVar.A((iIntValue >> 31) ^ (iIntValue << 1));
                return;
            case 17:
                long jLongValue = ((Long) str).longValue();
                gVar.y((jLongValue >> 63) ^ (jLongValue << 1));
                return;
            default:
                return;
        }
        gVar.r((e) str);
    }

    public static <T extends a<T>> d<T> i() {
        return new d<>();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d<FieldDescriptorType> clone() {
        d<FieldDescriptorType> dVar = new d<>();
        for (int i = 0; i < this.a.f20431j.size(); i++) {
            p<K, V>.b bVar = this.a.f20431j.get(i);
            dVar.f((a) bVar.getKey(), bVar.getValue());
        }
        o oVar = this.a;
        for (Map.Entry entry : oVar.k.isEmpty() ? p.a.b : oVar.k.entrySet()) {
            dVar.f((a) entry.getKey(), entry.getValue());
        }
        dVar.f20419c = this.f20419c;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    public final void f(FieldDescriptorType fielddescriptortype, Object obj) {
        fielddescriptortype.a();
        fielddescriptortype.b();
        d(null, obj);
        if (obj instanceof h) {
            this.f20419c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    public final void g(Map.Entry<FieldDescriptorType, Object> entry) {
        o oVar;
        Object objC;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof h) {
            value = ((h) value).a();
        }
        key.a();
        if (key.c() == c0.b.MESSAGE) {
            Object objA = this.a.get(key);
            if (objA instanceof h) {
                objA = ((h) objA).a();
            }
            if (objA == null) {
                oVar = this.a;
                objC = c(value);
            } else {
                objC = key.k(((l) objA).d(), (l) value).e();
                oVar = this.a;
            }
        } else {
            oVar = this.a;
            objC = c(value);
        }
        oVar.put(key, objC);
    }

    public final void h() {
        if (this.b) {
            return;
        }
        this.a.e();
        this.b = true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public d(int i) {
        h();
    }
}
