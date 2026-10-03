package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$WarmUpConfigOrBuilder extends MessageLiteOrBuilder {
    DataProto$DataType getDataTypes(int i);

    int getDataTypesCount();

    List<DataProto$DataType> getDataTypesList();

    DataProto$ExerciseType getExerciseType();

    int getExerciseTypeValue();
}
