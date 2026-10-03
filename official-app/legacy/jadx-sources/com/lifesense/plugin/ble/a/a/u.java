package com.lifesense.plugin.ble.a.a;

import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;

/* JADX INFO: loaded from: classes5.dex */
public enum u {
    UNKNOWN(0),
    RESPONSE_A5_AUTH(240),
    RESPONSE_A5_USER_INFO(241),
    RESPONSE_A5_DATA_CONFIRM(242),
    RESPONSE_WECHAT_AUTH(243),
    RESPONSE_WECHAT_INIT(Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER),
    RESPONSE_WECHAT_DATA_CONFIRM(UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE),
    RESPONSE_MESSAGE_REMINDER(246),
    RESPONSE_PUSH_COMMAND(247),
    RESPONSE_CALL_MESSAGE(248),
    RESPONSE_QUERY_MESSAGE(249);

    private int a;

    u(int i) {
        this.a = i;
    }
}
