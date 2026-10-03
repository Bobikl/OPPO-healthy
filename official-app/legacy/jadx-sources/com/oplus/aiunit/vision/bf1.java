package com.oplus.aiunit.vision;

import androidx.core.app.FrameMetricsAggregator;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import io.netty.util.internal.StringUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class bf1 implements bv5 {
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wg0<xtj> f9718j;
    public final cf1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9719l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9720n;

    public static class a {
        public String a;
        public String[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public kb7 f9721c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f9722e;
        public float f;
        public float g;
        public float h;
        public float i;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f9724l;
        public float m;
        public boolean q;
        public b s;
        public float t;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f9723j = 1.0f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f9725n = 1.0f;
        public float o = 1.0f;
        public float p = 1.0f;
        public final b[][] r = new b[128][];
        public float u = 1.0f;
        public char[] v = {'x', 'e', 'a', 'o', 'n', 's', 'r', 'c', 'u', 'm', 'v', 'w', 'z'};
        public char[] w = {'M', 'N', 'B', 'D', 'C', 'E', 'F', 'K', 'A', 'G', 'H', 'I', 'J', rnb.MATRIX_TYPE_RANDOM_LT, 'O', 'P', 'Q', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', rnb.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', rnb.MATRIX_TYPE_ZERO};

        public a(kb7 kb7Var, boolean z) throws Throwable {
            this.f9721c = kb7Var;
            this.d = z;
            e(kb7Var, z);
        }

        public b a() {
            for (b[] bVarArr : this.r) {
                if (bVarArr != null) {
                    for (b bVar : bVarArr) {
                        if (bVar != null && bVar.f9727e != 0 && bVar.d != 0) {
                            return bVar;
                        }
                    }
                }
            }
            throw new GdxRuntimeException("No glyphs found.");
        }

        public b b(char c2) {
            b[] bVarArr = this.r[c2 / 512];
            if (bVarArr != null) {
                return bVarArr[c2 & 511];
            }
            return null;
        }

        public String c(int i) {
            return this.b[i];
        }

        public String[] d() {
            return this.b;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00da  */
        public void e(kb7 kb7Var, boolean z) throws Throwable {
            BufferedReader bufferedReader;
            Throwable th;
            Exception exc;
            int iMax;
            String line;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            b[] bVarArr;
            if (this.b != null) {
                throw new IllegalStateException("Already loaded.");
            }
            this.a = kb7Var.h();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(kb7Var.m()), 512);
            try {
                try {
                    String line2 = bufferedReader2.readLine();
                    try {
                        if (line2 == null) {
                            throw new GdxRuntimeException("File is empty.");
                        }
                        String strSubstring = line2.substring(line2.indexOf("padding=") + 8);
                        boolean z2 = false;
                        String[] strArrSplit = strSubstring.substring(0, strSubstring.indexOf(32)).split(",", 4);
                        if (strArrSplit.length != 4) {
                            throw new GdxRuntimeException("Invalid padding.");
                        }
                        this.f9722e = Integer.parseInt(strArrSplit[0]);
                        boolean z3 = true;
                        this.f = Integer.parseInt(strArrSplit[1]);
                        this.g = Integer.parseInt(strArrSplit[2]);
                        this.h = Integer.parseInt(strArrSplit[3]);
                        float f7 = this.f9722e + this.g;
                        String line3 = bufferedReader2.readLine();
                        if (line3 == null) {
                            throw new GdxRuntimeException("Missing common header.");
                        }
                        String[] strArrSplit2 = line3.split(" ", 9);
                        if (strArrSplit2.length < 3) {
                            throw new GdxRuntimeException("Invalid common header.");
                        }
                        if (!strArrSplit2[1].startsWith("lineHeight=")) {
                            throw new GdxRuntimeException("Missing: lineHeight");
                        }
                        this.i = Integer.parseInt(strArrSplit2[1].substring(11));
                        if (!strArrSplit2[2].startsWith("base=")) {
                            throw new GdxRuntimeException("Missing: base");
                        }
                        float f8 = Integer.parseInt(strArrSplit2[2].substring(5));
                        if (strArrSplit2.length >= 6) {
                            try {
                                String str = strArrSplit2[5];
                                if (str == null || !str.startsWith("pages=")) {
                                    iMax = 1;
                                } else {
                                    try {
                                        iMax = Math.max(1, Integer.parseInt(strArrSplit2[5].substring(6)));
                                    } catch (NumberFormatException unused) {
                                        iMax = 1;
                                    }
                                }
                            } catch (Exception e2) {
                                exc = e2;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                nwi.a(bufferedReader);
                                throw th;
                            }
                        } else {
                            iMax = 1;
                        }
                        this.b = new String[iMax];
                        for (int i = 0; i < iMax; i++) {
                            String line4 = bufferedReader2.readLine();
                            if (line4 == null) {
                                throw new GdxRuntimeException("Missing additional page definitions.");
                            }
                            Matcher matcher = Pattern.compile(".*id=(\\d+)").matcher(line4);
                            if (matcher.find()) {
                                String strGroup = matcher.group(1);
                                try {
                                    if (Integer.parseInt(strGroup) != i) {
                                        throw new GdxRuntimeException("Page IDs must be indices starting at 0: " + strGroup);
                                    }
                                } catch (NumberFormatException e3) {
                                    throw new GdxRuntimeException("Invalid page id: " + strGroup, e3);
                                }
                            }
                            Matcher matcher2 = Pattern.compile(".*file=\"?([^\"]+)\"?").matcher(line4);
                            if (!matcher2.find()) {
                                throw new GdxRuntimeException("Missing: file");
                            }
                            this.b[i] = kb7Var.i().a(matcher2.group(1)).j().replaceAll("\\\\", "/");
                        }
                        float f9 = 0.0f;
                        this.f9724l = 0.0f;
                        while (true) {
                            String line5 = bufferedReader2.readLine();
                            if (line5 == null || line5.startsWith("kernings ") || line5.startsWith("metrics ")) {
                                break;
                                break;
                                break;
                            }
                            BufferedReader bufferedReader3 = bufferedReader2;
                            if (line5.startsWith("char ")) {
                                b bVar = new b();
                                StringTokenizer stringTokenizer = new StringTokenizer(line5, " =");
                                stringTokenizer.nextToken();
                                stringTokenizer.nextToken();
                                int i2 = Integer.parseInt(stringTokenizer.nextToken());
                                if (i2 <= 0) {
                                    this.s = bVar;
                                } else if (i2 <= 65535) {
                                    f(i2, bVar);
                                }
                                bVar.a = i2;
                                stringTokenizer.nextToken();
                                bVar.b = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                bVar.f9726c = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                bVar.d = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                bVar.f9727e = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                bVar.f9728j = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                if (z) {
                                    bVar.k = Integer.parseInt(stringTokenizer.nextToken());
                                } else {
                                    bVar.k = -(bVar.f9727e + Integer.parseInt(stringTokenizer.nextToken()));
                                }
                                stringTokenizer.nextToken();
                                bVar.f9729l = Integer.parseInt(stringTokenizer.nextToken());
                                if (stringTokenizer.hasMoreTokens()) {
                                    stringTokenizer.nextToken();
                                }
                                if (stringTokenizer.hasMoreTokens()) {
                                    try {
                                        bVar.f9730n = Integer.parseInt(stringTokenizer.nextToken());
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                                if (bVar.d > 0 && bVar.f9727e > 0) {
                                    this.f9724l = Math.min(bVar.k + f8, this.f9724l);
                                }
                            }
                            bufferedReader2 = bufferedReader3;
                            z2 = false;
                        }
                        this.f9724l += this.g;
                        while (true) {
                            line = bufferedReader2.readLine();
                            if (line == null || !line.startsWith("kerning ")) {
                                break;
                                break;
                            }
                            BufferedReader bufferedReader4 = bufferedReader2;
                            StringTokenizer stringTokenizer2 = new StringTokenizer(line, " =");
                            stringTokenizer2.nextToken();
                            stringTokenizer2.nextToken();
                            int i3 = Integer.parseInt(stringTokenizer2.nextToken());
                            stringTokenizer2.nextToken();
                            int i4 = Integer.parseInt(stringTokenizer2.nextToken());
                            if (i3 >= 0 && i3 <= 65535 && i4 >= 0 && i4 <= 65535) {
                                b bVarB = b((char) i3);
                                stringTokenizer2.nextToken();
                                int i5 = Integer.parseInt(stringTokenizer2.nextToken());
                                if (bVarB != null) {
                                    bVarB.a(i4, i5);
                                }
                            }
                            bufferedReader2 = bufferedReader4;
                            z2 = false;
                        }
                        if (line == null || !line.startsWith("metrics ")) {
                            z3 = z2;
                            f = 0.0f;
                            f2 = 0.0f;
                            f3 = 0.0f;
                            f4 = 0.0f;
                            f5 = 0.0f;
                            f6 = 0.0f;
                        } else {
                            StringTokenizer stringTokenizer3 = new StringTokenizer(line, " =");
                            stringTokenizer3.nextToken();
                            stringTokenizer3.nextToken();
                            float f10 = Float.parseFloat(stringTokenizer3.nextToken());
                            stringTokenizer3.nextToken();
                            f2 = Float.parseFloat(stringTokenizer3.nextToken());
                            stringTokenizer3.nextToken();
                            f3 = Float.parseFloat(stringTokenizer3.nextToken());
                            stringTokenizer3.nextToken();
                            f4 = Float.parseFloat(stringTokenizer3.nextToken());
                            stringTokenizer3.nextToken();
                            f5 = Float.parseFloat(stringTokenizer3.nextToken());
                            stringTokenizer3.nextToken();
                            f6 = Float.parseFloat(stringTokenizer3.nextToken());
                            stringTokenizer3.nextToken();
                            f = Float.parseFloat(stringTokenizer3.nextToken());
                            f9 = f10;
                        }
                        b bVarB2 = b(StringUtil.SPACE);
                        if (bVarB2 == null) {
                            bVarB2 = new b();
                            bVarB2.a = 32;
                            b bVarB3 = b('l');
                            if (bVarB3 == null) {
                                bVarB3 = a();
                            }
                            bVarB2.f9729l = bVarB3.f9729l;
                            f(32, bVarB2);
                        }
                        if (bVarB2.d == 0) {
                            float f11 = this.h;
                            bVarB2.d = (int) (bVarB2.f9729l + f11 + this.f);
                            bVarB2.f9728j = (int) (-f11);
                        }
                        this.t = bVarB2.f9729l;
                        b bVarA = null;
                        for (char c2 : this.v) {
                            bVarA = b(c2);
                            if (bVarA != null) {
                                break;
                            }
                        }
                        if (bVarA == null) {
                            bVarA = a();
                        }
                        this.u = bVarA.f9727e - f7;
                        b bVarB4 = null;
                        for (char c3 : this.w) {
                            bVarB4 = b(c3);
                            if (bVarB4 != null) {
                                break;
                            }
                        }
                        if (bVarB4 == null) {
                            b[][] bVarArr2 = this.r;
                            int i6 = 0;
                            for (int length = bVarArr2.length; i6 < length; length = length) {
                                b[] bVarArr3 = bVarArr2[i6];
                                if (bVarArr3 != null) {
                                    int length2 = bVarArr3.length;
                                    int i7 = 0;
                                    while (i7 < length2) {
                                        int i8 = length2;
                                        b bVar2 = bVarArr3[i7];
                                        if (bVar2 != null) {
                                            bVarArr = bVarArr3;
                                            int i9 = bVar2.f9727e;
                                            if (i9 != 0 && bVar2.d != 0) {
                                                this.f9723j = Math.max(this.f9723j, i9);
                                            }
                                        } else {
                                            bVarArr = bVarArr3;
                                        }
                                        i7++;
                                        length2 = i8;
                                        bVarArr3 = bVarArr;
                                    }
                                }
                                i6++;
                                bVarArr2 = bVarArr2;
                            }
                        } else {
                            this.f9723j = bVarB4.f9727e;
                        }
                        float f12 = this.f9723j - f7;
                        this.f9723j = f12;
                        float f13 = f8 - f12;
                        this.k = f13;
                        float f14 = -this.i;
                        this.m = f14;
                        if (z) {
                            this.k = -f13;
                            this.m = -f14;
                        }
                        if (z3) {
                            this.k = f9;
                            this.f9724l = f2;
                            this.m = f3;
                            this.f9723j = f4;
                            this.i = f5;
                            this.t = f6;
                            this.u = f;
                        }
                        nwi.a(bufferedReader2);
                        return;
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    nwi.a(bufferedReader);
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = bufferedReader2;
                th = th;
                nwi.a(bufferedReader);
                throw th;
            }
            exc = e;
            throw new GdxRuntimeException("Error loading font file: " + kb7Var, exc);
        }

        public void f(int i, b bVar) {
            b[][] bVarArr = this.r;
            int i2 = i / 512;
            b[] bVarArr2 = bVarArr[i2];
            if (bVarArr2 == null) {
                bVarArr2 = new b[512];
                bVarArr[i2] = bVarArr2;
            }
            bVarArr2[i & FrameMetricsAggregator.EVERY_DURATION] = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x006c A[PHI: r1 r11
  0x006c: PHI (r1v4 float) = (r1v3 float), (r1v22 float) binds: [B:7:0x004a, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r11v1 float) = (r11v0 float), (r11v6 float) binds: [B:7:0x004a, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
        public void g(b bVar, xtj xtjVar) {
            float f;
            float f2;
            Texture textureF = xtjVar.f();
            float fE = 1.0f / textureF.E();
            float fB = 1.0f / textureF.B();
            float f3 = xtjVar.b;
            float f4 = xtjVar.f18762c;
            float fC = xtjVar.c();
            float fB2 = xtjVar.b();
            float f5 = 0.0f;
            if (xtjVar instanceof ptj.a) {
                ptj.a aVar = (ptj.a) xtjVar;
                f = aVar.f15481j;
                f2 = (aVar.o - aVar.m) - aVar.k;
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            int i = bVar.b;
            float f6 = i;
            int i2 = bVar.d;
            float f7 = i + i2;
            int i3 = bVar.f9726c;
            float f8 = i3;
            int i4 = bVar.f9727e;
            float f9 = i3 + i4;
            if (f > 0.0f) {
                f6 -= f;
                if (f6 < 0.0f) {
                    bVar.d = (int) (i2 + f6);
                    bVar.f9728j = (int) (bVar.f9728j - f6);
                    f6 = 0.0f;
                }
                f7 -= f;
                if (f7 > fC) {
                    bVar.d = (int) (bVar.d - (f7 - fC));
                } else {
                    fC = f7;
                }
            } else {
                fC = f7;
            }
            if (f2 > 0.0f) {
                float f10 = f8 - f2;
                if (f10 < 0.0f) {
                    int i5 = (int) (i4 + f10);
                    bVar.f9727e = i5;
                    if (i5 < 0) {
                        bVar.f9727e = 0;
                    }
                } else {
                    f5 = f10;
                }
                f9 -= f2;
                if (f9 > fB2) {
                    float f11 = f9 - fB2;
                    bVar.f9727e = (int) (bVar.f9727e - f11);
                    bVar.k = (int) (bVar.k + f11);
                    f8 = f5;
                } else {
                    f8 = f5;
                    fB2 = f9;
                }
            } else {
                fB2 = f9;
            }
            bVar.f = (f6 * fE) + f3;
            bVar.h = f3 + (fC * fE);
            if (this.d) {
                bVar.g = (f8 * fB) + f4;
                bVar.i = f4 + (fB2 * fB);
            } else {
                bVar.i = (f8 * fB) + f4;
                bVar.g = f4 + (fB2 * fB);
            }
        }

        public void h(float f) {
            i(f, f);
        }

        public void i(float f, float f2) {
            if (f == 0.0f) {
                throw new IllegalArgumentException("scaleX cannot be 0.");
            }
            if (f2 == 0.0f) {
                throw new IllegalArgumentException("scaleY cannot be 0.");
            }
            float f3 = f / this.o;
            float f4 = f2 / this.p;
            this.i *= f4;
            this.t *= f3;
            this.u *= f4;
            this.f9723j *= f4;
            this.k *= f4;
            this.f9724l *= f4;
            this.m *= f4;
            this.h *= f3;
            this.f *= f3;
            this.f9722e *= f4;
            this.g *= f4;
            this.o = f;
            this.p = f2;
        }

        public String toString() {
            String str = this.a;
            return str != null ? str : super.toString();
        }
    }

    public static class b {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9726c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9727e;
        public float f;
        public float g;
        public float h;
        public float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9728j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f9729l;
        public byte[][] m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f9730n = 0;

        public void a(int i, int i2) {
            if (this.m == null) {
                this.m = new byte[128][];
            }
            byte[][] bArr = this.m;
            int i3 = i >>> 9;
            byte[] bArr2 = bArr[i3];
            if (bArr2 == null) {
                bArr2 = new byte[512];
                bArr[i3] = bArr2;
            }
            bArr2[i & FrameMetricsAggregator.EVERY_DURATION] = (byte) i2;
        }

        public String toString() {
            return Character.toString((char) this.a);
        }
    }

    public bf1() {
        this(x38.files.e("com/badlogic/gdx/utils/lsans-15.fnt"), x38.files.e("com/badlogic/gdx/utils/lsans-15.png"), false, true);
    }

    public float b() {
        return this.i.f9723j;
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        if (!this.f9720n) {
            return;
        }
        int i = 0;
        while (true) {
            wg0<xtj> wg0Var = this.f9718j;
            if (i >= wg0Var.f18241j) {
                return;
            }
            wg0Var.get(i).f().dispose();
            i++;
        }
    }

    public a i() {
        return this.i;
    }

    public void n(a aVar) {
        for (b[] bVarArr : aVar.r) {
            if (bVarArr != null) {
                for (b bVar : bVarArr) {
                    if (bVar != null) {
                        aVar.g(bVar, this.f9718j.get(bVar.f9730n));
                    }
                }
            }
        }
        b bVar2 = aVar.s;
        if (bVar2 != null) {
            aVar.g(bVar2, this.f9718j.get(bVar2.f9730n));
        }
    }

    public cf1 o() {
        return new cf1(this, this.m);
    }

    public void p(boolean z) {
        this.m = z;
        this.k.a(z);
    }

    public String toString() {
        String str = this.i.a;
        return str != null ? str : super.toString();
    }

    public bf1(kb7 kb7Var, xtj xtjVar) {
        this(kb7Var, xtjVar, false);
    }

    public bf1(kb7 kb7Var, xtj xtjVar, boolean z) {
        this(new a(kb7Var, z), xtjVar, true);
    }

    public bf1(kb7 kb7Var, boolean z) {
        this(new a(kb7Var, z), (xtj) null, true);
    }

    public bf1(kb7 kb7Var, kb7 kb7Var2, boolean z) {
        this(kb7Var, kb7Var2, z, true);
    }

    public bf1(kb7 kb7Var, kb7 kb7Var2, boolean z, boolean z2) {
        this(new a(kb7Var, z), new xtj(new Texture(kb7Var2, false)), z2);
        this.f9720n = true;
    }

    public bf1(a aVar, xtj xtjVar, boolean z) {
        this(aVar, (wg0<xtj>) (xtjVar != null ? wg0.n(xtjVar) : null), z);
    }

    public bf1(a aVar, wg0<xtj> wg0Var, boolean z) {
        kb7 kb7VarC;
        this.f9719l = aVar.d;
        this.i = aVar;
        this.m = z;
        if (wg0Var != null && wg0Var.f18241j != 0) {
            this.f9718j = wg0Var;
            this.f9720n = false;
        } else {
            String[] strArr = aVar.b;
            if (strArr != null) {
                int length = strArr.length;
                this.f9718j = new wg0<>(length);
                for (int i = 0; i < length; i++) {
                    kb7 kb7Var = aVar.f9721c;
                    if (kb7Var == null) {
                        kb7VarC = x38.files.a(aVar.b[i]);
                    } else {
                        kb7VarC = x38.files.c(aVar.b[i], kb7Var.t());
                    }
                    this.f9718j.a(new xtj(new Texture(kb7VarC, false)));
                }
                this.f9720n = true;
            } else {
                throw new IllegalArgumentException("If no regions are specified, the font data must have an images path.");
            }
        }
        this.k = o();
        n(aVar);
    }
}
