package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&JD\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\rH&J:\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\rH&J\"\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\rH&J8\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\rH&¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/a6k;", "", "", "Lcom/oplus/aiunit/vision/ez9;", "data", "", MapSchema.FIELD_NAME_ENTRY, "b", "", "startIndex", "limit", y15.PARAMS_DATA_TYPE, "eventCacheStatus", "Ljava/lang/Class;", "clazz", "d", "c", "f", "ids", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface a6k {
    int a(@NotNull List<Long> ids, int eventCacheStatus, int dataType, @NotNull Class<? extends ez9> clazz);

    int b(@NotNull List<? extends ez9> data);

    @Nullable
    List<ez9> c(long startIndex, int limit, int eventCacheStatus, @NotNull Class<? extends ez9> clazz);

    @Nullable
    List<ez9> d(long startIndex, int limit, int dataType, int eventCacheStatus, @NotNull Class<? extends ez9> clazz);

    int e(@NotNull List<? extends ez9> data);

    int f(int dataType, @NotNull Class<? extends ez9> clazz);
}
