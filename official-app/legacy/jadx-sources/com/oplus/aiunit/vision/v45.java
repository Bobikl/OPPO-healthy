package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ=\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ=\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/v45;", "Lcom/oplus/aiunit/vision/gs9;", "", "tag", "format", "", "error", "", "", "obj", "", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)Z", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "a", "Z", "isShowFilterLog", "()Z", "setShowFilterLog", "(Z)V", "<init>", "()V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class v45 implements gs9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final v45 b = new v45();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isShowFilterLog;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.v45$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/v45$a;", "", "Lcom/oplus/aiunit/vision/v45;", "instance", "Lcom/oplus/aiunit/vision/v45;", "a", "()Lcom/oplus/aiunit/vision/v45;", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final v45 a() {
            return v45.b;
        }
    }

    @Override // com.oplus.aiunit.vision.gs9
    public boolean d(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return this.isShowFilterLog;
    }

    @Override // com.oplus.aiunit.vision.gs9
    public boolean e(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return this.isShowFilterLog;
    }

    @Override // com.oplus.aiunit.vision.gs9
    public boolean i(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return this.isShowFilterLog;
    }

    @Override // com.oplus.aiunit.vision.gs9
    public boolean v(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return this.isShowFilterLog;
    }

    @Override // com.oplus.aiunit.vision.gs9
    public boolean w(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        return this.isShowFilterLog;
    }
}
