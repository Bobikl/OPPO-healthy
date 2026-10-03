package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\f\u0010\u000bJA\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\r\u0010\u000bJA\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\u000e\u0010\u000bJA\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&¢\u0006\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/gs9;", "", "", "tag", "format", "", "error", "", "obj", "", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)Z", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface gs9 {
    boolean d(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

    boolean e(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

    boolean i(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

    boolean v(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);

    boolean w(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj);
}
