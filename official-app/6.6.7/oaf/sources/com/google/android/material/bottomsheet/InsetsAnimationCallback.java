package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimationUtils;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class InsetsAnimationCallback extends WindowInsetsAnimationCompat.Callback {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.view.setTranslationY(0.0f);
    }

    public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @NonNull
    public WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        for (WindowInsetsAnimationCompat windowInsetsAnimationCompat : list) {
            if ((windowInsetsAnimationCompat.getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, windowInsetsAnimationCompat.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @NonNull
    public WindowInsetsAnimationCompat.BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return boundsCompat;
    }
}
