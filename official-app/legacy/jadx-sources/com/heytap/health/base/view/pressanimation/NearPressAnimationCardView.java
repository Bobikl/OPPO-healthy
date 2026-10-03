package com.heytap.health.base.view.pressanimation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.oplus.aiunit.vision.ov9;

/* JADX INFO: loaded from: classes15.dex */
public class NearPressAnimationCardView extends CardView implements ov9 {
    public NearPressAnimationCardView(@NonNull Context context) {
        this(context, null);
    }

    public NearPressAnimationCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPressAnimationCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(this);
    }
}
