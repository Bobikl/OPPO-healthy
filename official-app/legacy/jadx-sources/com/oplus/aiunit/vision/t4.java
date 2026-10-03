package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBody;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeader;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes16.dex */
public abstract class t4 {
    public static final String TAG = "AbsMsgSendClient";

    public WatchAppProto$AppCommandMsg a(@NonNull g5 g5Var) {
        WatchAppProto$MsgHeader watchAppProto$MsgHeaderBuild = WatchAppProto$MsgHeader.newBuilder().setActionAnchor(g5Var.getActionAnchor()).setProtocolVersion(g5Var.getProtocolVersion()).setCommandId(g5Var.getCommandId()).setBodyMd5(g5Var.getBodyMd5()).build();
        WatchAppProto$MsgBody msgRequestBody = g5Var.getMsgRequestBody();
        return msgRequestBody == null ? WatchAppProto$AppCommandMsg.newBuilder().setHeader(watchAppProto$MsgHeaderBuild).build() : WatchAppProto$AppCommandMsg.newBuilder().setHeader(watchAppProto$MsgHeaderBuild).setBody(msgRequestBody).build();
    }

    public void b(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg, rl4.c cVar) {
        try {
            s5l.a(TAG, "[sendMessage] -->  send msg = " + watchAppProto$AppCommandMsg.toString());
            gl4.devicePrimary.messageApi.e(new MessageEvent(267, watchAppProto$AppCommandMsg.getHeader().getCommandId(), watchAppProto$AppCommandMsg.toByteArray()), cVar);
        } catch (Exception e2) {
            s5l.b(TAG, "[sendMessage] --> " + e2.getMessage());
        }
    }

    public <T extends g5> void c(@NonNull T t, ys9 ys9Var) {
        d(a(t), ys9Var);
    }

    public abstract void d(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg, ys9 ys9Var);
}
