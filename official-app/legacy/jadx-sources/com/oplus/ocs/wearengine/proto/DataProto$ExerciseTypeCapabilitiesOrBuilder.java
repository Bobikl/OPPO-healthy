package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$ExerciseTypeCapabilitiesOrBuilder extends MessageLiteOrBuilder {
    boolean getIsAutoPauseAndResumeSupported();

    DataProto$DataType getSupportedSampleDataTypes(int i);

    int getSupportedSampleDataTypesCount();

    List<DataProto$DataType> getSupportedSampleDataTypesList();

    DataProto$DataType getSupportedStatsDataTypes(int i);

    int getSupportedStatsDataTypesCount();

    List<DataProto$DataType> getSupportedStatsDataTypesList();
}
