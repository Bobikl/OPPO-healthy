package com.heytap.sporthealth.blib.helper;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/DisconnectException;", "Lcom/heytap/sporthealth/blib/helper/SilentUIStateException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "lib_ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DisconnectException extends SilentUIStateException {
    public static final int $stable = 0;

    @NotNull
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public DisconnectException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.heytap.sporthealth.blib.helper.SilentUIStateException, com.heytap.sporthealth.blib.helper.UIStateException, java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectException(@NotNull String message) {
        super(DevicePageType.DEVICE_CONNECT_ERROR, null, 2, null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public /* synthetic */ DisconnectException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
