package com.coui.appcompat.panel;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.oplus.aiunit.vision.lh2;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$anim;
import com.support.appcompat.R$color;
import com.support.panel.R$dimen;
import com.support.panel.R$drawable;
import com.support.panel.R$id;
import com.support.panel.R$layout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPanelFragment extends Fragment implements Serializable {
    private static final long ENTER_MASK_ALPHA_ANIM_DURATION = 350;
    private static final long EXIT_MASK_ALPHA_ANIM_DURATION = 300;
    private static final long MASK_ALPHA = 255;
    private static final String SAVE_IS_IN_TINY_SCREEN_PANEL_KEY = "SAVE_IS_IN_TINY_SCREEN_PANEL_KEY";
    private static final String SAVE_IS_SHOW_IN_FIRST_PANEL_KEY = "SAVE_IS_SHOW_IN_FIRST_PANEL_KEY";
    private View mContentView;
    private DialogInterface.OnKeyListener mDialogOnKeyListener;
    private COUIPanelDragListener mDragPanelListener;
    private View mDragView;
    protected boolean mIsInTinyScreen;
    private Boolean mIsShowOnFirstPanel = Boolean.FALSE;
    private COUIBottomSheetDialog.OnBackInvokedLocalListener mOnBackInvokedLocalListener;
    private View.OnTouchListener mOutSideViewOnTouchListener;
    private COUIPanelBarView mPanelBarView;
    private PanelFragmentAnimationListener mPanelFragmentAnimationListener;
    private COUIPanelContentLayout mPanelView;
    private View mTitleView;
    private FrameLayout mTitleViewLayout;
    private COUIToolbar mToolbar;
    private static final Interpolator ENTER_MASK_ALPHA_ANIM_INTERPOLATOR = new PathInterpolator(0.3f, 0.26f, 0.4f, 1.0f);
    private static final Interpolator EXIT_MASK_ALPHA_ANIM_INTERPOLATOR = new PathInterpolator(0.3f, 0.15f, 0.3f, 1.0f);

    public interface PanelFragmentAnimationListener {
        void onAnimationEnd();
    }

    private void ensurePanelView() {
        if (this.mPanelView == null) {
            this.mPanelView = (COUIPanelContentLayout) getLayoutInflater().inflate(this.mIsInTinyScreen ? R$layout.coui_panel_view_layout_tiny : R$layout.coui_panel_view_layout, (ViewGroup) null);
        }
    }

    private void setBottomButtonBar(String str, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2, String str3, View.OnClickListener onClickListener3) {
        ensurePanelView();
        this.mPanelView.setUpBottomBar(true, str, onClickListener, str2, onClickListener2, str3, onClickListener3);
    }

    public Button getCenterButton() {
        COUIPanelContentLayout cOUIPanelContentLayout = this.mPanelView;
        if (cOUIPanelContentLayout != null) {
            return (Button) cOUIPanelContentLayout.findViewById(R.id.button3);
        }
        return null;
    }

    public int getContentResId() {
        return R$id.panel_container;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public DialogInterface.OnKeyListener getDialogOnKeyListener() {
        return this.mDialogOnKeyListener;
    }

    public COUIPanelDragListener getDragPanelListener() {
        return this.mDragPanelListener;
    }

    public View getDragView() {
        return this.mDragView;
    }

    public int getDragViewHeight() {
        View view = this.mDragView;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    public COUIPanelContentLayout getDraggableLinearLayout() {
        return this.mPanelView;
    }

    public Button getLeftButton() {
        COUIPanelContentLayout cOUIPanelContentLayout = this.mPanelView;
        if (cOUIPanelContentLayout != null) {
            return (Button) cOUIPanelContentLayout.findViewById(R.id.button2);
        }
        return null;
    }

    public COUIBottomSheetDialog.OnBackInvokedLocalListener getOnBackInvokedLocalListener() {
        return this.mOnBackInvokedLocalListener;
    }

    public View.OnTouchListener getOutSideViewOnTouchListener() {
        return this.mOutSideViewOnTouchListener;
    }

    public COUIPanelBarView getPanelBarView() {
        return this.mPanelBarView;
    }

    public Button getRightButton() {
        COUIPanelContentLayout cOUIPanelContentLayout = this.mPanelView;
        if (cOUIPanelContentLayout != null) {
            return (Button) cOUIPanelContentLayout.findViewById(R.id.button1);
        }
        return null;
    }

    public Boolean getShowOnFirstPanel() {
        return this.mIsShowOnFirstPanel;
    }

    public View getTitleView() {
        return this.mTitleView;
    }

    public COUIToolbar getToolbar() {
        return this.mToolbar;
    }

    public int getToolbarHeight() {
        COUIToolbar cOUIToolbar = this.mToolbar;
        if (cOUIToolbar != null) {
            return cOUIToolbar.getHeight();
        }
        return 0;
    }

    public void hideDragView() {
        ViewGroup.LayoutParams layoutParams = getDragView().getLayoutParams();
        layoutParams.height = getDragView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_panel_drag_view_hide_height);
        getDragView().setVisibility(4);
        getDragView().setLayoutParams(layoutParams);
    }

    public void initView(View view) {
    }

    public void onAbandon(Boolean bool) {
        setPanelDragListener(null);
        setDialogOnKeyListener(null);
        setOnBackInvokedLocalListener(null);
        setOutSideViewOnTouchListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.mIsShowOnFirstPanel = Boolean.valueOf(bundle.getBoolean(SAVE_IS_SHOW_IN_FIRST_PANEL_KEY, false));
            if (getParentFragment() instanceof COUIBottomSheetDialogFragment) {
                ((COUIBottomSheetDialogFragment) getParentFragment()).setPanelFragment(this, this.mIsShowOnFirstPanel);
            }
        }
        initView(this.mPanelView);
    }

    public void onAdd(Boolean bool) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        final ValueAnimator valueAnimatorOfFloat;
        Animation animationLoadAnimation;
        final Drawable drawable = getContext().getDrawable(R$drawable.coui_default_panel_bg_without_shadow);
        drawable.setTint(lh2.h(getContext(), R$color.coui_color_mask));
        drawable.setAlpha(0);
        if (i2 == R$anim.coui_open_slide_exit) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(EXIT_MASK_ALPHA_ANIM_INTERPOLATOR);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIPanelFragment.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    drawable.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                }
            });
            animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), i2);
        } else {
            valueAnimatorOfFloat = null;
            animationLoadAnimation = null;
        }
        if (i2 == R$anim.coui_close_slide_enter) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(ENTER_MASK_ALPHA_ANIM_DURATION);
            valueAnimatorOfFloat.setInterpolator(ENTER_MASK_ALPHA_ANIM_INTERPOLATOR);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIPanelFragment.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    drawable.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIPanelFragment.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (COUIPanelFragment.this.mPanelFragmentAnimationListener != null) {
                        COUIPanelFragment.this.mPanelFragmentAnimationListener.onAnimationEnd();
                    }
                }
            });
            animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), i2);
        }
        if (valueAnimatorOfFloat == null || animationLoadAnimation == null) {
            return super.onCreateAnimation(i, z, i2);
        }
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.coui.appcompat.panel.COUIPanelFragment.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                COUIPanelFragment.this.mPanelView.setForeground(null);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                COUIPanelFragment.this.mPanelView.setForeground(drawable);
                valueAnimatorOfFloat.start();
            }
        });
        return animationLoadAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (bundle != null) {
            this.mIsInTinyScreen = bundle.getBoolean(SAVE_IS_IN_TINY_SCREEN_PANEL_KEY, false);
        }
        COUIPanelContentLayout cOUIPanelContentLayout = (COUIPanelContentLayout) getLayoutInflater().inflate(this.mIsInTinyScreen ? R$layout.coui_panel_view_layout_tiny : R$layout.coui_panel_view_layout, (ViewGroup) null);
        this.mPanelView = cOUIPanelContentLayout;
        cOUIPanelContentLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mDragView = this.mPanelView.getDragView();
        this.mPanelBarView = this.mPanelView.getPanelBarView();
        View viewInflate = layoutInflater.inflate(R$layout.coui_panel_layout, viewGroup, false);
        this.mToolbar = (COUIToolbar) viewInflate.findViewById(R$id.bottom_sheet_toolbar);
        this.mTitleViewLayout = (FrameLayout) viewInflate.findViewById(R$id.title_view_container);
        this.mContentView = viewInflate.findViewById(getContentResId());
        this.mPanelView.addContentView(viewInflate);
        return this.mPanelView;
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentTrackHelper.trackOnHiddenChanged(this, z);
    }

    public void onHide(Boolean bool) {
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onPause() {
        super.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onResume() {
        super.onResume();
        FragmentTrackHelper.trackFragmentResume(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(SAVE_IS_SHOW_IN_FIRST_PANEL_KEY, this.mIsShowOnFirstPanel.booleanValue());
        bundle.putBoolean(SAVE_IS_IN_TINY_SCREEN_PANEL_KEY, this.mIsInTinyScreen);
    }

    public void onShow(Boolean bool) {
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    public void setContentView(View view) {
        this.mContentView = view;
    }

    public void setDialogOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.mDialogOnKeyListener = onKeyListener;
    }

    public void setIsInTinyScreen(boolean z) {
        this.mIsInTinyScreen = z;
    }

    public void setOnBackInvokedLocalListener(COUIBottomSheetDialog.OnBackInvokedLocalListener onBackInvokedLocalListener) {
        this.mOnBackInvokedLocalListener = onBackInvokedLocalListener;
    }

    public void setOutSideViewOnTouchListener(View.OnTouchListener onTouchListener) {
        this.mOutSideViewOnTouchListener = onTouchListener;
    }

    public void setPanelDragListener(COUIPanelDragListener cOUIPanelDragListener) {
        this.mDragPanelListener = cOUIPanelDragListener;
    }

    public void setPanelFragmentAnimationListener(PanelFragmentAnimationListener panelFragmentAnimationListener) {
        this.mPanelFragmentAnimationListener = panelFragmentAnimationListener;
    }

    public void setShowOnFirstPanel(Boolean bool) {
        this.mIsShowOnFirstPanel = bool;
    }

    public void setTitleView(int i) {
        if (i > 0) {
            setTitleView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.mTitleViewLayout, false));
        }
    }

    public void setToolbar(COUIToolbar cOUIToolbar) {
        if (cOUIToolbar == null || this.mToolbar == null) {
            return;
        }
        this.mTitleViewLayout.setVisibility(8);
        this.mToolbar.setVisibility(0);
        this.mToolbar = cOUIToolbar;
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentTrackHelper.trackFragmentSetUserVisibleHint(this, z);
    }

    public void showDragView() {
        ViewGroup.LayoutParams layoutParams = getDragView().getLayoutParams();
        layoutParams.height = getDragView().getContext().getResources().getDimensionPixelSize(R$dimen.coui_panel_drag_view_height);
        getDragView().setVisibility(0);
        getDragView().setLayoutParams(layoutParams);
    }

    public void setTitleView(View view) {
        this.mTitleView = view;
        if (this.mTitleViewLayout == null || view == null || view.getVisibility() == 8) {
            return;
        }
        this.mToolbar.setVisibility(8);
        this.mTitleViewLayout.setVisibility(0);
        this.mTitleView = view;
        this.mTitleViewLayout.addView(view);
    }
}
