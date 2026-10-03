package com.oplus.aiunit.vision;

import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/xti;", "", "Landroid/view/View;", "view", "", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class xti {
    public final boolean a(@Nullable View view) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View childAt = ((ViewGroup) view).getChildAt(0);
        Object tag = childAt != null ? childAt.getTag() : null;
        if (tag == null) {
            return false;
        }
        return ((Boolean) tag).booleanValue();
    }
}
