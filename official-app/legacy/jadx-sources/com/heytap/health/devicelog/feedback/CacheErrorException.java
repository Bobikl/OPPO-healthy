package com.heytap.health.devicelog.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/devicelog/feedback/CacheErrorException;", "Ljava/lang/IllegalStateException;", "msg", "", "fbOption", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "(Ljava/lang/String;Lcom/heytap/health/devicelog/feedback/FeedbackOption;)V", "getFbOption", "()Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "getMsg", "()Ljava/lang/String;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheErrorException extends IllegalStateException {
    public static final int $stable = 8;

    @NotNull
    private final FeedbackOption fbOption;

    @NotNull
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheErrorException(@NotNull String msg, @NotNull FeedbackOption fbOption) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(fbOption, "fbOption");
        this.msg = msg;
        this.fbOption = fbOption;
    }

    @NotNull
    public final FeedbackOption getFbOption() {
        return this.fbOption;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }
}
