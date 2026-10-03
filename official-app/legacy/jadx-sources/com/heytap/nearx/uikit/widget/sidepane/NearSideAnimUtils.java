package com.heytap.nearx.uikit.widget.sidepane;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.heytap.nearx.uikit.R$dimen;

/* JADX INFO: loaded from: classes18.dex */
public class NearSideAnimUtils {
    private static final float START_EDIT_ICON_ALPHA_OFFSET = 0.9f;

    public static void makeFirstEditIconAnim(float f, View view, Context context) {
        if (f > 1.0f || f < 0.0f) {
            return;
        }
        if (f >= 0.9f) {
            view.setAlpha((f - 0.9f) / 0.100000024f);
            view.setVisibility(0);
        } else {
            view.setAlpha(0.0f);
            view.setVisibility(8);
        }
    }

    public static void makeSecToolbarAnim(float f, View view, Context context) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart((int) (context.getResources().getDimensionPixelOffset(R$dimen.nx_side_pane_layout_toolbar_margin_start) * (1.0f - f)));
        }
    }

    public static void restoreInstanceToolbar(NearSidePaneLayout nearSidePaneLayout, View view, Context context) {
        if (nearSidePaneLayout.isOpen()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(context.getResources().getDimensionPixelOffset(R$dimen.nx_side_pane_layout_toolbar_margin_start));
        }
    }
}
