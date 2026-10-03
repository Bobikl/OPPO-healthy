package com.heytap.sporthealth.blib.helper;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/UIStateException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "state", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "message", "", "(Lcom/heytap/health/base/view/exceptionview/DevicePageType;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getState", "()Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "lib_ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class UIStateException extends RuntimeException {
    public static final int $stable = 0;

    @NotNull
    private final String message;

    @NotNull
    private final DevicePageType state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIStateException(@NotNull DevicePageType state, @NotNull String message) {
        super("BusinessException");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(message, "message");
        this.state = state;
        this.message = message;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @NotNull
    public final DevicePageType getState() {
        return this.state;
    }

    public /* synthetic */ UIStateException(DevicePageType devicePageType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(devicePageType, (i & 2) != 0 ? "" : str);
    }
}
