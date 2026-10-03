package com.heytap.nearx.uikit.widget.dialogview;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearButtonBarLayout;
import com.heytap.nearx.uikit.widget.NearMaxHeightScrollView;
import com.heytap.nearx.uikit.widget.dialogview.adapter.SummaryAdapter;
import com.heytap.nearx.uikit.widget.dialogview.widget.NearAlertDialogMaxLinearLayout;

/* JADX INFO: loaded from: classes18.dex */
public class NearAlertDialogBuilder extends AlertDialog.Builder {
    private static final int DEF_STYLE_ATTR = R$attr.alertDialogStyle;
    private static final int DEF_STYLE_RES = R$style.UikitAlertDialogBuildStyle;
    private static final int DEF_WINDOW_ANIM = R$style.Animation_Near_Dialog_Alpha;
    private static final int DEF_WINDOW_GRAVITY = 17;
    private static final String TAG = "NearAlertDialogBuilder";
    private boolean hasAdapter;
    private boolean hasMessage;
    private boolean hasSetView;
    private boolean hasTitle;
    private View mAnchorView;

    @ColorInt
    private int mBackgroundColor;
    private Drawable mBackgroundDrawable;
    private int mContentMaxWidth;
    private int mCustomContentLayoutRes;
    private AlertDialog mDialog;
    private int mDialogWindowType;
    private int mGravity;
    private boolean mIsNeedToAdaptMessageAndList;
    private DialogInterface.OnClickListener mItemClickListener;
    private CharSequence[] mItems;
    private CharSequence[] mSummaryItems;
    public int[] mTextColor;
    private int mWindowAnimStyleRes;

    public static class OutsideTouchListener implements View.OnTouchListener {
        private final Dialog dialog;
        private final int prePieSlop;

        public OutsideTouchListener(Dialog dialog) {
            this.dialog = dialog;
            this.prePieSlop = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            View viewFindViewById = view.findViewById(R$id.parentPanel);
            if (viewFindViewById == null) {
                return this.dialog.onTouchEvent(motionEvent);
            }
            if (new RectF(viewFindViewById.getLeft() + viewFindViewById.getPaddingLeft(), viewFindViewById.getTop() + viewFindViewById.getPaddingTop(), viewFindViewById.getRight() - viewFindViewById.getPaddingRight(), viewFindViewById.getBottom() - viewFindViewById.getPaddingBottom()).contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (motionEvent.getAction() == 1) {
                motionEventObtain.setAction(4);
            }
            view.performClick();
            boolean zOnTouchEvent = this.dialog.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return zOnTouchEvent;
        }
    }

    public NearAlertDialogBuilder(@NonNull Context context) {
        this(context, R$style.NearAlertDialog_Center);
        initAttrs();
    }

    private void disabledTitleScroll(AlertDialog alertDialog) {
        final NearMaxHeightScrollView nearMaxHeightScrollView = (NearMaxHeightScrollView) alertDialog.findViewById(R$id.alert_title_scroll_view);
        if (nearMaxHeightScrollView == null) {
            return;
        }
        nearMaxHeightScrollView.post(new Runnable() { // from class: com.oplus.aiunit.vision.wfc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$disabledTitleScroll$0(nearMaxHeightScrollView);
            }
        });
    }

