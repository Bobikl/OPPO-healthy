package com.omron;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public class dc {

    @NonNull
    private String a;

    @NonNull
    private BigDecimal b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private BigDecimal f8870c;

    @NonNull
    private BigDecimal d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f8871e;

    @Nullable
    private BigDecimal f;

    @Nullable
    private BigDecimal g;

    @NonNull
    private EnumSet<dn> h;

    public enum a {
        KpaUnit(1),
        TimeStampPresent(2),
        PulseRatePresent(4),
        UserIDPresent(8),
        MeasurementStatusPresent(16);

        private int a;

        a(int i) {
            this.a = i;
        }

        @NonNull
        public static EnumSet<a> b(int i) {
            EnumSet<a> enumSetNoneOf = EnumSet.noneOf(a.class);
            for (a aVar : values()) {
                if (aVar.a(i)) {
                    enumSetNoneOf.add(aVar);
                }
            }
            return enumSetNoneOf;
        }

        public boolean a(int i) {
            int i2 = this.a;
            return i2 == (i & i2);
        }
    }

    public dc(@NonNull byte[] bArr) {
        EnumSet<a> enumSetB = a.b(bArr[0]);
        this.a = enumSetB.contains(a.KpaUnit) ? "kPa" : "mmHg";
        this.b = new BigDecimal(ek.c(bArr, 1, true).a()).setScale(3, RoundingMode.HALF_UP);
        this.f8870c = new BigDecimal(ek.c(bArr, 3, true).a()).setScale(3, RoundingMode.HALF_UP);
        this.d = new BigDecimal(ek.c(bArr, 5, true).a()).setScale(3, RoundingMode.HALF_UP);
        int i = 7;
        if (enumSetB.contains(a.TimeStampPresent)) {
            this.f8871e = ek.g(bArr, 7, true);
            i = 14;
        } else {
            this.f8871e = null;
        }
        if (enumSetB.contains(a.PulseRatePresent)) {
            this.f = new BigDecimal(ek.c(bArr, i, true).a()).setScale(3, RoundingMode.HALF_UP);
            i += 2;
        } else {
            this.f = null;
        }
        if (enumSetB.contains(a.UserIDPresent)) {
            this.g = new BigDecimal(bArr[i] & 255);
            i++;
        } else {
            this.g = null;
        }
        this.h = enumSetB.contains(a.MeasurementStatusPresent) ? dn.b(bArr[i]) : EnumSet.noneOf(dn.class);
    }

    @NonNull
    public BigDecimal a() {
        return this.f8870c;
    }

    @NonNull
    public BigDecimal b() {
        return this.d;
    }

    @NonNull
    public EnumSet<dn> c() {
        return this.h;
    }

    @Nullable
    public BigDecimal d() {
        return this.f;
    }

    @NonNull
    public BigDecimal e() {
        return this.b;
    }

    @Nullable
    public String f() {
        return this.f8871e;
    }

    @NonNull
    public String g() {
        return this.a;
    }

    @Nullable
    public BigDecimal h() {
        return this.g;
    }

    public String toString() {
        return "BloodPressureMeasurement{mUnit='" + this.a + "', mSystolic=" + this.b + ", mDiastolic=" + this.f8870c + ", mMeanArterialPressure=" + this.d + ", mTimeStamp='" + this.f8871e + "', mPulseRate=" + this.f + ", mUserID=" + this.g + ", mMeasurementStatus=" + this.h + '}';
    }
}
