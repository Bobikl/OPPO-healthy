package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$MedalDataOrBuilder extends MessageLiteOrBuilder {
    String getCodeType();

    ByteString getCodeTypeBytes();

    WorkoutProto$MedalBean getMedalList(int i);

    int getMedalListCount();

    List<WorkoutProto$MedalBean> getMedalListList();
}
