package io.netty.incubator.codec.quic.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lio/netty/incubator/codec/quic/util/IDevice;", "", "adg", "", "brand", "getCarrierName", "getUUIDHashCode", "isConnectNet", "", "isExternalStorageMediaMounted", "model", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IDevice {
    @NotNull
    String adg();

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
}
