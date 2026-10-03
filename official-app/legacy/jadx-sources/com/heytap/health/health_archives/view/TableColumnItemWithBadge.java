package com.heytap.health.health_archives.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.heytap.health.health_archives.R$color;
import com.heytap.health.health_archives.R$drawable;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.view.TableColumnItemWithBadge;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.xu5;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010?\u001a\u00020>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\b\b\u0002\u0010B\u001a\u00020\u0006¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020 J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0006R\u0016\u0010%\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010'\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010+R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010+R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010+R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)¨\u0006E"}, d2 = {"Lcom/heytap/health/health_archives/view/TableColumnItemWithBadge;", "Landroid/widget/RelativeLayout;", "", "i", "", "isHighlighted", "", "highlightColor", "normalColor", LogFieldKey.PROCESS_NAME_KEY, "s", "j", "q", "onAttachedToWindow", "onDetachedFromWindow", "", "text", ClickApiEntity.SET_TEXT, "v", "setTextColorAndBadge", "color", "setHighlightTextColor", "setNormalTextColor", "drawableResId", "setBadgeDrawable", "", "sizeDp", "setBadgeSize", "spacingDp", "setBadgeSpacing", "Landroidx/appcompat/widget/AppCompatTextView;", "getTextView", "Landroid/widget/ImageView;", "getBadgeView", Fields.WIDTH_FIELD, "setTextViewWidth", "Landroidx/appcompat/widget/AppCompatTextView;", "textView", "Landroid/widget/ImageView;", "badgeView", MapSchema.FIELD_NAME_KEY, "Z", LogFieldKey.LEVEL_KEY, "I", "originalPaddingEnd", LogFieldKey.MESSAGE_KEY, "highlightTextColor", "n", "normalTextColor", "o", "badgeDrawableResId", "badgeSize", "badgeSpacing", "r", "retryCount", "maxRetryCount", "Ljava/lang/Runnable;", "t", "Ljava/lang/Runnable;", "timeoutRunnable", "u", "isLayoutAdjusted", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTableColumnItemWithBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableColumnItemWithBadge.kt\ncom/heytap/health/health_archives/view/TableColumnItemWithBadge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,500:1\n1#2:501\n*E\n"})
public final class TableColumnItemWithBadge extends RelativeLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public AppCompatTextView textView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ImageView badgeView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isHighlighted;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int originalPaddingEnd;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int highlightTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int normalTextColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int badgeDrawableResId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int badgeSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int badgeSpacing;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int retryCount;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int maxRetryCount;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public Runnable timeoutRunnable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isLayoutAdjusted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TableColumnItemWithBadge(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void k(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    public static final void l(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    public static final void m(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    public static final void n(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isHighlighted) {
            this$0.badgeView.setAlpha(1.0f);
            this$0.badgeView.setVisibility(0);
        }
    }

    public static final void o(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isAttachedToWindow() || this$0.isLayoutAdjusted) {
            return;
        }
        this$0.i();
        this$0.isLayoutAdjusted = true;
    }

    public static final void r(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isHighlighted) {
            this$0.badgeView.setAlpha(1.0f);
            this$0.badgeView.setVisibility(0);
        }
    }

    public static final void t(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((this$0.badgeView.getAlpha() == 0.0f) && this$0.isHighlighted) {
            this$0.q();
        }
    }

    public static final void u(TableColumnItemWithBadge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    @NotNull
    public final ImageView getBadgeView() {
        return this.badgeView;
    }

    @NotNull
    public final AppCompatTextView getTextView() {
        return this.textView;
    }

    public final void i() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            return;
        }
        boolean z = false;
        View childAt = getChildAt(0);
        RelativeLayout relativeLayout = childAt instanceof RelativeLayout ? (RelativeLayout) childAt : null;
        if (relativeLayout == null || (layoutParams = relativeLayout.getLayoutParams()) == null) {
            return;
        }
        int i = layoutParams2.height;
        if (i != -2 && (i == -1 || i > 0)) {
            z = true;
        }
        int i2 = z ? -1 : -2;
        if (layoutParams.height != i2) {
            layoutParams.height = i2;
            relativeLayout.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams3 = this.textView.getLayoutParams();
        if (layoutParams3 == null || layoutParams3.height == i2) {
            return;
        }
        layoutParams3.height = i2;
        this.textView.setLayoutParams(layoutParams3);
    }

    public final void j() {
        if (this.isHighlighted) {
            if (this.retryCount >= this.maxRetryCount) {
                q();
                return;
            }
            if (this.textView.getText().toString().length() == 0) {
                this.retryCount++;
                this.textView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.pmj
                    @Override // java.lang.Runnable
                    public final void run() {
                        TableColumnItemWithBadge.k(this.i);
                    }
                }, 50L);
                return;
            }
            Layout layout = this.textView.getLayout();
            if (layout == null || layout.getLineCount() == 0) {
                this.retryCount++;
                this.textView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.qmj
                    @Override // java.lang.Runnable
                    public final void run() {
                        TableColumnItemWithBadge.l(this.i);
                    }
                }, 50L);
                return;
            }
            if (this.textView.getWidth() <= 0) {
                this.retryCount++;
                this.textView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.rmj
                    @Override // java.lang.Runnable
                    public final void run() {
                        TableColumnItemWithBadge.m(this.i);
                    }
                }, 50L);
                return;
            }
            int width = (this.textView.getWidth() - this.textView.getPaddingStart()) - this.textView.getPaddingEnd();
            if (width <= 0) {
                q();
                return;
            }
            int paddingStart = (int) (this.textView.getPaddingStart() + RangesKt___RangesKt.coerceAtMost(layout.getLineWidth(0), width) + this.badgeSpacing);
            int lineTop = layout.getLineTop(0);
            int paddingTop = this.textView.getPaddingTop();
            int height = (this.textView.getHeight() - this.textView.getPaddingTop()) - this.textView.getPaddingBottom();
            int lineBottom = layout.getLineCount() > 0 ? layout.getLineBottom(layout.getLineCount() - 1) - layout.getLineTop(0) : 0;
            int i = paddingTop + (height > lineBottom ? (height - lineBottom) / 2 : 0) + lineTop + this.badgeSpacing;
            ViewGroup.LayoutParams layoutParams = this.badgeView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(paddingStart);
            layoutParams2.topMargin = i;
            int i2 = this.badgeSize;
            layoutParams2.width = i2;
            layoutParams2.height = i2;
            this.badgeView.setLayoutParams(layoutParams2);
            this.badgeView.post(new Runnable() { // from class: com.oplus.aiunit.vision.smj
                @Override // java.lang.Runnable
                public final void run() {
                    TableColumnItemWithBadge.n(this.i);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLayoutAdjusted) {
            return;
        }
        post(new Runnable() { // from class: com.oplus.aiunit.vision.mmj
            @Override // java.lang.Runnable
            public final void run() {
                TableColumnItemWithBadge.o(this.i);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.timeoutRunnable = null;
        this.retryCount = 0;
    }

    public final void p(boolean isHighlighted, int highlightColor, int normalColor) {
        this.isHighlighted = isHighlighted;
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.timeoutRunnable = null;
        if (!isHighlighted) {
            this.textView.setTextColor(normalColor);
            this.badgeView.setVisibility(8);
            this.badgeView.setAlpha(1.0f);
            AppCompatTextView appCompatTextView = this.textView;
            appCompatTextView.setPadding(appCompatTextView.getPaddingStart(), this.textView.getPaddingTop(), this.originalPaddingEnd, this.textView.getPaddingBottom());
            return;
        }
        this.textView.setTextColor(highlightColor);
        this.badgeView.setVisibility(0);
        this.badgeView.setAlpha(0.0f);
        this.retryCount = 0;
        int i = this.badgeSize + this.badgeSpacing;
        AppCompatTextView appCompatTextView2 = this.textView;
        appCompatTextView2.setPadding(appCompatTextView2.getPaddingStart(), this.textView.getPaddingTop(), this.originalPaddingEnd + i, this.textView.getPaddingBottom());
        s();
    }

    public final void q() {
        if (this.isHighlighted) {
            String string = this.textView.getText().toString();
            if (string.length() == 0) {
                ViewGroup.LayoutParams layoutParams = this.badgeView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(18);
                layoutParams2.removeRule(6);
                layoutParams2.setMarginStart((this.textView.getWidth() - this.badgeSize) - this.badgeSpacing);
                layoutParams2.topMargin = this.textView.getPaddingTop() + this.badgeSpacing;
                int i = this.badgeSize;
                layoutParams2.width = i;
                layoutParams2.height = i;
                this.badgeView.setLayoutParams(layoutParams2);
            } else {
                ViewGroup.LayoutParams layoutParams3 = this.badgeView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.removeRule(18);
                layoutParams4.removeRule(6);
                layoutParams4.setMarginStart(this.textView.getPaddingStart() + RangesKt___RangesKt.coerceAtMost((int) this.textView.getPaint().measureText(string), (this.textView.getWidth() - this.textView.getPaddingStart()) - this.textView.getPaddingEnd()) + this.badgeSpacing);
                layoutParams4.topMargin = this.textView.getPaddingTop() + this.badgeSpacing;
                int i2 = this.badgeSize;
                layoutParams4.width = i2;
                layoutParams4.height = i2;
                this.badgeView.setLayoutParams(layoutParams4);
            }
            this.badgeView.post(new Runnable() { // from class: com.oplus.aiunit.vision.tmj
                @Override // java.lang.Runnable
                public final void run() {
                    TableColumnItemWithBadge.r(this.i);
                }
            });
        }
    }

    public final void s() {
        if (this.isHighlighted) {
            ViewGroup.LayoutParams layoutParams = this.badgeView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(18);
                layoutParams2.removeRule(6);
                layoutParams2.setMarginStart(-10000);
                layoutParams2.topMargin = -10000;
                int i = this.badgeSize;
                layoutParams2.width = i;
                layoutParams2.height = i;
                this.badgeView.setLayoutParams(layoutParams2);
            }
            this.badgeView.setAlpha(0.0f);
            this.badgeView.setVisibility(0);
            this.retryCount = 0;
            Runnable runnable = this.timeoutRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: com.oplus.aiunit.vision.nmj
                @Override // java.lang.Runnable
                public final void run() {
                    TableColumnItemWithBadge.t(this.i);
                }
            };
            this.timeoutRunnable = runnable2;
            Intrinsics.checkNotNull(runnable2);
            postDelayed(runnable2, 500L);
            this.textView.post(new Runnable() { // from class: com.oplus.aiunit.vision.omj
                @Override // java.lang.Runnable
                public final void run() {
                    TableColumnItemWithBadge.u(this.i);
                }
            });
        }
    }

    public final void setBadgeDrawable(int drawableResId) {
        this.badgeDrawableResId = drawableResId;
        this.badgeView.setImageResource(drawableResId);
    }

    public final void setBadgeSize(float sizeDp) {
        int iA = xu5.a(getContext(), sizeDp);
        this.badgeSize = iA;
        if (this.isHighlighted) {
            int i = iA + this.badgeSpacing;
            AppCompatTextView appCompatTextView = this.textView;
            appCompatTextView.setPadding(appCompatTextView.getPaddingStart(), this.textView.getPaddingTop(), this.originalPaddingEnd + i, this.textView.getPaddingBottom());
            s();
        }
    }

    public final void setBadgeSpacing(float spacingDp) {
        int iA = xu5.a(getContext(), spacingDp);
        this.badgeSpacing = iA;
        if (this.isHighlighted) {
            int i = this.badgeSize + iA;
            AppCompatTextView appCompatTextView = this.textView;
            appCompatTextView.setPadding(appCompatTextView.getPaddingStart(), this.textView.getPaddingTop(), this.originalPaddingEnd + i, this.textView.getPaddingBottom());
            s();
        }
    }

    public final void setHighlightTextColor(int color) {
        this.highlightTextColor = color;
        if (this.isHighlighted) {
            this.textView.setTextColor(color);
        }
    }

    public final void setNormalTextColor(int color) {
        this.normalTextColor = color;
        if (this.isHighlighted) {
            return;
        }
        this.textView.setTextColor(color);
    }

    public final void setText(@Nullable CharSequence text) {
        this.textView.setText(text);
        if (this.isHighlighted) {
            int i = this.badgeSize + this.badgeSpacing;
            AppCompatTextView appCompatTextView = this.textView;
            appCompatTextView.setPadding(appCompatTextView.getPaddingStart(), this.textView.getPaddingTop(), this.originalPaddingEnd + i, this.textView.getPaddingBottom());
            s();
        }
    }

    public final void setTextColorAndBadge(boolean isHighlighted) {
        p(isHighlighted, this.highlightTextColor, this.normalTextColor);
    }

    public final void setTextViewWidth(int width) {
        ViewGroup.LayoutParams layoutParams = this.textView.getLayoutParams();
        layoutParams.width = width;
        this.textView.setLayoutParams(layoutParams);
    }

    public final void v() {
        if (this.isHighlighted) {
            s();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TableColumnItemWithBadge(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TableColumnItemWithBadge(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TableColumnItemWithBadge(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.highlightTextColor = context.getColor(R$color.health_archives_0066FF);
        this.normalTextColor = context.getColor(R$color.health_archives_90_black);
        this.badgeDrawableResId = R$drawable.health_archives_icon_link;
        this.badgeSize = xu5.a(context, 9.0f);
        this.badgeSpacing = xu5.a(context, 2.0f);
        this.maxRetryCount = 10;
        LayoutInflater.from(context).inflate(R$layout.health_archives_table_column_item_with_badge, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.table_column_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.table_column_text)");
        this.textView = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.table_column_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.table_column_badge)");
        this.badgeView = (ImageView) viewFindViewById2;
        this.originalPaddingEnd = this.textView.getPaddingEnd();
        this.badgeView.setImageResource(this.badgeDrawableResId);
        setTextColorAndBadge(false);
    }
}
