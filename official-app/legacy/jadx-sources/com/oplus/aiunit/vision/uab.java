package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Build;
import com.airbnb.lottie.LottieFeatureFlag;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public class uab {
    public final HashSet<LottieFeatureFlag> a = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    public boolean a(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        if (!z) {
            return this.a.remove(lottieFeatureFlag);
        }
        if (Build.VERSION.SDK_INT >= lottieFeatureFlag.minRequiredSdkVersion) {
            return this.a.add(lottieFeatureFlag);
        }
        o7b.c(String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
        return false;
    }

    public boolean b(LottieFeatureFlag lottieFeatureFlag) {
        return this.a.contains(lottieFeatureFlag);
    }
}
