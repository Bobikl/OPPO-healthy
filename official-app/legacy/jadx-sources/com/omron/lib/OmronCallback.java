package com.omron.lib;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronCallback {
    void cleanRegistration();

    List<String> getDeviceTypeList(int i);

    boolean isBluetoothOn();

    boolean isMonitoring();

    boolean isRegistered();

    void requestIdentifier(String str, String str2, Context context, IdentifierCallback identifierCallback);

    void startBindScan(int i, @Size(max = 300, min = 1) int i2, @NonNull BleScanDeviceCallback bleScanDeviceCallback);

    void startScan(int i, @Size(max = 300, min = 1) int i2, @Nullable String str, @NonNull BleScanDeviceCallback bleScanDeviceCallback);

    void startSyncScan(List<BleScanDevice> list, @Size(max = 300, min = 1) int i, @NonNull BleScanDeviceCallback bleScanDeviceCallback);

    void stopScan();
}
