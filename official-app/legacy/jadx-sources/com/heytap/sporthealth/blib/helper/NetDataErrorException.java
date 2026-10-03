package com.heytap.sporthealth.blib.helper;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/NetDataErrorException;", "Lcom/heytap/sporthealth/blib/helper/UIStateException;", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "lib_ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NetDataErrorException extends UIStateException {
    public static final int $stable = 0;
    private final int code;

    @NotNull
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetDataErrorException(int i, @NotNull String message) {
        super(DevicePageType.SERVER_INTERNAL_ERROR, null, 2, null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // com.heytap.sporthealth.blib.helper.UIStateException, java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ NetDataErrorException(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
