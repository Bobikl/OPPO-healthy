package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface RequestsProto$PrepareExerciseRequestOrBuilder extends MessageLiteOrBuilder {
    DataProto$WarmUpConfig getConfig();

    String getPackageName();

    ByteString getPackageNameBytes();

    boolean hasConfig();
}
