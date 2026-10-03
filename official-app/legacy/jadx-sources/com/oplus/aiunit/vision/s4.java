package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeader;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class s4 {
    public static final int DEFAULT_PROTOCOL_VERSION = 1;
    private String actionAnchor;
    private String bodyMd5;
    private int commandId;
    private int protocolVersion;

    public s4(int i, int i2) {
        this(i, i2, "");
    }

    @NotNull
    private static String generateMsgUniqueId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public WatchAppProto$MsgHeader createMsgHeader(String str, int i, int i2, boolean z) {
        return WatchAppProto$MsgHeader.newBuilder().setActionAnchor(str).setCommandId(i2).setProtocolVersion(i).setIsAck(z).build();
    }

    public WatchAppProto$AppCommandMsg getAckMsg(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        return WatchAppProto$AppCommandMsg.newBuilder().setHeader(getDefaultAckMsgHeader(watchAppProto$AppCommandMsg.getHeader().getActionAnchor(), watchAppProto$AppCommandMsg.getHeader().getCommandId())).build();
    }

    public String getActionAnchor() {
        return this.actionAnchor;
    }

    public String getBodyMd5() {
        return this.bodyMd5;
    }

    public int getCommandId() {
        return this.commandId;
    }

    public WatchAppProto$MsgHeader getDefaultAckMsgHeader(String str, int i) {
        return createMsgHeader(str, 1, i, true);
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    public abstract void onMsgDispatch(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg);

    public void setBodyMd5(String str) {
        this.bodyMd5 = str;
    }

    public String toString() {
        return "AbsMsgReceiver{protocolVersion=" + this.protocolVersion + ", commandId=" + this.commandId + ", actionAnchor='" + this.actionAnchor + "', bodyMd5='" + this.bodyMd5 + "'}";
    }

    public s4(int i, int i2, String str) {
        this(i, i2, generateMsgUniqueId(), str);
    }

    public s4(int i, int i2, String str, String str2) {
        this.protocolVersion = i;
        this.commandId = i2;
        this.actionAnchor = str;
        this.bodyMd5 = str2;
    }
}
