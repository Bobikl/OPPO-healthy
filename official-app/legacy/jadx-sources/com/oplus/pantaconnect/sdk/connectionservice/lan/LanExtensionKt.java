package com.oplus.pantaconnect.sdk.connectionservice.lan;

import com.oplus.pantaconnect.connection.LanConnectionHoldingParams;
import com.oplus.pantaconnect.connection.SocketQosResult;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, d2 = {"toInt", "", "", "toLanConnectionHoldingParams", "Lcom/oplus/pantaconnect/connection/LanConnectionHoldingParams;", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanConnectionHoldingOptions;", "toSocketQos", "Lcom/oplus/pantaconnect/sdk/connectionservice/lan/SocketQos;", "Lcom/oplus/pantaconnect/connection/SocketQosResult;", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LanExtensionKt {
    public static final int toInt(@Nullable byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return ByteBuffer.wrap(bArr).getInt();
    }

    @NotNull
    public static final LanConnectionHoldingParams toLanConnectionHoldingParams(@NotNull LanConnectionHoldingOptions lanConnectionHoldingOptions) {
        return LanConnectionHoldingParams.newBuilder().setDeviceId(lanConnectionHoldingOptions.getDeviceId()).setIsForcedHolding(lanConnectionHoldingOptions.isForcedHolding()).build();
    }

    @NotNull
    public static final SocketQos toSocketQos(@NotNull SocketQosResult socketQosResult) {
        SocketQos socketQos = new SocketQos();
        socketQos.setBandWidth(socketQosResult.getBandWidth());
        socketQos.setDelay(socketQosResult.getDelay());
        socketQos.setPacketLossRate(socketQosResult.getPacketLossRate());
        socketQos.setPeerIp(socketQosResult.getPeerIp());
        socketQos.setRssi(socketQosResult.getRssi());
        socketQos.setRemoteRssi(socketQosResult.getRemoteRssi());
        for (SocketState socketState : SocketState.values()) {
            if (socketState.ordinal() == socketQosResult.getSocketState().ordinal()) {
                socketQos.setSocketState(socketState);
                break;
            }
        }
        return socketQos;
    }
}
