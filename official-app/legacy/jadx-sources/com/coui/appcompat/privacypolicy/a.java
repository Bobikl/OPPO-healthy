package com.coui.appcompat.privacypolicy;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.oplus.aiunit.vision.b2n;
import com.support.privacypolicy.R$dimen;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002\"\u0018\u0010\u000e\u001a\u00020\u0005*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u0005*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroid/view/ViewGroup;", "Landroid/view/View;", "child", "", b2n.f, "", "dimRes", "Landroid/widget/LinearLayout$LayoutParams;", MapSchema.FIELD_NAME_ENTRY, "(Landroid/view/View;Ljava/lang/Integer;)Landroid/widget/LinearLayout$LayoutParams;", "resId", "b", "c", "(Landroid/view/View;)I", "intTag", "d", "(Landroid/view/ViewGroup;)I", "lastIntTag", "coui-support-privacypolicy_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCOUIPrivacyPolicyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUIPrivacyPolicyView.kt\ncom/coui/appcompat/privacypolicy/COUIPrivacyPolicyViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,338:1\n1#2:339\n169#3,2:340\n169#3,2:342\n*S KotlinDebug\n*F\n+ 1 COUIPrivacyPolicyView.kt\ncom/coui/appcompat/privacypolicy/COUIPrivacyPolicyViewKt\n*L\n276#1:340,2\n305#1:342,2\n*E\n"})
public final class a {
    public static final int b(View view, int i) {
        return view.getContext().getResources().getDimensionPixelSize(i);
    }

    public static final int c(View view) {
        Object tag = view.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static final int d(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return -1;
        }
        return c(ViewGroupKt.get(viewGroup, viewGroup.getChildCount() - 1));
    }

    public static final LinearLayout.LayoutParams e(View view, Integer num) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = num != null ? Integer.valueOf(b(view, num.intValue())).intValue() : 0;
        return layoutParams;
    }

    public static /* synthetic */ LinearLayout.LayoutParams f(View view, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return e(view, num);
    }

    public static final void g(ViewGroup viewGroup, View view) {
        LinearLayout.LayoutParams layoutParamsE;
        if (viewGroup.getChildCount() == 0) {
            layoutParamsE = f(viewGroup, null, 1, null);
        } else if (c(view) == 2) {
            layoutParamsE = e(viewGroup, Integer.valueOf(R$dimen.coui_component_privacy_policy_small_title_margin_top));
        } else {
            layoutParamsE = ((c(view) != 3 || viewGroup.getChildCount() <= 0) && d(viewGroup) != 3) ? e(viewGroup, Integer.valueOf(R$dimen.coui_component_privacy_policy_body_margin_top)) : e(viewGroup, Integer.valueOf(R$dimen.coui_component_privacy_policy_table_margin_vertical));
        }
        view.setLayoutParams(layoutParamsE);
    }
}
