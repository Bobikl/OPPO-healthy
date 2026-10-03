package com.heytap.connect.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/heytap/connect/api/IDevice;", "", "", "isConnectNet", "()Z", "", "getUUIDHashCode", "()Ljava/lang/String;", "isExternalStorageMediaMounted", "getCarrierName", "brand", "model", "packageName", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IDevice {
    @NotNull
    String brand();

    @Nullable
    String getCarrierName();

    @NotNull
    String getUUIDHashCode();

    boolean isConnectNet();

    boolean isExternalStorageMediaMounted();

    @NotNull
    String model();

    @NotNull
    String packageName();
}
