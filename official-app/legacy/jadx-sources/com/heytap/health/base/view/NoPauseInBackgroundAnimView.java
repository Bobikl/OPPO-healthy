package com.heytap.health.base.view;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes15.dex */
public class NoPauseInBackgroundAnimView extends LottieAnimationView {
    public NoPauseInBackgroundAnimView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean isShown() {
        return true;
    }

    public NoPauseInBackgroundAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoPauseInBackgroundAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
