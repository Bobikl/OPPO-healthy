package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface GameAssistantProto$GameFlashbackMsgOrBuilder extends MessageLiteOrBuilder {
    ByteString getByteIcon();

    int getGameId();

    int getStatus();

    String getStrContent();

    ByteString getStrContentBytes();

    String getStrTitle();

    ByteString getStrTitleBytes();
}
