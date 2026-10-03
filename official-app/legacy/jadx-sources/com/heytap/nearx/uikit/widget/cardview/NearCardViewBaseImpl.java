package com.heytap.nearx.uikit.widget.cardview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.rkc;

/* JADX INFO: loaded from: classes18.dex */
class NearCardViewBaseImpl implements NearCardViewImpl {
    private final RectF mCornerRect = new RectF();

    private NearRoundRectDrawableWithShadow createBackground(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new NearRoundRectDrawableWithShadow(context.getResources(), colorStateList, f, f2, f3);
    }

    private NearRoundRectDrawableWithShadow getShadowBackground(NearCardViewDelegate nearCardViewDelegate) {
        return (NearRoundRectDrawableWithShadow) nearCardViewDelegate.getCardBackground();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public ColorStateList getBackgroundColor(NearCardViewDelegate nearCardViewDelegate) {
        return getShadowBackground(nearCardViewDelegate).getColor();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getElevation(NearCardViewDelegate nearCardViewDelegate) {
        return getShadowBackground(nearCardViewDelegate).getShadowSize();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getMaxElevation(NearCardViewDelegate nearCardViewDelegate) {
        return getShadowBackground(nearCardViewDelegate).getMaxShadowSize();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getMinHeight(NearCardViewDelegate nearCardViewDelegate) {
        return getShadowBackground(nearCardViewDelegate).getMinHeight();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getMinWidth(NearCardViewDelegate nearCardViewDelegate) {
        return getShadowBackground(nearCardViewDelegate).getMinWidth();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getRadius(NearCardViewDelegate nearCardViewDelegate) {
        return getShadowBackground(nearCardViewDelegate).getCornerRadius();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void initStatic() {
        NearRoundRectDrawableWithShadow.setRoundRectHelper(new NearRoundRectDrawableWithShadow.RoundRectHelper() { // from class: com.heytap.nearx.uikit.widget.cardview.NearCardViewBaseImpl.1
            @Override // com.heytap.nearx.uikit.widget.cardview.NearRoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawPath(rkc.a().d(rectF, f), paint);
            }
        });
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void initialize(NearCardViewDelegate nearCardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        NearRoundRectDrawableWithShadow nearRoundRectDrawableWithShadowCreateBackground = createBackground(context, colorStateList, f, f2, f3);
        nearRoundRectDrawableWithShadowCreateBackground.setAddPaddingForCorners(nearCardViewDelegate.getPreventCornerOverlap());
        nearCardViewDelegate.setCardBackground(nearRoundRectDrawableWithShadowCreateBackground);
        updatePadding(nearCardViewDelegate);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void onCompatPaddingChanged(NearCardViewDelegate nearCardViewDelegate) {
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void onPreventCornerOverlapChanged(NearCardViewDelegate nearCardViewDelegate) {
        getShadowBackground(nearCardViewDelegate).setAddPaddingForCorners(nearCardViewDelegate.getPreventCornerOverlap());
        updatePadding(nearCardViewDelegate);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setBackgroundColor(NearCardViewDelegate nearCardViewDelegate, @Nullable ColorStateList colorStateList) {
        getShadowBackground(nearCardViewDelegate).setColor(colorStateList);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setElevation(NearCardViewDelegate nearCardViewDelegate, float f) {
        getShadowBackground(nearCardViewDelegate).setShadowSize(f);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setMaxElevation(NearCardViewDelegate nearCardViewDelegate, float f) {
        getShadowBackground(nearCardViewDelegate).setMaxShadowSize(f);
        updatePadding(nearCardViewDelegate);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setRadius(NearCardViewDelegate nearCardViewDelegate, float f) {
        getShadowBackground(nearCardViewDelegate).setCornerRadius(f);
        updatePadding(nearCardViewDelegate);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void updatePadding(NearCardViewDelegate nearCardViewDelegate) {
        Rect rect = new Rect();
        getShadowBackground(nearCardViewDelegate).getMaxShadowAndCornerPadding(rect);
        nearCardViewDelegate.setMinWidthHeightInternal((int) Math.ceil(getMinWidth(nearCardViewDelegate)), (int) Math.ceil(getMinHeight(nearCardViewDelegate)));
        nearCardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
