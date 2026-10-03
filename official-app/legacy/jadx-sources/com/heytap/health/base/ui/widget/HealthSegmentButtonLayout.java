package com.heytap.health.base.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.coui.appcompat.segmentbutton.COUISegmentButtonLayout;
import com.heytap.health.base.R$styleable;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.y04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u001d\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b\u001d\u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/heytap/health/base/ui/widget/HealthSegmentButtonLayout;", "Lcom/coui/appcompat/segmentbutton/COUISegmentButtonLayout;", "Landroid/util/AttributeSet;", "attrs", "", "p0", "", "changed", "", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "k0", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "l0", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "n0", c8l.KEY_A0, "I", "viewPageId", "Landroid/view/ViewGroup;", c8l.KEY_B0, "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class HealthSegmentButtonLayout extends COUISegmentButtonLayout {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public int viewPageId;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    @Nullable
    public ViewGroup viewPager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthSegmentButtonLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewPageId = -1;
        p0(null);
    }

    public static final void m0(ViewPager viewPager, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(viewPager, "$viewPager");
        viewPager.setCurrentItem(i2);
    }

    public static final void o0(ViewPager2 viewPager2, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(viewPager2, "$viewPager2");
        viewPager2.setCurrentItem(i2);
    }

    public final void k0() {
        ViewGroup viewGroup = this.viewPager;
        if (viewGroup instanceof ViewPager) {
            Intrinsics.checkNotNull(viewGroup, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
            l0((ViewPager) viewGroup);
        } else if (viewGroup instanceof ViewPager2) {
            Intrinsics.checkNotNull(viewGroup, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            n0((ViewPager2) viewGroup);
        }
    }

    public final void l0(final ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.base.ui.widget.HealthSegmentButtonLayout$bindViewPager$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
                this.i.S(state);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                this.i.T(position, positionOffset, positionOffsetPixels);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                this.i.U(position);
            }
        });
        setOnSelectedSegmentChangeListener(new COUISegmentButtonLayout.g() { // from class: com.oplus.aiunit.vision.cv8
            @Override // com.coui.appcompat.segmentbutton.COUISegmentButtonLayout.g
            public final void a(int i, int i2, float f) {
                HealthSegmentButtonLayout.m0(viewPager, i, i2, f);
            }
        });
        int currentItem = viewPager.getCurrentItem();
        if (currentItem != 0) {
            U(currentItem);
        }
    }

    public final void n0(final ViewPager2 viewPager2) {
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.heytap.health.base.ui.widget.HealthSegmentButtonLayout$bindViewPager2$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                this.i.S(state);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                this.i.T(position, positionOffset, positionOffsetPixels);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                this.i.U(position);
            }
        });
        setOnSelectedSegmentChangeListener(new COUISegmentButtonLayout.g() { // from class: com.oplus.aiunit.vision.bv8
            @Override // com.coui.appcompat.segmentbutton.COUISegmentButtonLayout.g
            public final void a(int i, int i2, float f) {
                HealthSegmentButtonLayout.o0(viewPager2, i, i2, f);
            }
        });
        int currentItem = viewPager2.getCurrentItem();
        if (currentItem != 0) {
            U(currentItem);
        }
    }

    @Override // com.coui.appcompat.segmentbutton.COUISegmentButtonLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.viewPager != null || this.viewPageId == -1 || getRootView() == null) {
            return;
        }
        View viewFindViewById = getRootView().findViewById(this.viewPageId);
        if ((viewFindViewById instanceof ViewPager) || (viewFindViewById instanceof ViewPager2)) {
            this.viewPager = (ViewGroup) viewFindViewById;
        }
        k0();
    }

    public final void p0(@Nullable AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R$styleable.lib_base_HealthSegmentButtonLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ealthSegmentButtonLayout)");
        this.viewPageId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.lib_base_HealthSegmentButtonLayout_linkViewPager, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthSegmentButtonLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewPageId = -1;
        p0(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthSegmentButtonLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewPageId = -1;
        p0(attributeSet);
    }
}
