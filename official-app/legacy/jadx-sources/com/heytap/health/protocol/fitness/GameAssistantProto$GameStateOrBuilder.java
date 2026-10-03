package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface GameAssistantProto$GameStateOrBuilder extends MessageLiteOrBuilder {
    int getGameId();

    String getGameName();

    ByteString getGameNameBytes();

    int getGameState();

    ByteString getIcon();

    int getTimestamp();
}
