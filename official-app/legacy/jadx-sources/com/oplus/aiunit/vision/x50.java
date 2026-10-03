package com.oplus.aiunit.vision;

import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes19.dex */
public class x50 {
    public static void a(LottieAnimationView lottieAnimationView) {
        if (lottieAnimationView == null || !lottieAnimationView.isAnimating()) {
            return;
        }
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.removeAllAnimatorListeners();
    }

    public static void b(LottieAnimationView lottieAnimationView, String str, String str2, int i, int i2, boolean z) {
        if (lottieAnimationView != null) {
            lottieAnimationView.setImageAssetsFolder(str2);
            lottieAnimationView.setAnimation(str);
            if (i != -1) {
                lottieAnimationView.setMinFrame(i);
            }
            if (i2 != -1) {
                lottieAnimationView.setMaxFrame(i2);
            }
            lottieAnimationView.loop(z);
            lottieAnimationView.playAnimation();
        }
    }
}
