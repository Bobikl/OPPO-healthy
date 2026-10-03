package com.oplus.aiunit.vision;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/tr9;", "", "health_base_release"}, k = 1, mv = {1, 8, 0})
public interface tr9 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static long a(@NotNull tr9 tr9Var, @Nullable Bundle bundle) {
            boolean z = false;
            if (bundle != null && bundle.containsKey("location_Time")) {
                z = true;
            }
            if (z) {
                return RangesKt___RangesKt.coerceAtMost(bundle.getLong("location_Time"), System.currentTimeMillis());
            }
            return 0L;
        }
    }
}
