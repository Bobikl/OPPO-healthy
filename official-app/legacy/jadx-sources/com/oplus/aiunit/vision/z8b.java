package com.oplus.aiunit.vision;

import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z8b implements nz6, gsb {
    public static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public byte[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19317c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19318e;
    public long f;
    public long g;
    public long h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19319j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19320l;
    public long[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19321n;

    public z8b() {
        this.a = new byte[8];
        this.m = new long[80];
        this.b = 0;
        reset();
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void b(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            s(bArr, 0);
            this.b = 0;
        }
        this.f19317c++;
    }

    @Override // com.oplus.aiunit.vision.nz6
    public int g() {
        return 128;
    }

    public final long h(long j2, long j3, long j4) {
        return ((~j2) & j4) ^ (j3 & j2);
    }

    public final long i(long j2, long j3, long j4) {
        return ((j2 & j4) ^ (j2 & j3)) ^ (j3 & j4);
    }

    public final long j(long j2) {
        return (j2 >>> 7) ^ (((j2 << 63) | (j2 >>> 1)) ^ ((j2 << 56) | (j2 >>> 8)));
    }

    public final long k(long j2) {
        return (j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)));
    }

    public final long l(long j2) {
        return ((j2 >>> 39) | (j2 << 25)) ^ (((j2 << 36) | (j2 >>> 28)) ^ ((j2 << 30) | (j2 >>> 34)));
    }

    public final long m(long j2) {
        return ((j2 >>> 41) | (j2 << 23)) ^ (((j2 << 50) | (j2 >>> 14)) ^ ((j2 << 46) | (j2 >>> 18)));
    }

    public final void n() {
        long j2 = this.f19317c;
        if (j2 > 2305843009213693951L) {
            this.d += j2 >>> 61;
            this.f19317c = j2 & 2305843009213693951L;
        }
    }

    public void o(z8b z8bVar) {
        byte[] bArr = z8bVar.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = z8bVar.b;
        this.f19317c = z8bVar.f19317c;
        this.d = z8bVar.d;
        this.f19318e = z8bVar.f19318e;
        this.f = z8bVar.f;
        this.g = z8bVar.g;
        this.h = z8bVar.h;
        this.i = z8bVar.i;
        this.f19319j = z8bVar.f19319j;
        this.k = z8bVar.k;
        this.f19320l = z8bVar.f19320l;
        long[] jArr = z8bVar.m;
        System.arraycopy(jArr, 0, this.m, 0, jArr.length);
        this.f19321n = z8bVar.f19321n;
    }

    public void p() {
        n();
        long j2 = this.f19317c << 3;
        long j3 = this.d;
        b(ByteCompanionObject.MIN_VALUE);
        while (this.b != 0) {
            b((byte) 0);
        }
        r(j2, j3);
        q();
    }

    public void q() {
        n();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.m;
            long jK = k(jArr[i - 2]);
            long[] jArr2 = this.m;
            jArr[i] = jK + jArr2[i - 7] + j(jArr2[i - 15]) + this.m[i - 16];
        }
        long j2 = this.f19318e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        long j6 = this.i;
        long j7 = this.f19319j;
        long j8 = this.k;
        long j9 = j7;
        long j10 = j5;
        int i2 = 0;
        long jL = j3;
        long j11 = j4;
        long j12 = j6;
        int i3 = 0;
        long j13 = this.f19320l;
        long j14 = j2;
        long j15 = j8;
        while (i3 < 10) {
            long j16 = j12;
            long jM = m(j12) + h(j12, j9, j15);
            long[] jArr3 = o;
            int i4 = i2 + 1;
            long j17 = j13 + jM + jArr3[i2] + this.m[i2];
            long j18 = j10 + j17;
            long jL2 = j17 + l(j14) + i(j14, jL, j11);
            int i5 = i4 + 1;
            long jM2 = j15 + m(j18) + h(j18, j16, j9) + jArr3[i4] + this.m[i4];
            long j19 = j11 + jM2;
            long jL3 = jM2 + l(jL2) + i(jL2, j14, jL);
            int i6 = i5 + 1;
            long jM3 = j9 + m(j19) + h(j19, j18, j16) + jArr3[i5] + this.m[i5];
            long j20 = jL + jM3;
            long jL4 = jM3 + l(jL3) + i(jL3, jL2, j14);
            int i7 = i6 + 1;
            long jM4 = j16 + m(j20) + h(j20, j19, j18) + jArr3[i6] + this.m[i6];
            long j21 = j14 + jM4;
            long jL5 = jM4 + l(jL4) + i(jL4, jL3, jL2);
            int i8 = i7 + 1;
            long jM5 = j18 + m(j21) + h(j21, j20, j19) + jArr3[i7] + this.m[i7];
            long j22 = jL2 + jM5;
            long jL6 = jM5 + l(jL5) + i(jL5, jL4, jL3);
            int i9 = i8 + 1;
            long jM6 = j19 + m(j22) + h(j22, j21, j20) + jArr3[i8] + this.m[i8];
            long j23 = jL3 + jM6;
            long jL7 = jM6 + l(jL6) + i(jL6, jL5, jL4);
            j15 = j23;
            int i10 = i9 + 1;
            long jM7 = j20 + m(j23) + h(j23, j22, j21) + jArr3[i9] + this.m[i9];
            long j24 = jL4 + jM7;
            j9 = j24;
            jL = jM7 + l(jL7) + i(jL7, jL6, jL5);
            long jM8 = j21 + m(j24) + h(j24, j15, j22) + jArr3[i10] + this.m[i10];
            long jL8 = jM8 + l(jL) + i(jL, jL7, jL6);
            i3++;
            j12 = jL5 + jM8;
            j11 = jL7;
            j13 = j22;
            j10 = jL6;
            i2 = i10 + 1;
            j14 = jL8;
        }
        this.f19318e += j14;
        this.f += jL;
        this.g += j11;
        this.h += j10;
        this.i += j12;
        this.f19319j += j9;
        this.k += j15;
        this.f19320l += j13;
        this.f19321n = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.m[i11] = 0;
        }
    }

    public void r(long j2, long j3) {
        if (this.f19321n > 14) {
            q();
        }
        long[] jArr = this.m;
        jArr[14] = j3;
        jArr[15] = j2;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void reset() {
        this.f19317c = 0L;
        this.d = 0L;
        int i = 0;
        this.b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f19321n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    public void s(byte[] bArr, int i) {
        this.m[this.f19321n] = h2e.b(bArr, i);
        int i2 = this.f19321n + 1;
        this.f19321n = i2;
        if (i2 == 16) {
            q();
        }
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void update(byte[] bArr, int i, int i2) {
        while (this.b != 0 && i2 > 0) {
            b(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.a.length) {
            s(bArr, i);
            byte[] bArr2 = this.a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f19317c += (long) bArr2.length;
        }
        while (i2 > 0) {
            b(bArr[i]);
            i++;
            i2--;
        }
    }

    public z8b(z8b z8bVar) {
        this.a = new byte[8];
        this.m = new long[80];
        o(z8bVar);
    }
}
