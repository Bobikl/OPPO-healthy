package com.heytap.health.protocol.insight;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface Insight$ScoreAnalysisOrBuilder extends MessageLiteOrBuilder {
    int getCurAvgScore();

    Insight$ScoreResult getDetails(int i);

    int getDetailsCount();

    List<Insight$ScoreResult> getDetailsList();

    int getLastAvgScore();

    int getTimestamp();
}
