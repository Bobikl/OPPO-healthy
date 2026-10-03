package com.heytap.health.daily.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes16.dex */
public class CustomRadiusLayout extends ConstraintLayout {
    public final Path i;

    public CustomRadiusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Path();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.i.reset();
        float fA = ejg.a(getContext(), 18.0f);
        this.i.addRoundRect(getLeft(), getTop(), getRight(), getBottom(), new float[]{fA, fA, fA, fA, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        int iSave = canvas.save();
        canvas.clipPath(this.i);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public CustomRadiusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Path();
    }
}
