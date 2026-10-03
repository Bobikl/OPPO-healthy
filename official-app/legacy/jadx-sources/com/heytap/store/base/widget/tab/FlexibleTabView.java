package com.heytap.store.base.widget.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.widget.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\rJ\b\u0010A\u001a\u00020=H\u0014J0\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0007H\u0014J\u0010\u0010H\u001a\u00020=2\u0006\u0010I\u001a\u00020\rH\u0002J\u0010\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020\rH\u0016J\b\u0010L\u001a\u00020=H\u0002J\u0010\u0010M\u001a\u00020=2\u0006\u0010I\u001a\u00020\rH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001b\u0010\u0010R\u001b\u0010\u001d\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0010R\u001b\u0010 \u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\u0010R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b%\u0010\u0010R\u001b\u0010'\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b(\u0010\u0010R\u000e\u0010*\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b-\u0010\u0010R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00102\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0012\u001a\u0004\b3\u0010\u0010R\u001b\u00105\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0012\u001a\u0004\b6\u0010\u0010R\u001b\u00108\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0012\u001a\u0004\b9\u0010\u0010R\u000e\u0010;\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/heytap/store/base/widget/tab/FlexibleTabView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "title", "", "descText", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;Ljava/lang/String;)V", "canExtend", "", "desFocusColor", "getDesFocusColor", "()I", "desFocusColor$delegate", "Lkotlin/Lazy;", "desHeight", "getDesHeight", "desHeight$delegate", "desUnFocusColor", "getDesUnFocusColor", "desUnFocusColor$delegate", "desWidth", "extendMargin", "getExtendMargin", "extendMargin$delegate", "focusTitleSize", "getFocusTitleSize", "focusTitleSize$delegate", "foldMargin", "getFoldMargin", "foldMargin$delegate", "heightOffset", "indicatorHeight", "getIndicatorHeight", "indicatorHeight$delegate", "indicatorWidth", "getIndicatorWidth", "indicatorWidth$delegate", "isExtend", "lastSelected", "marginOffset", "getMarginOffset", "marginOffset$delegate", "tabDesc", "Landroid/widget/TextView;", "tabTitle", "titleFocusColor", "getTitleFocusColor", "titleFocusColor$delegate", "titleUnFocusColor", "getTitleUnFocusColor", "titleUnFocusColor$delegate", "unfocusTitleSize", "getUnfocusTitleSize", "unfocusTitleSize$delegate", "widthOffset", "changeProgress", "", "progress", "", CardAction.LIFE_CIRCLE_VALUE_SHOW, "onDetachedFromWindow", "onLayout", "changed", LogFieldKey.LEVEL_KEY, "t", "r", "b", "setIsSelected", "isSelect", "setSelected", "selected", "setup", "showSelectAnim", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FlexibleTabView extends FrameLayout {
    private boolean canExtend;

    /* JADX INFO: renamed from: desFocusColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy desFocusColor;

    /* JADX INFO: renamed from: desHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy desHeight;

    /* JADX INFO: renamed from: desUnFocusColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy desUnFocusColor;
    private int desWidth;

    @Nullable
    private final String descText;

    /* JADX INFO: renamed from: extendMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extendMargin;

    /* JADX INFO: renamed from: focusTitleSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy focusTitleSize;

    /* JADX INFO: renamed from: foldMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy foldMargin;
    private int heightOffset;

    /* JADX INFO: renamed from: indicatorHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy indicatorHeight;

    /* JADX INFO: renamed from: indicatorWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy indicatorWidth;
    private boolean isExtend;
    private boolean lastSelected;

    /* JADX INFO: renamed from: marginOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy marginOffset;

    @NotNull
    private final TextView tabDesc;

    @NotNull
    private final TextView tabTitle;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: titleFocusColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleFocusColor;

    /* JADX INFO: renamed from: titleUnFocusColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleUnFocusColor;

    /* JADX INFO: renamed from: unfocusTitleSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unfocusTitleSize;
    private int widthOffset;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleTabView(@NotNull Context context) {
        this(context, null, 0, null, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getDesFocusColor() {
        return ((Number) this.desFocusColor.getValue()).intValue();
    }

    private final int getDesHeight() {
        return ((Number) this.desHeight.getValue()).intValue();
    }

    private final int getDesUnFocusColor() {
        return ((Number) this.desUnFocusColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getExtendMargin() {
        return ((Number) this.extendMargin.getValue()).intValue();
    }

    private final int getFocusTitleSize() {
        return ((Number) this.focusTitleSize.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFoldMargin() {
        return ((Number) this.foldMargin.getValue()).intValue();
    }

    private final int getIndicatorHeight() {
        return ((Number) this.indicatorHeight.getValue()).intValue();
    }

    private final int getIndicatorWidth() {
        return ((Number) this.indicatorWidth.getValue()).intValue();
    }

    private final int getMarginOffset() {
        return ((Number) this.marginOffset.getValue()).intValue();
    }

    private final int getTitleFocusColor() {
        return ((Number) this.titleFocusColor.getValue()).intValue();
    }

    private final int getTitleUnFocusColor() {
        return ((Number) this.titleUnFocusColor.getValue()).intValue();
    }

    private final int getUnfocusTitleSize() {
        return ((Number) this.unfocusTitleSize.getValue()).intValue();
    }

    private final void setIsSelected(boolean isSelect) {
        if (isSelect) {
            this.tabDesc.setTextColor(getDesFocusColor());
            this.tabTitle.setTextColor(getTitleFocusColor());
            this.tabTitle.setTextSize(0, getFocusTitleSize());
        } else {
            this.tabDesc.setTextColor(getDesUnFocusColor());
            this.tabTitle.setTextColor(getTitleUnFocusColor());
            this.tabTitle.setTextSize(0, getUnfocusTitleSize());
        }
        if (!this.isExtend) {
            showSelectAnim(isSelect);
            this.lastSelected = isSelect;
        } else {
            if (isSelect) {
                this.tabDesc.setBackgroundResource(R.drawable.widget_category_des_bg);
            } else {
                this.tabDesc.setBackgroundResource(0);
            }
            this.lastSelected = isSelect;
        }
    }

    private final void setup() {
        String str = this.title;
        boolean z = true;
        if (str == null || str.length() == 0) {
            this.tabTitle.setVisibility(8);
        } else {
            this.tabTitle.setVisibility(0);
            this.tabTitle.setText(this.title);
        }
        String str2 = this.descText;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (!z) {
            this.tabDesc.setVisibility(0);
            this.tabDesc.setText(this.descText);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.tabDesc.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        TextView textView = this.tabDesc;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = getIndicatorHeight();
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
        textView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.tabTitle.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        TextView textView2 = this.tabTitle;
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = getFoldMargin();
        textView2.setLayoutParams(layoutParams4);
        this.canExtend = false;
        this.isExtend = false;
    }

    private final void showSelectAnim(final boolean isSelect) {
        float f;
        float f2;
        if (this.lastSelected == isSelect) {
            return;
        }
        if (isSelect) {
            f2 = 0.0f;
            f = 1.0f;
        } else {
            f = 0.0f;
            f2 = 1.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f, 1.0f, 1.0f, 0, this.tabDesc.getWidth() / 2.0f, 0, this.tabDesc.getHeight() / 2.0f);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView.showSelectAnim.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation animation) {
                if (isSelect) {
                    return;
                }
                this.tabDesc.setBackgroundResource(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation) {
                if (isSelect) {
                    this.tabDesc.setBackgroundResource(R.drawable.widget_category_des_bg);
                }
            }
        });
        scaleAnimation.setDuration(300L);
        scaleAnimation.setFillAfter(false);
        this.tabDesc.startAnimation(scaleAnimation);
    }

    public final void changeProgress(float progress, boolean show) {
        if (this.canExtend) {
            this.isExtend = show;
            ViewGroup.LayoutParams layoutParams = this.tabDesc.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            TextView textView = this.tabDesc;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) (getExtendMargin() * progress);
            TextView textView2 = this.tabDesc;
            int i = this.desWidth;
            float f = 1 - progress;
            textView2.setScaleX((i + (this.widthOffset * f)) / i);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) (getDesHeight() + (this.heightOffset * f));
            textView.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.tabTitle.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            TextView textView3 = this.tabTitle;
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) (getExtendMargin() + (getMarginOffset() * f));
            textView3.setLayoutParams(layoutParams4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.canExtend) {
            return;
        }
        if (this.lastSelected) {
            this.tabDesc.setBackgroundResource(R.drawable.widget_category_des_bg);
        } else {
            this.tabDesc.setBackgroundResource(0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t, int r, int b) {
        super.onLayout(changed, l2, t, r, b);
        if (this.widthOffset == -1) {
            this.heightOffset = getIndicatorHeight() - this.tabDesc.getHeight();
            this.widthOffset = getIndicatorWidth() - this.tabDesc.getWidth();
            this.desWidth = this.tabDesc.getWidth();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        setIsSelected(selected);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @Nullable String str) {
        this(context, attributeSet, i, str, null, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexibleTabView(Context context, AttributeSet attributeSet, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @Nullable String str, @Nullable String str2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.title = str;
        this.descText = str2;
        this.desHeight = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$desHeight$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.recommend_category_title_height));
            }
        });
        this.titleFocusColor = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$titleFocusColor$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(ContextCompat.getColor(this.this$0.getContext(), R.color.widget_base_title_color));
            }
        });
        this.titleUnFocusColor = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$titleUnFocusColor$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(ContextCompat.getColor(this.this$0.getContext(), R.color.widget_base_title_color));
            }
        });
        this.desFocusColor = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$desFocusColor$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(ContextCompat.getColor(this.this$0.getContext(), R.color.category_des_text_focus_color));
            }
        });
        this.desUnFocusColor = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$desUnFocusColor$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(ContextCompat.getColor(this.this$0.getContext(), R.color.widget_base_subtitle_color));
            }
        });
        this.focusTitleSize = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$focusTitleSize$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.recommend_category_title_size_focus));
            }
        });
        this.indicatorHeight = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$indicatorHeight$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.recommend_category_tab_indicator_height));
            }
        });
        this.indicatorWidth = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$indicatorWidth$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.recommend_category_tab_indicator_width));
            }
        });
        this.extendMargin = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$extendMargin$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.recommend_category_tab_title_extend_top_margin));
            }
        });
        this.foldMargin = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$foldMargin$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.recommend_category_tab_title_top_margin));
            }
        });
        this.marginOffset = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$marginOffset$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(Math.abs(this.this$0.getExtendMargin() - this.this$0.getFoldMargin()));
            }
        });
        this.widthOffset = -1;
        this.heightOffset = -1;
        this.desWidth = -1;
        this.isExtend = true;
        this.canExtend = true;
        this.unfocusTitleSize = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.heytap.store.base.widget.tab.FlexibleTabView$unfocusTitleSize$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.getResources().getDimensionPixelSize(R.dimen.recommend_category_title_size_unfocus));
            }
        });
        LayoutInflater.from(context).inflate(R.layout.widget_layout_flexible_tab_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tabTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tabTitle)");
        this.tabTitle = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tabDesc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tabDesc)");
        this.tabDesc = (TextView) viewFindViewById2;
        setBackgroundColor(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setup();
    }
}
