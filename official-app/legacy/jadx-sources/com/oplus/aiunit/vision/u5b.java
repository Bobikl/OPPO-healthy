package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"", "tag", "content", "", "a", "device_manager_release"}, k = 2, mv = {1, 8, 0})
public final class u5b {
    public static final void a(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        if (tag.length() > 0) {
            ml4.a("LockUtils", "tag:" + tag + "," + content);
        }
    }
}
