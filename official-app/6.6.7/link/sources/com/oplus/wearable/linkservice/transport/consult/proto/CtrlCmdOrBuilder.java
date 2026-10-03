package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface CtrlCmdOrBuilder extends MessageLiteOrBuilder {
    GMS_CMD getCmd();

    int getCmdValue();

    CMD_DIRECTION getDirection();

    int getDirectionValue();

    ByteString getParam();
}
