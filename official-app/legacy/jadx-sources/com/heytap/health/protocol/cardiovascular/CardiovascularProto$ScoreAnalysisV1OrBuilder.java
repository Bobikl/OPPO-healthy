package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$ScoreAnalysisV1OrBuilder extends MessageLiteOrBuilder {
    int getCurAvgScore();

    CardiovascularProto$ScoreResultV1 getDetails(int i);

    int getDetailsCount();

    List<CardiovascularProto$ScoreResultV1> getDetailsList();

    int getLastAvgScore();

    int getTimestamp();
}
