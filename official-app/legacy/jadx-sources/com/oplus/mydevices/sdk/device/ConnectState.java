package com.oplus.mydevices.sdk.device;

import androidx.annotation.Keep;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/oplus/mydevices/sdk/device/ConnectState;", "", "(Ljava/lang/String;I)V", "CONNECTING", "CONNECTED", LanConstants.STATE_DISCONNECTED, LanConstants.STATE_DISCONNECTING, "UNAUTHORIZED", "UNDISCOVERED", "DISCOVERED", "COORDINATED", "ON_LINE", "OFF_LINE", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public enum ConnectState {
    CONNECTING,
    CONNECTED,
    DISCONNECTED,
    DISCONNECTING,
    UNAUTHORIZED,
    UNDISCOVERED,
    DISCOVERED,
    COORDINATED,
    ON_LINE,
    OFF_LINE
}
