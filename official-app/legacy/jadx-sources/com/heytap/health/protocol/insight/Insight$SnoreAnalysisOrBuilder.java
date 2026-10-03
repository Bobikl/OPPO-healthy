package com.heytap.health.protocol.insight;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface Insight$SnoreAnalysisOrBuilder extends MessageLiteOrBuilder {
    Insight$SnoreResult getDetails(int i);

    int getDetailsCount();

    List<Insight$SnoreResult> getDetailsList();

    int getTimestamp();

    int getTotalOsaResult();
}
