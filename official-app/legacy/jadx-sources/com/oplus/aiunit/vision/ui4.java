package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ui4;", "", "Companion", "a", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ui4 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ui4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/ui4$a;", "", "", "tag", "message", "", "b", "", "logType", "c", "a", "f", "d", MapSchema.FIELD_NAME_ENTRY, "CHUNK_SIZE", "I", "LOG_TYPE_D", "LOG_TYPE_E", "LOG_TYPE_I", "TAG", "Ljava/lang/String;", "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int logType, String tag, String message) {
            if (logType == 0) {
                d(tag, message);
            } else if (logType == 1) {
                f(tag, message);
            } else {
                if (logType != 4) {
                    return;
                }
                e(tag, message);
            }
        }

        public final void b(@NotNull String tag, @Nullable String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            c(1, tag, message);
        }

        public final void c(int logType, String tag, String message) {
            if (message != null) {
                byte[] bytes = message.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                if (bytes != null) {
                    if (bytes.length < 4000) {
                        ui4.INSTANCE.a(logType, tag, message);
                        return;
                    }
                    for (int i = 0; i < bytes.length; i += 4000) {
                        ui4.INSTANCE.a(logType, tag, new String(bytes, i, RangesKt___RangesKt.coerceAtMost(bytes.length - i, 4000), Charsets.UTF_8));
                    }
                }
            }
        }

        public final void d(String tag, String message) {
            z7b.b(tag, message);
        }

        public final void e(String tag, String message) {
            z7b.c(tag, message);
        }

        public final void f(String tag, String message) {
            z7b.f(tag, message);
        }
    }
}
