package com.platform.usercenter.tools.algorithm;

import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes9.dex */
public class SampleHelper {
    public static boolean isSampled(double d) {
        if (d <= 0.0d) {
            return false;
        }
        return d >= 1.0d || ThreadLocalRandom.current().nextDouble(1.0d) < d;
    }
}
