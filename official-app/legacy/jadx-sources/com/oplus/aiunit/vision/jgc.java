package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenuView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/jgc;", "Lcom/oplus/aiunit/vision/hgc;", "Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenuView;", "mMenuView", "", "b", "a", "Landroid/content/Context;", "context", "", "c", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class jgc implements hgc {
    @Override // com.oplus.aiunit.vision.hgc
    public void a(@NotNull BottomNavigationMenuView mMenuView) {
        Intrinsics.checkNotNullParameter(mMenuView, "mMenuView");
        mMenuView.setIconTintList(mMenuView.getResources().getColorStateList(R$color.nx_color_bottom_tool_navigation_item_selector));
    }

    @Override // com.oplus.aiunit.vision.hgc
    public void b(@NotNull BottomNavigationMenuView mMenuView) {
        Intrinsics.checkNotNullParameter(mMenuView, "mMenuView");
        mMenuView.setItemTextColor(mMenuView.getResources().getColorStateList(R$color.nx_color_bottom_tool_navigation_item_selector));
    }

    @Override // com.oplus.aiunit.vision.hgc
    public float c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0.0f;
    }
}
