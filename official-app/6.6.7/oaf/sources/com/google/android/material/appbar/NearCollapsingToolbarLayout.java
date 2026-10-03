package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.CollapsingTextHelper;
import com.heytap.nearx.uikit.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class NearCollapsingToolbarLayout extends CollapsingToolbarLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final String ELLIPSIS_NORMAL = "…";
    private static final String ELLIPSIS_TWO_DOTS = "‥";
    private static final boolean IS_DEBUG = false;
    private static final String TAG = "NearCollapsingToolbar";
    private static final PathInterpolator TITLE_PATH_INTERPOLATOR = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    private Rect mCollapsedBounds;
    private int mCollapsedSubtitleMarginTopIfNotHidden;
    private RectF mCurrentBounds;
    private Rect mExpandedBounds;
    private View mIconView;
    private ViewTreeObserver.OnGlobalLayoutListener mIconViewFirstLayoutListener;
    private StaticLayout mTextLayout;
    private TextPaint mTextPaint;
    private int mTitleTranslateOffset;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private OnToolbarLayoutScrollStateListener onToolbarLayoutScrollStateListener;

    public NearCollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void addIconView() {
        View view = this.mIconView;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CollapsingToolbarLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.LayoutParams) layoutParams)).gravity = 8388691;
        }
        addView(this.mIconView, getChildCount());
        this.mIconView.getViewTreeObserver().addOnGlobalLayoutListener(this.mIconViewFirstLayoutListener);
    }

    private int calculateCollapsedBound() {
        View viewFindSubtitleContentView;
        int measuredHeight;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (!(viewGroup instanceof NearCollapsableAppBarLayout)) {
            return 0;
        }
        NearCollapsableAppBarLayout nearCollapsableAppBarLayout = (NearCollapsableAppBarLayout) viewGroup;
        if (nearCollapsableAppBarLayout.isSubtitleHideEnable() || (viewFindSubtitleContentView = nearCollapsableAppBarLayout.findSubtitleContentView()) == null || viewFindSubtitleContentView.getVisibility() == 8 || (measuredHeight = viewFindSubtitleContentView.getMeasuredHeight()) == 0) {
            return 0;
        }
        return ((this.mCollapsedBounds.height() - ((int) this.collapsingTextHelper.getCollapsedTextHeight())) / 2) - (measuredHeight + this.mCollapsedSubtitleMarginTopIfNotHidden);
    }

    private boolean calculateIsRtl(@NonNull CharSequence charSequence) {
        return (ViewCompat.getLayoutDirection(this) == 1 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private StaticLayout createStaticLayout() {
        StaticLayout staticLayoutBuild;
        float fFloatValue = ((Float) getReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "scale")).floatValue();
        if (fFloatValue != 1.0f) {
            this.mTextPaint.setTextSize(this.collapsingTextHelper.getExpandedTextSize() * fFloatValue);
        }
        CharSequence text = this.collapsingTextHelper.getText();
        try {
            staticLayoutBuild = OStoreUikitStaticLayoutBuilderCompat.obtain(text, this.mTextPaint, (int) this.mCurrentBounds.width()).setEllipsize(TextUtils.TruncateAt.END).setIsRtl(calculateIsRtl(text)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setMaxLines(1).build();
        } catch (OStoreUikitStaticLayoutBuilderCompat.OStoreUikitStaticLayoutBuilderCompatException e) {
            Log.e(TAG, e.getCause().getMessage(), e);
            staticLayoutBuild = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayoutBuild);
    }

    private Object getReflectField(Class cls, Object obj, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            Log.e(TAG, "getReflectField error: " + e.getMessage());
            return null;
        }
    }

    private float getScale() {
        try {
            return ((Float) getReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "scale")).floatValue();
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    private Rect getTextHelperCollapsedBounds() {
        try {
            return (Rect) getReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "collapsedBounds");
        } catch (Exception unused) {
            return null;
        }
    }

    private RectF getTextHelperCurrentBounds() {
        try {
            return (RectF) getReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "currentBounds");
        } catch (Exception unused) {
            return null;
        }
    }

    private Rect getTextHelperExpandedBounds() {
        try {
            return (Rect) getReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "expandedBounds");
        } catch (Exception unused) {
            return null;
        }
    }

    private StaticLayout getTextLayout() {
        try {
            return (StaticLayout) getReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "textLayout");
        } catch (Exception unused) {
            return null;
        }
    }

    private TextPaint getTextPaint() {
        try {
            return (TextPaint) getReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "textPaint");
        } catch (Exception unused) {
            return null;
        }
    }

    private void init(AttributeSet attributeSet) {
        resetTextHelperInterpolator();
        this.mTextPaint = getTextPaint();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.NearCollapsingToolbarLayout);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NearCollapsingToolbarLayout_iconView, 0);
            typedArrayObtainStyledAttributes.recycle();
            setIconView(resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAttachedToWindow$0(AppBarLayout appBarLayout, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = Math.abs(i) >= appBarLayout.getTotalScrollRange() ? 1 : 2;
        }
        OnToolbarLayoutScrollStateListener onToolbarLayoutScrollStateListener = this.onToolbarLayoutScrollStateListener;
        if (onToolbarLayoutScrollStateListener != null) {
            onToolbarLayoutScrollStateListener.onScrollData(i, appBarLayout.getTotalScrollRange(), i2);
        }
    }

    private void setReflectField(Class cls, Object obj, String str, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e) {
            Log.e(TAG, "setReflectField error: " + e.getMessage());
        }
    }

    private void translateTitleIfNeed() {
        if (this.mCollapsedBounds == null) {
            return;
        }
        int iCalculateCollapsedBound = calculateCollapsedBound();
        this.mTitleTranslateOffset = iCalculateCollapsedBound;
        if (iCalculateCollapsedBound != 0) {
            this.mCollapsedBounds.offset(0, iCalculateCollapsedBound);
            this.collapsingTextHelper.recalculate();
        }
    }

    private void updateTextLayoutIfNeed() {
        StaticLayout staticLayout;
        if (isExpanded() || isCollapsed()) {
            return;
        }
        boolean z = true;
        if (getMaxLines() > 1 || (staticLayout = this.mTextLayout) == null) {
            return;
        }
        CharSequence text = staticLayout.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (!text.toString().contains(ELLIPSIS_TWO_DOTS) && !text.toString().contains(ELLIPSIS_NORMAL)) {
            z = false;
        }
        if (z) {
            StaticLayout staticLayoutCreateStaticLayout = createStaticLayout();
            setReflectField(this.collapsingTextHelper.getClass(), this.collapsingTextHelper, "textLayout", staticLayoutCreateStaticLayout);
            this.mTextLayout = staticLayoutCreateStaticLayout;
        }
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public CollapsingTextHelper getCollapsingTextHelper() {
        return this.collapsingTextHelper;
    }

    public StaticLayout getCollapsingTextLayout() {
        return this.mTextLayout;
    }

    public TextPaint getCollapsingTextPaint() {
        return this.mTextPaint;
    }

    public View getIconView() {
        return this.mIconView;
    }

    public boolean isCollapsed() {
        return this.collapsingTextHelper.getExpansionFraction() == 1.0f;
    }

    public boolean isExpanded() {
        return this.collapsingTextHelper.getExpansionFraction() == 0.0f;
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof AppBarLayout) {
            this.onOffsetChangedListener = new AppBarLayout.OnOffsetChangedListener() { // from class: com.oplus.aiunit.vision.bjc
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                    this.a.lambda$onAttachedToWindow$0(appBarLayout, i);
                }
            };
            ((AppBarLayout) getParent()).addOnOffsetChangedListener(this.onOffsetChangedListener);
        }
        bringChildToFront(this.mIconView);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getParent() instanceof AppBarLayout) {
            ((AppBarLayout) getParent()).removeOnOffsetChangedListener(this.onOffsetChangedListener);
        }
        setOnToolbarLayoutScrollStateListener(null);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        updateTextLayoutIfNeed();
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mTextLayout = getTextLayout();
        if (this.mCurrentBounds.isEmpty()) {
            this.mCurrentBounds = getTextHelperCurrentBounds();
        }
        if (this.mCollapsedBounds.isEmpty()) {
            this.mCollapsedBounds = getTextHelperCollapsedBounds();
        }
        if (this.mExpandedBounds.isEmpty()) {
            this.mExpandedBounds = getTextHelperExpandedBounds();
        }
        translateTitleIfNeed();
        View view = this.mIconView;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        if (calculateIsRtl(this.mTextLayout.getText())) {
            this.mCollapsedBounds.left += this.mIconView.getMeasuredWidth();
            this.mExpandedBounds.left += this.mIconView.getMeasuredWidth();
        } else {
            this.mCollapsedBounds.right -= this.mIconView.getMeasuredWidth();
            this.mExpandedBounds.right -= this.mIconView.getMeasuredWidth();
        }
        this.collapsingTextHelper.recalculate();
    }

    public void resetTextHelperInterpolator() {
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        PathInterpolator pathInterpolator = TITLE_PATH_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(pathInterpolator);
        this.collapsingTextHelper.setPositionInterpolator(pathInterpolator);
    }

    public void setIconView(int i) {
        setIconView(i == 0 ? null : LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    public void setOnToolbarLayoutScrollStateListener(OnToolbarLayoutScrollStateListener onToolbarLayoutScrollStateListener) {
        this.onToolbarLayoutScrollStateListener = onToolbarLayoutScrollStateListener;
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout
    public void setTitle(@Nullable CharSequence charSequence) {
        super.setTitle(charSequence);
        post(new Runnable() { // from class: com.google.android.material.appbar.NearCollapsingToolbarLayout.2
            @Override // java.lang.Runnable
            public void run() {
                NearCollapsingToolbarLayout.this.updateIconViewLocationIfNeed();
            }
        });
    }

    public void updateIconViewLocationIfNeed() {
        View view;
        StaticLayout staticLayout = this.mTextLayout;
        if (staticLayout == null) {
            return;
        }
        CharSequence text = staticLayout.getText();
        if (TextUtils.isEmpty(text) || (view = this.mIconView) == null || view.getVisibility() != 0) {
            return;
        }
        boolean z = text.toString().contains(ELLIPSIS_TWO_DOTS) || text.toString().contains(ELLIPSIS_NORMAL);
        Paint.FontMetricsInt fontMetricsInt = this.mTextPaint.getFontMetricsInt();
        float scale = getScale();
        boolean zCalculateIsRtl = calculateIsRtl(text);
        int i = (int) ((fontMetricsInt.bottom - fontMetricsInt.top) * scale);
        int measuredHeight = (int) (((getMeasuredHeight() - this.mCurrentBounds.top) - (fontMetricsInt.bottom * scale)) + (this.mTitleTranslateOffset * this.collapsingTextHelper.getExpansionFraction()));
        int measuredWidth = (getMeasuredWidth() - this.mIconView.getMeasuredWidth()) - getExpandedTitleMarginEnd();
        if (!z) {
            measuredWidth = Math.min((int) ((zCalculateIsRtl ? getMeasuredWidth() - this.mCurrentBounds.right : this.mCurrentBounds.left) + ((int) (this.mTextLayout.getLineWidth(0) * scale))), measuredWidth);
        } else if (!isExpanded()) {
            measuredWidth = (int) (zCalculateIsRtl ? this.mCurrentBounds.width() + getExpandedTitleMarginStart() : this.mCurrentBounds.right);
        }
        ViewGroup.LayoutParams layoutParams = this.mIconView.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams.height = i;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = measuredHeight;
            marginLayoutParams.setMarginStart(measuredWidth);
            this.mIconView.setLayoutParams(layoutParams);
        }
    }

    public NearCollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearCollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCollapsedSubtitleMarginTopIfNotHidden = 0;
        this.mCollapsedBounds = new Rect();
        this.mExpandedBounds = new Rect();
        this.mCurrentBounds = new RectF();
        this.mIconViewFirstLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.appbar.NearCollapsingToolbarLayout.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (NearCollapsingToolbarLayout.this.mIconView == null) {
                    return;
                }
                NearCollapsingToolbarLayout.this.mIconView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                NearCollapsingToolbarLayout.this.updateIconViewLocationIfNeed();
            }
        };
        init(attributeSet);
        this.mCollapsedSubtitleMarginTopIfNotHidden = context.getResources().getDimensionPixelOffset(R.dimen.nx_appbar_subtitle_collapsed_margin_top);
    }

    public void setIconView(View view) {
        View view2 = this.mIconView;
        if (view2 == view) {
            return;
        }
        if (view == null) {
            removeView(view2);
            this.mIconView = null;
        } else {
            this.mIconView = view;
            addIconView();
        }
    }
}
