package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/vnc;", "", "", "url", "", "a", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class vnc {

    @NotNull
    public static final vnc INSTANCE = new vnc();

    public final boolean a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return StringsKt__StringsJVMKt.startsWith$default(url, "http://", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(url, "https://", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(url, "ftp://", false, 2, null);
    }
}
