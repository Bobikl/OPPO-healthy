package com.heytap.health.protocol.insight;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface Insight$MultipleSignsAnalysisOrBuilder extends MessageLiteOrBuilder {
    Insight$SignsData getDetails(int i);

    int getDetailsCount();

    List<Insight$SignsData> getDetailsList();

    int getStatus();

    int getTimestamp();

    int getType();
}
