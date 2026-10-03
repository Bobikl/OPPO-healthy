package com.oplus.aiunit.vision;

import java.lang.reflect.Array;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public final class yg0 {
    public b a = null;
    public c b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f19006c = null;
    public f d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f19007e = null;
    public e f = null;
    public d g = null;

    public static class a {
        public final /* synthetic */ Class a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f19008c;

        public a(Class cls, int i, Object obj) {
            this.a = cls;
            this.b = i;
            this.f19008c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!nc3.H(obj, this.a) || Array.getLength(obj) != this.b) {
                return false;
            }
            for (int i = 0; i < this.b; i++) {
                Object obj2 = Array.get(this.f19008c, i);
                Object obj3 = Array.get(obj, i);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class b extends mue<boolean[]> {
        @Override // com.oplus.aiunit.vision.mue
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final boolean[] a(int i) {
            return new boolean[i];
        }
    }

    public static final class c extends mue<byte[]> {
        @Override // com.oplus.aiunit.vision.mue
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final byte[] a(int i) {
            return new byte[i];
        }
    }

    public static final class d extends mue<double[]> {
        @Override // com.oplus.aiunit.vision.mue
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final double[] a(int i) {
            return new double[i];
        }
    }

    public static final class e extends mue<float[]> {
        @Override // com.oplus.aiunit.vision.mue
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final float[] a(int i) {
            return new float[i];
        }
    }

    public static final class f extends mue<int[]> {
        @Override // com.oplus.aiunit.vision.mue
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final int[] a(int i) {
            return new int[i];
        }
    }

    public static final class g extends mue<long[]> {
        @Override // com.oplus.aiunit.vision.mue
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final long[] a(int i) {
            return new long[i];
        }
    }

    public static final class h extends mue<short[]> {
        @Override // com.oplus.aiunit.vision.mue
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final short[] a(int i) {
            return new short[i];
        }
    }

    public static <T> HashSet<T> a(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T t : tArr) {
            hashSet.add(t);
        }
        return hashSet;
    }

    public static Object b(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }

    public static <T> T[] j(T[] tArr, T t) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (tArr[i] == t) {
                if (i == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i);
                tArr2[0] = t;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(tArr, i2, tArr2, i2, i3);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t;
        return tArr3;
    }

    public b c() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public c d() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public d e() {
        if (this.g == null) {
            this.g = new d();
        }
        return this.g;
    }

    public e f() {
        if (this.f == null) {
            this.f = new e();
        }
        return this.f;
    }

    public f g() {
        if (this.d == null) {
            this.d = new f();
        }
        return this.d;
    }

    public g h() {
        if (this.f19007e == null) {
            this.f19007e = new g();
        }
        return this.f19007e;
    }

    public h i() {
        if (this.f19006c == null) {
            this.f19006c = new h();
        }
        return this.f19006c;
    }
}
