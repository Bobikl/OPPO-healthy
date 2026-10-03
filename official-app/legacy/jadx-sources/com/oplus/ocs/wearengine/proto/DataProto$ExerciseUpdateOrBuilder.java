package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$ExerciseUpdateOrBuilder extends MessageLiteOrBuilder {
    DataProto$ExerciseConfig getExerciseConfig();

    DataProto$ExerciseEndReason getExerciseEndReason();

    int getExerciseEndReasonValue();

    DataProto$ExerciseUpdate.SampleMetricsEntry getSampleMetrics(int i);

    int getSampleMetricsCount();

    List<DataProto$ExerciseUpdate.SampleMetricsEntry> getSampleMetricsList();

    DataProto$ExerciseState getState();

    int getStateValue();

    DataProto$StatsDataPoint getStatsMetrics(int i);

    int getStatsMetricsCount();

    List<DataProto$StatsDataPoint> getStatsMetricsList();

    boolean hasExerciseConfig();
}
