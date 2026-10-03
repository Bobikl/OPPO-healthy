package com.omron;

import android.support.annotation.NonNull;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public enum dn {
    BodyMovementDetected(1, "Body Movement Detected"),
    CuffTooLoose(2, "Cuff Too Loose"),
    IrregularPulseDetected(4, "Irregular Pulse Detected"),
    PulseRateTooHigher(8, "Pulse Rate Too Higher"),
    PulseRateTooLower(16, "Pulse Rate Too Lower"),
    ImproperMeasurementPosition(32, "Improper Measurement Position"),
    AFIBDetectionSupport(64, "AFIB Support Flag"),
    AFIBDetection(128, "AFIB Detection Flag");

    private int a;

    @NonNull
    private String b;

    dn(int i, @NonNull String str) {
        this.a = i;
        this.b = str;
    }

    private boolean a(int i) {
        int i2 = this.a;
        return i2 == (i & i2);
    }

    @NonNull
    public static EnumSet<dn> b(int i) {
        EnumSet<dn> enumSetNoneOf = EnumSet.noneOf(dn.class);
        for (dn dnVar : values()) {
            if (dnVar.a(i)) {
                enumSetNoneOf.add(dnVar);
            }
        }
        return enumSetNoneOf;
    }
}
