package com.heytap.health.base.view.pressanimation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ov9;

/* JADX INFO: loaded from: classes15.dex */
public class NearPressAnimationFrameLayout extends FrameLayout implements ov9 {
    public NearPressAnimationFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public NearPressAnimationFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPressAnimationFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(this);
    }
}
