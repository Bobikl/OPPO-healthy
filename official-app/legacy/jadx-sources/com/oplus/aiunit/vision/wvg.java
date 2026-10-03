package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.utils.Logger;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/wvg;", "", "", "b", "", "a", "Ljava/lang/String;", "sessionId", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class wvg {

    @NotNull
    public static final wvg INSTANCE = new wvg();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String sessionId;

    @NotNull
    public final String a() {
        String str = sessionId;
        if (str != null) {
            return str;
        }
        String string = UUID.randomUUID().toString();
        sessionId = string;
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString().apply { sessionId = this }");
        return string;
    }

    public final void b() {
        Logger.b(k6k.e(), "SessionIdHelper", "updateSessionId", null, null, 12, null);
        sessionId = UUID.randomUUID().toString();
    }
}
