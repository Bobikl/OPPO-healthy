package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectionCallback;", "", "onConnectionFailure", "", "device", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice;", EngineConstant.REASON, "", "onConnectionInitiated", "onConnectionSuccess", "connectionInfo", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/GlobalDeviceConnectionInfo;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GlobalDeviceConnectionCallback {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onConnectionFailure(@NotNull GlobalDeviceConnectionCallback globalDeviceConnectionCallback, @Nullable DisplayDevice displayDevice, @NotNull Throwable th) {
        }

        public static /* synthetic */ void onConnectionFailure$default(GlobalDeviceConnectionCallback globalDeviceConnectionCallback, DisplayDevice displayDevice, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConnectionFailure");
            }
            if ((i & 1) != 0) {
                displayDevice = null;
            }
            globalDeviceConnectionCallback.onConnectionFailure(displayDevice, th);
        }

        public static void onConnectionInitiated(@NotNull GlobalDeviceConnectionCallback globalDeviceConnectionCallback, @NotNull DisplayDevice displayDevice) {
        }

        public static void onConnectionSuccess(@NotNull GlobalDeviceConnectionCallback globalDeviceConnectionCallback, @NotNull DisplayDevice displayDevice, @NotNull GlobalDeviceConnectionInfo globalDeviceConnectionInfo) {
        }
    }

    void onConnectionFailure(@Nullable DisplayDevice device, @NotNull Throwable reason);

    void onConnectionInitiated(@NotNull DisplayDevice device);

    void onConnectionSuccess(@NotNull DisplayDevice device, @NotNull GlobalDeviceConnectionInfo connectionInfo);
}
