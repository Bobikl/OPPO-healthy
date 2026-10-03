package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface GameAssistantProto$GameRoundStateOrBuilder extends MessageLiteOrBuilder {
    int getGameId();

    String getGameName();

    ByteString getGameNameBytes();

    int getGameRoundNum();

    int getGameRoundState();

    int getTimestamp();
}
