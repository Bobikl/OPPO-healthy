package com.heytap.nearx.uikit.internal.widget.navigation;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.heytap.nearx.uikit.R$dimen;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0006\u0010\f\u001a\u00020\u0004R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/ToolNavigationMenuView;", "Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "defaultHeight", "setItemHeight", "z", "G", "I", "mItemHeight", "H", "mDefaultPadding", "", "[I", "mTempChildWidths", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class ToolNavigationMenuView extends BottomNavigationMenuView {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int mItemHeight;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int mDefaultPadding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int[] mTempChildWidths;

    @NotNull
    public Map<Integer, View> J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ToolNavigationMenuView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView, android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.mDefaultPadding = getResources().getDimensionPixelSize(R$dimen.NXcolor_tool_navigation_edge_item_padding);
        z();
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        z();
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int childCount = getChildCount();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824);
        int i = size / (childCount == 0 ? 1 : childCount);
        int i2 = size - (i * childCount);
        int i3 = 0;
        while (true) {
            int[] iArr = null;
            if (i3 >= childCount) {
                break;
            }
            int i4 = i3 + 1;
            int[] iArr2 = this.mTempChildWidths;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                iArr2 = null;
            }
            iArr2[i3] = i;
            if (i2 > 0) {
                int[] iArr3 = this.mTempChildWidths;
                if (iArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                } else {
                    iArr = iArr3;
                }
                iArr[i3] = iArr[i3] + 1;
                i2--;
            }
            i3 = i4;
        }
        int i5 = 0;
        int measuredWidth = 0;
        while (i5 < childCount) {
            int i6 = i5 + 1;
            View childAt = getChildAt(i5);
            int i7 = size / 2;
            int[] iArr4 = this.mTempChildWidths;
            if (iArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTempChildWidths");
                iArr4 = null;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.min(i7, iArr4[i5]), 1073741824), iMakeMeasureSpec);
            childAt.getLayoutParams().width = childAt.getMeasuredWidth();
            measuredWidth += childAt.getMeasuredWidth();
            i5 = i6;
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(this.mItemHeight, iMakeMeasureSpec, 0));
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView
    public void setItemHeight(int defaultHeight) {
        this.mItemHeight = defaultHeight;
    }

    public final void z() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.mDefaultPadding);
        marginLayoutParams.setMarginEnd(this.mDefaultPadding);
        setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ToolNavigationMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.J = new LinkedHashMap();
        this.mDefaultPadding = getResources().getDimensionPixelSize(R$dimen.NXcolor_tool_navigation_edge_item_padding);
        this.mTempChildWidths = new int[BottomNavigationMenu.INSTANCE.a()];
    }

    public /* synthetic */ ToolNavigationMenuView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolNavigationMenuView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.J = new LinkedHashMap();
    }
}
