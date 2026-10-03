package com.heytap.sports.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/share/widget/DataTypesLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "child", "", "addView", "removeAllViews", "a", "i", "Landroid/widget/LinearLayout;", "getInnerContainer", "()Landroid/widget/LinearLayout;", "setInnerContainer", "(Landroid/widget/LinearLayout;)V", "innerContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShareMsgMask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareMsgMask.kt\ncom/heytap/sports/share/widget/DataTypesLayout\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,303:1\n43#2:304\n*S KotlinDebug\n*F\n+ 1 ShareMsgMask.kt\ncom/heytap/sports/share/widget/DataTypesLayout\n*L\n281#1:304\n*E\n"})
public final class DataTypesLayout extends LinearLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public LinearLayout innerContainer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DataTypesLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final LinearLayout a(@Nullable View child) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(child);
        return linearLayout;
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child) {
        LinearLayout linearLayout = this.innerContainer;
        if (linearLayout != null) {
            Intrinsics.checkNotNull(linearLayout);
            if (linearLayout.getChildCount() < 4) {
                LinearLayout linearLayout2 = this.innerContainer;
                Intrinsics.checkNotNull(linearLayout2);
                linearLayout2.addView(child);
                return;
            }
        }
        LinearLayout linearLayoutA = a(child);
        this.innerContainer = linearLayoutA;
        super.addView(linearLayoutA, 0);
    }

    @Nullable
    public final LinearLayout getInnerContainer() {
        return this.innerContainer;
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.innerContainer = null;
        super.removeAllViews();
    }

    public final void setInnerContainer(@Nullable LinearLayout linearLayout) {
        this.innerContainer = linearLayout;
    }

    public /* synthetic */ DataTypesLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DataTypesLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
