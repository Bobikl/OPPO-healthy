package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$ValueOrBuilder extends MessageLiteOrBuilder {
    boolean getBoolVal();

    ByteString getByteArrayVal();

    DataProto$Value.DoubleArray getDoubleArrayVal();

    double getDoubleVal();

    long getLongVal();

    DataProto$Value.ValueCase getValueCase();

    boolean hasBoolVal();

    boolean hasByteArrayVal();

    boolean hasDoubleArrayVal();

    boolean hasDoubleVal();

    boolean hasLongVal();
}
