package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface GameAssistantProto$GameRoundDataOrBuilder extends MessageLiteOrBuilder {
    int getGameId();

    int getGameReportCalorie();

    ByteString getGameReportHrDetail();

    int getGameReportHrInterval();

    int getGameReportStartTime();

    int getGameReportStressAvg();
}
