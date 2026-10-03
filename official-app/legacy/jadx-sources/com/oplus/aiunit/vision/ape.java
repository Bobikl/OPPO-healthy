package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.utils.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/ape;", "", "", "expression", "errorMessage", "", "a", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class ape {

    @NotNull
    public static final ape INSTANCE = new ape();

    public final void a(boolean expression, @NotNull Object errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (expression) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(errorMessage.toString());
        Logger loggerE = k6k.e();
        String localizedMessage = illegalArgumentException.getLocalizedMessage();
        Intrinsics.checkNotNullExpressionValue(localizedMessage, "e.localizedMessage");
        Logger.d(loggerE, "Preconditions", localizedMessage, illegalArgumentException, null, 8, null);
    }
}
