package com.oplus.aiunit.vision;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p010kotlin.Metadata;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0016\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000¨\u0006\u0006"}, d2 = {"", "num", "goal", "a", "scale", "b", "health_base_release"}, k = 2, mv = {1, 8, 0})
public final class qu8 {
    public static final int a(int i, int i2) {
        return MathKt__MathJVMKt.roundToInt(new BigDecimal(new BigDecimal(i).divide(new BigDecimal(i2), 2, RoundingMode.HALF_UP).doubleValue()).multiply(new BigDecimal(100)).doubleValue());
    }

    public static final int b(int i, int i2, int i3) {
        return MathKt__MathJVMKt.roundToInt(new BigDecimal(i).divide(new BigDecimal(i2), i3, RoundingMode.HALF_UP).doubleValue());
    }
}
