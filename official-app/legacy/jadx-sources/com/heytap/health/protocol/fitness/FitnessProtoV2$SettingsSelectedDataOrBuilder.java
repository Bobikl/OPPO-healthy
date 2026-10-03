package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProtoV2$SettingsSelectedDataOrBuilder extends MessageLiteOrBuilder {
    int getTime();

    FitnessProtoV2$AchievementType getType(int i);

    int getTypeCount();

    List<FitnessProtoV2$AchievementType> getTypeList();

    int getTypeValue(int i);

    List<Integer> getTypeValueList();
}
