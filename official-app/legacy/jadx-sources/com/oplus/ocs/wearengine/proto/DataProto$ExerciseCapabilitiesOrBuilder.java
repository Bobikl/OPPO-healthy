package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$ExerciseCapabilitiesOrBuilder extends MessageLiteOrBuilder {
    DataProto$BatchingMode getSupportedBatchingModeOverrides(int i);

    int getSupportedBatchingModeOverridesCount();

    List<DataProto$BatchingMode> getSupportedBatchingModeOverridesList();

    int getSupportedBatchingModeOverridesValue(int i);

    List<Integer> getSupportedBatchingModeOverridesValueList();

    DataProto$ExerciseCapabilities.TypeToCapabilitiesEntry getTypeToCapabilities(int i);

    int getTypeToCapabilitiesCount();

    List<DataProto$ExerciseCapabilities.TypeToCapabilitiesEntry> getTypeToCapabilitiesList();
}
