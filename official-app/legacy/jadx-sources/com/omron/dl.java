package com.omron;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.heytap.log.formatter.LogFieldKey;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public class dl {

    @NonNull
    private String a;

    @NonNull
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private BigDecimal f8929c;

    @Nullable
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private BigDecimal f8930e;

    @Nullable
    private BigDecimal f;

    @Nullable
    private BigDecimal g;

    public enum a {
        ImperialUnit(1),
        TimeStampPresent(2),
        UserIDPresent(4),
        BMIAndHeightPresent(8);

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

    public dl(@NonNull byte[] bArr) {
        this(bArr, null);
    }

    @Nullable
    public BigDecimal a() {
        return this.f;
    }

    @Nullable
    public BigDecimal b() {
        return this.g;
    }

    @Nullable
    public String c() {
        return this.d;
    }

    @Nullable
    public BigDecimal d() {
        return this.f8930e;
    }

    @NonNull
    public BigDecimal e() {
        return this.f8929c;
    }

    @NonNull
    public String f() {
        return this.a;
    }

    public String toString() {
        return "WeightMeasurement{mWeightUnit='" + this.a + "', mHeightUnit='" + this.b + "', mWeight=" + this.f8929c + ", mTimeStamp='" + this.d + "', mUserID=" + this.f8930e + ", mBMI=" + this.f + ", mHeight=" + this.g + '}';
    }

    public dl(@NonNull byte[] bArr, @Nullable dm dmVar) {
        float fC;
        float fB;
        String str;
        int i;
        EnumSet<a> enumSetB = a.b(bArr[0]);
        if (enumSetB.contains(a.ImperialUnit)) {
            fC = dmVar != null ? dmVar.d() : 0.01f;
            fB = dmVar != null ? dmVar.a() : 0.1f;
            this.a = "lb";
            str = "in";
        } else {
            fC = dmVar != null ? dmVar.c() : 0.005f;
            fB = dmVar != null ? dmVar.b() : 0.001f;
            this.a = "kg";
            str = LogFieldKey.MESSAGE_KEY;
        }
        this.b = str;
        this.f8929c = new BigDecimal(ek.a(bArr, 1, true) * fC).setScale(3, RoundingMode.HALF_UP);
        if (enumSetB.contains(a.TimeStampPresent)) {
            this.d = ek.g(bArr, 3, true);
            i = 10;
        } else {
            i = 3;
        }
        if (enumSetB.contains(a.UserIDPresent)) {
            this.f8930e = new BigDecimal(bArr[i] & 255);
            i++;
        }
        if (enumSetB.contains(a.BMIAndHeightPresent)) {
            this.f = new BigDecimal(ek.a(bArr, i, true) * 0.1f).setScale(3, RoundingMode.HALF_UP);
            this.g = new BigDecimal(ek.a(bArr, i + 2, true) * fB).setScale(1, RoundingMode.HALF_UP);
        }
    }
}
