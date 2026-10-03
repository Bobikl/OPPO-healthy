package com.omron;

import android.support.annotation.NonNull;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public class db {

    @NonNull
    private final EnumSet<a> a;

    public enum a {
        BodyMovementDetection(1),
        CuffFitDetection(2),
        IrregularPulseDetection(4),
        PulseRateRangeDetection(8),
        MeasurementPositionDetection(16),
        MultipleBond(32);

        private int a;

        a(int i) {
            this.a = i;
        }

        private boolean a(int i) {
            int i2 = this.a;
            return i2 == (i & i2);
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
    }

    public db(@NonNull byte[] bArr) {
        this.a = a.b(ek.b(bArr, 0, true));
    }

    public String toString() {
        return "BloodPressureFeature{mSupportedFlags=" + this.a + '}';
    }
}
