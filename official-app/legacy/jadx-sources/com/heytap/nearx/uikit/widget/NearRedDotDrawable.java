package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.eic;
import com.oplus.aiunit.vision.i85;

/* JADX INFO: loaded from: classes18.dex */
public class NearRedDotDrawable extends Drawable {
    private eic mNearHintRedDotDelegate;
    private int mPointMode;
    private int mPointNumber;
    private RectF mRectF;

    public NearRedDotDrawable(int i, int i2, Context context, RectF rectF) {
        this.mPointMode = i;
        this.mPointNumber = i2;
        this.mRectF = rectF;
        eic eicVar = (eic) i85.f();
        this.mNearHintRedDotDelegate = eicVar;
        eicVar.b(context, null, R$styleable.NearHintRedDot, R$attr.NearHintRedDotSmallStyle, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.mNearHintRedDotDelegate.e(canvas, this.mPointMode, String.valueOf(this.mPointNumber), this.mRectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
