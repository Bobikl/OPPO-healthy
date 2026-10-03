package com.heytap.nearx.uikit.widget.cardview;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes18.dex */
interface NearCardViewImpl {
    ColorStateList getBackgroundColor(NearCardViewDelegate nearCardViewDelegate);

    float getElevation(NearCardViewDelegate nearCardViewDelegate);

    float getMaxElevation(NearCardViewDelegate nearCardViewDelegate);

    float getMinHeight(NearCardViewDelegate nearCardViewDelegate);

    float getMinWidth(NearCardViewDelegate nearCardViewDelegate);

    float getRadius(NearCardViewDelegate nearCardViewDelegate);

    void initStatic();

    void initialize(NearCardViewDelegate nearCardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3);

    void onCompatPaddingChanged(NearCardViewDelegate nearCardViewDelegate);

    void onPreventCornerOverlapChanged(NearCardViewDelegate nearCardViewDelegate);

    void setBackgroundColor(NearCardViewDelegate nearCardViewDelegate, @Nullable ColorStateList colorStateList);

    void setElevation(NearCardViewDelegate nearCardViewDelegate, float f);

    void setMaxElevation(NearCardViewDelegate nearCardViewDelegate, float f);

    void setRadius(NearCardViewDelegate nearCardViewDelegate, float f);

    void updatePadding(NearCardViewDelegate nearCardViewDelegate);
}
