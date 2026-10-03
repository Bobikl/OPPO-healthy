package com.heytap.health.base.view.pressanimation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.base.R$styleable;
import com.oplus.aiunit.vision.ov9;

/* JADX INFO: loaded from: classes15.dex */
public class NearPressAnimationConstraintLayout extends ConstraintLayout implements ov9 {
    public NearPressAnimationConstraintLayout(@NonNull Context context) {
        this(context, null);
    }

    public NearPressAnimationConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPressAnimationConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_press_anim);
            z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_press_anim_animAfterPause, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("animAfterPause ");
        sb.append(z);
        c(this, z);
    }
}
