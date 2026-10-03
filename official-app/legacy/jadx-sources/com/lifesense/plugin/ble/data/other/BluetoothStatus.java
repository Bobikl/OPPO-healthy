package com.lifesense.plugin.ble.data.other;

import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;

/* JADX INFO: loaded from: classes5.dex */
public enum BluetoothStatus {
    UNKNOWN(240),
    BLUETOOTH_TURNING_OFF_WITH_CODE(241),
    BLUETOOTH_STATE_OFF_WITH_CODE(242),
    BLUETOOTH_TURNING_OFF(243),
    BLUETOOTH_STATE_OFF(Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER),
    BLUETOOTH_TURNING_ON_WITH_CODE(UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE),
    BLUETOOTH_STATE_ON_WITH_CODE(246),
    BLUETOOTH_TURNING_ON(247),
    BLUETOOTH_STATE_ON(248);

    private int value;

    BluetoothStatus(int i) {
        this.value = i;
    }

    public int getStatusValue() {
        return this.value;
    }
}
