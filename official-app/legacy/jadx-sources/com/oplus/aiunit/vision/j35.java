package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\f\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000\u001a\u0013\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "c", "", "a", "(Ljava/lang/Integer;)I", "", "b", "(Ljava/lang/Long;)J", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class j35 {
    public static final int a(@Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final long b(@Nullable Long l2) {
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    @NotNull
    public static final String c(@Nullable String str) {
        return str != null ? str : "";
    }
}
