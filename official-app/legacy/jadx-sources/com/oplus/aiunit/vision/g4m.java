package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/g4m;", "", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class g4m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.g4m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/g4m$a;", "", "", "ssoid", "", "a", "(Ljava/lang/String;)Ljava/lang/Integer;", "value", "", "b", "c", "SP_BASE_LINE_LEFT_TIME", "Ljava/lang/String;", "SP_STATE", "SP_WRIST_TEMPERATURE_FILE_NAME", "<init>", "()V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Integer a(@NotNull String ssoid) {
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            String str = "SP_BASE_LINE_LEFT_TIME-" + vbb.b(ssoid);
            v9g v9gVarX = v9g.x("SP_WRIST_TEMPERATURE_FILE_NAME");
            if (v9gVarX.n(str)) {
                return Integer.valueOf(v9gVarX.z(str, 0));
            }
            return null;
        }

        @JvmStatic
        public final void b(@NotNull String ssoid, int value) {
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            v9g.x("SP_WRIST_TEMPERATURE_FILE_NAME").S("SP_BASE_LINE_LEFT_TIME-" + vbb.b(ssoid), value);
        }

        @JvmStatic
        public final void c(@NotNull String ssoid, int value) {
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            v9g.x("SP_STATE-").S("SP_BASE_LINE_LEFT_TIME-" + vbb.b(ssoid), value);
        }
    }
}
