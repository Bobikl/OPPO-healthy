package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class vli implements i68 {
    public static final String u = "vli";

    @ColorInt
    public int[] a;

    @ColorInt
    public final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i68.a f17894c;
    public ByteBuffer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f17895e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColorInt
    public int[] f17896j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p68 f17897l;
    public Bitmap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17898n;
    public int o;
    public int p;
    public int q;
    public int r;

    @Nullable
    public Boolean s;

    @NonNull
    public Bitmap.Config t;

    public vli(@NonNull i68.a aVar, p68 p68Var, ByteBuffer byteBuffer, int i) {
        this(aVar);
        q(p68Var, byteBuffer, i);
    }

    @Override // com.oplus.aiunit.vision.i68
    public void a(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.oplus.aiunit.vision.i68
    public void b() {
        this.k = -1;
    }

    @Override // com.oplus.aiunit.vision.i68
    public int c() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.i68
    public void clear() {
        this.f17897l = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            this.f17894c.e(bArr);
        }
        int[] iArr = this.f17896j;
        if (iArr != null) {
            this.f17894c.f(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.f17894c.c(bitmap);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.f17895e;
        if (bArr2 != null) {
            this.f17894c.e(bArr2);
        }
    }

    @Override // com.oplus.aiunit.vision.i68
    public int d() {
        return this.d.limit() + this.i.length + (this.f17896j.length * 4);
    }

    @Override // com.oplus.aiunit.vision.i68
    @Nullable
    public synchronized Bitmap e() {
        if (this.f17897l.f15208c <= 0 || this.k < 0) {
            String str = u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f17897l.f15208c + ", framePointer=" + this.k);
            }
            this.o = 1;
        }
        int i = this.o;
        if (i != 1 && i != 2) {
            this.o = 0;
            if (this.f17895e == null) {
                this.f17895e = this.f17894c.a(255);
            }
            n68 n68Var = this.f17897l.f15209e.get(this.k);
            int i2 = this.k - 1;
            n68 n68Var2 = i2 >= 0 ? this.f17897l.f15209e.get(i2) : null;
            int[] iArr = n68Var.k;
            if (iArr == null) {
                iArr = this.f17897l.a;
            }
            this.a = iArr;
            if (iArr == null) {
                String str2 = u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.k);
                }
                this.o = 1;
                return null;
            }
            if (n68Var.f) {
                System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                int[] iArr2 = this.b;
                this.a = iArr2;
                iArr2[n68Var.h] = 0;
                if (n68Var.g == 2 && this.k == 0) {
                    this.s = Boolean.TRUE;
                }
            }
            return r(n68Var, n68Var2);
        }
        String str3 = u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.o);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.i68
    public void f() {
        this.k = (this.k + 1) % this.f17897l.f15208c;
    }

    @Override // com.oplus.aiunit.vision.i68
    public int g() {
        return this.f17897l.f15208c;
    }

    @Override // com.oplus.aiunit.vision.i68
    @NonNull
    public ByteBuffer getData() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.i68
    public int h() {
        int i;
        if (this.f17897l.f15208c <= 0 || (i = this.k) < 0) {
            return 0;
        }
        return m(i);
    }

    @ColorInt
    public final int i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.p + i; i9++) {
            byte[] bArr = this.i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.p + i11; i12++) {
            byte[] bArr2 = this.i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    public final void j(n68 n68Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f17896j;
        int i6 = n68Var.d;
        int i7 = this.p;
        int i8 = i6 / i7;
        int i9 = n68Var.b / i7;
        int i10 = n68Var.f14358c / i7;
        int i11 = n68Var.a / i7;
        boolean z = this.k == 0;
        int i12 = this.r;
        int i13 = this.q;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        Boolean bool = this.s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (n68Var.f14359e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 == 2) {
                        i15 = 4;
                    } else if (i18 == 3) {
                        i14 = 4;
                        i17 = i18;
                        i15 = 2;
                    } else if (i18 == 4) {
                        i17 = i18;
                        i15 = 1;
                        i14 = 2;
                    }
                    i17 = i18;
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            boolean z2 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * n68Var.f14358c;
                if (z2) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 < i22) {
                            int i30 = i(i24, i28, n68Var.f14358c);
                            if (i30 != 0) {
                                iArr[i29] = i30;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i24 += i7;
                            i29++;
                            i10 = i4;
                        }
                    }
                }
                bool = bool2;
                i16++;
                i9 = i5;
                i8 = i;
                i10 = i4;
                i15 = i3;
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.s == null) {
            this.s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    public final void k(n68 n68Var) {
        n68 n68Var2 = n68Var;
        int[] iArr = this.f17896j;
        int i = n68Var2.d;
        int i2 = n68Var2.b;
        int i3 = n68Var2.f14358c;
        int i4 = n68Var2.a;
        boolean z = this.k == 0;
        int i5 = this.r;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = n68Var2.f14358c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            n68Var2 = n68Var;
        }
        Boolean bool = this.s;
        this.s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.s == null && z && b != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    public final void l(n68 n68Var) {
        int i;
        int i2;
        short s;
        this = this;
        if (n68Var != null) {
            this.d.position(n68Var.f14360j);
        }
        if (n68Var == null) {
            p68 p68Var = this.f17897l;
            i = p68Var.f;
            i2 = p68Var.g;
        } else {
            i = n68Var.f14358c;
            i2 = n68Var.d;
        }
        int i3 = i * i2;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i3) {
            this.i = this.f17894c.a(i3);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int iP = p();
        int i4 = 1 << iP;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iP + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = this.f17895e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int iO = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (i9 < i3) {
            if (iO == 0) {
                iO = o();
                if (iO <= 0) {
                    this.o = 3;
                    break;
                }
                i14 = 0;
            }
            i16 += (bArr5[i14] & 255) << i15;
            i14++;
            iO--;
            int i21 = i15 + 8;
            i12 = i12;
            i11 = i11;
            i20 = i20;
            i7 = i7;
            i18 = i18;
            while (true) {
                if (i21 < i11) {
                    i15 = i21;
                    break;
                }
                int i22 = i6;
                int i23 = i16 & i13;
                i16 >>= i11;
                i21 -= i11;
                if (i23 == i4) {
                    i13 = i8;
                    i11 = i7;
                    i12 = i22;
                    i6 = i12;
                    i20 = -1;
                } else {
                    if (i23 == i5) {
                        i15 = i21;
                        i6 = i22;
                        break;
                    }
                    if (i20 == -1) {
                        bArr2[i17] = bArr3[i23];
                        i17++;
                        i9++;
                        i20 = i23;
                        i18 = i20;
                        i6 = i22;
                        i21 = i21;
                    } else {
                        if (i23 >= i12) {
                            bArr4[i19] = (byte) i18;
                            i19++;
                            s = i20;
                        } else {
                            s = i23;
                        }
                        while (s >= i4) {
                            bArr4[i19] = bArr3[s];
                            i19++;
                            s = sArr[s];
                        }
                        i18 = bArr3[s] & 255;
                        byte b = (byte) i18;
                        bArr2[i17] = b;
                        while (true) {
                            i17++;
                            i9++;
                            if (i19 <= 0) {
                                break;
                            }
                            i19--;
                            bArr2[i17] = bArr4[i19];
                        }
                        byte[] bArr6 = bArr4;
                        if (i12 < 4096) {
                            sArr[i12] = (short) i20;
                            bArr3[i12] = b;
                            i12++;
                            if ((i12 & i13) == 0 && i12 < 4096) {
                                i11++;
                                i13 += i12;
                            }
                        }
                        i20 = i23;
                        i6 = i22;
                        i21 = i21;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i17, i3, (byte) 0);
    }

    public int m(int i) {
        if (i >= 0) {
            p68 p68Var = this.f17897l;
            if (i < p68Var.f15208c) {
                return p68Var.f15209e.get(i).i;
            }
        }
        return -1;
    }

    public final Bitmap n() {
        Boolean bool = this.s;
        Bitmap bitmapB = this.f17894c.b(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    public final int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(this.f17895e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }

    public final int p() {
        return this.d.get() & 255;
    }

    public synchronized void q(@NonNull p68 p68Var, @NonNull ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.o = 0;
            this.f17897l = p68Var;
            this.k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.f17898n = false;
            Iterator<n68> it = p68Var.f15209e.iterator();
            while (it.hasNext()) {
                if (it.next().g == 3) {
                    this.f17898n = true;
                    break;
                }
            }
            this.p = iHighestOneBit;
            int i2 = p68Var.f;
            this.r = i2 / iHighestOneBit;
            int i3 = p68Var.g;
            this.q = i3 / iHighestOneBit;
            this.i = this.f17894c.a(i2 * i3);
            this.f17896j = this.f17894c.d(this.r * this.q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Bitmap r(n68 n68Var, n68 n68Var2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f17896j;
        int i3 = 0;
        if (n68Var2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                this.f17894c.c(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (n68Var2 != null && n68Var2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (n68Var2 != null && (i2 = n68Var2.g) > 0) {
            if (i2 == 2) {
                if (!n68Var.f) {
                    p68 p68Var = this.f17897l;
                    int i4 = p68Var.f15211l;
                    if (n68Var.k == null || p68Var.f15210j != n68Var.h) {
                        i3 = i4;
                    }
                }
                int i5 = n68Var2.d;
                int i6 = this.p;
                int i7 = i5 / i6;
                int i8 = n68Var2.b / i6;
                int i9 = n68Var2.f14358c / i6;
                int i10 = n68Var2.a / i6;
                int i11 = this.r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.r;
                }
            } else if (i2 == 3 && (bitmap = this.m) != null) {
                int i16 = this.r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.q);
            }
        }
        l(n68Var);
        if (n68Var.f14359e || this.p != 1) {
            j(n68Var);
        } else {
            k(n68Var);
        }
        if (this.f17898n && ((i = n68Var.g) == 0 || i == 1)) {
            if (this.m == null) {
                this.m = n();
            }
            Bitmap bitmap3 = this.m;
            int i17 = this.r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.q);
        }
        Bitmap bitmapN = n();
        int i18 = this.r;
        bitmapN.setPixels(iArr, 0, i18, 0, 0, i18, this.q);
        return bitmapN;
    }

    public vli(@NonNull i68.a aVar) {
        this.b = new int[256];
        this.t = Bitmap.Config.ARGB_8888;
        this.f17894c = aVar;
        this.f17897l = new p68();
    }
}
