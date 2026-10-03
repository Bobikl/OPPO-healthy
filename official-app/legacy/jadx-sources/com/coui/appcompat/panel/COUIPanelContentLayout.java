package com.coui.appcompat.panel;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.coui.appcompat.buttonBar.COUIButtonBarLayout;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.rne;
import com.support.panel.R$dimen;
import com.support.panel.R$drawable;
import com.support.panel.R$id;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPanelContentLayout extends LinearLayout implements rne {
    private static final Rect PANEL_OUTSETS = new Rect();
    private COUIPanelPressHelper mCOUIPanelPressHelper;
    private Rect mDisplayFrame;
    private boolean mIsLayoutAtMaxHeight;
    public boolean mIsTurnOnAnim;
    private int mPaddingBottomTemp;
    private final int mPanelHorizontalPadding;
    private boolean mPopupRuleEnable;

    public COUIPanelContentLayout(Context context) {
        this(context, null);
    }

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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setDragViewPressAnim$0(View view, boolean z, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (view != null) {
                view.setVisibility(0);
            }
            if (z) {
                this.mIsTurnOnAnim = true;
                this.mCOUIPanelPressHelper.startAnim(view);
            }
        }
        return true;
    }

    private void setSpecifyViewPaddingButton(boolean z, int i) {
        View viewFindViewById = getRootView().findViewById(R$id.coui_need_set_paddingbottom_id);
        if (viewFindViewById != null) {
            if (!z) {
                if (this.mPaddingBottomTemp != -1) {
                    viewFindViewById.setPadding(viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), this.mPaddingBottomTemp);
                    this.mPaddingBottomTemp = -1;
                    return;
                }
                return;
            }
            if (i > 0) {
                if (this.mPaddingBottomTemp == -1) {
                    this.mPaddingBottomTemp = viewFindViewById.getPaddingBottom();
                    viewFindViewById.setPadding(viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), i + this.mPaddingBottomTemp);
                    return;
                }
                return;
            }
            if (this.mPaddingBottomTemp != -1) {
                viewFindViewById.setPadding(viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingEnd(), this.mPaddingBottomTemp);
                this.mPaddingBottomTemp = -1;
            }
        }
    }

    public void addContentView(View view) {
        LinearLayout linearLayout;
        if (view == null || (linearLayout = (LinearLayout) findViewById(R$id.panel_content)) == null) {
            return;
        }
        linearLayout.setClipChildren(false);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, -1));
    }

    public void dragBgEndAnim() {
        this.mCOUIPanelPressHelper.endAnim(findViewById(R$id.tv_drag_press_bg));
    }

    @Override // com.oplus.aiunit.vision.rne
    public int getBarrierDirection() {
        return 4;
    }

    public COUIButtonBarLayout getBtnBarLayout() {
        return (COUIButtonBarLayout) findViewById(R$id.bottom_bar);
    }

    @Override // com.oplus.aiunit.vision.rne
    @NonNull
    public Rect getDisplayFrame() {
        if (this.mDisplayFrame == null) {
            this.mDisplayFrame = new Rect();
        }
        getGlobalVisibleRect(this.mDisplayFrame);
        Rect rect = this.mDisplayFrame;
        int i = rect.left;
        int i2 = this.mPanelHorizontalPadding;
        rect.left = i + i2;
        rect.right -= i2;
        return rect;
    }

    public View getDivider() {
        return findViewById(R$id.divider_line);
    }

    public View getDragBgView() {
        return findViewById(R$id.tv_drag_press_bg);
    }

    public ImageView getDragView() {
        return (ImageView) findViewById(R$id.drag_img);
    }

    public FrameLayout getDrawLayout() {
        return (FrameLayout) findViewById(R$id.drag_layout);
    }

    public boolean getLayoutAtMaxHeight() {
        return this.mIsLayoutAtMaxHeight;
    }

    public int getMaxHeight() {
        return COUIPanelMultiWindowUtils.getPanelMaxHeight(getContext(), null);
    }

    @Override // com.oplus.aiunit.vision.rne
    @NonNull
    public Rect getOutsets() {
        return PANEL_OUTSETS;
    }

    public COUIPanelBarView getPanelBarView() {
        return (COUIPanelBarView) findViewById(R$id.panel_drag_bar);
    }

    @Override // com.oplus.aiunit.vision.rne
    public boolean getPopupMenuRuleEnabled() {
        return this.mPopupRuleEnable;
    }

    @Override // com.oplus.aiunit.vision.rne
    public int getType() {
        return 2;
    }

    public void refresh() {
        findViewById(R$id.tv_drag_press_bg).setBackground(AppCompatResources.getDrawable(getContext(), R$drawable.coui_pannel_press_shadow_bg));
    }

    public void removeContentView() {
        ((LinearLayout) findViewById(R$id.panel_content)).removeAllViews();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void removeDragViewPressAnim() {
        View viewFindViewById = findViewById(R$id.tv_drag_press_bg);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(null);
        }
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

    @SuppressLint({"ClickableViewAccessibility"})
    public void setDragViewPressAnim(final boolean z) {
        final View viewFindViewById = findViewById(R$id.tv_drag_press_bg);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(null);
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.rj2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.i.lambda$setDragViewPressAnim$0(viewFindViewById, z, view, motionEvent);
                }
            });
        }
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

    @Deprecated
    public void setNavigationMargin(Configuration configuration, int i, WindowInsets windowInsets) {
        setNavigationMargin(configuration, windowInsets, true, false);
    }

    public void setPopupMenuRuleEnabled(boolean z) {
        this.mPopupRuleEnable = z;
    }

    public void setRightButton(String str, View.OnClickListener onClickListener) {
        initButton((Button) findViewById(R.id.button1), str, onClickListener);
    }

    public void setUpBottomBar(boolean z, String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2, String str3, View.OnClickListener onClickListener3) {
        setDividerVisibility(z);
        COUIButtonBarLayout cOUIButtonBarLayout = (COUIButtonBarLayout) findViewById(R$id.bottom_bar);
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            cOUIButtonBarLayout.setVisibility(8);
            return;
        }
        cOUIButtonBarLayout.setVisibility(0);
        cOUIButtonBarLayout.setVerButDividerVerMargin(getContext().getResources().getDimensionPixelOffset(R$dimen.coui_panel_bottom_bar_padding_top));
        cOUIButtonBarLayout.setVerButVerPadding(getContext().getResources().getDimensionPixelOffset(R$dimen.coui_panel_bottom_button_vertical_padding));
        cOUIButtonBarLayout.setVerPaddingBottom(getContext().getResources().getDimensionPixelOffset(R$dimen.coui_panel_bottom_bar_padding_bottom));
        cOUIButtonBarLayout.setVerButPaddingOffset(0);
        Button button = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);
        Button button3 = (Button) findViewById(R.id.button1);
        initButton(button, str, onClickListener);
        initButton(button2, str2, onClickListener2);
        initButton(button3, str3, onClickListener3);
    }

    public COUIPanelContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    public void setNavigationMargin(Configuration configuration, WindowInsets windowInsets, boolean z, boolean z2) {
        boolean zIsIsHandlePanel;
        if (Build.VERSION.SDK_INT <= 30) {
            return;
        }
        boolean zIsDisplayInUpperWindow = COUIPanelMultiWindowUtils.isDisplayInUpperWindow(COUIPanelMultiWindowUtils.contextToActivity(getContext()));
        boolean zIsInMultiWindowMode = COUIPanelMultiWindowUtils.isInMultiWindowMode(COUIPanelMultiWindowUtils.contextToActivity(getContext()));
        boolean z3 = !COUIPanelMultiWindowUtils.isSmallScreen(getContext(), null);
        int navigationBarHeight = getNavigationBarHeight(windowInsets, configuration);
        View viewFindViewById = getRootView().findViewById(R$id.coordinator);
        int i = 0;
        if (viewFindViewById != null) {
            View viewFindViewById2 = viewFindViewById.findViewById(com.support.appcompat.R$id.design_bottom_sheet);
            if (viewFindViewById2 instanceof COUIPanelPercentFrameLayout) {
                zIsIsHandlePanel = ((COUIPanelPercentFrameLayout) viewFindViewById2).isIsHandlePanel();
            } else {
                zIsIsHandlePanel = false;
            }
        } else {
            zIsIsHandlePanel = false;
        }
        if ((zIsDisplayInUpperWindow && zIsInMultiWindowMode) || !z3 || zIsIsHandlePanel) {
            i = navigationBarHeight;
            navigationBarHeight = 0;
        }
        if (COUINavigationBarUtil.isGestureNavigation(getContext())) {
            COUIViewMarginUtil.setMargin(viewFindViewById, 3, navigationBarHeight);
            setSpecifyViewPaddingButton(z, i);
        } else if (z2) {
            setSpecifyViewPaddingButton(z, i);
        }
    }

    public COUIPanelContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPopupRuleEnable = true;
        this.mCOUIPanelPressHelper = new COUIPanelPressHelper();
        this.mPanelHorizontalPadding = context.getResources().getDimensionPixelOffset(R$dimen.coui_bottom_sheet_content_horizontal_padding_with_card);
        this.mPaddingBottomTemp = -1;
    }
}
