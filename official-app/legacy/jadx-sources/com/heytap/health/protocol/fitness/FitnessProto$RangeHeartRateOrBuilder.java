package com.heytap.health.protocol.fitness;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$RangeHeartRateOrBuilder extends MessageLiteOrBuilder {
    FitnessProto$TARGET_RANGE_SWITCH getSwitchType();

    int getSwitchTypeValue();

    FitnessProto$HeartRateZone getZonesData(int i);

    int getZonesDataCount();

    List<FitnessProto$HeartRateZone> getZonesDataList();

    FitnessProto$HR_ZONES_TYPE getZonesType();

    int getZonesTypeValue();
}
