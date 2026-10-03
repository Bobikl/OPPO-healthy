package com.oplus.aiunit.vision;

import com.heytap.connect.api.logger.Logger;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ=\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ=\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/qpj;", "Lcom/heytap/connect/api/logger/Logger$ILogHook;", "", "tag", "format", "", "error", "", "", "obj", "", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)Z", MapSchema.FIELD_NAME_ENTRY, "i", "v", "w", "<init>", "()V", "Companion", "a", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class qpj implements Logger.ILogHook {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final qpj a = new qpj();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.qpj$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/qpj$a;", "", "Lcom/oplus/aiunit/vision/qpj;", "INSTANCE", "Lcom/oplus/aiunit/vision/qpj;", "a", "()Lcom/oplus/aiunit/vision/qpj;", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final qpj a() {
            return qpj.a;
        }
    }

    @Override // com.heytap.connect.api.logger.Logger.ILogHook
    public boolean d(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        t7b.INSTANCE.b(tag, format);
        return true;
    }

    @Override // com.heytap.connect.api.logger.Logger.ILogHook
    public boolean e(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        t7b.INSTANCE.e(tag, format, error);
        return true;
    }

    @Override // com.heytap.connect.api.logger.Logger.ILogHook
    public boolean i(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        t7b.INSTANCE.g(tag, format);
        return true;
    }

    @Override // com.heytap.connect.api.logger.Logger.ILogHook
    public boolean v(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        t7b.INSTANCE.j(tag, format);
        return true;
    }

    @Override // com.heytap.connect.api.logger.Logger.ILogHook
    public boolean w(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        t7b.INSTANCE.k(tag, format);
        return true;
    }
}
