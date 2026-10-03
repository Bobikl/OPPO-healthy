package com.heytap.store.homemodule.utils;

import android.view.View;
import androidx.databinding.BindingAdapter;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"isGone", "", "Landroid/view/View;", "value", "", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DarkTextColorUtilKt {
    @BindingAdapter({"forceDarkXiaoMi"})
    public static final void isGone(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            DarkTextColorUtil.INSTANCE.forceDarkXiaoMi(view);
        }
    }
}
