package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ne8;", "Lcom/oplus/aiunit/vision/nq9;", "", "tag", "message", "", "d", "i", "w", MapSchema.FIELD_NAME_ENTRY, "", "caller", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class ne8 implements nq9 {
    @Override // com.oplus.aiunit.vision.nq9
    @NotNull
    public String a(@Nullable Throwable caller) {
        String strE = a7b.e(caller);
        Intrinsics.checkNotNullExpressionValue(strE, "getStackTraceString(caller)");
        return strE;
    }

    @Override // com.oplus.aiunit.vision.nq9
    public void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z7b.b(tag, message);
    }

    @Override // com.oplus.aiunit.vision.nq9
    public void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z7b.c(tag, message);
    }

    @Override // com.oplus.aiunit.vision.nq9
    public void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z7b.f(tag, message);
    }

    @Override // com.oplus.aiunit.vision.nq9
    public void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z7b.j(tag, message);
    }
}
