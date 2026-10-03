package com.oplus.mydevices.sdk.internal;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/IDeviceCallProcessor;", "", "process", "Landroid/os/Bundle;", "method", "", "args", "extra", "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public interface IDeviceCallProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/IDeviceCallProcessor$Companion;", "", "()V", "create", "Lcom/oplus/mydevices/sdk/internal/IDeviceCallProcessor;", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final IDeviceCallProcessor create() {
            return new DeviceCallProcessor();
        }
    }

    @NotNull
    Bundle process(@NotNull String method, @NotNull String args, @NotNull Bundle extra);
}
