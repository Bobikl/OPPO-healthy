package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface RequestsProto$StartExerciseRequestOrBuilder extends MessageLiteOrBuilder {
    DataProto$ExerciseConfig getConfig();

    String getPackageName();

    ByteString getPackageNameBytes();

    boolean hasConfig();
}
