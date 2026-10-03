package com.oplus.aiunit.vision;

import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/yoe;", "", "", "expression", "errorMessage", "", "a", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class yoe {

    @NotNull
    public static final yoe INSTANCE = new yoe();

    public final void a(boolean expression, @NotNull Object errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (expression) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(errorMessage.toString());
        TrackLogger.d("Preconditions", illegalArgumentException.getLocalizedMessage(), illegalArgumentException, new Object[0]);
    }
}
