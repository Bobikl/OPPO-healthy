package com.heytap.sporthealth.blib.helper;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/SilentUIStateException;", "Lcom/heytap/sporthealth/blib/helper/UIStateException;", "state", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "message", "", "(Lcom/heytap/health/base/view/exceptionview/DevicePageType;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "lib_ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SilentUIStateException extends UIStateException {
    public static final int $stable = 0;

    @NotNull
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public SilentUIStateException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.heytap.sporthealth.blib.helper.UIStateException, java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentUIStateException(@NotNull DevicePageType state, @NotNull String message) {
        super(state, message);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public /* synthetic */ SilentUIStateException(DevicePageType devicePageType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DevicePageType.SERVER_INTERNAL_ERROR : devicePageType, (i & 2) != 0 ? "" : str);
    }
}
