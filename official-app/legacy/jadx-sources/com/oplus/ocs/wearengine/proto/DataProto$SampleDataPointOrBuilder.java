package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$SampleDataPointOrBuilder extends MessageLiteOrBuilder {
    DataProto$DataPointAccuracy getAccuracy();

    DataProto$DataType getDataType();

    DataProto$Bundle getMetaData();

    long getTime();

    DataProto$Value getValue();

    boolean hasAccuracy();

    boolean hasDataType();

    boolean hasMetaData();

    boolean hasValue();
}
