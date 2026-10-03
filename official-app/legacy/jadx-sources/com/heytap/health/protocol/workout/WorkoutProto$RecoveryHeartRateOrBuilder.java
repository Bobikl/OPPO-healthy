package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$RecoveryHeartRateOrBuilder extends MessageLiteOrBuilder {
    ByteString getHeartRate();

    int getOffset(int i);

    int getOffsetCount();

    List<Integer> getOffsetList();

    int getSportType();

    int getSportsEndTime();

    int getSportsStartTime();

    int getStartTime();
}
