package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/z53;", "", "Companion", "a", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class z53 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.z53$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/z53$a;", "", "", "msg", "", "d", "a", "b", MapSchema.FIELD_NAME_ENTRY, "", "c", "TAG", "Ljava/lang/String;", "<init>", "()V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
        }

        public final void b(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            a7b.b("cervical_vertebra", msg);
        }

        public final void c(@Nullable Throwable e2) {
            a7b.b("cervical_vertebra", a7b.e(e2));
        }

        public final void d(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            a7b.f("cervical_vertebra", msg);
        }

        public final void e(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            a7b.m("cervical_vertebra", msg);
        }
    }
}
