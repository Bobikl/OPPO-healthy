package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface CtrlCmdOrBuilder extends MessageLiteOrBuilder {
    GMS_CMD getCmd();

    int getCmdValue();

    CMD_DIRECTION getDirection();

    int getDirectionValue();

    ByteString getParam();
}
