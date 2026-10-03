package com.oplus.aiunit.vision;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/view/ViewGroup;", "", "layoutResId", "Landroid/view/View;", "a", "com.github.CymChad.brvah"}, k = 2, mv = {1, 6, 0})
public final class up {
    @NotNull
    public static final View a(@NotNull ViewGroup viewGroup, @LayoutRes int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        return viewInflate;
    }
}
