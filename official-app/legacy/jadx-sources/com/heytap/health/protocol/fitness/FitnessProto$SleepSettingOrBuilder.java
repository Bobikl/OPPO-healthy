package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$SleepSettingOrBuilder extends MessageLiteOrBuilder {
    int getUserHabitsSwitch();

    FitnessProto$UserRest getUsersRest(int i);

    int getUsersRestCount();

    List<FitnessProto$UserRest> getUsersRestList();
}
