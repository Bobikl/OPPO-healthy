package com.heytap.nearx.uikit.widget.navigation;

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
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J0\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0014J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0014J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006)"}, d2 = {"Lcom/heytap/nearx/uikit/widget/navigation/EnlargeNavigationMenuView;", "Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationMenuView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "enlargeIndex", "getEnlargeIndex", "()I", "setEnlargeIndex", "(I)V", "isPortrait", "", "()Z", "isRtlMode", "mDefaultPadding", "getMDefaultPadding", "setMDefaultPadding", "mItemHeight", "getMItemHeight", "setMItemHeight", "initEnlargeMenuItem", "Lcom/heytap/nearx/uikit/widget/navigation/BottomNavigationItemView;", "initMenuItem", "onLayout", "", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setItemHeight", "defaultHeight", "updateMenuView", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EnlargeNavigationMenuView extends BottomNavigationMenuView {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int enlargeIndex;
    private int mDefaultPadding;
    private int mItemHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public EnlargeNavigationMenuView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean isPortrait() {
        return getResources().getConfiguration().orientation == 1;
    }

    private final boolean isRtlMode() {
        return getLayoutDirection() == 1;
    }

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView
    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
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

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView
    @NotNull
    public BottomNavigationItemView initEnlargeMenuItem() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, R$layout.nx_enlarge_navigation_item_layout_new, true, 6, null);
    }

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView
    @NotNull
    public BottomNavigationItemView initMenuItem() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new BottomNavigationItemView(context, null, 0, R$layout.nx_enlarge_navigation_item_layout_new, false, 22, null);
    }

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                if (isRtlMode()) {
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

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                int i3 = R$id.icon;
                View viewFindViewById = childAt.findViewById(i3);
                if (Intrinsics.areEqual(viewFindViewById.getTag(), BatteryView.STYLE_SMALL) || (isPortrait() && !Intrinsics.areEqual(viewFindViewById.getTag(), "sw480"))) {
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

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView
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

    @Override // com.heytap.nearx.uikit.widget.navigation.BottomNavigationMenuView
    public void updateMenuView() {
        super.updateMenuView();
        if (getParent() == null || !(getParent() instanceof ViewGroup)) {
            return;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent).setActivated(false);
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
        this._$_findViewCache = new LinkedHashMap();
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
        this._$_findViewCache = new LinkedHashMap();
    }
}
