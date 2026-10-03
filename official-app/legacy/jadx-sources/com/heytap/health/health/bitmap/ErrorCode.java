package com.heytap.health.health.bitmap;

import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/health/bitmap/ErrorCode;", "", "code", "", iim.a.f, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "SUCCESS", "PARAM_INVALID", "DATA_NOT_SUPPORT_DRAW", "DATA_ERROR", "CREATE_BITMAP_ERROR", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ErrorCode {
    SUCCESS(0, "SUCCESS"),
    PARAM_INVALID(10001, "PARAM_INVALID"),
    DATA_NOT_SUPPORT_DRAW(10002, "DATA_NOT_SUPPORT_DRAW"),
    DATA_ERROR(10003, "DATA_ERROR"),
    CREATE_BITMAP_ERROR(10004, "CREATE_BITMAP_ERROR");

    private final int code;

    @NotNull
    private final String description;

    ErrorCode(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }
}
