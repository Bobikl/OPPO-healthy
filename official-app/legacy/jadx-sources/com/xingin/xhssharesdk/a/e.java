package com.xingin.xhssharesdk.a;

import com.oplus.aiunit.vision.jmm;
import com.oplus.aiunit.vision.ypm;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e implements Iterable<Byte>, Serializable {
    public static final d b = new d(f.b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20420c;
    public int a = 0;

    public static final class a implements b {
        @Override // com.xingin.xhssharesdk.a.e.b
        public final byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public interface b {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public static abstract class c extends e {
        @Override // com.xingin.xhssharesdk.a.e, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new ypm(this);
        }
    }

    public static class d extends c {
        public final byte[] d;

        public d(byte[] bArr) {
            this.d = bArr;
        }

        @Override // com.xingin.xhssharesdk.a.e
        public byte a(int i) {
            return this.d[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e) || size() != ((e) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof d)) {
                return obj.equals(this);
            }
            d dVar = (d) obj;
            int i = this.a;
            int i2 = dVar.a;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > dVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size + 0 > dVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + dVar.size());
            }
            byte[] bArr = this.d;
            byte[] bArr2 = dVar.d;
            int iA = a() + size;
            int iA2 = a();
            int iA3 = dVar.a() + 0;
            while (iA2 < iA) {
                if (bArr[iA2] != bArr2[iA3]) {
                    return false;
                }
                iA2++;
                iA3++;
            }
            return true;
        }

        @Override // com.xingin.xhssharesdk.a.e
        public int size() {
            return this.d.length;
        }

        public int a() {
            return 0;
        }

        @Override // com.xingin.xhssharesdk.a.e
        public final void a(jmm jmmVar) {
            jmmVar.a(this.d, a(), size());
        }

        @Override // com.xingin.xhssharesdk.a.e
        public final int a(int i, int i2) {
            byte[] bArr = this.d;
            int iA = a() + 0;
            Charset charset = f.a;
            for (int i3 = iA; i3 < iA + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.xingin.xhssharesdk.a.e$e, reason: collision with other inner class name */
    public static final class C1019e implements b {
        @Override // com.xingin.xhssharesdk.a.e.b
        public final byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        boolean z;
        try {
            Class.forName("android.content.Context");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f20420c = z ? new C1019e() : new a();
    }

    public static d a(String str) {
        return new d(str.getBytes(f.a));
    }

    public abstract byte a(int i);

    public abstract int a(int i, int i2);

    public abstract void a(jmm jmmVar);

    public final int hashCode() {
        int iA = this.a;
        if (iA == 0) {
            int size = size();
            iA = a(size, size);
            if (iA == 0) {
                iA = 1;
            }
            this.a = iA;
        }
        return iA;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new ypm(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
