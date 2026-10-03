package com.oplus.nearx.track.internal.remoteconfig;

import com.oplus.aiunit.vision.h78;
import com.oplus.aiunit.vision.k6k;
import com.oplus.aiunit.vision.r7b;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ=\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ=\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/CloudConfigLogHook;", "Lcom/oplus/aiunit/vision/r7b$b;", "", "tag", "format", "", "error", "", "", "obj", "", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)Z", MapSchema.FIELD_NAME_ENTRY, "i", "v", "w", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class CloudConfigLogHook implements r7b.b {
    @Override // com.oplus.aiunit.vision.r7b.b
    public boolean d(@NotNull final String tag, @NotNull final String format, @Nullable final Throwable error, @NotNull final Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.CloudConfigLogHook.d.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                k6k.e().a(tag, format, error, obj);
            }
        });
        return true;
    }

    @Override // com.oplus.aiunit.vision.r7b.b
    public boolean e(@NotNull final String tag, @NotNull final String format, @Nullable final Throwable error, @NotNull final Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.CloudConfigLogHook.e.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                k6k.e().c(tag, format, error, obj);
            }
        });
        return true;
    }

    @Override // com.oplus.aiunit.vision.r7b.b
    public boolean i(@NotNull final String tag, @NotNull final String format, @Nullable final Throwable error, @NotNull final Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.CloudConfigLogHook.i.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                k6k.e().i(tag, format, error, obj);
            }
        });
        return true;
    }

    @Override // com.oplus.aiunit.vision.r7b.b
    public boolean v(@NotNull final String tag, @NotNull final String format, @Nullable final Throwable error, @NotNull final Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.CloudConfigLogHook.v.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                k6k.e().o(tag, format, error, obj);
            }
        });
        return true;
    }

    @Override // com.oplus.aiunit.vision.r7b.b
    public boolean w(@NotNull final String tag, @NotNull final String format, @Nullable final Throwable error, @NotNull final Object... obj) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(obj, "obj");
        h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.CloudConfigLogHook.w.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                k6k.e().q(tag, format, error, obj);
            }
        });
        return true;
    }
}
