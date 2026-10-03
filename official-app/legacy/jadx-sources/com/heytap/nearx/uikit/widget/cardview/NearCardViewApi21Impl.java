package com.heytap.nearx.uikit.widget.cardview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(21)
class NearCardViewApi21Impl implements NearCardViewImpl {
    private NearRoundRectDrawable getCardBackground(NearCardViewDelegate nearCardViewDelegate) {
        return (NearRoundRectDrawable) nearCardViewDelegate.getCardBackground();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public ColorStateList getBackgroundColor(NearCardViewDelegate nearCardViewDelegate) {
        return getCardBackground(nearCardViewDelegate).getColor();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getElevation(NearCardViewDelegate nearCardViewDelegate) {
        return nearCardViewDelegate.getCardView().getElevation();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getMaxElevation(NearCardViewDelegate nearCardViewDelegate) {
        return getCardBackground(nearCardViewDelegate).getPadding();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getMinHeight(NearCardViewDelegate nearCardViewDelegate) {
        return getRadius(nearCardViewDelegate) * 2.0f;
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getMinWidth(NearCardViewDelegate nearCardViewDelegate) {
        return getRadius(nearCardViewDelegate) * 2.0f;
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public float getRadius(NearCardViewDelegate nearCardViewDelegate) {
        return getCardBackground(nearCardViewDelegate).getRadius();
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void initStatic() {
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void initialize(NearCardViewDelegate nearCardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        nearCardViewDelegate.setCardBackground(new NearRoundRectDrawable(colorStateList, f));
        View cardView = nearCardViewDelegate.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        setMaxElevation(nearCardViewDelegate, f3);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void onCompatPaddingChanged(NearCardViewDelegate nearCardViewDelegate) {
        setMaxElevation(nearCardViewDelegate, getMaxElevation(nearCardViewDelegate));
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void onPreventCornerOverlapChanged(NearCardViewDelegate nearCardViewDelegate) {
        setMaxElevation(nearCardViewDelegate, getMaxElevation(nearCardViewDelegate));
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setBackgroundColor(NearCardViewDelegate nearCardViewDelegate, @Nullable ColorStateList colorStateList) {
        getCardBackground(nearCardViewDelegate).setColor(colorStateList);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setElevation(NearCardViewDelegate nearCardViewDelegate, float f) {
        nearCardViewDelegate.getCardView().setElevation(f);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setMaxElevation(NearCardViewDelegate nearCardViewDelegate, float f) {
        getCardBackground(nearCardViewDelegate).setPadding(f, nearCardViewDelegate.getUseCompatPadding(), nearCardViewDelegate.getPreventCornerOverlap());
        updatePadding(nearCardViewDelegate);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void setRadius(NearCardViewDelegate nearCardViewDelegate, float f) {
        getCardBackground(nearCardViewDelegate).setRadius(f);
    }

    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void updatePadding(NearCardViewDelegate nearCardViewDelegate) {
        if (!nearCardViewDelegate.getUseCompatPadding()) {
            nearCardViewDelegate.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float maxElevation = getMaxElevation(nearCardViewDelegate);
        float radius = getRadius(nearCardViewDelegate);
        int iCeil = (int) Math.ceil(NearRoundRectDrawableWithShadow.calculateHorizontalPadding(maxElevation, radius, nearCardViewDelegate.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(NearRoundRectDrawableWithShadow.calculateVerticalPadding(maxElevation, radius, nearCardViewDelegate.getPreventCornerOverlap()));
        nearCardViewDelegate.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }
}
