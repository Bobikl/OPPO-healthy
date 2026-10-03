package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$ExerciseLapSummaryOrBuilder extends MessageLiteOrBuilder {
    DataProto$StatsDataPoint getLapMetrics(int i);

    int getLapMetricsCount();

    List<DataProto$StatsDataPoint> getLapMetricsList();
}
