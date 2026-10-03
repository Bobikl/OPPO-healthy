package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JV\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&JV\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&JV\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&JV\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&JV\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/bs9;", "", "", "tag", "msg", "", "isMsgContainsSensitiveInfo", "sensitiveMsg", "printThreadInfo", "", "stackTraceDepth", "printClassNameAndMethodName", "", "throwable", "", "b", "d", "c", "a", MapSchema.FIELD_NAME_ENTRY, "OLog_release"}, k = 1, mv = {1, 8, 0})
public interface bs9 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(bs9 bs9Var, String str, String str2, boolean z, String str3, boolean z2, int i, boolean z3, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
            }
            bs9Var.d(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : th);
        }

        public static /* synthetic */ void b(bs9 bs9Var, String str, String str2, boolean z, String str3, boolean z2, int i, boolean z3, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            bs9Var.e(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : th);
        }

        public static /* synthetic */ void c(bs9 bs9Var, String str, String str2, boolean z, String str3, boolean z2, int i, boolean z3, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
            }
            bs9Var.c(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : th);
        }

        public static /* synthetic */ void d(bs9 bs9Var, String str, String str2, boolean z, String str3, boolean z2, int i, boolean z3, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
            }
            bs9Var.b(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : th);
        }

        public static /* synthetic */ void e(bs9 bs9Var, String str, String str2, boolean z, String str3, boolean z2, int i, boolean z3, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            bs9Var.a(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : th);
        }
    }

    void a(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable);

    void b(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable);

    void c(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable);

    void d(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable);

    void e(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable);
}
