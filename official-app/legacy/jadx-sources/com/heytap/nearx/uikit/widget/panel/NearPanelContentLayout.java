package com.heytap.nearx.uikit.widget.panel;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.nearx.uikit.R$bool;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.widget.NearButtonBarLayout;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.dmc;

/* JADX INFO: loaded from: classes18.dex */
public class NearPanelContentLayout extends LinearLayout {
    private static final int NAV_STATE_SWIPE_SIDE_GESTURE = 3;
    private boolean mIsLayoutAtMaxHeight;

    public NearPanelContentLayout(Context context) {
        this(context, null);
    }

    @SuppressLint({"NewApi"})
    private int getNavigationBarHeight(WindowInsets windowInsets, Configuration configuration) {
        if (windowInsets != null) {
            return windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
        }
        int identifier = getContext().getResources().getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        return configuration != null ? getContext().createConfigurationContext(configuration).getResources().getDimensionPixelSize(identifier) : getContext().getResources().getDimensionPixelSize(identifier);
    }

    private void initButton(Button button, String str, View.OnClickListener onClickListener) {
        if (button != null) {
            if (TextUtils.isEmpty(str)) {
                button.setVisibility(8);
                return;
            }
            button.setVisibility(0);
            button.setText(str);
            button.setOnClickListener(onClickListener);
        }
    }

    private boolean isBigScreen(Configuration configuration) {
        return configuration == null ? getContext().getResources().getBoolean(R$bool.is_nx_bottom_sheet_dialog_in_big_screen) : getContext().createConfigurationContext(configuration).getResources().getBoolean(R$bool.is_nx_bottom_sheet_dialog_in_big_screen);
    }

    public void addContentView(View view) {
        if (view != null) {
            ((LinearLayout) findViewById(R$id.panel_content)).addView(view, new LinearLayout.LayoutParams(-1, -1));
        }
    }

    public NearButtonBarLayout getBtnBarLayout() {
        return (NearButtonBarLayout) findViewById(R$id.bottom_bar);
    }

    public View getDivider() {
        return findViewById(R$id.divider_line);
    }

    public ImageView getDragView() {
        return (ImageView) findViewById(R$id.drag_img);
    }

    public boolean getLayoutAtMaxHeight() {
        return this.mIsLayoutAtMaxHeight;
    }

    public int getMaxHeight() {
        return NearPanelMultiWindowUtils.getPanelMaxHeight(getContext(), null);
    }

    public NearPanelBarView getPanelBarView() {
        return (NearPanelBarView) findViewById(R$id.panel_drag_bar);
    }

    public void removeContentView() {
        ((LinearLayout) findViewById(R$id.panel_content)).removeAllViews();
    }

    public void setCenterButton(String str, View.OnClickListener onClickListener) {
        initButton((Button) findViewById(R.id.button3), str, onClickListener);
    }

    public void setDividerVisibility(boolean z) {
        View viewFindViewById = findViewById(R$id.divider_line);
        if (z) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
    }

    public void setDragViewDrawable(Drawable drawable) {
        if (drawable != null) {
            ((ImageView) findViewById(R$id.drag_img)).setImageDrawable(drawable);
        }
    }

    public void setDragViewDrawableTintColor(int i) {
        ((AppCompatImageView) findViewById(R$id.drag_img)).getDrawable().setTint(i);
    }

    public void setLayoutAtMaxHeight(boolean z) {
        this.mIsLayoutAtMaxHeight = z;
        if (z) {
            getLayoutParams().height = -1;
        } else {
            getLayoutParams().height = -2;
        }
        requestLayout();
    }

    public void setLeftButton(String str, View.OnClickListener onClickListener) {
        initButton((Button) findViewById(R.id.button2), str, onClickListener);
    }

    public void setNavigationMargin(Configuration configuration, int i, WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT <= 30) {
            return;
        }
        int i2 = 0;
        if (Settings.Secure.getInt(getContext().getContentResolver(), "hide_navigationbar_enable", 0) == 3) {
            boolean zIsDisplayInUpperWindow = NearPanelMultiWindowUtils.isDisplayInUpperWindow(NearPanelMultiWindowUtils.contextToActivity(getContext()));
            boolean zIsInMultiWindowMode = NearPanelMultiWindowUtils.isInMultiWindowMode(NearPanelMultiWindowUtils.contextToActivity(getContext()));
            boolean zIsBigScreen = isBigScreen(configuration);
            int navigationBarHeight = getNavigationBarHeight(windowInsets, configuration);
            if (zIsDisplayInUpperWindow && zIsInMultiWindowMode) {
                navigationBarHeight = 0;
            } else if (!zIsBigScreen) {
                i2 = navigationBarHeight;
                navigationBarHeight = 0;
            }
            View viewFindViewById = findViewById(R$id.panel_content);
            View viewFindViewById2 = viewFindViewById.getRootView().findViewById(R$id.coordinator);
            dmc.b(viewFindViewById, 3, i2);
            dmc.b(viewFindViewById2, 3, navigationBarHeight);
        }
    }

    public void setRightButton(String str, View.OnClickListener onClickListener) {
        initButton((Button) findViewById(R.id.button1), str, onClickListener);
    }

    public void setUpBottomBar(boolean z, String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2, String str3, View.OnClickListener onClickListener3) {
        setDividerVisibility(z);
        NearButtonBarLayout nearButtonBarLayout = (NearButtonBarLayout) findViewById(R$id.bottom_bar);
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            nearButtonBarLayout.setVisibility(8);
            return;
        }
        nearButtonBarLayout.setVisibility(0);
        nearButtonBarLayout.setVerButDividerVerMargin(getContext().getResources().getDimensionPixelOffset(R$dimen.nx_panel_bottom_bar_padding_top));
        nearButtonBarLayout.setVerButVerPadding(getContext().getResources().getDimensionPixelOffset(R$dimen.nx_panel_bottom_button_vertical_padding));
        nearButtonBarLayout.setVerPaddingBottom(getContext().getResources().getDimensionPixelOffset(R$dimen.nx_panel_bottom_bar_padding_bottom));
        nearButtonBarLayout.setVerButPaddingOffset(0);
        Button button = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);
        Button button3 = (Button) findViewById(R.id.button1);
        initButton(button, str, onClickListener);
        initButton(button2, str2, onClickListener2);
        initButton(button3, str3, onClickListener3);
    }

    public NearPanelContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPanelContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
