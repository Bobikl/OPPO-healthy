package com.heytap.health.protocol.workout;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$SportsRecoveryHeartRateDataOrBuilder extends MessageLiteOrBuilder {
    WorkoutProto$RecoveryHeartRate getData(int i);

    int getDataCount();

    List<WorkoutProto$RecoveryHeartRate> getDataList();

    int getIndex();

    int getStartTime();
}
