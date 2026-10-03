package com.heytap.nearx.uikit.widget.poplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.PopupWindow;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$style;

/* JADX INFO: loaded from: classes18.dex */
public class NearPopupWindow extends PopupWindow {
    public NearPopupWindow(Context context) {
        this(context, null);
    }

    private void initPopupWindow(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R$attr.nxPopupWindowBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = context.getResources().getDrawable(R$drawable.nx_popup_window_bg);
        }
        setBackgroundDrawable(drawable);
        typedArrayObtainStyledAttributes.recycle();
        setClippingEnabled(false);
        setElevation(0.0f);
        setExitTransition(null);
        setEnterTransition(null);
        setAnimationStyle(R$style.Animation_Near_PopupListWindow);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(final View view) {
        super.setContentView(view);
        if (view != null) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.nearx.uikit.widget.poplist.NearPopupWindow.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), view.getContext().getResources().getDimensionPixelOffset(R$dimen.nx_popup_list_window_content_radius));
                }
            });
            view.setClipToOutline(true);
        }
    }

    public void setDismissTouchOutside(boolean z) {
        if (z) {
            setTouchable(true);
            setFocusable(true);
            setOutsideTouchable(true);
        } else {
            setFocusable(false);
            setOutsideTouchable(false);
        }
        update();
    }

    public NearPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.popupWindowStyle);
    }

    public NearPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearPopupWindow(View view, int i, int i2) {
        this(view, i, i2, false);
    }

    public NearPopupWindow(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        initPopupWindow(view.getContext());
    }

    public NearPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initPopupWindow(context);
    }
}
