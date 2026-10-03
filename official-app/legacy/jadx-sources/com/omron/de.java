package com.omron;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.heytap.log.formatter.LogFieldKey;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public class de {

    @NonNull
    private String a;

    @NonNull
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private BigDecimal f8880c;

    @Nullable
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private BigDecimal f8881e;

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
    private BigDecimal f8882j;

    @Nullable
    private BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private BigDecimal f8883l;

    @Nullable
    private BigDecimal m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private BigDecimal f8884n;

    public class a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(@NonNull byte[] bArr, @Nullable dd ddVar) {
            float fC;
            float fB;
            de deVar;
            String str;
            EnumSet<b> enumSetB = b.b(ek.d(bArr, 0, true));
            if (enumSetB.contains(b.ImperialUnit)) {
                fC = ddVar != null ? ddVar.d() : 0.01f;
                fB = ddVar != null ? ddVar.a() : 0.1f;
                de.this.a = "lb";
                deVar = de.this;
                str = "in";
            } else {
                fC = ddVar != null ? ddVar.c() : 0.005f;
                fB = ddVar != null ? ddVar.b() : 0.001f;
                de.this.a = "kg";
                deVar = de.this;
                str = LogFieldKey.MESSAGE_KEY;
            }
            deVar.b = str;
            de.this.f8880c = new BigDecimal(ek.a(bArr, 2, true) * 0.1f * 0.01f).setScale(3, RoundingMode.HALF_UP);
            int i = 4;
            if (enumSetB.contains(b.TimeStampPresent)) {
                de.this.d = ek.g(bArr, 4, true);
                i = 11;
            }
            if (enumSetB.contains(b.UserIDPresent)) {
                de.this.f8881e = new BigDecimal(bArr[i] & 255);
                i++;
            }
            if (enumSetB.contains(b.BasalMetabolismPresent)) {
                de.this.f = new BigDecimal(ek.b(bArr, i, true));
                i += 2;
            }
            if (enumSetB.contains(b.MusclePercentagePresent)) {
                de.this.g = new BigDecimal(ek.a(bArr, i, true) * 0.1f * 0.01f).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.MuscleMassPresent)) {
                de.this.h = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.FatFreeMassPresent)) {
                de.this.i = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.SoftLeanMassPresent)) {
                de.this.f8882j = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.BodyWaterMassPresent)) {
                de.this.k = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.ImpedancePresent)) {
                de.this.f8883l = new BigDecimal(ek.a(bArr, i, true) * 0.1f).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.WeightPresent)) {
                de.this.m = new BigDecimal(ek.a(bArr, i, true) * fC).setScale(3, RoundingMode.HALF_UP);
                i += 2;
            }
            if (enumSetB.contains(b.HeightPresent)) {
                de.this.f8884n = new BigDecimal(ek.a(bArr, i, true) * fB).setScale(1, RoundingMode.HALF_UP);
            }
        }
    }

    public enum b {
        ImperialUnit(1),
        TimeStampPresent(2),
        UserIDPresent(4),
        BasalMetabolismPresent(8),
        MusclePercentagePresent(16),
        MuscleMassPresent(32),
        FatFreeMassPresent(64),
        SoftLeanMassPresent(128),
        BodyWaterMassPresent(256),
        ImpedancePresent(512),
        WeightPresent(1024),
        HeightPresent(2048),
        MultiplePacketMeasurement(4096);

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

    public de(@NonNull byte[] bArr) {
        this(bArr, null, null);
    }

    @Nullable
    public BigDecimal d() {
        return this.i;
    }

    @Nullable
    public BigDecimal e() {
        return this.f8884n;
    }

    @Nullable
    public BigDecimal f() {
        return this.f8883l;
    }

    @Nullable
    public BigDecimal g() {
        return this.h;
    }

    @Nullable
    public BigDecimal h() {
        return this.g;
    }

    @Nullable
    public BigDecimal i() {
        return this.f8882j;
    }

    @Nullable
    public String j() {
        return this.d;
    }

    @Nullable
    public BigDecimal k() {
        return this.f8881e;
    }

    @Nullable
    public BigDecimal l() {
        return this.m;
    }

    @NonNull
    public String m() {
        return this.a;
    }

    public String toString() {
        return "BodyCompositionMeasurement{mWeightUnit='" + this.a + "', mHeightUnit='" + this.b + "', mBodyFatPercentage=" + this.f8880c + ", mTimeStamp='" + this.d + "', mUserID=" + this.f8881e + ", mBasalMetabolism=" + this.f + ", mMusclePercentage=" + this.g + ", mMuscleMass=" + this.h + ", mFatFreeMass=" + this.i + ", mSoftLeanMass=" + this.f8882j + ", mBodyWaterMass=" + this.k + ", mImpedance=" + this.f8883l + ", mWeight=" + this.m + ", mHeight=" + this.f8884n + '}';
    }

    public de(@NonNull byte[] bArr, @Nullable byte[] bArr2) {
        this(bArr, bArr2, null);
    }

    @Nullable
    public BigDecimal a() {
        return this.f;
    }

    @NonNull
    public BigDecimal b() {
        return this.f8880c;
    }

    @Nullable
    public BigDecimal c() {
        return this.k;
    }

    public de(@NonNull byte[] bArr, @Nullable byte[] bArr2, @Nullable dd ddVar) {
        this.a = "";
        this.b = "";
        this.f8880c = new BigDecimal("0");
        a aVar = new a();
        aVar.a(bArr, ddVar);
        if (bArr2 != null) {
            aVar.a(bArr2, ddVar);
        }
    }
}
