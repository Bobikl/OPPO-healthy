package com.oplus.aiunit.vision;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes17.dex */
public class hnf implements gp0 {
    @Override // com.oplus.aiunit.vision.gp0
    public String a(int i, double d) {
        return new BigDecimal(d).setScale(1, RoundingMode.HALF_UP).doubleValue() + "H";
    }
}
