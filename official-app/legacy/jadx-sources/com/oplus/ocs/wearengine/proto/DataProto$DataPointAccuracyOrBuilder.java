package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DataProto$DataPointAccuracyOrBuilder extends MessageLiteOrBuilder {
    DataProto$DataPointAccuracy.AccuracyCase getAccuracyCase();

    DataProto$DataPointAccuracy.LocationAccuracy getLocationAccuracy();

    boolean hasLocationAccuracy();
}
