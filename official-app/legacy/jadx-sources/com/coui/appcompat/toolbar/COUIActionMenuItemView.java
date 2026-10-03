package com.coui.appcompat.toolbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TooltipCompat;
import com.oplus.aiunit.vision.fj2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.rm2;
import com.support.toolbar.R$dimen;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"RestrictedApi"})
public class COUIActionMenuItemView extends ActionMenuItemView {
    private static final String TAG = "COUIActionMenuItemView";
    private int mIconMenuMinWidth;
    private boolean mIsText;
    private int mMarginEnd;
    private fj2 mMaskRippleDrawable;
    private int mPaddingHorizontal;
    private int mPaddingVertical;
    private int mTextMenuItemMaxWidth;
    private int mTextPaddingHorizontal;
    private int mTextPaddingVertical;

    public COUIActionMenuItemView(Context context) {
        this(context, null);
    }

    private void configMenuIconBackground() {
        fj2 fj2Var = new fj2(getContext());
        this.mMaskRippleDrawable = fj2Var;
        fj2Var.u(fj2.t(getContext(), 0));
        setBackground(this.mMaskRippleDrawable);
        ph2.c(this, false);
    }

    private void setReflectField(Class cls, Object obj, String str, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e2) {
            Log.e(TAG, "setReflectField error: " + e2.getMessage());
        }
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView, androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        super.initialize(menuItemImpl, i);
        this.mIsText = menuItemImpl.getIcon() == null;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (this.mIsText) {
            rm2.b(this);
            setMaxWidth(this.mTextMenuItemMaxWidth);
        } else {
            setReflectField(ActionMenuItemView.class, this, "mMinWidth", Integer.valueOf(this.mIconMenuMinWidth));
            configMenuIconBackground();
            int i2 = this.mPaddingHorizontal;
            int i3 = this.mPaddingVertical;
            setPadding(i2, i3, i2, i3);
        }
        boolean z = this.mIsText;
        layoutParams.height = z ? -2 : -1;
        if (!z && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(this.mMarginEnd);
        }
        setLayoutParams(layoutParams);
    }

    public boolean isTextMenuItem() {
        return this.mIsText;
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView, android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MenuItemImpl mItemData = getMItemData();
        if (mItemData == null || mItemData.getIcon() == null) {
            return;
        }
        this.mMarginEnd = getContext().createConfigurationContext(configuration).getResources().getDimensionPixelSize(R$dimen.coui_action_menu_item_view_margin_end);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(this.mMarginEnd);
        }
        TooltipCompat.setTooltipText(this, null);
    }

    public void refresh() {
        fj2 fj2Var = this.mMaskRippleDrawable;
        if (fj2Var != null) {
            fj2Var.h(getContext());
        }
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView, androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        super.setIcon(drawable);
        TooltipCompat.setTooltipText(this, null);
    }

    public void setItemWithGap(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.mIsText && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            if (z) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(this.mMarginEnd);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
            }
        }
        setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView, androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        TooltipCompat.setTooltipText(this, null);
    }

    public COUIActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaddingHorizontal = context.getResources().getDimensionPixelSize(R$dimen.coui_toolbar_menu_bg_padding_horizontal);
        this.mPaddingVertical = context.getResources().getDimensionPixelSize(R$dimen.coui_toolbar_menu_bg_padding_vertical);
        this.mTextPaddingHorizontal = context.getResources().getDimensionPixelSize(R$dimen.coui_toolbar_text_menu_bg_padding_horizontal);
        this.mTextPaddingVertical = context.getResources().getDimensionPixelSize(R$dimen.coui_toolbar_text_menu_bg_padding_vertical);
        this.mMarginEnd = context.getResources().getDimensionPixelSize(R$dimen.coui_action_menu_item_view_margin_end);
        this.mIconMenuMinWidth = context.getResources().getDimensionPixelSize(R$dimen.coui_action_menu_item_min_width);
        this.mTextMenuItemMaxWidth = context.getResources().getDimensionPixelSize(R$dimen.coui_action_bar_text_menu_item_max_width);
    }
}
