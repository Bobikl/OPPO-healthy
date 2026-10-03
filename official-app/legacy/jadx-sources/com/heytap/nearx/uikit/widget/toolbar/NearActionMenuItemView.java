package com.heytap.nearx.uikit.widget.toolbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"RestrictedApi"})
public class NearActionMenuItemView extends ActionMenuItemView {
    private int mMarginEnd;
    private int mPaddingHorizontal;
    private int mPaddingVertical;
    private int mTextPaddingHorizontal;
    private int mTextPaddingVertical;

    public NearActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView, androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        super.initialize(menuItemImpl, i);
        boolean z = menuItemImpl.getIcon() == null;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = z ? -2 : -1;
        if (!z && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(this.mMarginEnd);
        }
        setLayoutParams(layoutParams);
        setBackgroundResource(z ? R$drawable.nx_toolbar_text_menu_bg : R$drawable.nx_toolbar_menu_bg);
        if (z) {
            int i2 = this.mTextPaddingHorizontal;
            int i3 = this.mTextPaddingVertical;
            setPadding(i2, i3, i2, i3);
        } else {
            int i4 = this.mPaddingHorizontal;
            int i5 = this.mPaddingVertical;
            setPadding(i4, i5, i4, i5);
        }
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView, android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MenuItemImpl mItemData = getMItemData();
        if (mItemData == null || mItemData.getIcon() == null) {
            return;
        }
        this.mMarginEnd = getContext().createConfigurationContext(configuration).getResources().getDimensionPixelSize(R$dimen.nx_action_menu_item_view_margin_end);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(this.mMarginEnd);
        }
    }

    public NearActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaddingHorizontal = context.getResources().getDimensionPixelSize(R$dimen.nx_toolbar_menu_bg_padding_horizontal);
        this.mPaddingVertical = context.getResources().getDimensionPixelSize(R$dimen.nx_toolbar_menu_bg_padding_vertical);
        this.mTextPaddingHorizontal = context.getResources().getDimensionPixelSize(R$dimen.nx_toolbar_text_menu_bg_padding_horizontal);
        this.mTextPaddingVertical = context.getResources().getDimensionPixelSize(R$dimen.nx_toolbar_text_menu_bg_padding_vertical);
        this.mMarginEnd = context.getResources().getDimensionPixelSize(R$dimen.nx_action_menu_item_view_margin_end);
    }
}