    private void initAttrs() {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.NearAlertDialogBuilder, DEF_STYLE_ATTR, DEF_STYLE_RES);
        this.mGravity = typedArrayObtainStyledAttributes.getInt(R$styleable.NearAlertDialogBuilder_android_gravity, 17);
        this.mWindowAnimStyleRes = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearAlertDialogBuilder_windowAnimStyle, DEF_WINDOW_ANIM);
        this.mContentMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearAlertDialogBuilder_contentMaxWidth, 0);
        this.mCustomContentLayoutRes = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearAlertDialogBuilder_customContentLayout, 0);
        this.mIsNeedToAdaptMessageAndList = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearAlertDialogBuilder_isNeedToAdaptMessageAndList, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initContentMaxWidth(@NonNull Window window) {
        if (this.mContentMaxWidth <= 0) {
            return;
        }
        View viewFindViewById = window.findViewById(R$id.parentPanel);
        if (viewFindViewById instanceof NearAlertDialogMaxLinearLayout) {
            ((NearAlertDialogMaxLinearLayout) viewFindViewById).setMaxWidth(this.mContentMaxWidth);
        }
    }

    private void initCustomPanel() {
        int i;
        if (this.hasSetView || (i = this.mCustomContentLayoutRes) == 0) {
            return;
        }
        setView(i);
    }

    private void initCustomPanelVisibility(@NonNull Window window) {
        if (this.hasSetView) {
            ViewGroup viewGroup = (ViewGroup) window.findViewById(R$id.customPanel);
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = (ViewGroup) window.findViewById(R$id.custom);
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
        }
    }

    private void initDialogBackground(@NonNull Window window) {
        if (this.mBackgroundColor != -1) {
            window.findViewById(R$id.rootView).setBackgroundColor(this.mBackgroundColor);
        } else if (this.mBackgroundDrawable != null) {
            window.findViewById(R$id.rootView).setBackground(this.mBackgroundDrawable);
        }
    }

    private void initListPanel(@NonNull Window window) {
        ViewGroup viewGroup = (ViewGroup) window.findViewById(R$id.listPanel);
        AlertDialog alertDialog = this.mDialog;
        ListView listView = alertDialog != null ? alertDialog.getListView() : null;
        if (listView != null) {
            listView.setScrollIndicators(0);
        }
        boolean z = (!this.hasMessage || viewGroup == null || listView == null) ? false : true;
        if (z) {
            viewGroup.addView(listView, new ViewGroup.LayoutParams(-1, -1));
        }
        View view = (ViewGroup) window.findViewById(R$id.scrollView);
        if (view != null) {
            view.setScrollIndicators(0);
            if (this.mIsNeedToAdaptMessageAndList && z) {
                setViewHorizontalWeight(view, 1);
                setViewHorizontalWeight(viewGroup, 1);
            }
        }
    }

    private void initSingleContentPadding(@NonNull Window window) {
        View viewFindViewById = window.findViewById(R$id.buttonPanel);
        if (!(viewFindViewById instanceof NearButtonBarLayout) || viewFindViewById.getVisibility() == 8) {
            return;
        }
        int i = window.getAttributes().gravity;
        NearButtonBarLayout nearButtonBarLayout = (NearButtonBarLayout) viewFindViewById;
        int buttonCount = nearButtonBarLayout.getButtonCount();
        CharSequence[] charSequenceArr = this.mItems;
        boolean z = this.hasTitle || this.hasMessage || this.hasSetView || this.hasAdapter || (charSequenceArr != null && charSequenceArr.length > 0);
        boolean z2 = buttonCount == 1;
        boolean z3 = (i == 17 || i == 80) ? false : true;
        if (z2 && z3 && this.mAnchorView != null) {
            if (z) {
                nearButtonBarLayout.setSingleNeuBtnPaddingBottomOffsetIfHasAboveContent(getContext().getResources().getDimensionPixelOffset(R$dimen.nx_free_alert_dialog_single_btn_padding_bottom_offset));
            } else {
                nearButtonBarLayout.setVerButVerPadding(getContext().getResources().getDimensionPixelOffset(R$dimen.nx_free_alert_dialog_single_btn_padding_vertical));
                nearButtonBarLayout.setVerButPaddingOffset(0);
            }
        }
    }

    private void initWindow(@NonNull Window window) {
        View view = this.mAnchorView;
        if (view != null) {
            NearBottomAlertDialogAdjustUtil.adjustToFree(window, view);
            window.getDecorView().setVisibility(4);
        } else {
            window.setGravity(this.mGravity);
            window.setWindowAnimations(this.mWindowAnimStyleRes);
        }
        window.getDecorView().setOnTouchListener(new OutsideTouchListener(this.mDialog));
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = this.mDialogWindowType;
        if (i > 0) {
            attributes.type = i;
        }
        attributes.width = this.mAnchorView != null ? -2 : -1;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disabledTitleScroll$0(NearMaxHeightScrollView nearMaxHeightScrollView) {
        if (nearMaxHeightScrollView.getHeight() < nearMaxHeightScrollView.getMaxHeight()) {
            nearMaxHeightScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.NearAlertDialogBuilder.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
    }

    private void setViewHorizontalWeight(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams.height = 0;
            ((LinearLayout.LayoutParams) layoutParams).weight = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static Context wrapColorContext(@NonNull Context context, int i, int i2) {
        return new ContextThemeWrapper(new ContextThemeWrapper(context, i), i2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @Deprecated
    public AlertDialog create() {
        initCustomPanel();
        initAdapter();
        AlertDialog alertDialogCreate = super.create();
        this.mDialog = alertDialogCreate;
        initWindow(alertDialogCreate.getWindow());
        return this.mDialog;
    }

    public void initAdapter() {
        if (this.hasAdapter) {
            return;
        }
        CharSequence[] charSequenceArr = this.mItems;
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            setAdapter((ListAdapter) new SummaryAdapter(getContext(), this.hasTitle, this.hasMessage, this.mItems, this.mSummaryItems, this.mTextColor), this.mItemClickListener);
        }
    }

    public NearAlertDialogBuilder setBackgroundColor(@ColorInt int i) {
        this.mBackgroundColor = i;
        return this;
    }

    public NearAlertDialogBuilder setBackgroundDrawable(Drawable drawable) {
        this.mBackgroundDrawable = drawable;
        return this;
    }

    public NearAlertDialogBuilder setNeedToAdaptMessageAndList(boolean z) {
        this.mIsNeedToAdaptMessageAndList = z;
        return this;
    }

    public NearAlertDialogBuilder setSummaryItems(int i) {
        this.mSummaryItems = getContext().getResources().getTextArray(i);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog.Builder setView(int i) {
        this.hasSetView = true;
        return super.setView(i);
    }

    public NearAlertDialogBuilder setWindowAnimStyle(int i) {
        this.mWindowAnimStyleRes = i;
        return this;
    }

    public NearAlertDialogBuilder setWindowGravity(int i) {
        this.mGravity = i;
        return this;
    }

    public NearAlertDialogBuilder setWindowType(int i) {
        this.mDialogWindowType = i;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog show() {
        return show(null);
    }

    public void updateViewAfterShown() {
        AlertDialog alertDialog = this.mDialog;
        if (alertDialog == null) {
            return;
        }
        initDialogBackground(alertDialog.getWindow());
        initCustomPanelVisibility(this.mDialog.getWindow());
        initListPanel(this.mDialog.getWindow());
        initContentMaxWidth(this.mDialog.getWindow());
        initSingleContentPadding(this.mDialog.getWindow());
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.hasAdapter = listAdapter != null;
        super.setAdapter(listAdapter, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        this.hasAdapter = listAdapter != null;
        super.setSingleChoiceItems(listAdapter, i, onClickListener);
        return this;
    }

    public NearAlertDialogBuilder setSummaryItems(CharSequence[] charSequenceArr) {
        this.mSummaryItems = charSequenceArr;
        return this;
    }

    public AlertDialog show(View view) {
        this.mAnchorView = view;
        AlertDialog alertDialogShow = super.show();
        disabledTitleScroll(alertDialogShow);
        updateViewAfterShown();
        return alertDialogShow;
    }

    public NearAlertDialogBuilder(@NonNull Context context, int i) {
        super(new ContextThemeWrapper(context, i));
        this.hasTitle = false;
        this.hasMessage = false;
        this.hasAdapter = false;
        this.hasSetView = false;
        this.mDialogWindowType = 0;
        this.mBackgroundColor = -1;
        this.mBackgroundDrawable = null;
        this.mAnchorView = null;
        initAttrs();
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setItems(int i, DialogInterface.OnClickListener onClickListener) {
        this.mItems = getContext().getResources().getTextArray(i);
        this.mItemClickListener = onClickListener;
        super.setItems(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setMessage(CharSequence charSequence) {
        this.hasMessage = !TextUtils.isEmpty(charSequence);
        super.setMessage(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setTitle(CharSequence charSequence) {
        this.hasTitle = !TextUtils.isEmpty(charSequence);
        super.setTitle(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog.Builder setView(View view) {
        this.hasSetView = true;
        return super.setView(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setMessage(int i) {
        this.hasMessage = !TextUtils.isEmpty(getContext().getString(i));
        super.setMessage(i);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setTitle(int i) {
        this.hasTitle = !TextUtils.isEmpty(getContext().getString(i));
        super.setTitle(i);
        return this;
    }

    @NonNull
    @Deprecated
    public AlertDialog create(View view) {
        this.mAnchorView = view;
        return create();
    }

    public NearAlertDialogBuilder setItems(int i, DialogInterface.OnClickListener onClickListener, int[] iArr) {
        this.mItems = getContext().getResources().getTextArray(i);
        this.mItemClickListener = onClickListener;
        this.mTextColor = iArr;
        super.setItems(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public NearAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.mItems = charSequenceArr;
        this.mItemClickListener = onClickListener;
        super.setItems(charSequenceArr, onClickListener);
        return this;
    }

    public NearAlertDialogBuilder(@NonNull Context context, int i, int i2) {
        super(wrapColorContext(context, i, i2));
        this.hasTitle = false;
        this.hasMessage = false;
        this.hasAdapter = false;
        this.hasSetView = false;
        this.mDialogWindowType = 0;
        this.mBackgroundColor = -1;
        this.mBackgroundDrawable = null;
        this.mAnchorView = null;
        initAttrs();
    }
}
