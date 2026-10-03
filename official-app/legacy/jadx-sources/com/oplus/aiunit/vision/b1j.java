package com.oplus.aiunit.vision;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/b1j;", "", "", "text", "", "a", "str", "b", "<init>", "()V", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
public final class b1j {

    @NotNull
    public static final b1j INSTANCE = new b1j();

    @JvmStatic
    public static final boolean a(@Nullable String text) {
        return TextUtils.isEmpty(text);
    }

    @JvmStatic
    public static final boolean b(@Nullable String str) {
        return str == null || Intrinsics.areEqual("", str) || Intrinsics.areEqual("null", str);
    }
}
