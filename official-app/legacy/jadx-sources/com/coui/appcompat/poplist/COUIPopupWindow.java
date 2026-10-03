package com.coui.appcompat.poplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.content.ContextCompat;
import com.oplus.aiunit.vision.byg;
import com.oplus.aiunit.vision.lh2;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.poplist.R$color;
import com.support.poplist.R$drawable;
import com.support.poplist.R$style;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPopupWindow extends PopupWindow {
    public Context a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1866c;
    public WindowSpacingControlHelper d;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), lh2.c(COUIPopupWindow.this.getContentView().getContext(), R$attr.couiRoundCornerM));
        }
    }

    public COUIPopupWindow(Context context) {
        this(context, null);
    }

    public void a(int i, WindowSpacingControlHelper.AnchorViewTypeEnum anchorViewTypeEnum) {
        this.d.a(i, anchorViewTypeEnum);
    }

    public int b(View view, WindowSpacingControlHelper.AnchorViewTypeEnum anchorViewTypeEnum) {
        if (this.d.i()) {
            return this.d.c(view, anchorViewTypeEnum);
        }
        return 0;
    }

    public int c(WindowSpacingControlHelper.AnchorViewTypeEnum anchorViewTypeEnum) {
        if (this.d.i()) {
            return this.d.d(anchorViewTypeEnum);
        }
        return 0;
    }

    public void d() {
        if (!this.b || getContentView() == null) {
            return;
        }
        setBackgroundDrawable(null);
        if (byg.a()) {
            byg.e(getContentView(), 3);
        } else {
            setElevation(this.a.getResources().getDimensionPixelSize(R$dimen.support_shadow_size_level_five));
            getContentView().setOutlineSpotShadowColor(ContextCompat.getColor(this.a, R$color.coui_popup_outline_spot_shadow_color));
        }
    }

    public void e() {
        if (!this.f1866c || getContentView() == null) {
            return;
        }
        getContentView().setOutlineProvider(new a());
        getContentView().setClipToOutline(true);
    }

    public final void f(Context context) {
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{com.support.poplist.R$attr.couiPopupWindowBackground});
        g(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setClippingEnabled(false);
        setElevation(0.0f);
        setExitTransition(null);
        setEnterTransition(null);
        setAnimationStyle(R$style.Animation_COUI_PopupListWindow);
    }

    public void g(Context context, TypedArray typedArray) {
        typedArray.getDrawable(0);
        setBackgroundDrawable(context.getResources().getDrawable(R$drawable.coui_free_bottom_alert_poplist_background));
    }

    public void h(boolean z) {
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

    public void i(boolean z) {
        this.b = z;
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        super.setContentView(view);
        e();
        d();
    }

    public COUIPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.popupWindowStyle);
    }

    public COUIPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_PopupWindow);
    }

    public COUIPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = false;
        this.f1866c = true;
        this.d = new WindowSpacingControlHelper();
        f(context);
    }
}
