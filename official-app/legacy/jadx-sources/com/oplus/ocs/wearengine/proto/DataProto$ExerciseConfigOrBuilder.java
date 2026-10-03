package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$ExerciseConfigOrBuilder extends MessageLiteOrBuilder {
    DataProto$BatchingMode getBatchingMode();

    int getBatchingModeValue();

    DataProto$Bundle getExerciseParams();

    DataProto$ExerciseType getExerciseType();

    int getExerciseTypeValue();

    boolean getIsAutoPauseAndResumeEnabled();

    DataProto$DataType getSampleDataTypes(int i);

    int getSampleDataTypesCount();

    List<DataProto$DataType> getSampleDataTypesList();

    DataProto$DataType getStatsDataTypes(int i);

    int getStatsDataTypesCount();

    List<DataProto$DataType> getStatsDataTypesList();

    boolean hasExerciseParams();
}
