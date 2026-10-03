package com.heytap.health.band.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes15.dex */
public interface PressCmd$CmdOrBuilder extends MessageLiteOrBuilder {
    PressCmd$CMD_Tpye getCmd();

    int getCmdValue();

    PressTestProto$DIRECTION getDirection();

    int getDirectionValue();

    ByteString getParamData();
}
