package com.heytap.nearx.uikit.internal.widget.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.oplus.aiunit.vision.y04;
import com.oplus.deviceui.BatteryView;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0017\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,B!\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020\u0005¢\u0006\u0004\b+\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0014J0\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0014J\b\u0010\u0013\u001a\u00020\u0007H\u0016R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010!\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u0014\u0010$\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006/"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/EnlargeNavigationMenuView;", "Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView;", "Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationItemView;", "j", "i", "", "defaultHeight", "", "setItemHeight", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "x", "G", "I", "getMItemHeight", "()I", "setMItemHeight", "(I)V", "mItemHeight", "H", "getEnlargeIndex", "setEnlargeIndex", "enlargeIndex", "getMDefaultPadding", "setMDefaultPadding", "mDefaultPadding", MapSchema.FIELD_NAME_KEY, "()Z", "isRtlMode", "z", "isPortrait", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class EnlargeNavigationMenuView extends BottomNavigationMenuView {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int mItemHeight;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int enlargeIndex;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int mDefaultPadding;

    @NotNull
    public Map<Integer, View> J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public EnlargeNavigationMenuView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean k() {
        return getLayoutDirection() == 1;
    }

    public final int getEnlargeIndex() {
        return this.enlargeIndex;
    }

    public final int getMDefaultPadding() {
        return this.mDefaultPadding;
    }

    public final int getMItemHeight() {
        return this.mItemHeight;
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView
    @NotNull
    public BottomNavigationItemView i() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, R$layout.nx_enlarge_navigation_item_layout, true, 6, null);
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView
    @NotNull
    public BottomNavigationItemView j() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, R$layout.nx_enlarge_navigation_item_layout, false, 22, null);
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childCount = getChildCount();
        int i = right - left;
        int i2 = bottom - top;
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < childCount) {
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                if (k()) {
                    int i5 = i - measuredWidth;
                    childAt.layout(i5 - childAt.getMeasuredWidth(), i2 - childAt.getMeasuredHeight(), i5, i2);
                } else {
                    childAt.layout(measuredWidth, i2 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth() + measuredWidth, i2);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
            i3 = i4;
        }
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = 0;
        View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 0);
        View.MeasureSpec.getSize(widthMeasureSpec);
        int childCount = getChildCount();
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                int i3 = R$id.icon;
                View viewFindViewById = childAt.findViewById(i3);
                if (Intrinsics.areEqual(viewFindViewById.getTag(), BatteryView.STYLE_SMALL) || (z() && !Intrinsics.areEqual(viewFindViewById.getTag(), "sw480"))) {
                    ViewGroup.LayoutParams layoutParams = childAt.findViewById(i3).getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                    ((RelativeLayout.LayoutParams) layoutParams).addRule(14, -1);
                }
            }
            i = i2;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setEnlargeIndex(int i) {
        this.enlargeIndex = i;
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView
    public void setItemHeight(int defaultHeight) {
        super.setItemHeight(defaultHeight);
        this.mItemHeight = defaultHeight;
    }

    public final void setMDefaultPadding(int i) {
        this.mDefaultPadding = i;
    }

    public final void setMItemHeight(int i) {
        this.mItemHeight = i;
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView
    public void x() {
        super.x();
        if (getParent() == null || !(getParent() instanceof ViewGroup)) {
            return;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent).setActivated(false);
    }

    public final boolean z() {
        return getResources().getConfiguration().orientation == 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EnlargeNavigationMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.enlargeIndex = -1;
        setClipChildren(false);
        setClipToPadding(false);
        this.mDefaultPadding = getContext().getResources().getDimensionPixelSize(R$dimen.NXcolor_navigation_item_padding);
        this.J = new LinkedHashMap();
    }

    public /* synthetic */ EnlargeNavigationMenuView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnlargeNavigationMenuView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.enlargeIndex = -1;
        setClipChildren(false);
        setClipToPadding(false);
        this.mDefaultPadding = getContext().getResources().getDimensionPixelSize(R$dimen.NXcolor_navigation_item_padding);
        this.J = new LinkedHashMap();
    }
}
