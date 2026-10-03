package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface GameAssistantProto$GameVibrationOrBuilder extends MessageLiteOrBuilder {
    String getGameName();

    ByteString getGameNameBytes();

    String getGameVibName();

    ByteString getGameVibNameBytes();

    int getGameVibType();
}
