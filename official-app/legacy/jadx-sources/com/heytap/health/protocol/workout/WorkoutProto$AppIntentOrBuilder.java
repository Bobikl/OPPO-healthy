package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$AppIntentOrBuilder extends MessageLiteOrBuilder {
    String getAction();

    ByteString getActionBytes();

    String getClsName();

    ByteString getClsNameBytes();

    String getPackageName();

    ByteString getPackageNameBytes();

    String getParams();

    ByteString getParamsBytes();
}
