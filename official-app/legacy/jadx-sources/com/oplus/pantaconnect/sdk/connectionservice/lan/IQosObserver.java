package com.oplus.pantaconnect.sdk.connectionservice.lan;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/lan/IQosObserver;", "", "onSocketQosAvailable", "", "deviceId", "", "socketQos", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/SocketQos;", "onSocketQosUnavailable", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IQosObserver {
    void onSocketQosAvailable(@NotNull String deviceId, @NotNull SocketQos socketQos);

    void onSocketQosUnavailable(@NotNull String deviceId, @NotNull SocketQos socketQos);
}
