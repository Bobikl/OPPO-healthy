package com.oplus.mydevices.sdk.linkage;

import androidx.annotation.Keep;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/oplus/mydevices/sdk/linkage/CapsuleType;", "", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SET_ACTIVE", "CONNECT", "CONNECTED", "LOW_BATTERY", "DISCONNECT", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public enum CapsuleType {
    SET_ACTIVE("setActive"),
    CONNECT("connect"),
    CONNECTED(DeviceInfoCompat.DeviceState.CONNECTED),
    LOW_BATTERY("lowBattery"),
    DISCONNECT("disConnect");

    CapsuleType(String str) {
    }
}
