package com.oplus.aiunit.vision;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.heytap.deviceinfo.MyDevicesInterface;
import com.oplus.mydevices.sdk.IDeviceCallback;
import com.oplus.mydevices.sdk.IResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public abstract class e4 implements IDeviceCallback {
    public static final String TAG = "LA.AbsIDeviceCallback";

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    @NotNull
    public Bundle call(int i, @Nullable Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("bundle call:");
        sb.append(i);
        return bundle == null ? new Bundle() : bundle;
    }

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    public void deleteDevice(@NonNull String str, @NonNull IResult iResult) {
    }

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    public void onCardHide() {
    }

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    public void onCardShow() {
    }

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    public void onConnectResult(int i) {
    }

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    public void onDeviceServiceConnected(@NotNull MyDevicesInterface myDevicesInterface) {
    }

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    public void onDeviceServiceDisconnected() {
    }

    @Override // com.oplus.mydevices.sdk.IDeviceCallback
    public void setAlias(@NotNull String str, @NotNull String str2, @NotNull IResult iResult) {
    }
}
