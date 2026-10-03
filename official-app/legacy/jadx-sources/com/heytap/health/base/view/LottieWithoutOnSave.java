package com.heytap.health.base.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes15.dex */
public class LottieWithoutOnSave extends LottieAnimationView {
    public LottieWithoutOnSave(Context context) {
        super(context);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.view.View
    public Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return null;
    }

    public LottieWithoutOnSave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LottieWithoutOnSave(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
