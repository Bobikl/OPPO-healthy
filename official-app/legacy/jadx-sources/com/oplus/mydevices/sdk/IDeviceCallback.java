package com.oplus.mydevices.sdk;

import android.os.Bundle;
import com.heytap.deviceinfo.MyDevicesInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J \u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0019"}, d2 = {"Lcom/oplus/mydevices/sdk/IDeviceCallback;", "", "call", "Landroid/os/Bundle;", "code", "", "params", "connect", "", "deviceId", "", "result", "Lcom/oplus/mydevices/sdk/IResult;", "deleteDevice", "disconnect", "onCardHide", "onCardShow", "onConnectResult", "resultCode", "onDeviceServiceConnected", "myDevicesInterface", "Lcom/heytap/deviceinfo/MyDevicesInterface;", "onDeviceServiceDisconnected", "setAlias", "newName", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public interface IDeviceCallback {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        @NotNull
        public static Bundle call(@NotNull IDeviceCallback iDeviceCallback, int i, @Nullable Bundle bundle) {
            return new Bundle();
        }

        public static void connect(@NotNull IDeviceCallback iDeviceCallback, @NotNull String deviceId, @NotNull IResult result) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void deleteDevice(@NotNull IDeviceCallback iDeviceCallback, @NotNull String deviceId, @NotNull IResult result) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void disconnect(@NotNull IDeviceCallback iDeviceCallback, @NotNull String deviceId, @NotNull IResult result) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void onCardHide(@NotNull IDeviceCallback iDeviceCallback) {
        }

        public static void onCardShow(@NotNull IDeviceCallback iDeviceCallback) {
        }

        public static void onConnectResult(@NotNull IDeviceCallback iDeviceCallback, int i) {
        }

        public static void onDeviceServiceConnected(@NotNull IDeviceCallback iDeviceCallback, @NotNull MyDevicesInterface myDevicesInterface) {
            Intrinsics.checkNotNullParameter(myDevicesInterface, "myDevicesInterface");
        }

        public static void onDeviceServiceDisconnected(@NotNull IDeviceCallback iDeviceCallback) {
        }

        public static void setAlias(@NotNull IDeviceCallback iDeviceCallback, @NotNull String deviceId, @NotNull String newName, @NotNull IResult result) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(newName, "newName");
            Intrinsics.checkNotNullParameter(result, "result");
        }
    }

    @NotNull
    Bundle call(int code, @Nullable Bundle params);

    void connect(@NotNull String deviceId, @NotNull IResult result);

    void deleteDevice(@NotNull String deviceId, @NotNull IResult result);

    void disconnect(@NotNull String deviceId, @NotNull IResult result);

    void onCardHide();

    void onCardShow();

    void onConnectResult(int resultCode);

    void onDeviceServiceConnected(@NotNull MyDevicesInterface myDevicesInterface);

    void onDeviceServiceDisconnected();

    void setAlias(@NotNull String deviceId, @NotNull String newName, @NotNull IResult result);
}
