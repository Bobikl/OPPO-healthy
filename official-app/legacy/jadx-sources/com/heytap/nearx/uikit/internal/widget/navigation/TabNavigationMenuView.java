package com.heytap.nearx.uikit.internal.widget.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.heytap.nearx.uikit.R$id;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B!\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/TabNavigationMenuView;", "Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "space", "setNavigationIconTextSpace", "G", "I", "navigationIconText", "", "z", "()Z", "isPortrait", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class TabNavigationMenuView extends BottomNavigationMenuView {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int navigationIconText;

    @NotNull
    public Map<Integer, View> H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public TabNavigationMenuView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                View viewFindViewById = childAt.findViewById(R$id.normalLable);
                if (Intrinsics.areEqual(viewFindViewById.getTag(), BatteryView.STYLE_SMALL) || (z() && !Intrinsics.areEqual(viewFindViewById.getTag(), "sw480"))) {
                    ViewGroup.LayoutParams layoutParams = childAt.findViewById(R$id.icon).getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = this.navigationIconText;
                    layoutParams2.addRule(14, -1);
                }
            }
            i = i2;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setNavigationIconTextSpace(int space) {
        this.navigationIconText = space;
    }

    public final boolean z() {
        return getResources().getConfiguration().orientation == 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TabNavigationMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.H = new LinkedHashMap();
    }

    public /* synthetic */ TabNavigationMenuView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabNavigationMenuView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.H = new LinkedHashMap();
    }
}
