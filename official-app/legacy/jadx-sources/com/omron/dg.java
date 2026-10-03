package com.omron;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.heytap.log.formatter.LogFieldKey;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public class dg {

    @NonNull
    private String a;

    @NonNull
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private BigDecimal f8892c;

    @Nullable
    private BigDecimal d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f8893e;

    @Nullable
    private BigDecimal f;

    @Nullable
    private BigDecimal g;

    @Nullable
    private BigDecimal h;

    @Nullable
    private BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private BigDecimal f8894j;

    @Nullable
    private BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private BigDecimal f8895l;

    @Nullable
    private BigDecimal m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private BigDecimal f8896n;

    @Nullable
    private BigDecimal o;

    @Nullable
    private BigDecimal p;

    @Nullable
    private BigDecimal q;

    @Nullable
    private BigDecimal r;

    @Nullable
    private BigDecimal s;

    @Nullable
    private BigDecimal t;

    @Nullable
    private BigDecimal u;

    @Nullable
    private BigDecimal v;

    public class a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(@NonNull byte[] bArr, @Nullable dd ddVar) {
            float fC;
            float fB;
            dg dgVar;
            String str;
            int i;
            EnumSet<b> enumSetB = b.b(ek.e(bArr, 0, true) & 16777215);
            if (enumSetB.contains(b.ImperialUnit)) {
                fC = ddVar != null ? ddVar.d() : 0.01f;
                fB = ddVar != null ? ddVar.a() : 0.1f;
                dg.this.a = "lb";
                dgVar = dg.this;
                str = "in";
            } else {
                fC = ddVar != null ? ddVar.c() : 0.005f;
                fB = ddVar != null ? ddVar.b() : 0.001f;
                dg.this.a = "kg";
                dgVar = dg.this;
                str = LogFieldKey.MESSAGE_KEY;
            }
            dgVar.b = str;
            if (enumSetB.contains(b.SequenceNumberPresent)) {
                dg.this.f8892c = new BigDecimal(ek.b(bArr, 3, true));
                i = 5;
            } else {
                i = 3;
            }
            if (enumSetB.contains(b.WeightPresent)) {
                dg.this.d = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.TimeStampPresent)) {
                dg.this.f8893e = ek.g(bArr, i, true);
                i += 7;
            }
            if (enumSetB.contains(b.UserIDPresent)) {
                dg.this.f = new BigDecimal(bArr[i] & 255);
                i++;
            }
            if (enumSetB.contains(b.BMIAndHeightPresent)) {
                dg.this.g = new BigDecimal(ek.a(bArr, i, true) * 0.1f).setScale(3, RoundingMode.HALF_UP);
                int i2 = i + 2;
                dg.this.h = new BigDecimal(ek.a(bArr, i2, true) * fB).setScale(1, RoundingMode.HALF_UP);
                i = i2 + 2;
            }
            if (enumSetB.contains(b.BodyFatPercentagePresent)) {
                dg.this.i = new BigDecimal(ek.a(bArr, i, true) * 0.1f * 0.01f).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.BasalMetabolismPresent)) {
                dg.this.f8894j = new BigDecimal(ek.b(bArr, i, true));
                i += 2;
            }
            if (enumSetB.contains(b.MusclePercentagePresent)) {
                dg.this.k = new BigDecimal(ek.a(bArr, i, true) * 0.1f * 0.01f).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.MuscleMassPresent)) {
                dg.this.f8895l = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.FatFreeMassPresent)) {
                dg.this.m = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.SoftLeanMassPresent)) {
                dg.this.f8896n = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.BodyWaterMassPresent)) {
                dg.this.o = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.ImpedancePresent)) {
                dg.this.p = new BigDecimal(ek.a(bArr, i, true) * 0.1f).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.SkeletalMusclePercentagePresent)) {
                dg.this.q = new BigDecimal(ek.a(bArr, i, true) * 0.1f * 0.01f).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.VisceralFatLevelPresent)) {
                dg.this.r = new BigDecimal(bArr[i] * 0.5f).setScale(3, RoundingMode.HALF_UP);
                i++;
            }
            if (enumSetB.contains(b.BodyAgePresent)) {
                dg.this.s = new BigDecimal((int) bArr[i]);
                i++;
            }
            if (enumSetB.contains(b.BodyFatPercentageStageEvaluationPresent)) {
                dg.this.t = new BigDecimal((int) bArr[i]);
                i++;
            }
            if (enumSetB.contains(b.SkeletalMusclePercentageStageEvaluationPresent)) {
                dg.this.u = new BigDecimal((int) bArr[i]);
                i++;
            }
            if (enumSetB.contains(b.VisceralFatLevelStageEvaluationPresent)) {
                dg.this.v = new BigDecimal((int) bArr[i]);
            }
        }
    }

    public enum b {
        ImperialUnit(1),
        SequenceNumberPresent(2),
        WeightPresent(4),
        TimeStampPresent(8),
        UserIDPresent(16),
        BMIAndHeightPresent(32),
        BodyFatPercentagePresent(64),
        BasalMetabolismPresent(128),
        MusclePercentagePresent(256),
        MuscleMassPresent(512),
        FatFreeMassPresent(1024),
        SoftLeanMassPresent(2048),
        BodyWaterMassPresent(4096),
        ImpedancePresent(8192),
        SkeletalMusclePercentagePresent(16384),
        VisceralFatLevelPresent(32768),
        BodyAgePresent(65536),
        BodyFatPercentageStageEvaluationPresent(131072),
        SkeletalMusclePercentageStageEvaluationPresent(262144),
        VisceralFatLevelStageEvaluationPresent(524288),
        MultiplePacketMeasurement(1048576);

        private int a;

        b(int i) {
            this.a = i;
        }

        @NonNull
        public static EnumSet<b> b(int i) {
            EnumSet<b> enumSetNoneOf = EnumSet.noneOf(b.class);
            for (b bVar : values()) {
                if (bVar.a(i)) {
                    enumSetNoneOf.add(bVar);
                }
            }
            return enumSetNoneOf;
        }

        public boolean a(int i) {
            int i2 = this.a;
            return i2 == (i & i2);
        }
    }

    public dg(@NonNull byte[] bArr) {
        this(bArr, null, null);
    }

    @Nullable
    public BigDecimal d() {
        return this.i;
    }

    @Nullable
    public BigDecimal e() {
        return this.t;
    }

    @Nullable
    public BigDecimal f() {
        return this.o;
    }

    @Nullable
    public BigDecimal g() {
        return this.m;
    }

    @Nullable
    public BigDecimal h() {
        return this.h;
    }

    @Nullable
    public BigDecimal i() {
        return this.p;
    }

    @Nullable
    public BigDecimal j() {
        return this.f8895l;
    }

    @Nullable
    public BigDecimal k() {
        return this.k;
    }

    @Nullable
    public BigDecimal l() {
        return this.f8892c;
    }

    @Nullable
    public BigDecimal m() {
        return this.q;
    }

    @Nullable
    public BigDecimal n() {
        return this.u;
    }

    @Nullable
    public BigDecimal o() {
        return this.f8896n;
    }

    @Nullable
    public String p() {
        return this.f8893e;
    }

    @Nullable
    public BigDecimal q() {
        return this.f;
    }

    @Nullable
    public BigDecimal r() {
        return this.r;
    }

    @Nullable
    public BigDecimal s() {
        return this.v;
    }

    @Nullable
    public BigDecimal t() {
        return this.d;
    }

    public String toString() {
        return "OmronMeasurementWS{mWeightUnit='" + this.a + "', mHeightUnit='" + this.b + "', mSequenceNumber=" + this.f8892c + ", mWeight=" + this.d + ", mTimeStamp='" + this.f8893e + "', mUserID=" + this.f + ", mBMI=" + this.g + ", mHeight=" + this.h + ", mBodyFatPercentage=" + this.i + ", mBasalMetabolism=" + this.f8894j + ", mMusclePercentage=" + this.k + ", mMuscleMass=" + this.f8895l + ", mFatFreeMass=" + this.m + ", mSoftLeanMass=" + this.f8896n + ", mBodyWaterMass=" + this.o + ", mImpedance=" + this.p + ", mSkeletalMusclePercentage=" + this.q + ", mVisceralFatLevel=" + this.r + ", mBodyAge=" + this.s + ", mBodyFatPercentageStageEvaluation=" + this.t + ", mSkeletalMusclePercentageStageEvaluation=" + this.u + ", mVisceralFatLevelStageEvaluation=" + this.v + '}';
    }

    @NonNull
    public String u() {
        return this.a;
    }

    public dg(@NonNull byte[] bArr, @Nullable byte[] bArr2) {
        this(bArr, bArr2, null);
    }

    @Nullable
    public BigDecimal a() {
        return this.g;
    }

    @Nullable
    public BigDecimal b() {
        return this.f8894j;
    }

    @Nullable
    public BigDecimal c() {
        return this.s;
    }

    public dg(@NonNull byte[] bArr, @Nullable byte[] bArr2, @Nullable dd ddVar) {
        this.a = "";
        this.b = "";
        a aVar = new a();
        aVar.a(bArr, ddVar);
        if (bArr2 != null) {
            aVar.a(bArr2, ddVar);
        }
    }
}
