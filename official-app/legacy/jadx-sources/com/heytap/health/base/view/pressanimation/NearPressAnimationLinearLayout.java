package com.heytap.health.base.view.pressanimation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ov9;

/* JADX INFO: loaded from: classes15.dex */
public class NearPressAnimationLinearLayout extends LinearLayout implements ov9 {
    public NearPressAnimationLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    public NearPressAnimationLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPressAnimationLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(this);
    }
}
